
package conectbd_11;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class CursoUI extends JFrame {
    private CursoService service = new CursoService();
    private JButton btnAgregar, btnListar, btnBuscar, btnEliminar;
    private JTable tabla;

    public CursoUI() {
        setTitle("Gestión de Cursos");
        setSize(800, 600); // ajusté ancho para que entren todos los botones
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Botones
        btnListar = new JButton("Listar Cursos");
        btnListar.setBounds(50, 400, 150, 30);
        add(btnListar);

        btnAgregar = new JButton("Agregar Curso");
        btnAgregar.setBounds(220, 400, 150, 30);
        add(btnAgregar);

        btnBuscar = new JButton("Buscar Curso");
        btnBuscar.setBounds(390, 400, 150, 30);
        add(btnBuscar);

        btnEliminar = new JButton("Eliminar Curso");
        btnEliminar.setBounds(560, 400, 150, 30);
        add(btnEliminar);

        // Tabla
        tabla = new JTable();
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(20, 70, 740, 250);
        add(scroll);

        // Acción Listar
        btnListar.addActionListener(e -> {
            try {
                cargarTabla(service.obtenerTodos());
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        // Acción Agregar
        btnAgregar.addActionListener(e -> {
            String nombre = JOptionPane.showInputDialog(this, "Nombre: ");
            String profesor = JOptionPane.showInputDialog(this, "Profesor: ");
            String creditosJst = JOptionPane.showInputDialog(this, "Créditos: ");

            try {
                int creditos = Integer.parseInt(creditosJst);
                service.agregarCurso(nombre, profesor, creditos);
                cargarTabla(service.obtenerTodos());

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Debe ingresar un número válido como crédito");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            }
        });

        // Acción Buscar
        btnBuscar.addActionListener(e -> {
            String nombre = JOptionPane.showInputDialog(this, "Nombre: ");

            if (nombre != null && !nombre.trim().isEmpty()) {
                try {
                    List<Curso> resultado = service.buscarPorNombre(nombre.trim());
                    cargarTabla(resultado);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error al buscar el nombre: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Debe ingresar un nombre válido");
            }
        });

        // Acción Eliminar
        btnEliminar.addActionListener(e -> {
            int filaSeleccionada = tabla.getSelectedRow();

            if (filaSeleccionada != -1) {
                int id = (int) tabla.getValueAt(filaSeleccionada, 0);

                try {
                    boolean eliminado = service.eliminarPorId(id);
                    if (eliminado) {
                        JOptionPane.showMessageDialog(this, "Curso eliminado con éxito");
                        cargarTabla(service.obtenerTodos());
                    } else {
                        JOptionPane.showMessageDialog(this, "No se encontró el curso con ese ID.");
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Error al eliminar: " + ex.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(this, "Seleccione un curso de la tabla para eliminar.");
            }
        });
    }

    // Método para cargar la tabla con datos de Cursos
    public void cargarTabla(List<Curso> lista) throws SQLException {
        String columnas[] = {"ID", "Nombre", "Profesor", "Créditos"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        for (Curso c : lista) {
            modelo.addRow(new Object[]{c.getId(), c.getNombre(), c.getProfesor(), c.getCreditos()});
        }

        tabla.setModel(modelo);
    }

   
}

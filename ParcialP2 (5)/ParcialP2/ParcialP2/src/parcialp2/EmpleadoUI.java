
package parcialp2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;

public class EmpleadoUI extends JFrame {
    private JTextField txtNombre, txtEdad, txtSalario;
    private JButton btnAgregar, btnListar;
    private JTable tabla;
    private java.util.List<Empleado> empleados = new ArrayList<>();

    public EmpleadoUI() {
        setTitle("Gestión de Empleados");
        setSize(600, 400);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(20, 20, 100, 30);
        add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 20, 150, 30);
        add(txtNombre);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(20, 60, 100, 30);
        add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(120, 60, 150, 30);
        add(txtEdad);

        JLabel lblSalario = new JLabel("Salario:");
        lblSalario.setBounds(20, 100, 100, 30);
        add(lblSalario);

        txtSalario = new JTextField();
        txtSalario.setBounds(120, 100, 150, 30);
        add(txtSalario);

        btnAgregar = new JButton("Agregar");
        btnAgregar.setBounds(300, 20, 120, 30);
        add(btnAgregar);

        btnListar = new JButton("Listar");
        btnListar.setBounds(300, 60, 120, 30);
        add(btnListar);

        tabla = new JTable();
        JScrollPane scroll = new JScrollPane(tabla);
        scroll.setBounds(20, 150, 540, 200);
        add(scroll);

        btnAgregar.addActionListener(e->agregarEmpleado());
        btnListar.addActionListener(e->mostrarEmpleados());
    }
    
    public void agregarEmpleado(){
        String nombre=txtNombre.getText().trim();
        String edadSrt=txtEdad.getText().trim();
        String salarioSrt=txtSalario.getText().trim();
        
        if(nombre.isEmpty()){
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío");
            return;
        }
        
        int edad;
        try{
            edad=Integer.parseInt(edadSrt);
            if(edad<18 || edad>65){
                JOptionPane.showMessageDialog(this, "La edad debe estar entre los 18 y 65 años");
                return;
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Edad inválida");
            return;
        }
        
        double salario;
        try{
            salario=Double.parseDouble(salarioSrt);
            if(salario<=0){
                JOptionPane.showMessageDialog(this, "Salario debe ser mayor a 0");
                return;
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Salario inválido");
            return;
        }
        
        for(Empleado empleado:empleados){
            if(empleado.getNombre().equalsIgnoreCase(nombre)){
                JOptionPane.showMessageDialog(this, "Ya existe un empleado con ese nombre");
                return;
            }
        }
        
        Empleado nuevo=new Empleado(nombre,edad,salario);
        empleados.add(nuevo);
        
        JOptionPane.showMessageDialog(this, "Empleado insertado con éxito");
        limpiarCampos();
        mostrarEmpleados();
    }
    
    public void mostrarEmpleados(){
        String columnas[]={"Nombre","Edad","Salario"};
        DefaultTableModel modelo=new DefaultTableModel(columnas,0);
        
        for(Empleado e:empleados){
            Object[] filas={e.getNombre(),e.getEdad(),e.getSalario()};
            modelo.addRow(filas);
        }
        tabla.setModel(modelo);
    }
    
    public void limpiarCampos(){
        txtNombre.setText("");
        txtEdad.setText("");
        txtSalario.setText("");
    }

}

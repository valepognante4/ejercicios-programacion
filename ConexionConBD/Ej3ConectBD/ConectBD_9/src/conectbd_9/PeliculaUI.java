
package conectbd_9;

import javax.swing.*;
import java.sql.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class PeliculaUI extends JFrame{
    private PeliculaService service=new PeliculaService();
    private JTable tabla;
    private JButton btnListar,btnAgregar,btnBuscar;
    
    public PeliculaUI(){
        setTitle("Sistema de Videoclub");
        setSize(800,600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        btnListar=new JButton("Listar Peliculas");
        btnListar.setBounds(150, 400, 150, 30);
        add(btnListar);
        
        btnAgregar=new JButton("Agregar Pelicula");
        btnAgregar.setBounds(320, 400, 150, 30);
        add(btnAgregar);
        
        btnBuscar=new JButton("Buscar Pelicula");
        btnBuscar.setBounds(490, 400, 150, 30);
        add(btnBuscar);
        
        tabla=new JTable();
        JScrollPane scroll=new JScrollPane(tabla);
        scroll.setBounds(20, 70, 550, 250);
        add(scroll);
        
                
        btnListar.addActionListener(e->{
            try{
                cargarTabla(service.obtenerTodos());
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });
        
        btnAgregar.addActionListener(e->{ 
            String titulo=JOptionPane.showInputDialog(this,"Nombre: ");
            String genero=JOptionPane.showInputDialog(this,"Genero: ");
            String anioSrt=JOptionPane.showInputDialog(this,"Año: ");
            
            try{
                int anio=Integer.parseInt(anioSrt.trim());
                
                int anioActual=java.time.Year.now().getValue();
                if(anio>anioActual || anio<1800){
                    JOptionPane.showMessageDialog(this, "Ingrese un año válido (1800-" + anioActual + ").");
                    return;
                }
                
                service.agregarPelicula(titulo, genero, anio);
                cargarTabla(service.obtenerTodos());
                
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Debe ingresar un número válido como año");
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
            }
        });
        
        btnBuscar.addActionListener(e->{
            String titulo=JOptionPane.showInputDialog(this, "Ingrese el título a buscar: ");
            
            if(titulo!=null && !titulo.trim().isEmpty()){
                try{
                    List<Pelicula> resultado=service.buscarPorPelicula(titulo.trim());
                    cargarTabla(resultado);
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(this, "Error al buscar: "+ex.getMessage());
                }
            }else{
                JOptionPane.showMessageDialog(this,"Debe ingresar un título válido");
            }
        });
    }
    
    public void cargarTabla(List<Pelicula> lista) throws SQLException{
        String columnas[]={"ID","Titulo","Genero","Año"};
        DefaultTableModel modelo=new DefaultTableModel(columnas,0);
        
        for(Pelicula p: lista){
            modelo.addRow(new Object[]{p.getId(),p.getTitulo(),p.getGenero(),p.getAnio()});
        }
        tabla.setModel(modelo);
    }
}

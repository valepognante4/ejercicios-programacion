
package conectbd_7;

import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class EstudianteUI extends JFrame{
    private EstudianteService service=new EstudianteService();
    private JTable tabla;
    private JButton btnListar, btnAgregar;
 
    
    public EstudianteUI(){
       setTitle("Gestión de Estudiantes");
       setSize(600,600);
       setLayout(null);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       btnListar=new JButton("Listar Estudiantes");
       btnListar.setBounds(150, 400, 140, 30);
       add(btnListar);
       
       btnAgregar=new JButton("Agregar Estudiante");
       btnAgregar.setBounds(320, 400, 160, 30);
       add(btnAgregar);
       
       tabla=new JTable();
       JScrollPane scroll=new JScrollPane(tabla);
       scroll.setBounds(20,70 , 550, 250);
       add(scroll);
       
       btnListar.addActionListener(e->{
           try{
               cargarTabla();
           }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
           }
       });
       
       btnAgregar.addActionListener(e->{
           String nombre=JOptionPane.showInputDialog(this,"Nombre: ");
           String apellido=JOptionPane.showInputDialog(this, "Apellido: ");
           String edadStr=JOptionPane.showInputDialog(this, " Edad: ");
           try{
               int edad=Integer.parseInt(edadStr);
               service.agregarEstudiante(nombre,apellido,edad);
               cargarTabla();
               
           }catch(Exception ex){
             JOptionPane.showMessageDialog(this, "Error: "+ex.getMessage());
           }
       });
       

       
    }
    private void cargarTabla()throws SQLException{
           String columnas[]={"ID","Nombre","Apellido","Edad"};
           DefaultTableModel modelo=new DefaultTableModel(columnas,0);
           
           for(Estudiante e: service.obtenerTodos()){
               modelo.addRow(new Object[]{e.getId(),e.getNombre(),e.getApellido(),e.getEdad()});
           }
           
           tabla.setModel(modelo);
       }
}

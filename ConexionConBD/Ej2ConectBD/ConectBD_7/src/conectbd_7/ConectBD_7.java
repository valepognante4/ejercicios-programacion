
package conectbd_7;

/*Ejercicio 1:
Crea un sistema para administrar estudiantes de una escuela
Cada estudiante tiene: ID, nombre, apellido, edad
Funcionalidades mínimas: listar estudiantes y agregar nuevo estudiante
Clases sugeridas:
Estudiante
EstudianteDAO
EstudianteService
EstudianteUI
Main
 */
public class ConectBD_7 {

    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(()->{
            new EstudianteUI().setVisible(true);
        });
    }
    
}

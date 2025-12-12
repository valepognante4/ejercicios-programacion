
package conectbd_9;

/*Ejercicio 3:

Crea un sistema de videoclub o plataforma de streaming

Cada producto tiene: ID, titulo, genero, año
Funcionalidades mínimas: listar película, agregar nueva película y buscar película por título
Clases sugeridas:
Pelicula
PeliculaDAO
PeliculaService
PeliculaUI
Main
 */
public class ConectBD_9 {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(()->
        new PeliculaUI().setVisible(true));
    }
    
}

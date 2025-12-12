
package v.ejprogramacion3;
/*Ejercicio 4: Usar un ArrayList para almacenar 3 nombre. Mostrar el contenido usando un bucle*/

//Colocamos la libreria ArrayList para poder crear listas dinámicas
import java.util.ArrayList;

public class Ejprogramacion3 {

    public static void main(String[] args) {
        
      /* Creamos el ArrayList, que tiene que ser una lista de objeto String por ser nombres y el
      ArrayList<>() está llamando al constructor de la clase ArrayList*/
      ArrayList<String> nombres=new ArrayList<>();
      
      //Agregamos los tres nombres a través del add, ya que el add se utiliza para agregar elementos a la lista
      nombres.add("Valentina");
      nombres.add("Martina");
      nombres.add("Micaela");
      
       /* Mostramos los nombres usando un bucle for-each para no tener que usar indices expecíficos.
      En primer lugar se coloca el tipo con el nombre de la variable y en segundo lugar el nombre de la ArrayList 
      que estamos recorriendo en este caso nombres*/
       for (String nombre : nombres) {
           
           //Colocamos el nombre para que me muestre todos los nombres que se encuentran en la ArrayList antes agregados
            System.out.println(nombre);
        }
       
    }
}



package v.ejprogramacion;
/*Ejercicio 1: Crear un método que reciba un int como final y muestre su valor,.
Intentar modificarlo dentro del método para ver el error*/

/*Hacemos una importación estática de el método mostrarValor
para no tener que poner el nombre del método con el nombre de la clase*/
import static v.ejprogramacion.Numero.mostrarValor;

public class Ejprogramacion {

     public static void main(String[] args) {
         
        //Al hacer la importación estática no necesitamos poner el nombre de la clase para llamar al método 
        mostrarValor(5);
    }
}

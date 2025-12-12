
package v.ejprogramacion;

public class Numero {
    //Al declararlo como static estoy diciendo que no hace falta crear un objeto desde el main 
    public static void mostrarValor(final int numero) {
        
        //Este es el error de compilacón que sale ya que al ser final no se puede modificar su valor
        valor+=valor+1;
        System.out.println("Valor recibido: " + numero);
    }
    

}

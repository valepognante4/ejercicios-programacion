

package v.arbolnavidad;

/**
 *
 * 
 */
public class Arbolnavidad {

    public static void main(String[] args) {
      int altura=10;
      
      for(int fila=0;fila<altura;fila++){
          for(int espacio=0;espacio<(altura-fila-1);espacio++){
              System.out.print(" ");
          }
          
          for(int asterisco=0;asterisco<((fila*2)+1);asterisco++){
              System.out.print("*");
          }
          System.out.println("");
          
      }
      int largotronco=3;
      
      for(int base=0;base<largotronco;base++){
           for(int espacio=0;espacio<(altura-2);espacio++){
             System.out.print(" ");
         }
         
         for(int tronco=0;tronco<3;tronco++){
             System.out.print("|");
         }
            System.out.println("");
      }
    }
}

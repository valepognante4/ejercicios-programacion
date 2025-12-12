
package v.ejprogramacion2;
/*Ejercicio 3: Crear una matriz 3x3 y llenarla con número del 1 al 9. Mostrarla en consola.
Luego, realiza la suma de cada una de sus filas. */


public class Ejprogramacion2 {

    public static void main(String[] args) {
        
        //Declaramos la matriz 3*3
        int matriz[][]=new int[3][3];
        
        /*Declaramos un número que empiece en 1 ya que el ejercicio me pide llenar la matriz partiendo desde el 1
        y como en un arreglo las posiciones se empiezan a contar desde la posicion 0 es necesario declararlo*/
       int numero=1;
       
       //Tenemos que colocar dos for ya que uno es utilizado para recorrer las filas y otro las columnas

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                /*numero++ lo colocamos para que a la posición siguiente se le vaya sumando uno y de esta manera
                hacer que la matriz se llene hasta el número 9*/
               matriz[i][j]=numero++;
               
               //Mostramos la matriz con sus datos
                System.out.print(matriz[i][j]);
            }
            //Hacemos un salto de línea para que me queden las filas una debajo de la otra 
            System.out.println("");
        }
        
        /*Tenemos que colocar dos for ya que uno es utilizado para recorrer las filas y otro las columnas
        y el length es para encontrar la cantidad de elementos que tienen en las filas o las columnas*/
        for (int i=0; i<matriz.length;i++) {
            //Inicializamos la suma en cero
            int sumaFila=0;

            for (int j=0;j<matriz[i].length;j++) {
                //Sumamos los elementos de las filas
                sumaFila+=matriz[i][j]; 
            }

            //Colocamos ese i+1 para que me aparezcan los resultados a partir de la fila 1
            System.out.println("Suma de la fila " + (i+1) + ": " + sumaFila);
        }
       
       
    }
}

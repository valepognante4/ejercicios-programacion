
package v.ejercicio_3;

//Creamos la clase genérica Contador<T>
public class Contador<T> {

    /*Creamos el método contar que recibe dos parámetros un arreglo genérico de elementos de tipo T 
    y el valor que queremos buscar dentro del arreglo. El método devuelve un entero int que representa la 
    cantidad de veces que aparece valorBuscado en el arreglo.*/
    public int contar(T[] arreglo,T valorBuscado) {
        
        //Verificamos si el arreglo recibido es null
       if(arreglo==null){
           
           /*Si lo es, lanzamos una excepción personalizada ArregloNuloException con un mensaje de error.
            Esto evita que el programa se rompa al intentar recorrer un arreglo que no existe.
           Usamos throw para lanzar una excepción de forma manual cuando ocurre una situación 
           inesperada o no válida en el programa.*/
           throw new ArregloNuloException("El arreglo es null");
       }
       
       /*Inicializamos la variable contador que se usará para contar la cantidad de veces que 
       aparece el valorBuscado*/
       int contador=0;
       
       //Utilizamos un bucle for-each para recorrer los elementos del arreglo
       for(T elemento: arreglo){
           
           /*Si ambos son null se cuenta como coincidencia(esto evita errores por llamar equals() sobre null).*/
           if(valorBuscado==null && elemento==null){
               
               //si hay coincidencia, se incrementa el contador.
               contador++;
               
                //Si valorBuscado no es null, se utiliza equals() para comparar los objetos.
           }else if(valorBuscado!=null && valorBuscado.equals(elemento)){
               ///si hay coincidencia, se incrementa el contador.
               contador++;
           }
       }
       
       //Retornamos la cantidad de coincidencias encontradas.
       return contador;
    }
}

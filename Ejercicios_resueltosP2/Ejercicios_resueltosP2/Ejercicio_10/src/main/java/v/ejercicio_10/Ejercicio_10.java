
package v.ejercicio_10;

/*Implementá el clásico problema de las Torres de Hanoi para n discos. Mostrá cada movimiento 
necesario para resolverlo.
 */
public class Ejercicio_10 {

    public static void main(String[] args) {
        // Definimos la cantidad de discos a mover
       int n=3;
       
       // Mostramos un mensaje inicial
        System.out.println("Movimientos para resolver la Torre de Hanoi con "+n+" discos: ");
        
        // Llamamos al método recursivo para resolver el problema
        // Pasamos:
        // - n: cantidad de discos
        // - 'A': torre origen
        // - 'C': torre destino
        // - 'B': torre auxiliar
        TorresDeHanoi.hanoi(n, 'A', 'C', 'B');
    }
}

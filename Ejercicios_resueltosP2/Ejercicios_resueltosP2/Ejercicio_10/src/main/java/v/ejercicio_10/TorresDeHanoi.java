
package v.ejercicio_10;

public class TorresDeHanoi {
    // Creamos el método recursivo que resuelve las Torres de Hanoi para n discos
    // Parámetros:
    // n: número de discos a mover
    // origen: torre de donde se mueven los discos
    // destino: torre a donde se quieren mover los discos
    // auxiliar: torre auxiliar que se usa como soporte en los movimientos
    public static void hanoi(int n,char origen,char destino,char auxiliar){
        
        //Utilizamos un if para el caso base
        // Caso base: si solo hay un disco, simplemente se mueve de origen a destino
        if(n==1){
            System.out.println("Mover disco 1 de "+origen+" a "+destino);
            return;
        }
        
        // Paso 1: Mover los n-1 discos superiores desde origen a la torre auxiliar,
        // usando la torre destino como auxiliar
        hanoi(n-1,origen,auxiliar,destino);
        
        // Paso 2: Mover el disco más grande (el n-ésimo) desde origen a destino
        System.out.println("Mover disco "+n+" de "+origen+" a "+destino);
        
        // Paso 3: Mover los n-1 discos que quedaron en la torre auxiliar hacia la torre destino,
        // usando la torre origen como auxiliar
        hanoi(n-1,auxiliar,destino,origen);
    }
}

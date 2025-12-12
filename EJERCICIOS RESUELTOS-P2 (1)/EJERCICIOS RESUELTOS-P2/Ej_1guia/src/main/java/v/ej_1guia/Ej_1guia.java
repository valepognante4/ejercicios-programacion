
package v.ej_1guia;

import java.util.Scanner;

/*Ejercicio 1: 
Se desea diseñar un programa que simule un reproductor de música con distintas fuentes. 
El sistema debe: 
1. Definir una interfaz ReproductorMusica con los métodos: 
o reproducir() 
o pausar() 
o detener() 
2. Implementar dos clases concretas: 
o ReproductorMP3: reproduce archivos locales en formato MP3. 
o ReproductorStreaming: reproduce música desde la nube (streaming). 
3. En la clase principal (Main), el programa debe mostrar un menú en consola que 
permita al usuario: 
o Seleccionar el tipo de reproductor (MP3 o Streaming). 
o Elegir qué acción realizar: reproducir, pausar o detener. 
o Poder ejecutar varias acciones hasta que el usuario decida salir del 
programa. 
 */
public class Ej_1guia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        /*En este caso podemos ver el polimorfismo ya que la variable "reproductor" es del tipo 
        ReproductorMusica (interfaz), pero puede referirse tanto a un ReproductorMP3 como a un ReproductorStreaming. 
        Esto permite usar el mismo código para distintos tipos de reproductores.*/
        ReproductorMusica reproductor = null;

        System.out.println("Selecciona el tipo de reproductor: ");
        System.out.println("1. MP3");
        System.out.println("2.Streaming");
        System.out.print("Opción: ");
        int tipo = teclado.nextInt();
        teclado.nextLine();

        if (tipo == 1) {
            System.out.print("Ingrese el nombre del archivo MP3: ");
            String archivo = teclado.nextLine();

            //Instanciamos el reproductorMP3 
            reproductor = new ReproductorMP3(archivo);
        } else if (tipo == 2) {
            System.out.print("Ingrese la URL del Streaming: ");
            String url = teclado.nextLine();

            //Instanciamos el reproductorStreaming 
            reproductor = new ReproductorStreaming(url);

        } else {
            System.out.println("Opción inválida. Saliendo...");
            teclado.close();
            return;
        }

        int opcion;
        do {
            System.out.println("Acciones disponibles: ");
            System.out.println("1. Reproducir");
            System.out.println("2. Pausar");
            System.out.println("3. Detener");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    /*En este caso podemos ver el polimorfismo ya que la lista
                    es de tipo ReproductorMusica, cada objeto (ReproductorMP3, ReproductorStreaming)
                    ejecuta su propia versión de reproducir()*/
                    reproductor.reproducir();
                    break;
                case 2:
                    /*En este caso podemos ver el polimorfismo ya que la lista
                    es de tipo ReproductorMusica, cada objeto (ReproductorMP3, ReproductorStreaming)
                    ejecuta su propia versión de pausar()*/
                    reproductor.pausar();
                    break;
                case 3:
                    /*En este caso podemos ver el polimorfismo ya que la lista
                    es de tipo ReproductorMusica, cada objeto (ReproductorMP3, ReproductorStreaming)
                    ejecuta su propia versión de detener()*/
                    reproductor.detener();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo");
            }

        } while (opcion != 4);

        teclado.close();
    }
}

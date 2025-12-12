

package v.ej_5guia;

import java.util.Scanner;

/*Ejercicio 5: 
Una empresa de transporte necesita un sistema que permita crear vehículos de distintos 
tipos y simular sus acciones. 
El sistema debe cumplir con los siguientes requisitos: 
1. Definir una interfaz Vehiculo con los métodos: 
o acelerar() 
o frenar() 
2. Implementar las clases concretas: 
o Auto: imprime mensajes propios al acelerar y frenar. 
o Moto: imprime mensajes propios al acelerar y frenar. 
o Camion (nuevo): imprime mensajes propios al acelerar y frenar. 
3. Implementar una clase VehiculoFactory que se encargue de crear vehículos a partir 
de un tipo ingresado por el usuario. 
4. Crear una clase GestorVehiculos que contenga una lista de vehículos y permita: 
o Agregar vehículos creados por la fábrica. 
o Mostrar todos los vehículos registrados indicando su tipo. 
o Simular que todos los vehículos aceleran y frenan en conjunto. 
5. En la clase principal (MainFactory), implementar un menú en consola que permita 
al usuario: 
o Crear un vehículo (auto, moto o camión). 
o Mostrar los vehículos registrados. 
o Hacer que todos los vehículos aceleren. 
o Hacer que todos los vehículos frenen. 
o Salir del programa. 
 */
public class Ej_5guia {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        GestorVehiculos gestor=new GestorVehiculos();
        int opcion;
        
        do{
            System.out.println("--- Sistema de Vehículos ---");
            System.out.println("1. Crear vehículo");
            System.out.println("2. Mostrar vehículos");
            System.out.println("3. Acelerar todos");
            System.out.println("4. Frenar todos");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opcion=teclado.nextInt();
            teclado.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el tipo de vehiculo (auto/moto/camion): ");
                    String tipo=teclado.nextLine();
                    Vehiculo v=VehiculoFactory.crearVehiculo(tipo);
                    gestor.agregarVehiculo(v);
                    break;
                case 2:
                    gestor.mostrarVehiculos();
                    break;
                case 3:

                    /*En este caso podemos ver el polimorfismo ya que la lista
                    es de tipo Vehiculo, cada objeto (Auto, Moto, Camino) ejecuta su propia
                    versión de acelerar()*/
                    gestor.acelerarTodos();
                    break;
                case 4:
                    
                    /*En este caso podemos ver el polimorfismo ya que la lista
                    es de tipo Vehiculo, cada objeto (Auto, Moto, Camino) ejecuta su propia
                    versión de frenar()*/
                    gestor.frenarTodos();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo");
            }
            
        }while(opcion!=5);
 
       teclado.close();
        
    }
    
}

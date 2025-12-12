package v.ej_4guia;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Ejercicio 4 
Se desea diseñar un sistema que permita gestionar distintas figuras geométricas y calcular 
sus propiedades principales. 
Actualmente existen tres tipos de figuras: 
• Círculo, definido por su radio. 
• Rectángulo, definido por su base y altura. 
• Triángulo isósceles, definido por su base y altura. 
El sistema debe cumplir los siguientes requisitos: 
1. La interfaz Figura debe definir dos métodos: 
o double area() → devuelve el área de la figura. 
o double perimetro() → devuelve el perímetro de la figura. 
2. Cada clase (Circulo, Rectangulo, Triangulo) debe implementar la interfaz y definir 
sus fórmulas de área y perímetro. 
3. Crear una clase GestorFiguras que contenga una lista de figuras y permita: 
o Agregar nuevas figuras. 
o Mostrar todas las figuras indicando su tipo, área y perímetro. 
o Calcular el área total ocupada por todas las figuras. 
4. En la clase principal (MainFiguras), implementar un menú en consola para que el 
usuario pueda: 
o Agregar un círculo (pidiendo su radio). 
o Agregar un rectángulo (pidiendo base y altura). 
o Agregar un triángulo (pidiendo base y altura). 
o Mostrar todas las figuras registradas. 
o Calcular el área total ocupada. 
o Salir del programa. 
 */
public class Ej_4guia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        GestorFiguras gestor = new GestorFiguras();
        int opcion = 0;
        do {
            try {
                System.out.println("--- Menú Figuras ---");
                System.out.println("1. Agregar Círculo");
                System.out.println("2. Agregar Rectángulo");
                System.out.println("3. Agregar Triángulo");
                System.out.println("4. Mostrar figuras");
                System.out.println("5. Calcular área total");
                System.out.println("6. Salir");
                System.out.print("Opción: ");
                opcion = teclado.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el radio: ");
                        double r = teclado.nextDouble();
                        
                        if(r<=0){
                            System.out.println("El radio debe ser mayor a cero.");

                        }else{
                            
                          /*En este caso podemos ver el polimorfismo ya que se agrega un Circulo a 
                          la lista de tipo Figura, ejecutando la implementación específica en tiempo
                          de ejecución*/
                          gestor.agregarFigura(new Circulo(r));
                        }
                        break;
                    case 2:
                        System.out.print("Ingrese la base: ");
                        double bR = teclado.nextDouble();
                        System.out.print("Ingrese la altura: ");
                        double hR = teclado.nextDouble();
                        
                        if(bR<=0|| hR<=0){
                            System.out.println("La base y la altura deben ser mayores a cero.");
                        }else{
                            
                          /*En este caso podemos ver el polimorfismo ya que se agrega un Rectangulo a 
                            la lista de tipo Figura, ejecutando la implementación específica en tiempo
                            de ejecución*/
                            gestor.agregarFigura(new Rectangulo(bR, hR));  
                        }

                        break;
                    case 3:
                        System.out.print("Ingrese la base: ");
                        double bT = teclado.nextDouble();
                        System.out.print("Ingrese la altura: ");
                        double hT = teclado.nextDouble();
                        
                        if(bT<=0|| hT<=0){
                            System.out.println("La base y la altura deben ser mayores a cero.");
                        }else{
                            
                         /*En este caso podemos ver el polimorfismo ya que se agrega un Triangulo a 
                           la lista de tipo Figura, ejecutando la implementación específica en tiempo
                           de ejecución*/
                           gestor.agregarFigura(new Triangulo(bT, hT));   
                        }
                        break;
                    case 4:
                        gestor.mostrarFiguras();
                        break;
                    case 5:
                        double total = gestor.areaTotal();
                        if (total == 0) {
                            System.out.println("No hay figuras registradas.");
                        } else {
                            System.out.println("Área total: " + total);
                        }
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida. Intente de nuevo");
                }

            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido");
                teclado.nextLine();
            }

        } while (opcion != 6);
    }
}

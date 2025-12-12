
package v.ej_3guia;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Ejercicio 3: 
Se desea diseñar un sistema para una empresa de desarrollo de software que permita 
gestionar a sus empleados. 
Actualmente existen dos tipos de empleados: 
• Programadores, que trabajan desarrollando en un lenguaje de programación. 
• Diseñadores, que trabajan utilizando una herramienta de diseño. 
El sistema debe cumplir con los siguientes requisitos: 
1. Definir una clase abstracta Empleado que contenga: 
o Atributos básicos: nombre, salario. 
o Métodos: 
▪ trabajar() (abstracto, implementado por cada subclase). 
▪ calcularBono() que retorne un adicional al salario según el tipo de 
empleado. 
2. Implementar las subclases: 
o Programador, con el atributo adicional lenguaje. 
▪ Su bono es el 20% del salario. 
o Diseñador, con el atributo adicional herramienta. 
▪ Su bono es el 15% del salario. 
3. Crear una clase Empresa que contenga una lista de empleados y permita: 
o Agregar empleados a la nómina. 
o Listar empleados, mostrando nombre, salario y tipo. 
o Calcular el gasto total (suma de salarios + bonos). 
4. En la clase principal (Main), implementar un menú interactivo en consola para que 
el usuario pueda: 
o Agregar un programador o diseñador. 
o Mostrar todos los empleados con sus roles. 
o Calcular el gasto total de la empresa. 
o Salir del programa. 
 */
public class Ej_3guia {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        
        Empresa empresa=new Empresa();
        int opcion;
        
        do{
            System.out.println("--- Sistema de Gestión de Empleados ---");
            System.out.println("1. Agregar Programador");
            System.out.println("2. Agregar Diseñador");
            System.out.println("3. Mostrar Empleados");
            System.out.println("4. Calcular gasto total");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion=teclado.nextInt();
            teclado.nextLine();
            
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombreP=teclado.nextLine();
                    
                    double salarioP=0;
                    boolean salarioValido=false;
                    
                    while(!salarioValido){
                        try{
                            System.out.print("Ingrese el salario: ");
                            salarioP=teclado.nextDouble();
                            teclado.nextLine();
                            salarioValido=true;
                        }catch(InputMismatchException e){
                            System.out.println("Salario inválido. Ingrese un número.");
                            teclado.nextLine();
                        }
                    }
                    
                    System.out.print("Ingrese el lenguaje: ");
                    String lenguaje=teclado.nextLine();
                    
                    /*En este caso podemos ver polimorfismo ya que se instancia un Porgramador, pero se lo 
                    almacena en una referencia de tipo Empleado. Esto permite manejar de forma genérica
                    diferentes tipos de empleados en la empresa.*/
                    empresa.agregarEmpleado(new Programador(nombreP,salarioP,lenguaje));
                    System.out.println("Empleado agregado correctamente");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre: ");
                    String nombreD=teclado.nextLine();
                    
                    double salarioD=0;
                    boolean salarioValidoD=false;
                    
                    while(!salarioValidoD){
                        try{
                            System.out.print("Ingrese el salario: ");
                            salarioD=teclado.nextDouble();
                            teclado.nextLine();
                            salarioValidoD=true;
                        }catch(InputMismatchException e){
                            System.out.println("Salario inválido. Ingrese un número.");
                            teclado.nextLine();
                        }
                    }

                    System.out.print("Ingrese la herramienta: ");
                    String herramienta=teclado.nextLine();
                    
                    /*En este caso podemos ver polimorfismo ya que se instnacia un Diseñador, pero se lo 
                    almacena en una referencia de tipo Empleado. Esto permite manejar de forma genérica
                    diferentes tipos de empleados en la empresa.*/
                    empresa.agregarEmpleado(new Diseniador(nombreD,salarioD,herramienta));
                    System.out.println("Empleado agregado correctamente");
                    
                    break;
                case 3:
                    empresa.listarEmpleados();
                    break;
                case 4:
                    double gasto=empresa.calcularGastoTotal();
                    System.out.println("El gasto total de la empresa (con bonos) es: $"+gasto);
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente");
            }
        }while(opcion!=5);
        
        teclado.close();  
    }
}

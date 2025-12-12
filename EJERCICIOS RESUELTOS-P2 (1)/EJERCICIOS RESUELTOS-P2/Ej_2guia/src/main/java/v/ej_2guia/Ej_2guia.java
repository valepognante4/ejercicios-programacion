
package v.ej_2guia;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Ejercicio 2: 
Se desea construir un sistema de pagos flexible que permita a una tienda aceptar múltiples 
métodos de pago. 
Actualmente existen 3 formas de pago: 
• Pago en efectivo 
• Pago con tarjeta de crédito 
• Pago por transferencia bancaria 
El sistema debe: 
1. Definir una interfaz Pago con los métodos: 
o realizarPago(double monto) 
o obtenerComprobante() 
2. Implementar las clases: 
o PagoEfectivo 
o PagoTarjetaCredito 
o PagoTransferencia 
3. Crear una clase HistorialPagos que guarde todos los pagos realizados, de modo 
que el usuario pueda: 
o Registrar un nuevo pago. 
o Consultar los comprobantes de todos los pagos efectuados. 
o Calcular el total recaudado. 
4. En la clase principal (Main), mostrar un menú en consola que permita al usuario: 
o Seleccionar el tipo de pago (efectivo, tarjeta o transferencia). 
o Ingresar el monto y, si corresponde, los datos adicionales (número de 
tarjeta o cuenta). 
o Guardar el pago en el historial. 
o Consultar en cualquier momento el listado de comprobantes y el total 
recaudado. 
o Salir del programa.
 */
public class Ej_2guia {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        HistorialPagos historial = new HistorialPagos();
        int opcion = 0;

        do {
            try {
                System.out.println("---- Sistema de Pagos ----");
                System.out.println("1.Pagar en efectivo");
                System.out.println("2. Pagar con tarjeta de crédito");
                System.out.println("3. Pagar por transferencia bancaria");
                System.out.println("4. Ver historial de pagos.");
                System.out.println("5. Ver total recaudado");
                System.out.println("6. Salir");
                System.out.print("Opción: ");
                
                opcion = teclado.nextInt();
                teclado.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el monto:");
                        double montoEfectivo = teclado.nextDouble();
                        teclado.nextLine();

                        /*En este caso se produce el polimorfismo ya que la variable de tipo Pago puede apuntar
                        a cualquier objeto que implemente la interfaz. Acá apuntamos a PagoEfectivo. Al llamar a realizarPago()
                        se ejecuta la implementación especifica de PagoEfectivo*/
                        Pago pagoE = new PagoEfectivo();
                        pagoE.realizarPago(montoEfectivo);
                        historial.registrarPago(pagoE);
                        break;
                    case 2:
                        System.out.print("Ingrese el monto: ");
                        double montoTarjeta = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.print("Ingrese el número de tarjeta: ");
                        String nroTarjeta = teclado.nextLine();

                        /*En este caso también se produce polimorfismo ya que Pago puede apuntar ahora a 
                        PagoTarjetaCredito. El mismo método realizarPago() se comporta distinto según la clase.*/
                        Pago pagoT = new PagoTarjetaCredito(nroTarjeta);
                        pagoT.realizarPago(montoTarjeta);
                        historial.registrarPago(pagoT);
                        break;
                    case 3:
                        System.out.print("Ingrese el monto: ");
                        double montoTransf = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.print("Ingrese el número de cuenta: ");
                        String cuenta = teclado.nextLine();

                        /*En este caso también se produce polimorfismo ya que Pago puede apuntar a 
                        PagoTransferencia, demostrando nuevamente que el mismo tipo puede referirse
                        a distintas clases y ejecutar su propia implementación.*/
                        Pago pagoTr = new PagoTransferencia(cuenta);
                        pagoTr.realizarPago(montoTransf);
                        historial.registrarPago(pagoTr);
                        break;
                    case 4:
                        historial.mostrarComprobante();
                        break;
                    case 5:
                        historial.mostrarTotal();
                        break;
                    case 6:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opción inválida.Intente de nuevo");

                }

            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número válido");
                teclado.nextLine();
            }


        } while (opcion != 6);

        teclado.close();
    }
}

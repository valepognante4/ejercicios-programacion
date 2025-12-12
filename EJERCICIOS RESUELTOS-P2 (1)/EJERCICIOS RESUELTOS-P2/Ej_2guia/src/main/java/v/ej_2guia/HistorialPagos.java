
package v.ej_2guia;

import java.util.ArrayList;
import java.util.List;

public class HistorialPagos {
    private List<Pago> pagos;
    
    public HistorialPagos(){
        pagos=new ArrayList<>();
    }
    
    //Implementamos la lógica para registrar el pago
    public void registrarPago(Pago pago){
        pagos.add(pago);
    }
    
//Implementamos la lógica para mostrar el comprobante
    public void mostrarComprobante(){
        System.out.println("--- Historial de pagos ---");
        
        if(pagos.isEmpty()){
            System.out.println("No se registraron pagos aún.");
        }else{
            for(Pago p:pagos){
                
                /*En este caso podemos ver el polimorfismo ya que la referencia "p" es de
                tipo Pago, pero en tiempo de ejecución puede ser un PagoEfectivo, PagoTarjetaCredito o
                PagoTransferencia. El método p.obtenerComprobante() se ejecuta según la implementación
                de la subclase correspondiente.*/
                System.out.println(p.obtenerComprobante());
            }
        }
    }
    
    //Implementamos la lógica para mostrar el total recaudado
    public void mostrarTotal(){
        double total=0;
        for(Pago p:pagos){
            
            /*En este caso podemos ver el polimorfismo ya que la referencia "p" es de
            tipo Pago, pero en tiempo de ejecución puede ser un PagoEfectivo, PagoTarjetaCredito o
            PagoTransferencia. El método p.getMonto() se ejecuta según la implementación
            de la subclase correspondiente.*/
            total+=p.getMonto();
        }
        System.out.println("Total recaudado: $"+total);
    }

}



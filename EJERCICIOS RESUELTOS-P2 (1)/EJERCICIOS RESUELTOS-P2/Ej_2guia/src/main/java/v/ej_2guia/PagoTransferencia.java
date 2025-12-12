
package v.ej_2guia;
/*En este caso podemos ver la herencia junto con la implementación  ya que esta clase implementa
la interfaz Pago (herencia de contrato) y proporciona su propia impelemntación concreta de los métodos,
definiendo cómo se realiza y se implementa este tipo de pago.*/
public class PagoTransferencia implements Pago {
    private double monto;
    private String cuentaDestino;

    public PagoTransferencia(String cuentaDestino){
        this.cuentaDestino=cuentaDestino;
    }

    //Implementación específica para realizar pago con transferencia
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo Pago,
    al llamar a realizarPago() se ejecutará esta versión si el objeto es PagoTransferencia.
    Cada clase implementa el método a su manera, permitiendo que un mismo mensaje tenga
    distintos comportamientos según el tipo de objeto.*/
    @Override
    public void realizarPago(double monto) {
        this.monto=monto;
        System.out.println("Pago por transferencia a cuenta "+cuentaDestino+" realizado por $"+monto);
    }

    //Implementación específica para obtener comprobante con transferencia
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo Pago,
    al llamar a obtenerComprobante() se ejecutará esta versión si el objeto es PagoTransferencia.
    Cada clase implementa el método a su manera, permitiendo que un mismo mensaje tenga
    distintos comportamientos según el tipo de objeto.*/
    @Override
    public String obtenerComprobante() {
        return "Comprobante de pago por transferencia a cuenta "+cuentaDestino+": $"+monto;
    }

    //Implementación específica del monto con transferencia
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo Pago,
    al llamar a getMonto() se ejecutará esta versión si el objeto es PagoTransferencia.
    Cada clase implementa el método a su manera, permitiendo que un mismo mensaje tenga
    distintos comportamientos según el tipo de objeto.*/
    @Override
    public double getMonto() {
        return monto;
    }
    
}



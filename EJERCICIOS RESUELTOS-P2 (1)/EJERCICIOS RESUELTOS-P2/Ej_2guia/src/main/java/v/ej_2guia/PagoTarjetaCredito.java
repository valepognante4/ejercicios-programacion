
package v.ej_2guia;

/*En este caso podemos ver la herencia junto con la implementación  ya que esta clase implementa
la interfaz Pago (herencia de contrato) y proporciona su propia impelemntación concreta de los métodos,
definiendo cómo se realiza y se implementa este tipo de pago.*/
public class PagoTarjetaCredito implements Pago{
    private double monto;
    private String numeroTarjeta;
    
    public PagoTarjetaCredito(String numeroTarjeta){
        this.numeroTarjeta=numeroTarjeta;
    }
    
    //Implementación específica para realizar pago con tarjeta de crédito
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo Pago,
    al llamar a realizarPago() se ejecutará esta versión si el objeto es PagoTarjetaCredito.
    Cada clase implementa el método a su manera, permitiendo que un mismo mensaje tenga
    distintos comportamientos según el tipo de objeto.*/
    @Override
    public void realizarPago(double monto) {
        this.monto=monto;
        System.out.println("Pago con tarjeta de crédito realizado por $"+monto+"(Tarjeta terminada en "+numeroTarjeta.substring(numeroTarjeta.length()-4)+")");
    }

    //Implementación específica para obtener comprobante con tarjeta de crédito
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo Pago,
    al llamar a obtenerComprobante() se ejecutará esta versión si el objeto es PagoTarjetaCredito.
    Cada clase implementa el método a su manera, permitiendo que un mismo mensaje tenga
    distintos comportamientos según el tipo de objeto.*/
    @Override
    public String obtenerComprobante() {
       return "Comprobante de pago con tarjeta: $"+monto+"(Tarjeta ****"+numeroTarjeta.substring(numeroTarjeta.length()-4)+")";
    }

    //Implementación específica del monto con tarjeta de crédito
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo Pago,
    al llamar a getMonto() se ejecutará esta versión si el objeto es PagoTarjetaCredito.
    Cada clase implementa el método a su manera, permitiendo que un mismo mensaje tenga
    distintos comportamientos según el tipo de objeto.*/
    @Override
    public double getMonto() {
       return monto;
    }
}




package v.ej_2guia;

/*En este caso podemos ver la herencia junto con la implementación  ya que esta clase implementa
la interfaz Pago (herencia de contrato) y proporciona su propia implementación concreta de los métodos,
definiendo cómo se realiza y se implementa este tipo de pago.*/
public class PagoEfectivo implements Pago{
    private double monto;
    

    //Implementación específica para realizar pago en efectivo
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo Pago,
    al llamar a realizarPago() se ejecutará esta versión si el objeto es PagoEfectivo.
    Cada clase implementa el método a su manera, permitiendo que un mismo mensaje tenga
    distintos comportamientos según el tipo de objeto.*/
    @Override
    public void realizarPago(double monto) {
        this.monto=monto;
        System.out.println("Pago en efectivo realizado por $"+monto);
    }

    //Implementación específica para obtener comprobante del pago en efectivo
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo Pago,
    al llamar a obtenerComprobante() se ejecutará esta versión si el objeto es PagoEfectivo.
    Cada clase implementa el método a su manera, permitiendo que un mismo mensaje tenga
    distintos comportamientos según el tipo de objeto.*/
    @Override
    public String obtenerComprobante() {
        return "Comprobante de pago en efectivo: $"+monto;
    }

    //Implementación específica del monto en efectivo
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo Pago,
    al llamar a getMonto() se ejecutará esta versión si el objeto es PagoEfectivo.
    Cada clase implementa el método a su manera, permitiendo que un mismo mensaje tenga
    distintos comportamientos según el tipo de objeto.*/
    @Override
    public double getMonto() {
        return monto;
    }
    
}


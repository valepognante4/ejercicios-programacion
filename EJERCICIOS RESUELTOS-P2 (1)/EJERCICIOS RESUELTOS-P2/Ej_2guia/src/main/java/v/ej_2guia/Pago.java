
package v.ej_2guia;

/*En este caso podemos ver el comportamiento ya que la interfaz Pago define los métodos que cualquier forma de pago
debe tener: realizarPago(double monto), obtenerComprobante() y getMonto(). 
Acá indicamos qué debe hacer un pago, pero no cómo se hace. Esto es comportamiento porque
representa las acciones esperadas de cualquer pago.*/
public interface Pago {
    void realizarPago(double monto);
    String obtenerComprobante();
    double getMonto();
}

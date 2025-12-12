
package v.ej_5guia;

/*En este caso podemos ver la herencia junto con implementación ya que hereda los métodos
de la interfaz Vehiculo y los implementa */
public class Moto implements Vehiculo{

    //Implementamos el método acelerar
    /*Esto también muestra polimorfismo, porque si usamos una referencia del tipo Vehiculo
    al llamar acelerar() se ejecutará esta versión si el objeto es un Moto. Cada subclase
    implementa el método a su manera, permitiendo que un mismo mensaje se comporte distinto
    según el vehículo que sea.*/
    @Override
    public void acelerar() {
        System.out.println("La moto esta acelerando...");
    }

    //Implementamos el método frenar
    /*Esto también muestra polimorfismo, porque si usamos una referencia del tipo Vehiculo
    al llamar a frenar() se ejecutará esta versión si el objeto es un Moto. Cada subclase
    implementa el método a su manera, permitiendo que un mismo mensaje se comporte distinto
    según el vehículo que sea.*/
    @Override
    public void frenar() {
        System.out.println("La moto esta frenando...");
    }
    
}

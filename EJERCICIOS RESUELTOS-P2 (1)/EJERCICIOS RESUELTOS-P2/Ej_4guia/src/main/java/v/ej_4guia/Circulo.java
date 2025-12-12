package v.ej_4guia;

/*En este caso podemos ver la herencia junto con implementación ya que hereda los métodos
de la interfaz Figura y los implementa */
public class Circulo implements Figura {

    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    //Implementamos la lógica para calcular el área del Círculo
    /*Esto también muestra polimorfismo, porque si usamos una referencia del tipo Figura
    al llamar a area() se ejecutará esta versión si el objeto es un Círculo. Cada subclase
    implementa el método a su manera, permitiendo que un mismo mensaje se comporte distinto
    según la figura que sea.*/
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }

    //Implementamos la lógica para caluclar el perímetro del Círculo
    /*Esto también muestra polimorfismo, porque si usamos una referencia del tipo Figura
    al llamar a perimetro() se ejecutará esta versión si el objeto es un Círculo. Cada subclase
    implementa el método a su manera, permitiendo que un mismo mensaje se comporte distinto
    según la figura que sea.*/
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

}



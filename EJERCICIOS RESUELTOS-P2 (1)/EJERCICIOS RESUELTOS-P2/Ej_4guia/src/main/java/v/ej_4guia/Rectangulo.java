
package v.ej_4guia;

/*En este caso podemos ver la herencia junto con implementación ya que hereda los métodos
de la interfaz Figura y los implementa */
public class Rectangulo implements Figura {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
 
    //Implementamos la lógica para calcular el área del Rectangulo
    /*Esto también muestra polimorfismo, porque si usamos una referencia del tipo Figura
    al llamar a area() se ejecutará esta versión si el objeto es un Rectangulo. Cada subclase
    implementa el método a su manera, permitiendo que un mismo mensaje se comporte distinto
    según la figura que sea.*/
    @Override
    public double area() {
        return base*altura;
    }

    //Implementamos la lógica para caluclar el perímetro del Rectangulo
    /*Esto también muestra polimorfismo, porque si usamos una referencia del tipo Figura
    al llamar a perimetro() se ejecutará esta versión si el objeto es un Rectangulo. Cada subclase
    implementa el método a su manera, permitiendo que un mismo mensaje se comporte distinto
    según la figura que sea.*/
    @Override
    public double perimetro() {
        return 2*(base+altura);
    }
    
}


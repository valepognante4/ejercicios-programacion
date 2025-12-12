
package v.ej_3guia;

/*En este caso podemos ver la herencia al utilizar el extends ya que nos esta indicando que 
la clase Diseniador(subclase) hereda de la clase Empleado(superclase)*/
public class Diseniador extends Empleado{
    private String herramienta;

    public Diseniador(String nombre, double salario, String herramienta) {
        
        /*Dentro de este constructor podemos ver que el diseñador hereda el nombre y salario de
        la clase Empleado a través del super*/
        super(nombre, salario);
        this.herramienta=herramienta;
    }

    /*En este caso se cumple la implementación ya que se esta definiendo cómo trabaja un Diseñador,
     dando cuerpo al método abstracto trabajar() de la clase Empleado.*/
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo
    Empleado, al llamar a trabajar() se ejecutará esta versión si el objeto es Diseñador.
    Cada subclase implementa el método a su manera, permitiendo que un mismo mensaje
    se comporte distinto según el tipo de empleado.*/
    @Override
    public void trabajar() {
        System.out.println(nombre+" esta diseñando con "+herramienta);
    }

    /*En este caso también se cumple la implementación ya que se esta especificando cómo calcular el bono de un 
    Diseñador (15% del salario)*/
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo
    Empleado, al llamar a calcularBono() se ejecutará esta versión si el objeto es Diseñador.
    Cada subclase implementa el método a su manera, permitiendo que un mismo mensaje
    se comporte distinto según el tipo de empleado.*/
    @Override
    public double calcularBono() {
        return salario*0.15;
    }

    /*En este caso también se cumple la implementación ya que esta definiendo cómo mostrar los detalles 
    del Diseñador.*/
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo
    Empleado, al llamar a getDetalles() se ejecutará esta versión si el objeto es Diseñador.
    Cada subclase implementa el método a su manera, permitiendo que un mismo mensaje
    se comporte distinto según el tipo de empleado.*/
    @Override
    public String getDetalles() {
      return nombre+ " - Diseñador - Salario: $"+salario+" - Herramienta: "+herramienta;
    }
    
}


package v.ej_3guia;

/*En este caso podemos ver la herencia al utilizar el extends ya que nos esta indicando que 
la clase Programador(subclase) hereda de la clase Empleado(superclase)*/
public class Programador extends Empleado{
    private String lenguaje;


    public Programador(String nombre, double salario, String lenguaje) {
        
        /*Dentro de este constructor podemos ver que el programador hereda el nombre y salario de la
        clase Empleado a través del super*/
        super(nombre, salario);
        this.lenguaje=lenguaje;
    }

    /*En este caso se cumple la implementación ya que se esta definiendo cómo trabaja un Programador,
     dando cuerpo al método abstracto trabajar() de la clase Empleado.*/
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo
    Empleado, al llamar a trabajar() se ejecutará esta versión si el objeto es Programador.
    Cada subclase implementa el método a su manera, permitiendo que un mismo mensaje
    se comporte distinto según el tipo de empleado.*/
    @Override
    public void trabajar() {
        System.out.println(nombre+" esta programando en "+lenguaje);
    }

    /*En este caso también se cumple la implementación ya que se esta especificando cómo calcular el bono de un 
    Programador (20% del salario)*/
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo
    Empleado, al llamar a calcularBono() se ejecutará esta versión si el objeto es Programador.
    Cada subclase implementa el método a su manera, permitiendo que un mismo mensaje
    se comporte distinto según el tipo de empleado.*/
    @Override
    public double calcularBono() {
        return salario*0.20;
    }

    /*En este caso también se cumple la implementación ya que esta definiendo cómo mostrar los detalles 
    del Programador.*/
    /*Esto también muestra el polimorfismo, porque si usamos una referencia del tipo
    Empleado, al llamar a getDetalles() se ejecutará esta versión si el objeto es Programador.
    Cada subclase implementa el método a su manera, permitiendo que un mismo mensaje
    se comporte distinto según el tipo de empleado.*/
    @Override
    public String getDetalles() {
      return nombre+ " - Programador - Salario: $"+salario+" - Lenguaje: "+lenguaje;
    }
    
}

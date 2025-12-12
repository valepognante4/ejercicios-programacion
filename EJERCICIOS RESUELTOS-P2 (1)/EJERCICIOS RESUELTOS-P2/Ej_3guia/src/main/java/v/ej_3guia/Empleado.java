
package v.ej_3guia;

public abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    /*En este caso podemos ver el comportamiento ya que este método abstracto define lo que todos los empleados
    deben hacer (trabajar) pero no se indica como lo harán. Cada subclase decidirá su propia forma.*/
    public abstract void trabajar();
    
    /*En este caso podemos ver el comportamiento ya que este método abstracto define que todos los empleados
    deben calcular un bono, pero no dice cómo debe hacerlo. Las subclases se encargarán de su implementación.*/
    public abstract double calcularBono();
    
    /*En este caso podemos ver el comportamiento ya que este método abstracto define que todo empleado
    debe mostrar sus detalles, pero no dice cómo debe hacerlo. Cada subclase lo implementará de manera distinta.*/
    public abstract String getDetalles();
}

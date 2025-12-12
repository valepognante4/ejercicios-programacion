
package v.ej_7guia;

/*En esta clase se representa un libro de la biblioteca. Acá se implementa el comportamiento
propio de un libro(prestarse, devolverse, consultar su estado) ya que se centra en el qué 
en vez del cómo*/
public class Libro {
    private String titulo;
    private boolean prestado;
    
    
    public Libro(String titulo){
        this.titulo=titulo;
        this.prestado=false;
    }


    public String getTitulo() {
        return titulo;
    }

    /* En este caso podemos ver el comportamiento ya que se puede consultar si el libro está prestado*/
    public boolean isPrestado() {
        return prestado;//Implementación ya que devuelve el valor del atributo prestado
    }
    
    //En este caso podemos ver el comportamiento ya que el libro puede prestarse
    public void prestar(){
        prestado=true;//Implementación ya que cambia el estado interno a true
    }
    
    
    //En este caso podemos ver el comportamiento ya que el libro puede devolverse
    public void devolver(){
        prestado=false;//Implementación ya que cambia el estado interno a false
    }

    /*En este caso podemos ver el polimorfismo ya que se sobrescribe el método toString()
    heredado de Object para que cada objeto Libro se muestre con su título y estado.
    También podemos ver la herencia, ya que Libro hereda de Object implícitamente */
    @Override
    public String toString(){
        return titulo + (prestado ? " (Prestado) ": " (Disponible)");
    }

}

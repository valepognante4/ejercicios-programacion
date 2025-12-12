
package v.ej_1guia;

/*En este caso podemos ver el comportamiento ya que la interfaz define qué métodos debe 
tener cualquier reproductor de música (reproducir, pausar, detener), pero no dice cómo se hacen.*/
public interface ReproductorMusica {
    void reproducir();
    void pausar();
    void detener();
}

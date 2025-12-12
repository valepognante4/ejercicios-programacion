
package v.ej_1guia;

/* En este caso podemos ver la herencia junto con la implementación ya que la clase ReproductorStreaming 
hereda (implements) de la interfaz ReproductorMusica lo que la obliga a implementar todos sus métodos. 
Acá es donde se da la implementación concreta para música Streaming ya que se centra en cómo lo hace.*/
public class ReproductorStreaming implements ReproductorMusica {
    private String url;

    public ReproductorStreaming(String url) {
        this.url = url;
    }
    
    //Implementación específica para reproducir música Streaming
    /*Esto también permite el polimorfismo ya que si se usa una referencia del tipo
    ReproductorMusica, se ejecutará esta versión cuando el objeto sea un ReproductorStreaming*/
    @Override
    public void reproducir() {
        System.out.println("Transmitiendo música desde url: "+url);
    }

    //Implementación específica para pausar música Streaming
    /*Esto también permite el polimorfismo ya que si se usa una referencia del tipo
    ReproductorMusica, se ejecutará esta versión cuando el objeto sea un ReproductorStreaming*/
    @Override
    public void pausar() {
        System.out.println("Pausando transmisión desde url: "+url);
    }

    //Implementación específica para detener música Streaming
    /*Esto también permite el polimorfismo ya que si se usa una referencia del tipo
    ReproductorMusica, se ejecutará esta versión cuando el objeto sea un ReproductorStreaming*/
    @Override
    public void detener() {
       System.out.println("Deteniendo transmisión desde url: "+url);
    }
    
}


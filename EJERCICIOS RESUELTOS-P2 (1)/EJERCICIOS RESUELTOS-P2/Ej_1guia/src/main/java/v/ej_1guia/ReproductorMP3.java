
package v.ej_1guia;

/* En este caso podemos ver la herencia junto con la implementación ya que la clase ReproductorMP3 
hereda (implements) de la interfaz ReproductorMusica lo que la obliga a implementar todos sus métodos. 
Acá es donde se da la implementación concreta para archivos MP3 ya que se centra en cómo lo hace.*/
public class ReproductorMP3 implements ReproductorMusica {
    private String archivo;

    public ReproductorMP3(String archivo) {
       this.archivo=archivo;
    }
    
    //Implementación específica para reproducir un MP3
    /*Esto también permite el polimorfismo ya que si se usa una referencia del tipo
    ReproductorMusica, se ejecutará esta versión cuando el objeto sea un ReproductorMP3*/
    @Override
    public void reproducir() {
        System.out.println("Reproduciendo archivo MP3: "+archivo);
    }

    //Implementación específica para pausar un MP3
    /*Esto también permite el polimorfismo ya que si se usa una referencia del tipo
    ReproductorMusica, se ejecutará esta versión cuando el objeto sea un ReproductorMP3*/
    @Override
    public void pausar() {
        System.out.println("Pausando reproducción de archivo MP3: "+archivo);
    }

    //Implementación específica para detener un MP3
    /*Esto también permite el polimorfismo ya que si se usa una referencia del tipo
    ReproductorMusica, se ejecutará esta versión cuando el objeto sea un ReproductorMP3*/
    @Override
    public void detener() {
       System.out.println("Deteniendo reproducción de archivo MP3: "+archivo);
    }
    
}



package conectbd_11;

public class Curso {
   private int id;
   private String nombre;
   private String profesor;
   private int creditos;

    public Curso(int id, String nombre, String profesor, int creditos) {
        this.id = id;
        this.nombre = nombre;
        this.profesor = profesor;
        this.creditos = creditos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", profesor=" + profesor + ", credito=" + creditos + '}';
    }
   
    
   
}

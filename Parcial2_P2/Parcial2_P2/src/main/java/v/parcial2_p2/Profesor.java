
package v.parcial2_p2;

public class Profesor extends Persona {
    public Profesor(String nombre, String dni) throws DniInvalidoException {
        super(nombre, dni);
    }

    @Override
    public String toString() {
        return "Profesor: " + nombre + ", DNI: " + dni;
    }
}
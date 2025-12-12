
package v.parcial2_p2;

abstract class Persona {
    protected String nombre;
    protected String dni;

    public Persona(String nombre, String dni) throws DniInvalidoException {
        if (!dni.matches("\\d{7,}")) {
            throw new DniInvalidoException("DNI inválido: " + dni);
        }
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }

    public abstract String toString();
}
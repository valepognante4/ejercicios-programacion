
package v.parcial2_p2;

class Estudiante extends Persona implements Prestable {
    private Materia materia;
    private Nota nota;

    public class Nota {
        private double valor;
        private String observaciones;

        public Nota(double valor, String observaciones) {
            this.valor = valor;
            this.observaciones = observaciones;
        }

        public double getValor() { return valor; }

        @Override
        public String toString() {
            return "Nota: "+valor + " (" + observaciones + ")";
        }
    }

    public Estudiante(String nombre, String dni, Materia materia, double notaValor, String obs) throws DniInvalidoException {
        super(nombre, dni);
        this.materia=materia;
        this.nota=new Nota(notaValor, obs);
    }

    public Nota getNota() { return nota; }
    public Materia getMateria() { return materia; }

    @Override
    public void asistir() {
        System.out.println(nombre+" asistió a clase.");
    }

    @Override
    public void retirarse() {
        System.out.println(nombre+" se retiró de clase.");
    }

    @Override
    public String toString() {
        return "Estudiante: " + nombre + ", DNI: " + dni + ", Materia: " + materia + ", " + nota;
    }
}

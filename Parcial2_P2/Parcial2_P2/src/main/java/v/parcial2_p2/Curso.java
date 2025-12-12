package v.parcial2_p2;

import java.util.*;

class Curso<T extends Estudiante> {

    private List<T> estudiantes;

    public Curso() {
        estudiantes = new ArrayList<>();
    }

    public void agregar(T est) {
        estudiantes.add(est);
    }

    public void mostrarEstudiantes() {
        for (T est : estudiantes) {
            System.out.println(est);
        }
    }

    public void ordenarPorNombre() {
        for (int i=1;i<estudiantes.size();i++) {
            T actual = estudiantes.get(i);
            int j=i-1;
            while (j>=0 && estudiantes.get(j).getNombre().compareToIgnoreCase(actual.getNombre()) > 0) {
                estudiantes.set(j+1, estudiantes.get(j));
                j--;
            }
            estudiantes.set(j+1, actual);
        }
    }

    public void ordenarPorNota() {
        for (int i=0;i<estudiantes.size() - 1; i++) {
            int min=i;
            for (int j=i+1; j<estudiantes.size(); j++) {
                if (estudiantes.get(j).getNota().getValor() < estudiantes.get(min).getNota().getValor()) {
                    min=j;
                }
            }
            Collections.swap(estudiantes, i, min);
        }
    }

    public T busquedaSecuencial(String nombre) throws EstudianteNoEncontradoException {
        for (T est : estudiantes) {
            if (est.getNombre().equalsIgnoreCase(nombre)) {
                return est;
            }
        }
        throw new EstudianteNoEncontradoException("Estudiante con nombre '" + nombre + "' no encontrado.");
    }

    public T busquedaBinaria(String dni) throws EstudianteNoEncontradoException {
        estudiantes.sort(Comparator.comparing(Estudiante::getDni));
        int izquierda = 0, derecha = estudiantes.size() - 1;
        while (izquierda <= derecha) {
            int medio = (izquierda + derecha) / 2;
            int actualDni=estudiantes.get(medio).getDni().compareTo(dni);
            if (actualDni==0) {
                return estudiantes.get(medio);
            } else if (actualDni < 0) {
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        throw new EstudianteNoEncontradoException("Estudiante con DNI '" + dni + "' no encontrado.");
    }

    public int contarAprobados() {
        return contarRecursivo(0);
    }

    private int contarRecursivo(int i) {
        if (i>=estudiantes.size()) {
            return 0;
        }
        return (estudiantes.get(i).getNota().getValor() > 6 ? 1 : 0)+contarRecursivo(i+1);
    }
}




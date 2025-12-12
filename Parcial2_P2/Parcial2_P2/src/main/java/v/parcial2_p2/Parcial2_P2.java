package v.parcial2_p2;

import java.util.Scanner;

public class Parcial2_P2 {

    public static void main(String[] args) {
        try {
            Persona[] personas = new Persona[]{
                new Profesor("Carlos", "12345678"),
                new Estudiante("Valentina", "46768185", Materia.PROGRAMACION, 9, "Excelente"),
                new Estudiante("Lucía", "34567890", Materia.FISICA, 5, "Debe mejorar"),
                new Estudiante("Bruno", "45678901", Materia.MATEMATICA, 7, "Bien")
            };

            System.out.println("Listado de personas: ");
            for (Persona p : personas) {
                System.out.println(p.toString());
            }

            Curso<Estudiante> curso = new Curso<>();
            for (Persona p : personas) {
                if (p instanceof Estudiante) {
                    curso.agregar((Estudiante) p);
                }
            }

            System.out.println("\nEstudiantes ordenados por nombre:");
            curso.ordenarPorNombre();
            curso.mostrarEstudiantes();

            System.out.println("\nEstudiantes ordenados por nota:");
            curso.ordenarPorNota();
            curso.mostrarEstudiantes();

            Scanner teclado = new Scanner(System.in);

            System.out.print("\nIngrese el nombre del estudiante a buscar (búsqueda secuencial): ");
            String nombreBuscado = teclado.nextLine();
            try {
                Estudiante est = curso.busquedaSecuencial(nombreBuscado);
                System.out.println("Estudiante encontrado: " + est);
            } catch (EstudianteNoEncontradoException e) {
                System.out.println("No se encontró: " + e.getMessage());
            }

            System.out.print("\nIngrese el DNI del estudiante a buscar (búsqueda binaria): ");
            String dniBuscado=teclado.nextLine();
            try {
                Estudiante estPorDni=curso.busquedaBinaria(dniBuscado);
                System.out.println("Estudiante encontrado por DNI: " + estPorDni);
            } catch (EstudianteNoEncontradoException e) {
                System.out.println("No se encontró: " + e.getMessage());
            }

            System.out.println("\nCantidad de estudiantes con nota mayor a 6: " + curso.contarAprobados());

            teclado.close();

        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
      

 
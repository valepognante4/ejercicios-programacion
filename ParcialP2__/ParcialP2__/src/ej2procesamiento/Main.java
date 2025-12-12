package ej2procesamiento;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> puntajes = new LinkedList<>();
        puntajes.add(70);
        puntajes.add(85);
        puntajes.add(60);
        puntajes.add(90);
        puntajes.add(75);

        System.out.println("Puntajes originales: " + puntajes);

        Queue<String> solicitudes = new LinkedList<>();
        Stack<String> operaciones = new Stack<>();

        solicitudes.offer("Solicitud análisis semanal");
        solicitudes.offer("Solicitud informe mensual");
        solicitudes.offer("Solicitud revisión individual");

        operaciones.push("Carga de puntajes");
        operaciones.push("Procesamiento de datos");
        operaciones.push("Generación de informe");

        System.out.println("\nCola de solicitudes: " + solicitudes);
        System.out.println("Pila de operaciones: " + operaciones);

        long inicio = System.nanoTime();
        QuickSort.sort(puntajes, 0, puntajes.size() - 1);
        long fin = System.nanoTime();

        double tiempoMs = (fin - inicio) / 1_000_000.0;
        System.out.println("\nPuntajes ordenados (QuickSort): " + puntajes);
        System.out.printf("Tiempo de ejecución: %.3f ms%n", tiempoMs);

        double promedio = PromedioRecursivo.calcularPromedio(puntajes,0,0);
        System.out.printf("Promedio (recursivo): %.2f%n", promedio);

    }
}



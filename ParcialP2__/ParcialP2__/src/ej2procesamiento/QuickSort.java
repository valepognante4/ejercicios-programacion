package ej2procesamiento;


import java.util.LinkedList;

public class QuickSort {

    public static void sort(LinkedList<Integer> lista, int inicio, int fin) {
        if (inicio < fin) {
            int pivoteIndex = particionar(lista, inicio, fin);
            sort(lista, inicio, pivoteIndex - 1);
            sort(lista, pivoteIndex + 1, fin);
        }
    }

    private static int particionar(LinkedList<Integer> lista, int inicio, int fin) {
        int pivote = lista.get(fin);
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            if (lista.get(j) <= pivote) {
                i++;
                intercambiar(lista, i, j);
            }
        }
        intercambiar(lista, i + 1, fin);
        return i + 1;
    }

    private static void intercambiar(LinkedList<Integer> lista, int i, int j) {
        int temp = lista.get(i);
        lista.set(i, lista.get(j));
        lista.set(j, temp);
    }

}


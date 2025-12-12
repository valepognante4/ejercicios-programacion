package ej2procesamiento;

import java.util.LinkedList;

public class PromedioRecursivo {
    public static double calcularPromedio(LinkedList<Integer> lista, int indice, double suma) {
        if(indice == lista.size()) {
            return suma / lista.size();
        }
        return calcularPromedio(lista, indice + 1, suma + lista.get(indice));
    }
}




package v.ej_4guia;

import java.util.ArrayList;
import java.util.List;

public class GestorFiguras {

    private List<Figura> figuras;

    public GestorFiguras() {
        figuras = new ArrayList<>();
    }

    //Implementamos la lógica para agregar figuras a la lista
    public void agregarFigura(Figura f) {
        figuras.add(f);
    }

    //Implementamos la lógica para mostrar las figuras
    public void mostrarFiguras() {
        if (figuras.isEmpty()) {
            System.out.println("No hay figuras registradas.");

        } else {
            for (Figura f : figuras) {

                /*En este caso podemos ver el polimorfismo ya que la referencia "f" es de
                tipo Figura, pero en tiempo de ejecución puede ser un Círculo, Rectangulo o
                Triangulo. Los métodos f.area() y f.perimetro() se ejecutan según la implementación
                de la subclase correspondiente.*/
                System.out.println(f.getClass().getSimpleName()
                        + "- Área: " + f.area()
                        + ", Perímetro: " + f.perimetro());
            }
        }
    }

    //Implementamos la lógica para el calculo del área total
    public double areaTotal() {
        double total = 0;
        for (Figura f : figuras) {

            /*En este caso podemos ver polimorfismo ya que la referencia "f" es de tipo 
            Figura, pero en tiempo de ejecución puede ser un Círculo, Rectangulo o Triangulo.
            Al llamar a f.area(), se ejecuta la implementación específica de cada subclase,
            sumando correctamente el área total de todas las figuras*/
            total += f.area();
        }
        return total;
    }

}


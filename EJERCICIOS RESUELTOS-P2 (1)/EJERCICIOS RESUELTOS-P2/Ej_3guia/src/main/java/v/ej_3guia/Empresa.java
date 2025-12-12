
package v.ej_3guia;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Empleado> empleados;
    
    public Empresa(){
        empleados=new ArrayList<>();
    }
    
    //Implementamos la lógica para agregar empleados a la lista
    public void agregarEmpleado(Empleado e){
        empleados.add(e);
    }
    
    //Implementamos la lógica para recorrer la lista y mostrar los empleados
    public void listarEmpleados(){
        if(empleados.isEmpty()){
            System.out.println("No hay empleados en lla empresa");
        }else{
            System.out.println("Lista de empleados: ");
            for(Empleado e:empleados){
    
                /*En este caso podemos ver polimorfismo ya que aunque usemos la referencia genérica
                "Empleado" en tiempo de ejecución se ejecuta el getDetalles() de la subclase Programador o Diseñador*/
                System.out.println(e.getDetalles());
            }
        }
    }
    
    //Implementamos la lógica para calcular el gasto total de la empresa sumando salarios y bonos
    public double calcularGastoTotal(){
        double total=0;
        for(Empleado e:empleados){

            /*En este caso podemos ver el polimorfismo ya que el método calcularBono() se comporta diferente
            según si el objeto es un Programador o Diseñador*/
            total+=e.getSalario()+e.calcularBono();
        }
        return total;
    }
    
    
}

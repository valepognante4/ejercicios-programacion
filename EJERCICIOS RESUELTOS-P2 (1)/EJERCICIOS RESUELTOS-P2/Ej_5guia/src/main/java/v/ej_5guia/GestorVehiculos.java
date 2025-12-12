
package v.ej_5guia;

import java.util.ArrayList;
import java.util.List;

public class GestorVehiculos {
    private List<Vehiculo> vehiculos=new ArrayList<>();
    
    //Implementamos la lógica para agregar vehiculos a la lista
    public void agregarVehiculo(Vehiculo v){
        if(v!=null){
            vehiculos.add(v);
            System.out.println("Vehículo creado: "+v.getClass().getSimpleName());
        }
    }

    //Implementamos la lógica para mostrar los vehículos
    public void mostrarVehiculos(){
        System.out.println("--- Vehículos registrados ---");
        if(vehiculos.isEmpty()){
            System.out.println("No hay vehiculos registrados");
        }else{
            for(Vehiculo v:vehiculos){
                System.out.println(v.getClass().getSimpleName());
            }
        }
    }
    
    //Implementamos la lógica para acelerar todos los vehículos
    public void acelerarTodos(){
        for(Vehiculo v:vehiculos){
            
            /*En este caso podemos ver el polimorfismo ya que la referencia "v" es de
            tipo Vehiculo, pero en tiempo de ejecución puede ser un Auto, Moto o
            Camion. El método v.acelerar()se ejecuta según la implementación
            de la subclase correspondiente.*/
            v.acelerar();
        }
    }
    
    //Implementamos la lógica para frenar todos los vehículos
    public void frenarTodos(){
         for(Vehiculo v:vehiculos){
             
            /*En este caso podemos ver el polimorfismo ya que la referencia "v" es de
            tipo Vehiculo, pero en tiempo de ejecución puede ser un Auto, Moto o
            Camion. El método v.frenar()se ejecuta según la implementación
            de la subclase correspondiente.*/
            v.frenar();
        }
    }

}

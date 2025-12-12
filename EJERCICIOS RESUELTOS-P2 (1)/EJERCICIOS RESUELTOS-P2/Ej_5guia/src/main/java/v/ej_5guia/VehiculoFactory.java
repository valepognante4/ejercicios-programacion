
package v.ej_5guia;

/*En este caso aplicamos el patrón de diseño Factory. La clase se encarga de crear 
instancias de distintos vehiculos según el tipo ingresado.*/
public class VehiculoFactory {
    public static Vehiculo crearVehiculo(String tipo){
        if(tipo==null){
            return null;
        }
        switch(tipo.toLowerCase()){
            case "auto":
                return new Auto();
            case "moto":
                return new Moto();
            case "camion":
                return new Camion();
            default:
                System.out.println("Tipo de vehículo no reconocido: " + tipo);
                return null;
        }
    }
}


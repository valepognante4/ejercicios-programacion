
package v.ej2parcialp2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ej2parcialp2 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        System.out.println("ingrese una oración completa: ");
        String cadena=teclado.nextLine();
        
        if(cadena.trim().isEmpty()){
            System.out.println("No se ingresó ninguna oración");
            return;
        }
        
        String[] palabraArray=cadena.trim().split("\\s+");
        ArrayList<String> palabras=new ArrayList<>(Arrays.asList(palabraArray));
        
        System.out.println("Listado de palabras de la oración: ");
        int contador=0;
        for(String palabra: palabras){
            System.out.println(palabra);
            contador++;
        }
        System.out.println("La cantidad de palabras que hay son: "+contador);
        
        System.out.println(" ");
        
        String palabralarga=" ";
        for(String palabra: palabras){
           if(palabra.length()>palabralarga.length()){
               palabralarga=palabra;
           }
        }
        System.out.println("La palabra más larga es: "+palabralarga);
        
        System.out.println(" ");
        
        boolean encontrada=false;
        for(String palabra: palabras){
            String cad="Java";
            if(palabra.equalsIgnoreCase(cad)){
                encontrada=true;
            }
        }
        
         if(encontrada){
            System.out.println("La palabra java está en la oración");
        }else{
            System.out.println("La palabra java no esta en la oración");
        }
        
        
       

     

      
        
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cadena_Ejercicio_8;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class ServiceCadena {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena_Ejercicio_8 cadena = new Cadena_Ejercicio_8();
    
    public void menu(){
    
        System.out.println("Ingrese la frase: ");
        cadena.setFrase(leer.nextLine().toUpperCase());
        cadena.setCantidad(cadena.getFrase().length());
        mostrarVocales();
        invertirFrase();
        System.out.println("Ingrese la letra a buscar dentro de la frase: ");
        vecesRepetido(leer.next().toUpperCase());
        System.out.println("Ingrese otra frase para comparar longitud: ");
        compararLongitud(leer.next().toUpperCase());
        System.out.println("Ingrese una nueva frase para concatenar con la anterior");
        unirFrases(leer.next().toUpperCase());
        System.out.println("Ingrese por que caracter quiere intercambia la letra A: ");
        reemplazar(leer.next().toUpperCase());
        System.out.println("Ingrese la letra para comparar si la frase la contiene: ");
        System.out.println("Contiene? --> "+contiene(leer.next().toUpperCase()));
    }
    
    public void mostrarVocales(){
    
        int contadorVocal = 0;
        for (int i = 0; i < cadena.getCantidad(); i++) {
            
            char caracter = cadena.getFrase().charAt(i);
            
            if(caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
                
                contadorVocal++;
            }           
                       
        }        
        System.out.println("Cantidad de vocales encontradas en la frase es de --> "+contadorVocal);
    }
    
    public void invertirFrase(){
        
        String fraseInvertida = "";
        for (int i = cadena.getCantidad()-1; i >= 0; i--) {
            
            fraseInvertida += cadena.getFrase().charAt(i);            
        }
        
        System.out.println("Cadena original --> "+cadena.getFrase());
        System.out.println("Cadena invertida --> "+fraseInvertida);
    }
    
    public void vecesRepetido(String letra){
        
        int repetido = 0;
        
        for (int i = 0; i < cadena.getCantidad(); i++) {
            
            if(cadena.getFrase().charAt(i) == letra.charAt(0)){
                
                repetido++;
            }            
        }
        System.out.println("La frase ingresada es: "+cadena.getFrase());
        System.out.println("La cantidad de veces que se repite "+letra+" es de --> "+repetido);
    }
    
    public void compararLongitud(String frase1){
        
        if(cadena.getCantidad() == frase1.length()){
            
            System.out.println("La longitud de ambas frases son iguales");
            
        }else{
            System.out.println("La longitud de ambas frases no son iguales");
        }
    }
    
    public void unirFrases(String fraseNueva){
        
        System.out.println("La frase concatenada quedaria --> "+cadena.getFrase().concat(" "+fraseNueva));
        
    }
    
    public void reemplazar(String letra){
        
        String nuevaFrase = "";
        for (int i = 0; i < cadena.getCantidad(); i++) {
            
            if(cadena.getFrase().charAt(i) == 'A'){
                nuevaFrase = cadena.getFrase();
                
                //nuevaFrase += cadena.getFrase().replace(cadena.getFrase().charAt(i), letra.charAt(0));
            }
        }              
        
        
        System.out.println("Frase original --> "+cadena.getFrase());
        System.out.println("Frase reemplazada --> "+nuevaFrase.replace("A", letra));
//        cadena.setFrase().replace(letra, "A");
    }
    
    public boolean contiene(String letra){
        
        for (int i = 0; i < cadena.getCantidad(); i++) {
            
            if(cadena.getFrase().charAt(i) == letra.charAt(0)){
                
                return true;
                
            }
        }
        return false;
    }
}

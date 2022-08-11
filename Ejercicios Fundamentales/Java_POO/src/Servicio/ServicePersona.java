/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona_Ejercicio_7;
import java.util.Scanner;

public class ServicePersona {
    
    Scanner leer = new Scanner(System.in);
    Persona_Ejercicio_7 persona = new Persona_Ejercicio_7();
    
    public int menorIMC;
    public int idealIMC;
    public int mayorIMC;
    public int mayorEdad;
    public int menorEdad;
    
    
    
    public Persona_Ejercicio_7 crearPersona(){
    
        System.out.println("Ingrese el Nombre: ");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad: ");
        persona.setEdad(leer.nextInt());
        System.out.println("Ingrese el Sexo---> H = Hombre / M = Mujer / O = Otro");
        String op = leer.next().toUpperCase();
        while(!"H".equals(op) && !"M".equals(op) && !"O".equals(op)){
            
            System.out.println("Lo ingresado no esta entre las opciones --> H / M / O");
            op = leer.next().toUpperCase();
        }
        persona.setSexo(op);
        System.out.println("Ingrese el peso: ");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura: ");
        persona.setAltura(leer.nextDouble());
        
        return persona;
    
    }
    
    public double calcularIMC(Persona_Ejercicio_7 persona1){
        
        double IMC = persona1.getPeso() / Math.pow(persona1.getAltura(), 2);
        
        if(IMC < 20){
            
            return -1;
            
        }else if(IMC >= 20 && IMC <= 25){
            
            return 0;
            
        }else if(IMC > 25){
            
            return 1;
            
        }
        return 10;
    }
    
    public boolean esMayorDeEdad(){
        
        return persona.getEdad() > 18;
                   
    }
    
    public void instanciarPersona(){
        
        int contadorPersona = 0;
               
        do {        
            
            persona = crearPersona();
            if(calcularIMC(persona) == -1){
                
                this.menorIMC++;
                System.out.println("Se peso se encuentra por debajo del peson ideal");
                
            }else if(calcularIMC(persona) == 0){
                
                this.idealIMC++;
                System.out.println("Se encuentra en su peso ideal");
                
            }else if(calcularIMC(persona) == 1){
                
                this.mayorIMC++;
                System.out.println("Tiene sobrepeso");
                
            }
            
            if(esMayorDeEdad()){
            
                this.mayorEdad++;
                System.out.println("Es Mayor de edad");
            }else{
                
                this.menorEdad++;
                System.out.println("No es mayor de edad");
            }
                        
            contadorPersona++;            
            
        } while (contadorPersona != 4);
        
    }
    
}

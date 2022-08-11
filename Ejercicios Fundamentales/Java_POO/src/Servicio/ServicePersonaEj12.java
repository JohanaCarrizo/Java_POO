/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona_Ejercicio_12;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class ServicePersonaEj12 {
    
    Scanner leer = new Scanner(System.in);
    Persona_Ejercicio_12 persona = new Persona_Ejercicio_12();
    
    public Persona_Ejercicio_12 crearPersona(){
        
        System.out.println("Ingrese su nombre: ");
        persona.setNombre(leer.next());
        System.out.println("Ingrese el dia: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        persona.setFecha(fecha);
        
        return persona;
    }
    
    public int calcularEdad(){
        
        Date fecha2 = new Date();
        return (fecha2.getYear() - persona.getFecha().getYear());
        
    }
    
    public boolean menorQue(int edad){
    
        if(calcularEdad() < edad){
            
            return true;            
        }else{
            return false;
        }    
    }
    
    public void mostraPersona(){
        
        System.out.println("Nombre: "+ persona.getNombre()+ "\n Fecha de Nac: "+persona.getFecha());
        
    }
    
}

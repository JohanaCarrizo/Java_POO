/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Matematica_Ejercicio_9;

/**
 *
 * @author Johana
 */
public class ServiceMatematica {
    
    Matematica_Ejercicio_9 mate = new Matematica_Ejercicio_9(Math.random()*10, Math.random()*10);
    
    public double devolverMayor(){
        
        return Math.max(mate.getNumero1(), mate.getNumero2());
        
    }
    
    public double calcularPotencia(){
        
        return Math.pow(Math.max(Math.round(mate.getNumero1()), Math.round(mate.getNumero2())), Math.min(Math.round(mate.getNumero1()), Math.round(mate.getNumero2())));
        
    }
    
    public double calcularRaiz(){
        
        return Math.sqrt(Math.min(Math.abs(mate.getNumero1()), Math.abs(mate.getNumero2())));
        
    }
    
}

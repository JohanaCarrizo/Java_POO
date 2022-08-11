/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Servicio.ServiceMatematica;
import java.util.Arrays;

/**
 *
 * @author Johana
 */
public class Main_Ejercicio_9 {

    public static void main(String[] args) {
        
        ServiceMatematica sm = new ServiceMatematica();
        
        System.out.println("El numero mayor es --> "+sm.devolverMayor());
        System.out.println("La potencia es --> "+sm.calcularPotencia());
        System.out.println("La raiz cuadrada es --> "+ sm.calcularRaiz());       
       
    }
    
}

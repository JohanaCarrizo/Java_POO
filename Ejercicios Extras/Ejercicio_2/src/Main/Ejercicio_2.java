/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Punto;
import Service.ServicePunto;

/**
 *
 * @author Johana
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicePunto sp = new ServicePunto();
        Punto punto = sp.crearPunto();
        
        System.out.println("La distancia entre los punto es de ---> "+ sp.calcularDistancia());
        
        
    }
    
}

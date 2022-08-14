/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Service.ServiceNIF;

/**
 *
 * @author Johana
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServiceNIF snif = new ServiceNIF();
        
        snif.crearNIF();
        snif.mostrarNIF();
        
    }
    
}

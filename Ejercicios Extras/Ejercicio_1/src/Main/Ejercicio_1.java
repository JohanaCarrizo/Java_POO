/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Cancion;

/**
 *
 * @author Johana
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cancion cancion = new Cancion();
        cancion.setAutor("Elvis");
        cancion.setTitulo("Cocho");
        System.out.println(cancion.getAutor()+" "+ cancion.getTitulo());
        
        
    }
    
}

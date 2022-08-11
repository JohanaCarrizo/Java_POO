/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Entidad.Rectangulo_Ejercicio_4;

/**
 *
 * @author Johana
 */
public class Main_Ejercicio_4 {

    
    public static void main(String[] args) {
        
        Rectangulo_Ejercicio_4 rec = new Rectangulo_Ejercicio_4();
        
        rec.crearRectangulo();
        System.out.println(""+rec.calcularSuperficie(rec.getBase(), rec.getAltura()));
        System.out.println(""+rec.calcularPerimetro(rec.getBase(), rec.getAltura()));
        rec.dibujarRectangulo(rec.getBase(), rec.getAltura());
    }
    
}

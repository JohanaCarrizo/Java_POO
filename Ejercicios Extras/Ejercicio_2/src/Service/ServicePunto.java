/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Punto;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class ServicePunto {
    
    Scanner leer = new Scanner(System.in);
    Punto punto = new Punto();
    
    public Punto crearPunto(){
        
        System.out.println("Ingrese el primer punto");
        System.out.println("X1 --> ");
        punto.setX1(leer.nextInt());
        System.out.println("Y1 --> ");
        punto.setY1(leer.nextInt());
        
        System.out.println("Ingrese el segundo punto");
        System.out.println("X2 --> ");
        punto.setX2(leer.nextInt());
        System.out.println("Y2 --> ");
        punto.setY2(leer.nextInt());
        
        return punto;
    
    }
    
    public double calcularDistancia(){
    
        return Math.sqrt(Math.pow((punto.getX2()-punto.getX1()), 2)+ Math.pow((punto.getY2()-punto.getY1()), 2));
        
    }
   
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Servicio.ServiceCafetera;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Main_Ejercicio_6 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        ServiceCafetera sc = new ServiceCafetera();
        
        sc.llenarCafetera();
        System.out.println("Ingrese el tamaño de la taza a llenar:");
        sc.servirTaza(leer.nextInt());
        System.out.println("Ingrese la cantidad de cafe que quiere agregar a la cafetera: ");
        sc.agregarCafe(leer.nextInt());
        //sc.vaciarCafetera();
    }
    
}

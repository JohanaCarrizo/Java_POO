/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;


public class MesSecreto {
        
    Scanner leer = new Scanner(System.in);
    String[] mes = {"enero","febrero","marzo","abril","mayo", "junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    String mesSecreto = mes[1];
    
    public void adivinarMes(){
    
        System.out.println("Adivine el mes: ");
        
        String a = leer.next().toLowerCase();
        
        while(!a.equals(mesSecreto)){
        
            System.out.println("No has acertado. Intentalo nuevamente: ");
            a = leer.next().toLowerCase();
        }
        
        System.out.println("Ha acertado!!!");
    }  
}

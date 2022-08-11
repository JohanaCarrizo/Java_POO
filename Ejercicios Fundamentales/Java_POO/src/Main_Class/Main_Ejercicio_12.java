/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Entidad.Persona_Ejercicio_12;
import Servicio.ServicePersonaEj12;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Main_Ejercicio_12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        ServicePersonaEj12 sp = new ServicePersonaEj12();
        Persona_Ejercicio_12 pe1 = sp.crearPersona();
        
        System.out.println("La edad es: "+sp.calcularEdad());
        
        System.out.println("Ingrese nueva edad: ");
        
        System.out.println("Es menor? --> "+sp.menorQue(leer.nextInt()));

        sp.mostraPersona();
    }
    
}

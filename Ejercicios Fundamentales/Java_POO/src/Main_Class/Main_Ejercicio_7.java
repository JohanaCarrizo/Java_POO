/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Entidad.Persona_Ejercicio_7;
import Servicio.ServicePersona;

/**
 *
 * @author Johana
 */
public class Main_Ejercicio_7 {

    public static void main(String[] args) {

        ServicePersona sp = new ServicePersona();

        sp.instanciarPersona();
        System.out.println("Porcentaje de persona con menor IMC ---> " + (((sp.menorIMC * 100) / 40)*10)+"%");
        System.out.println("Porcentaje de persona con ideal IMC ---> " + (((sp.idealIMC * 100) / 40)*10)+"%");
        System.out.println("Porcentaje de persona con mayor IMC ---> " + (((sp.mayorIMC * 100) / 40)*10)+"%");
        System.out.println("Porcentaje de personas de mayor de edad ---> " + (((sp.mayorEdad * 100) / 40)*10)+"%");
        System.out.println("Porcentaje de personas de menor de edad ---> " + (((sp.menorEdad * 100) / 40)*10)+"%");
    }

}

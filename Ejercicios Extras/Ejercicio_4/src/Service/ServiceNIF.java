/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.NIF;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class ServiceNIF {

    Scanner leer = new Scanner(System.in);
    NIF nif = new NIF();

    String[] vectorNif = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

    public void crearNIF() {

        System.out.println("Por favor, ingrese su DNI: ");
        nif.setDni(leer.nextInt());        
        nif.setLetra(calcularNIF());
    }

    private String calcularNIF() {

        int resto = nif.getDni() % 23;

        for (int i = 0; i < vectorNif.length; i++) {

            if (resto == i) {

                return vectorNif[i];
            }
        }

        return "";
    }
    
    public void mostrarNIF(){
        
        System.out.println("Su NIF es ---> "+nif.getDni()+"-"+nif.getLetra());
    
    }

}

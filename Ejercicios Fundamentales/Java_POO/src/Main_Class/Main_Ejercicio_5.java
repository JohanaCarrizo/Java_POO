/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Entidad.Cuenta_Ejercicio_5;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Main_Ejercicio_5 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        Cuenta_Ejercicio_5 cuenta1 = new Cuenta_Ejercicio_5();
        
        cuenta1.crearCuenta();
        System.out.println("Ingrese el saldo: ");
        cuenta1.ingresar(leer.nextDouble());
        System.out.println("Ingrese el dinero a retirar: ");
        cuenta1.retirar(leer.nextDouble());
        System.out.println("Ingrese el monto a retirar por extraccion rapida: ");
        cuenta1.extraccionRapida(leer.nextDouble());
        cuenta1.consultarSaldo();
        cuenta1.consultarDatos();
        
    }
    
}

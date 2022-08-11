/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Main_Ejercicio_11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el dia: ");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año: ");
        int anio = leer.nextInt();

        LocalDate fecha = LocalDate.of(anio, Month.of(mes) , dia);
        LocalDate fecha1 = LocalDate.now();
        System.out.println(fecha);
        System.out.println(fecha1);
        
        System.out.println("La diferencia es de: "+(fecha1.getYear() - fecha.getYear())+" años");
        

    }

}

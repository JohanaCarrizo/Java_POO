/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Entidad.Libro_Ejercicio_1;
import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Main_Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer = new Scanner(System.in);
        Libro_Ejercicio_1 libro1 = new Libro_Ejercicio_1();
        
        System.out.println("Ingrese el ISBN del libro ");
        libro1.ISBN = leer.nextInt();
        
        System.out.println("Ingrese el titulo del libro: ");
        libro1.titulo = leer.next();
        
        System.out.println("Ingrese el autor del libero: ");
        libro1.autor = leer.next();
        
        System.out.println("Ingrese la cantidad de paginas del libro: ");
        libro1.cant_pag = leer.nextInt();
        
        System.out.println(""+ libro1.toString());
        
        
        
    }
    
}

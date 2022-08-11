/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

public class Operacion_Ejercicio_3 {
    Scanner leer = new Scanner(System.in);
    private int numero1;
    private int numero2;

    public Operacion_Ejercicio_3() {
    }

    public Operacion_Ejercicio_3(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Operacion_Ejercicio_3{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }
    
    public void crearOperacion(){
        
        System.out.println("Ingrese el primer numero: ");
        this.numero1 = leer.nextInt();
        
        System.out.println("Ingese el segundo numero: ");
        this.numero2 = leer.nextInt();
    
    }
    
    public int suma(int numero1, int numero2){
        
        return numero1 + numero2;
    
    }
    
    public int resta(int numero1, int numero2){
    
        return numero1 - numero2;
    
    }
    
    public int multiplicar(int numero1, int numero2){
    
        if(numero1 != 0 && numero2 != 0){
            
            return numero1 * numero2;
        
        }else{
        
            return 0;
        
        }
    }
    
    public double dividir(int numero1, int numero2){
        
         if(numero2 != 0){
            
            return numero1 / numero2;
        
        }else{
        
            return 0;
        
        }   
    }
}

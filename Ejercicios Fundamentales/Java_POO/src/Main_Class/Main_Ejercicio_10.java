/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import java.util.Arrays;

/**
 *
 * @author Johana
 */
public class Main_Ejercicio_10 {

    public static void main(String[] args) {
        
        double[] vectorA = new double[50];
        double[] vectorB = new double[20];
        
        for (int i = 0; i < 50; i++) {
            
            vectorA[i] = Math.random();
            
        }
        
        System.out.println("-----------Arreglo A---------");
        
        for (int i = 0; i < 50; i++) {
            
            System.out.print("["+vectorA[i]+"]");
            
        }
        
        System.out.println("\n-------Arreglo B--------");
        
        Arrays.sort(vectorA);
        
         for (int i = 0; i < 20; i++) {
            
            if(i < 10){
                vectorB[i] = vectorA[i];
            }else{
                vectorB[i] = 0.5;
            }
        }
         
         for (int i = 0; i < 20; i++) {
            
            System.out.print("["+vectorB[i]+"]");
            
        }
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main_Class;

import Entidad.Operacion_Ejercicio_3;


public class Main_Ejercicio_3 {

    
    public static void main(String[] args) {
        
        Operacion_Ejercicio_3 op = new Operacion_Ejercicio_3();
        
        op.crearOperacion();
        
        System.out.println("La suma es: "+op.suma(op.getNumero1(), op.getNumero2()));
        System.out.println("La resta es: "+op.resta(op.getNumero1(), op.getNumero2()));
        
        if(op.getNumero1() == 0 || op.getNumero2() == 0){
        
            System.out.println("Error en la multiplicacion");
        
        }else{
                System.out.println("La multiplicacion es: "+ op.multiplicar(op.getNumero1(), op.getNumero2()));
                
        }
        
         if(op.getNumero2() == 0){
        
            System.out.println("Error en la division por cero");
        
        }else{
                System.out.println("La division es: "+ op.dividir(op.getNumero1(), op.getNumero2()));
                
        }
        
    }
    
}

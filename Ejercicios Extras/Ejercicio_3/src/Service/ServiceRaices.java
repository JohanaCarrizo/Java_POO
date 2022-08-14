/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Raices;
import java.util.Scanner;

//raiz con dos coluciones diferentes ---> 1, 6, 8
//raiz con unica solucion ---> 1, -4, 4

public class ServiceRaices {
    
    Scanner leer = new Scanner(System.in);    
    Raices raiz = new Raices(1, 6, 8);
    
    public double getDiscriminante(){
    
        return (Math.pow(raiz.getB(), 2)) - (4*raiz.getA()*raiz.getC());
        
    }
    
    public boolean tieneRaices(){
        
        return getDiscriminante() > 0;
    }
    
    public boolean tieneRaiz(){
    
        return getDiscriminante() == 0;
    
    }
    
    public void obtenerRaices(){
    
        System.out.println(tieneRaices() ? "Raiz Mayor ---> "+(-(raiz.getB()) + Math.sqrt(getDiscriminante()))/ (2*raiz.getA())+ 
                                                             "\nRaiz Menor ---> "+ (-(raiz.getB()) - Math.sqrt(getDiscriminante()))/ (2*raiz.getA()) : "");
       
    }
    
    public void obtenerRaiz(){
        
        System.out.println(tieneRaiz() ? "Unica solucion ---> "+(-(raiz.getB()) + Math.sqrt(getDiscriminante()))/ (2*raiz.getA()) : "");
           
    }
    
    public void calcular(){
        
        if(tieneRaices()){
        
            obtenerRaices();
            
        
        }else if(tieneRaiz()){
        
            obtenerRaiz();
        }
        
        else{
        
            System.out.println("No existe solucion");
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cafetera_Ejercicio_6;

/**
 *
 * @author Johana
 */
public class ServiceCafetera {
    
    Cafetera_Ejercicio_6 cafe = new Cafetera_Ejercicio_6(); 
    
    public void llenarCafetera() {

        cafe.setCantidadActual(cafe.getCapacidadMaxima());
        System.out.println("Cafetera llenada con: "+cafe.getCantidadActual()+"mL");
    }

    public void servirTaza(int tamanioTaza) {

        if (tamanioTaza < cafe.getCantidadActual()) {
            
            cafe.setCantidadActual(cafe.getCantidadActual()-tamanioTaza);

            System.out.println("Su taza se ha llenado... La taza s eha llenado con: "+cafe.getCantidadActual()+ " mL");

        } else if (tamanioTaza > cafe.getCantidadActual()) {
            
            cafe.setCantidadActual(tamanioTaza - cafe.getCantidadActual());

            System.out.println("Su taza se lleno con " + cafe.getCantidadActual()+" mL");

        } else {

            System.out.println("Cafetera vacia");

        }
    }

    public void vaciarCafetera() {

        cafe.setCantidadActual(0);
        System.out.println("Su cafetera se ha vaciado");
    }

    public void agregarCafe(int cantidadCafe) {
        
        if(cantidadCafe + cafe.getCantidadActual() <= cafe.getCapacidadMaxima()){
            
            cafe.setCantidadActual(cafe.getCantidadActual()+cantidadCafe);
            System.out.println("La cafetera se lleno y ahora tiene "+cafe.getCantidadActual()+" mL");
        
        }else{
            
            System.out.println("La cantidad de cafe ingresada supera a la cantidad maxima");
        }
        
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

public class Rectangulo_Ejercicio_4 {

    Scanner leer = new Scanner(System.in);
    private double altura;
    private double base;

    public Rectangulo_Ejercicio_4() {
    }

    public Rectangulo_Ejercicio_4(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void crearRectangulo() {

        System.out.println("Ingresar la base del rectangulo: ");
        this.base = leer.nextDouble();

        System.out.println("Ingresar la altura del rectangulo: ");
        this.altura = leer.nextDouble();

    }

    public double calcularSuperficie(double base, double altura) {

        return base * altura;

    }

    public double calcularPerimetro(double base, double altura) {

        return (base + altura) * 2;

    }

    public void dibujarRectangulo(double base, double altura) {

        for (int i = 1; i <= base; i++) {
            for (int j = 1; j <= altura; j++) {

                if (i == base || i == 1) {

                    System.out.print("*");

                } else if (j == altura || j == 1) {

                    System.out.print("*");

                }else{
                    
                    System.out.print(" ");
                
                }

            }
            System.out.println("");
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Johana
 */
public class Cuenta_Ejercicio_5 {

    Scanner leer = new Scanner(System.in);
    private int numCuenta;
    private int dni;
    private int saldo;

    public Cuenta_Ejercicio_5() {
    }

    public Cuenta_Ejercicio_5(int numCuenta, int dni, int saldo) {
        this.numCuenta = numCuenta;
        this.dni = dni;
        this.saldo = saldo;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void crearCuenta() {

        System.out.println("Ingrese su numero de cuenta: ");
        this.numCuenta = leer.nextInt();
        System.out.println("Ingresar el DNI: ");
        this.dni = leer.nextInt();

    }

    public void ingresar(double ingreso) {

        this.saldo += ingreso;

    }

    public void retirar(double retiro) {

        if (retiro > saldo) {

            saldo = 0;

        } else {

            saldo -= retiro;

        }

    }

    public void extraccionRapida(double extraccion) {

        double saldoPorc = saldo * 0.20;

        if (extraccion > saldoPorc) {

            System.out.println("Usted no puede retirar mas de: " + saldoPorc);

        } else {

            saldo -= extraccion;

        }
    }
    
    public void consultarSaldo(){
    
        System.out.println("Su saldo es: "+saldo);
    
    }
    
    public void consultarDatos(){
    
        System.out.println("DNI: "+dni+"\nNumero de cuenta: "+numCuenta+ "\nSaldo: "+saldo);
    }

}

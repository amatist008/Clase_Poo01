/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;

import java.util.Scanner;

public class artimetica {
    public void sumar(int a, int b){
        int suma = a + b;
        System.out.println("la suma es igual a: " + suma);
    }
    public void resta(int a, int b){
        int resta = a - b;
        System.out.println("la resta es igual a: " + resta);
    }
    public void multiplicacion(int a, int b){
        int multiplicacion = a * b;
        System.out.println("la multiplicacion es igual a: " + multiplicacion);
    }
    public void division(int a, int b){
        float division = (float)a / b;
        System.out.println("la division es igual a: " + division);
    }
    public void modulo(int a, int b){
        int modulo = a % b;
        System.out.println("la modulo es igual a: " + modulo);
    }
}

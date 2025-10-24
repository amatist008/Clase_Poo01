
package com.mycompany.poo;

public class POO { 
    public static void main(String[] args) {
       //instancia
      /* artimetica objAritmeticos = new artimetica(); 
       
       objAritmeticos.sumar(3,4);
       objAritmeticos.resta(5,4);
       objAritmeticos.multiplicacion(3,4);
       objAritmeticos.division(3,9);
       objAritmeticos.modulo(2,2);*/
       
       relacionales objRelacionales = new relacionales();
       boolean resultado = objRelacionales.igualdad(3, 9);
       System.out.println(resultado);
       
    }
}

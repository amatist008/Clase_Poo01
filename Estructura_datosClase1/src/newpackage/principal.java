/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        Operadores objO = new Operadores();//int
        
        double resta = objO.restar(9, 2);
        
        System.out.println("la resta es: "+resta);
        
    }
    
}

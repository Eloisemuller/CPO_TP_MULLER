/*
 * eloise muller 
 * Calculette TP0
TDC
Septembre 2024

 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author elois
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
  int operateur;
  int operande1;
  int operande2;
  int result;
Scanner sc = new Scanner(System.in);
operateur =sc.nextInt(); // On demande a sc de donner le prochain entier

          System.out.println("saisisez une valeur");
        operande1 =sc.nextInt();
        System.out.println("saisisez une valeur");
        operande2 =sc.nextInt();
        if (operateur == 1);
        result = operande1 + operande2;
        System.out.println("le resultat est :");
        
       
        
        
    }
    
}

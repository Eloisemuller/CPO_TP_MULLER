/*
 * eloise muller 
 * Calculette TP0
TDb
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
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
 // int operateur;
  //int operande1;
//  int operande2;
//  int result;
int operator = scanner.nextInt(); // On demande a sc de donner le prochain entier
if (operator < 1 || operator > 5) {
            System.out.println("Error: Invalid operator selected. Please choose a number between 1 and 5.");
        } else {
            // Demander à l'utilisateur une première valeur (operande1)
            System.out.println("Please enter the first operand:");
            double operande1 = scanner.nextDouble();

            // Demander à l'utilisateur une deuxième valeur (operande2)
            System.out.println("Please enter the second operand:");
            double operande2 = scanner.nextDouble();

            // Variable pour stocker le résultat
            double result = 0;

            // Calcul du résultat en fonction de l'opérateur
            switch (operator) {
                case 1: // Addition
                    result = operande1 + operande2;
                    System.out.println("The result of addition is: " + result);
                    break;
                case 2: // Soustraction
                    result = operande1 - operande2;
                    System.out.println("The result of subtraction is: " + result);
                    break;
                case 3: // Multiplication
                    result = operande1 * operande2;
                    System.out.println("The result of multiplication is: " + result);
                    break;
                case 4: // Division
                    if (operande2 != 0) {
                        result = operande1 / operande2;
                        System.out.println("The result of division is: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                case 5: // Modulo
                    if (operande2 != 0) {
                        result = operande1 % operande2;
                        System.out.println("The result of modulo is: " + result);
                    } else {
                        System.out.println("Error: Modulo by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator selected.");
                    break;
            }
        }

        // Fermeture du scanner
  

    //    System.out.println("saisisez une valeur");
    //    operande1 =sc.nextInt();
      //  System.out.println("saisisez une valeur");
        //operande2 =sc.nextInt();
//        if (operateur < 1 || operateur > 5) {
  //          System.out.println("erreur.");
    //        System.exit(0);
      //  }
        //System.out.println("s'il vous plait entrez le premier numero:");
 //       int operande1 = scanner.nextInt();

//        System.out.println("s'il vous plait entrez le second numero:");
  //      int operande2 = scanner.nextInt();
//
  //     
         
        
    }
    
}

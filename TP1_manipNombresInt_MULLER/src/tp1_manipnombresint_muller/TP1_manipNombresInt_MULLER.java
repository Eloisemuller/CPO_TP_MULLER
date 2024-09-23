/*
 * elooise muller 
tdb 
septembre 2024
TP1 part 1
 */
package tp1_manipnombresint_muller;

import java.util.Scanner;

/**
 *
 * @author elois
 */
public class TP1_manipNombresInt_MULLER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Entrer deux entiers :");
        int nombre1= sc.nextInt();
        int nombre2= sc.nextInt();
// on initialise les variables ( Q2)
int resultatsomme = nombre1 + nombre2 ;
int resultatdiff = nombre1 - nombre2;
int resultatproduit = nombre1 * nombre2;
int resultatdiv = nombre1 / nombre2;
int resultatmodulo = nombre1 % nombre2;
//affichage des résultats 
System.out.println("Le resultat de la somme des deux entiers est:" + resultatsomme );
System.out.println("Le resultat de la difference des deux entiers est:" + resultatdiff );       
System.out.println("Le resultat du produit des deux entiers est:" + resultatproduit );
System.out.println("Le resultat du quotient des deux entiers est:" + resultatdiv );
System.out.println("Le resultat du reste de la division euclidienne des deux entiers est:" + resultatmodulo );
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_muller;

import java.util.Scanner;

/**
 *
 * @author elois
 */
public class TP1_convertisseur_MULLER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Veuillez entrer une valeur réelle : ");
        
        // Lecture de la valeur réelle et stockage dans une variable de type double
        double valeur = scanner.nextDouble();
        
        // Affichage de la valeur saisie
        System.out.println("Vous avez saisi : " + valeur);
        System.out.print("Veuillez entrer une température en degrés Celsius : ");
        
        // Lecture de la température saisie par l'utilisateur et stockage dans une variable de type double
        double celsius = scanner.nextDouble();
        
        // Conversion de la température en Kelvin
        double kelvin = celsius + 273;
        
        // Affichage des résultats
        System.out.println("Température en degrés Celsius : " + celsius);
        System.out.println("Température en degrés Kelvin : " + kelvin);
    }
     // Méthode pour convertir une température en degrés Celsius vers Kelvin
    public static double CelciusVersKelvin(double tCelcius) {
        // Conversion en Kelvin
        return tCelcius + 273;
    }
    
}

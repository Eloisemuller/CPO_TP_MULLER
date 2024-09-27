/*Eloise Muller 
TDB
Septembre 2024

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
        // Création d'un objet Scanner pour lire les entrées utilisateur
        

        // Demande à l'utilisateur de saisir une valeur de température
        System.out.print("Bonjour, saisissez une valeur de température : ");
        double temperature = scanner.nextDouble();

        // Affichage du menu pour le choix de la conversion
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Fahrenheit vers Celsius");
        System.out.println("4) De Celsius vers Fahrenheit");
        System.out.println("5) De Kelvin vers Fahrenheit");
        System.out.println("6) De Fahrenheit vers Kelvin");

        // Lecture du choix de l'utilisateur
        int choix = scanner.nextInt();

        // Variable pour stocker le résultat de la conversion
        double resultat = 0;
        String uniteDepart = "";
        String uniteArrivee = "";

        // Switch pour traiter le choix de conversion
        switch (choix) {
            case 1:
                resultat = CelciusVersKelvin(temperature);
                uniteDepart = "degrés Celsius";
                uniteArrivee = "degrés Kelvin";
                break;
            case 2:
                resultat = KelvinVersCelcius(temperature);
                uniteDepart = "degrés Kelvin";
                uniteArrivee = "degrés Celsius";
                break;
            case 3:
                resultat = FarenheitVersCelcius(temperature);
                uniteDepart = "degrés Fahrenheit";
                uniteArrivee = "degrés Celsius";
                break;
            case 4:
                resultat = CelciusVersFarenheit(temperature);
                uniteDepart = "degrés Celsius";
                uniteArrivee = "degrés Fahrenheit";
                break;
            case 5:
                resultat = KelvinVersFarenheit(temperature);
                uniteDepart = "degrés Kelvin";
                uniteArrivee = "degrés Fahrenheit";
                break;
            case 6:
                resultat = FarenheitVersKelvin(temperature);
                uniteDepart = "degrés Fahrenheit";
                uniteArrivee = "degrés Kelvin";
                break;
            default:
                System.out.println("Choix invalide. Veuillez relancer le programme.");
                scanner.close();
                return; // Arrête le programme si le choix est invalide
        }

        // Affichage du résultat de la conversion
        System.out.println(temperature + " " + uniteDepart + " est égal à " + resultat + " " + uniteArrivee);

    }
    
     // Méthode pour convertir une température en degrés Celsius vers Kelvin
    public static double CelciusVersKelvin(double tCelcius) {
        // Conversion en Kelvin
        return tCelcius + 273;
    }
     // Méthode pour convertir Kelvin vers Celsius
    public static double KelvinVersCelcius(double tKelvin) {
        return tKelvin - 273;
    }

    // Méthode pour convertir Fahrenheit vers Celsius
    public static double FarenheitVersCelcius(double tFahrenheit) {
        return (tFahrenheit - 32) * 5 / 9;
    }

    // Méthode pour convertir Celsius vers Fahrenheit
    public static double CelciusVersFarenheit(double tCelsius) {
        return (tCelsius * 9 / 5) + 32;
    }

    // Méthode pour convertir Kelvin vers Fahrenheit en utilisant deux méthodes
    public static double KelvinVersFarenheit(double tKelvin) {
        // Conversion Kelvin vers Celsius puis Celsius vers Fahrenheit
        double celsius = KelvinVersCelcius(tKelvin);
        return CelciusVersFarenheit(celsius);
    }

    // Méthode pour convertir Fahrenheit vers Kelvin en utilisant deux méthodes
    public static double FarenheitVersKelvin(double tFahrenheit) {
        // Conversion Fahrenheit vers Celsius puis Celsius vers Kelvin
        double celsius = FarenheitVersCelcius(tFahrenheit);
        return CelciusVersKelvin(celsius);
    }
    
}

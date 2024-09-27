/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_muller;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elois
 */
public class TP1_guessMyNumber_MULLER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Random generateurAleat = new Random();
        
        // Affichage de 5 nombres aléatoires entre 0 et 100
        System.out.println("Voici 5 nombres aléatoires entre 0 et 100 :");
        for (int i = 0; i < 5; i++) {
            int n = generateurAleat.nextInt(100); // Génère un nombre aléatoire entre 0 et 99
            System.out.println(n);
        }
 // Q2 Génération d'un nombre aléatoire entre 0 et 100
        int nombreAleatoire = generateurAleat.nextInt(100);
        
        // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Variable pour stocker la saisie de l'utilisateur
        int saisieUtilisateur = 1;
        
        // Boucle tant que l'utilisateur n'a pas trouvé le bon nombre
        while (saisieUtilisateur != nombreAleatoire) {
            // Demande à l'utilisateur de saisir un nombre entre 0 et 100
            System.out.print("Saisissez un nombre entre 0 et 100 : ");
            saisieUtilisateur = scanner.nextInt();
            
            // Comparaison de la saisie avec le nombre aléatoire
            if (saisieUtilisateur < nombreAleatoire) {
                System.out.println("Trop petit !");
            } else if (saisieUtilisateur > nombreAleatoire) {
                System.out.println("Trop grand !");
            } else {
                System.out.println("Gagné !");
            }
        }
    }
    
}

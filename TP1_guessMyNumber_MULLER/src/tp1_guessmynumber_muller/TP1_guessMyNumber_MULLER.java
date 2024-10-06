/*TP1
Eloise Muller 
Guess my number
septembre 2024
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
         // Création d'un objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);
        
        // Affichage de 5 nombres aléatoires entre 0 et 100
        System.out.println("Voici 5 nombres aléatoires entre 0 et 100 :");
        for (int i = 0; i < 5; i++) {
            int n = generateurAleat.nextInt(100); // Génère un nombre aléatoire entre 0 et 99
            System.out.println(n);
        }
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1) Facile (Nombre entre 0 et 50, tentatives illimitées)");
        System.out.println("2) Normal (Nombre entre 0 et 100, 10 tentatives maximum)");
        System.out.println("3) Difficile (Nombre entre 0 et 200, 5 tentatives maximum)");
        
        int choixDifficulte = scanner.nextInt();
        
        // Variables pour l'intervalle du nombre aléatoire et le nombre maximum de tentatives
        int borneMax = 100;
        int nombreMaxTentatives = 10;
        boolean tentativesLimitees = true;
        
        // Ajuster les paramètres selon le niveau de difficulté choisi
        switch (choixDifficulte) {
            case 1: // Facile
                borneMax = 50;  // Nombre entre 0 et 50
                tentativesLimitees = false;  // Tentatives illimitées
                break;
            case 2: // Normal
                borneMax = 100;  // Nombre entre 0 et 100
                nombreMaxTentatives = 10;  // 10 tentatives maximum
                break;
            case 3: // Difficile
                borneMax = 200;  // Nombre entre 0 et 200
                nombreMaxTentatives = 5;   // 5 tentatives maximum
                break;
            default:
                System.out.println("Choix invalide. Veuillez relancer le programme.");
                
                return; // Arrête le programme en cas de choix invalide
        }
        
 // Q2 Génération d'un nombre aléatoire entre 0 et 100
        int nombreAleatoire = generateurAleat.nextInt(borneMax + 1);
        
       
        // Variable pour stocker la saisie de l'utilisateur
        int saisieUtilisateur = -1;
        
        // Initialisation du compteur de tentatives
        int compteurTentatives = 0;

        
        // Boucle tant que l'utilisateur n'a pas trouvé le bon nombre ou n'a pas épuisé ses tentatives
        while (saisieUtilisateur != nombreAleatoire) {
            // Vérification du nombre de tentatives restantes (si applicable)
            if (tentativesLimitees && compteurTentatives >= nombreMaxTentatives) {
                System.out.println("Vous avez épuisé vos " + nombreMaxTentatives + " tentatives. Vous avez perdu !");
                System.out.println("Le nombre à trouver était : " + nombreAleatoire);
                break;
            }
             // Demande à l'utilisateur de saisir un nombre
            System.out.print("Saisissez un nombre entre 0 et " + borneMax + " : ");
            saisieUtilisateur = scanner.nextInt();
            
             // Incrémentation du compteur de tentatives
            compteurTentatives++;
            
            // Comparaison de la saisie avec le nombre aléatoire
            if (saisieUtilisateur < nombreAleatoire) {
                if (nombreAleatoire - saisieUtilisateur > 20) {
                    System.out.println("Vraiment trop petit !");
                } else {
                    System.out.println("Trop petit !");
                }
            } else if (saisieUtilisateur > nombreAleatoire) {
                if (saisieUtilisateur - nombreAleatoire > 20) {
                    System.out.println("Vraiment trop grand !");
                } else {
                    System.out.println("Trop grand !");
                }
            } else {
                System.out.println("Gagné !");
                System.out.println("Vous avez trouvé le nombre en " + compteurTentatives + " tentatives.");
                break;
                
            }
        }
    }
    
}

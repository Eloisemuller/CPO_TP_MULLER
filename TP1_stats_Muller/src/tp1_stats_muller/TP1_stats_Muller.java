/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_muller;

import java.util.Scanner;

/**
 *
 * @author elois
 */
public class TP1_stats_Muller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création d'un scanner pour lire l'entrée de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur de saisir un nombre entier
        System.out.print("Veuillez saisir un nombre entier m: ");
        int m = scanner.nextInt();  // Lecture de l'entier

        // Afficher le nombre saisi
        System.out.println("Vous avez saisi: " + m);

        // Création d'un tableau de 6 entiers, initialisé à 0
        int[] des = new int[6];

       // Boucle sur m itérations pour simuler les lancers de dé
        for (int i = 0; i < m; i++) {
            // Générer un nombre aléatoire entre 0 et 5 (pour les faces 1 à 6 du dé)
            int resultat = (int)(Math.random() * 6);  // Math.random() génère un nombre flottant entre 0 et 1
                                                      // Multiplié par 6, puis converti en entier pour obtenir un nombre entre 0 et 5
            // Incrémenter la case correspondant à la face obtenue
            des[resultat]++;
        }

        // Affichage des résultats sous forme de pourcentages
        System.out.println("Résultats des lancers de dés sous forme de pourcentages :");

        // Boucle pour afficher la valeur de chaque cellule (le pourcentage de chaque face)
        for (int i = 0; i < des.length; i++) {
            // Calculer le pourcentage pour chaque face
            double pourcentage = ((double)des[i] / m) * 100;
            
            // i+1 pour afficher les faces de 1 à 6 (car les indices commencent à 0)
            System.out.printf("Face %d : %.2f%% occurrences\n", (i + 1), pourcentage);
        }
    }
    
}

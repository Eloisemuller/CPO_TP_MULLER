/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_mullereloise;

/**
 *
 * @author elois
 */
public class TP3_Heroic_Fantasy_MULLERELOISE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Création des épées avec les paramètres demandés
        Epee excalibur = new Epee( 7,"Excalibur", 5);
        Epee durandal = new Epee( 4,"Durandal", 7);

        // Création des bâtons avec les paramètres demandés
        Baton chene = new Baton( 4,"Chêne", 5);
        Baton charme = new Baton( 5,"Charme", 6);

        // Affichage des informations de chaque arme
        System.out.println(excalibur);
        System.out.println(durandal);
        System.out.println(chene);
        System.out.println(charme);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_muller2;

/**
 *
 * @author elois
 */
public class BouteilleBiere {
    String Nom;
    float degreAlcool;
    String brasserie;
    boolean ouverte;

    // Constructeur avec paramètres
    public BouteilleBiere(String unNom, float unDegre, String uneBrasserie) {
        Nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;  // Par défaut, la bière n'est pas ouverte
    }

    // Méthode pour lire l'étiquette de la bouteille
    public void lireEtiquette() {
        System.out.println("Bouteille de " + Nom + " (" + degreAlcool + " degrés) \nBrasserie : " + brasserie);
    }

    // Méthode pour décapsuler la bière
    public boolean Décapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println("Bière " + Nom + " décapsulée !");
            return true;
        } else {
            System.out.println("Erreur : bière déjà ouverte");
            return false;
        }
    }

    // Redéfinition de la méthode toString
    @Override
    public String toString() {
        String chaine_a_retourner;
        chaine_a_retourner = Nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte == true) {
            chaine_a_retourner += "oui";
        } else {
            chaine_a_retourner += "non";
        }
        return chaine_a_retourner;
    }
    
}

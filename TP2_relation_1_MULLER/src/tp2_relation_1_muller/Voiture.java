/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_muller;

/**
 *
 * @author elois
 */
public class Voiture {
    String marque;
     String modele;
     int annee;
     int puissanceCV;
     Personne proprietaire;
     

    // Constructeur

    public Voiture(String marque, String modele, int annee, int puissanceCV, Personne proprietaire) {
        this.marque = marque;
        this.modele = modele;
        this.annee = annee;
        this.puissanceCV = puissanceCV;
        this.proprietaire = proprietaire;
    }

    
    

    // Méthode toString() pour afficher les informations de la voiture
    @Override
    public String toString() {
        return "Voiture [Marque: " + marque + ", Modèle: " + modele + ", Année: " + annee + "]";
    }
}

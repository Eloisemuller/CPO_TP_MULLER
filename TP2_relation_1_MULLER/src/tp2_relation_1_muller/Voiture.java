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
    String Modele;
    String Marque;
    int PuissanceCV;
    Personne Proprietaire; // pour stocker le propriétaire

    public Voiture(String modele, String marque, int puissanceCV) {
        this.Modele = modele;
        this.Marque = marque;
        this.PuissanceCV = puissanceCV;
        this.Proprietaire = null; // initialisé à null, sans propriétaire
    }

    @Override
    public String toString() {
        return "Voiture{" + "Modele='" + Modele + '\'' + ", Marque='" + Marque + '\'' + ", PuissanceCV=" + PuissanceCV + '}';
    }
}

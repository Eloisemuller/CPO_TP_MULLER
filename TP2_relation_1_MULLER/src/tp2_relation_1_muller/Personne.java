/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_muller;

/**
 *
 * @author elois
 */
public class Personne {    
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbVoitures = 0;
        this.liste_voitures = new Voiture[3]; // initialise le tableau de voitures pour 3 voitures max
    }

    @Override
    public String toString() {
        return "Personne{" + "nom='" + nom + '\'' + ", prenom='" + prenom + '\'' + '}';
    }
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
    if (voiture_a_ajouter.Proprietaire != null) {
        return false; // La voiture a déjà un propriétaire
    }
    if (this.nbVoitures >= 3) {
        return false; // La personne possède déjà 3 voitures
    }
    this.liste_voitures[this.nbVoitures] = voiture_a_ajouter;
    voiture_a_ajouter.Proprietaire = this;
    this.nbVoitures++;
    return true;
}
}
   


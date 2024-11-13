/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_muller;

/**
 *
 * @author elois
 */
public class TP2_relation_1_MULLER {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("liste des voitures disponibles " + uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra);
       
        bob.liste_voitures[0] = uneClio;
bob.nbVoitures = 1;
uneClio.Proprietaire = bob;

System.out.println("La première voiture de Bob est " + bob.liste_voitures[0]);
bob.liste_voitures[1] = uneAutreClio;
        bob.nbVoitures = 2;
        uneAutreClio.Proprietaire = bob;

        reno.liste_voitures[0] = une2008;
        reno.nbVoitures = 1;
        une2008.Proprietaire = reno;

        reno.liste_voitures[1] = uneMicra;
        reno.nbVoitures = 2;
        uneMicra.Proprietaire = reno;

        System.out.println("Les voitures de Bob :");
        for (int i = 0; i < bob.nbVoitures; i++) {
            System.out.println(bob.liste_voitures[i]);
        }

        System.out.println("\nLes voitures de Reno :");
        for (int i = 0; i < reno.nbVoitures; i++) {
            System.out.println(reno.liste_voitures[i]);
        }
    }
   
}


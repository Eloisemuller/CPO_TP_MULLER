/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_mullerr;

/**
 *
 * @author elois
 */
public class TP2_manip_MULLERR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Tartiflette assiette1 = new Tartiflette(500);
    Tartiflette assiette2 = new Tartiflette(600);

    Tartiflette assiette3 = assiette2;

    // Affichage des calories avant l'échange
    System.out.println("Avant échange :");
    System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

    // Interversion des références entre assiette1 et assiette2
    Tartiflette temp = assiette1;
    assiette1 = assiette2;
    assiette2 = temp;

    // Affichage des calories après l'échange
    System.out.println("Après échange :");
    System.out.println("nb de calories de Assiette 1 : " + assiette1.nbCalories);
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);

// question 6 :Non, aucune de ces lignes n'est correcte, car elles essaient de créer une référence de type Moussaka à partir d'un objet de type Tartiflette 
             //ce qui n'est pas autorisé en Java 
             //Une référence obj en Java fait référence à une instance d'un objet dans la mémoire, permettant d'accéder à ses méthodes et attributs.

        // Création d'un tableau de 10 références de type Moussaka
        Moussaka[] moussakas = new Moussaka[10];
        
        // Pour chaque référence, création d'un nouvel objet Moussaka
        for (int i = 0; i < moussakas.length; i++) {
        // probleme à ce niveau regler ça
        }

        // Vérification que chaque case du tableau contient une instance de Moussaka
        for (int i = 0; i < moussakas.length; i++) {
            System.out.println("Moussaka " + i + ": " + moussakas[i]);
        }      

    }
    
}

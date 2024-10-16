/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_muller2;

/**
 *
 * @author elois
 */
public class TP2_bieres_MULLER2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Création de la première bière : Cuvée des Trolls
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", 7.0f, "Dubuisson");
        
        // Affichage des informations de la première bière
        uneBiere.lireEtiquette();
        
        // Création de la deuxième bière : Leffe
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6f, "Abbaye de Leffe");
        
        // Affichage des informations de la deuxième bière
        autreBiere.lireEtiquette();
        
        // Création de trois autres bières
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Heineken", 5.0f, "Heineken Brewery");
        BouteilleBiere quatriemeBiere = new BouteilleBiere("Guinness", 4.2f, "Guinness Brewery");
        BouteilleBiere cinquiemeBiere = new BouteilleBiere("Corona", 4.5f, "Cervecería Modelo");

        // Affichage des informations des trois autres bières
        troisiemeBiere.lireEtiquette();
        quatriemeBiere.lireEtiquette();
        cinquiemeBiere.lireEtiquette();
        
         // Création de plusieurs AUTRE bouteilles de bière
        
        BouteilleBiere biereTrois = new BouteilleBiere("Chimay", 9.0f, "Chimay");
        BouteilleBiere biereQuatre = new BouteilleBiere("Kronenbourg", 5.0f, "Kronenbourg");

        // Affichage des étiquettes et des états des bières avant décapsulage
        System.out.println(uneBiere);
        System.out.println(autreBiere);
        System.out.println(biereTrois);
        System.out.println(biereQuatre);
        
        // Tentative de décapsuler certaines bières
        System.out.println("\nTentative de décapsulage :");
        uneBiere.Décapsuler(); // Cuvée des trolls
        autreBiere.Décapsuler(); // Leffe
        biereTrois.Décapsuler(); // Chimay
        
        // Affichage des états des bières après décapsulage
        System.out.println("\nÉtat des bières après décapsulage :");
        System.out.println(uneBiere);
        System.out.println(autreBiere);
        System.out.println(biereTrois);
        System.out.println(biereQuatre); // Cette bière n'a pas été décapsulée
    
    }
    
}

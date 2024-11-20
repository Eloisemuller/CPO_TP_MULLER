/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_mullereloise;

/**
 *
 * @author elois
 */
public abstract class Arme {
    String nom ; 
    int niveau ; 

    public Arme(String nom, int niveau) {
        this.nom = nom;
        if (niveau<=100){ 
        this.niveau = niveau;}
        else{this.niveau=100;}
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_mullereloise;

/**
 *
 * @author elois
 */
public class Epee extends Arme {
int indice ;

    public Epee(int indice, String nom, int niveau) {
        super(nom, niveau);
        if (indice<100){
        this.indice = indice;}
        else{indice=99;}
       
    }

    
    
    
    
}


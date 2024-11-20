/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_mullereloise;

/**
 *
 * @author elois
 */
public class Baton extends Arme{
    int age ;

    public Baton(int indice, String nom, int niveau) {
        super(nom, niveau);
        if(age<100){
        this.age = indice;}
        else{age=99;}
    }
    
}

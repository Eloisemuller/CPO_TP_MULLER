/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_muller;

import java.util.Scanner;

/**
 *
 * @author elois
 */
public class TP2_convertisseurObjet_MULLER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Convertisseur conv = new Convertisseur();
       
        Scanner sc = new Scanner(System.in);
       
        double a;
        int b =0;
       
       
        System.out.println("Bonjour, saisissez une valeur : ");
        a = sc.nextDouble();
        System.out.println("Saisissez la conversion que vous souhaitez effectuer :" + "\n" + "1) De Celcius vers Kelvin" + "\n" + "2) de Kelvin vers Celcius" + "\n" + "3) de Celcius vers Farenheit" + "\n" + "4) de Farenheit vers Celcius" + "\n" + "5) de Kelvin vers Farenheit" + "\n" + "6) de Farenheit vers Kelvin");
        b = sc.nextInt();
       
        switch (b) {
            case 1 -> System.out.println(a + " degres Celsius est egal a " + conv.CelciusVersKelvin(a) + " degres Kelvin.");
            case 2 -> System.out.println(a + " degres Kelvin est egal a " + conv.KelvinVersCelcius(a) + " degres Celsius.");
            case 3 -> System.out.println(a + " degres Celsius est egal a " + conv.CelciusVersFarenheit(a) + " degres Fahrenheit.");
            case 4 -> System.out.println(a + " degres Fahrenheit est egal a " + conv.FarenheitVersCelcius(a) + " degres Celsius.");
            case 5 -> System.out.println(a + " degres Kelvin est egal a " + conv.KelvinVersFarenheit(a) + " degres Fahrenheit.");
            case 6 -> System.out.println(a + " degres Fahrenheit est egal a " + conv.FarenheitVersKelvin(a) + " degres Kelvin.");
            default -> System.out.println("Choix non valide.");
        }
       
        System.out.println(conv.toString());

        sc.close();
   
   
}
}


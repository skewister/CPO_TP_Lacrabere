/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_lacrabere;

/**
 *
 * @author gofri
 */
public class BouteilleBiere {
    
    String nom;
    Double degreAlcool;
    String brasserie;
    boolean ouverte;
    
    public void lireEtiquette(){
    
        System.out.println("Bouteille de " + nom +" (" + degreAlcool +" degres) \nBrasserie : " + brasserie ) ;
        
    }
    
    
    
}


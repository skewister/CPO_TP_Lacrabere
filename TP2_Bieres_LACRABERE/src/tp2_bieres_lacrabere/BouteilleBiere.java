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
    

    public BouteilleBiere(String unNom, double unDegree, String
    uneBrasserie, boolean etreOuverte) {
    nom = unNom;
    degreAlcool = unDegree;
    brasserie = uneBrasserie;
    ouverte = etreOuverte;
}   

        
    public void Décapsuler(){
        if (ouverte == false ){
            ouverte = true ;  
        }else {
            System.out.println("« erreur : biere "+ nom +" déjà ouverte");
        }
}
    
    @Override
    public String toString() {
    String chaine_a_retourner;
    chaine_a_retourner = nom + " (" + degreAlcool + " degrés) \nOuverte ? ";
    if (ouverte == true ) chaine_a_retourner += "oui" ;
    else chaine_a_retourner += "non" ;
    return chaine_a_retourner ;
    }
    
    
}


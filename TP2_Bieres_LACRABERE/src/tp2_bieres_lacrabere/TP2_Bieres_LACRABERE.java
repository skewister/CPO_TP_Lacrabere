   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_lacrabere;

/**
 *
 * @author gofri
 */
public class TP2_Bieres_LACRABERE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       

    BouteilleBiere uneBiere = new BouteilleBiere();
    uneBiere.nom = "Cuvee des trolls";
    uneBiere.brasserie = "Dubuisson";
    uneBiere.degreAlcool = 7.0 ;
    uneBiere.ouverte = false;
    uneBiere.lireEtiquette();
    
    BouteilleBiere une2ndBiere = new BouteilleBiere();
    une2ndBiere.nom = "Leffe";
    une2ndBiere.brasserie = "Abbaye de Leffe";
    une2ndBiere.degreAlcool = 6.6 ;
    une2ndBiere.ouverte = false;
    une2ndBiere.lireEtiquette();
    }
    
    
}



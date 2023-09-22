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


    
    
    BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson",true) ;
    BouteilleBiere une2ndBiere = new BouteilleBiere("Leffe",6.6 ,"Lerdameur",false) ;
    BouteilleBiere une3ndBiere = new BouteilleBiere("Desperados",7.8 ,"mexicaine",false) ;
    BouteilleBiere une4ndBiere = new BouteilleBiere("Levrette",5.9 ,"Caffé",true) ;
    BouteilleBiere une5ndBiere = new BouteilleBiere("Grimbergen",4.8 ,"Blonde",false) ;
    
    System.out.println(uneBiere) ;
    uneBiere.Décapsuler();
    System.out.println(uneBiere) ;
    
    System.out.println(une2ndBiere) ;
    System.out.println(une3ndBiere) ;
    System.out.println(une4ndBiere) ;
    System.out.println(une5ndBiere) ;
    
    }

    
}



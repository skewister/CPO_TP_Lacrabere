/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_lacrabere_version_console.pkg1;

/**
 *
 * @author gofri
 */
public class CelluleLumineuse {
    
    private boolean etat;
    
    
    CelluleLumineuse(){
    etat = false;
    }
    
    public boolean activerCellule(){
        
        etat = true;
        return etat;
    }
     public boolean eteindreCellule(){
   
        etat = false;
        return etat;
    }
    
     public boolean estEteint(){
     
        return etat == false;
     }
     
     public boolean getEtat(){
        return etat != false;
     }
    
}


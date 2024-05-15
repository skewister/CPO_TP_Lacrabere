/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lightoff_lacrabere_version_console.pkg1;

/**
 *
 * @author gofri
 */
public class LightOff_LACRABERE_version_console1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CelluleLumineuse cellule1 = new CelluleLumineuse();
        CelluleLumineuse cellule2 = new CelluleLumineuse();
        cellule1.getEtat();
        System.out.println(cellule1.getEtat());
        cellule2.activerCellule();
        cellule1.activerCellule();
        System.out.println("Etat de cellule1 après activation: " + cellule1.getEtat());
        cellule2.eteindreCellule();
        System.out.println("Etat de cellule2 après extinction: " + cellule2.getEtat());
        
    }
    
}

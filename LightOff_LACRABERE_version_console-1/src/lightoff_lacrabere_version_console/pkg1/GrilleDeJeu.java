/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightoff_lacrabere_version_console.pkg1;

import java.util.Random;
/**
 *
 * @author gofri
 */
public class GrilleDeJeu {
    private CelluleLumineuse[][] matriceCellules;
    private int nbLignes;
    private int nbColonnes;
    
    public GrilleDeJeu(int nbLignes, int nbColonnes) {
        this.nbLignes = nbLignes;
        this.nbColonnes = nbColonnes;
        matriceCellules = new CelluleLumineuse[nbLignes][nbColonnes];

        for (int x = 0; x < nbLignes; x++) {
            for (int y = 0; y < nbColonnes; y++) {
                matriceCellules[x][y] = new CelluleLumineuse();
            }
        }
    }
    
    public void eteindreToutesLesCellules(){
        
        for (int i = 0; i < nbLignes; i++){
            for (int j = 0; j < nbColonnes; j++){
                matriceCellules[i][j].eteindreCellule();
            }
        }   
    }
    
     public void activerLigneDeCellules(int ligne) {
        if (ligne >= 0 && ligne < nbLignes) {
            for (int j = 0; j < nbColonnes; j++) {
                matriceCellules[ligne][j].activerCellule();
            }
        }
    }

    public void activerColonneDeCellules(int colonne) {
        if (colonne >= 0 && colonne < nbColonnes) {
            for (int i = 0; i < nbLignes; i++) {
                matriceCellules[i][colonne].activerCellule();
            }
        }
    }

    public void activerDiagonaleDescendante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][i].activerCellule();
        }
    }

    public void activerDiagonaleMontante() {
        for (int i = 0; i < Math.min(nbLignes, nbColonnes); i++) {
            matriceCellules[i][nbColonnes - 1 - i].activerCellule();
        }
    }

    public void activerLigneColonneOuDiagonaleAleatoire() {
        Random rand = new Random();
        int choix = rand.nextInt(3); // 0 pour ligne, 1 pour colonne, 2 pour diagonale
        switch (choix) {
            case 0 -> {
                int ligne = rand.nextInt(nbLignes);
                activerLigneDeCellules(ligne);
            }
            case 1 -> {
                int colonne = rand.nextInt(nbColonnes);
                activerColonneDeCellules(colonne);
            }
            case 2 -> {
                // Activer une diagonale aléatoire
                int diagonale = rand.nextInt(2); // 0 pour diagonale principale, 1 pour diagonale secondaire
                if (diagonale == 0) {
                    activerDiagonaleDescendante();
                } else {
                    activerDiagonaleMontante();
                }
            }
            default -> {
            }
        }
    }
    
    public void melangerMatriceAleatoirement(int nbTours){
        eteindreToutesLesCellules();
        
        for (int i = 0; i < nbTours; i++){
        activerLigneColonneOuDiagonaleAleatoire();
        }
    }
    
    public boolean cellulesToutesEteintes() {
        boolean resultat = false;
        
        for (int i = 0; i < nbLignes; i++){
            for (int j = 0; i < nbColonnes; j++){
                resultat = matriceCellules[i][j].getEtat() == true;
            }
        }
        return resultat;
    }
    
    
    @Override
    public String toString() {
        StringBuilder map = new StringBuilder();
        
        map.append("  |");
        for (int j = 0; j < nbColonnes; j++) {
            map.append(" ").append(j).append(" |");
        }
        map.append("\n");
        
        for (int i = 0; i < nbLignes; i++) {
            map.append(i).append(" |");
            for (int j = 0; j < nbColonnes; j++) {
                map.append(" ").append(matriceCellules[i][j].getEtat() ? "O" : "X").append(" |");
            }
            map.append("\n");
        }
        
        return map.toString();
    }
    
}

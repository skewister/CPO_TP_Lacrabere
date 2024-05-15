package lightoff_lacrabere_version_console.pkg1;

import java.util.Scanner;

/**
 *
 * @author gofri
 */
public class Partie {
    private GrilleDeJeu grille;
    public int nbCoups;

    public Partie(int nbLignes, int nbColonnes) {
        this.grille = new GrilleDeJeu(nbLignes, nbColonnes);
        this.nbCoups = 0;
    }
    
    public void initialiserPartie(int nbTours) {
        grille.melangerMatriceAleatoirement(nbTours);
        nbCoups = 0;
    }

    public void lancerPartie() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("État initial de la grille:");
        System.out.println(grille.toString());

        while (!grille.cellulesToutesEteintes()) {
            System.out.println("Entrez votre coup (ligne, colonne, diagonale descendante, diagonale montante): ");
            String choix = scanner.nextLine();

            if (choix.equalsIgnoreCase("ligne")) {
                System.out.println("Entrez le numéro de la ligne à activer : ");
                int ligne = scanner.nextInt();
                scanner.nextLine(); // Consommer la nouvelle ligne restante
                grille.activerLigneDeCellules(ligne);
            } else if (choix.equalsIgnoreCase("colonne")) {
                System.out.println("Entrez le numéro de la colonne à activer : ");
                int colonne = scanner.nextInt();
                scanner.nextLine(); // Consommer la nouvelle ligne restante
                grille.activerColonneDeCellules(colonne);
            } else if (choix.equalsIgnoreCase("diagonale descendante")) {
                grille.activerDiagonaleDescendante();
            } else if (choix.equalsIgnoreCase("diagonale montante")) {
                grille.activerDiagonaleMontante();
            } else {
                System.out.println("Coup invalide. Essayez encore.");
                continue;
            }

            nbCoups++;
            System.out.println("État mis à jour de la grille:");
            System.out.println(grille.toString());
            System.out.println("Nombre de coups : " + nbCoups);
        }

        System.out.println("Félicitations ! Vous avez éteint toutes les cellules.");
        System.out.println("Nombre total de coups : " + nbCoups);
        scanner.close();
    }
}

import java.util.Scanner;

public class exerciceperso {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau 2D de taille 11x11
        int[][] tableau = new int[11][11];

        // Remplissage du tableau
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                tableau[i][j] = i * j; // Exemple de remplissage avec le produit des indices
            }
        }

        // Affichage du tableau
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println();
        }
    }
}
package TD1.tableaux;

/*Ecrire un programme qui permet de saisir deux matrices carrées réelles, calculer leur
somme et afficher le résultat.*/

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, m;
        System.out.println("Donner les dimensions du matrice A[n][m] et B[n][m]");
        System.out.print("n= ");
        n = in.nextInt();
        System.out.print("m= ");
        m = in.nextInt();


        int[][] a = new int[n][m];
        int[][] b = new int[n][m];

        System.out.println("Saisie de la matrice A :");
        saisirMatrice(in, a);

        System.out.println("Saisie de la matrice B :");
        saisirMatrice(in, b);


        int[][] somme = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                somme[i][j] = a[i][j] + b[i][j];
            }
        }


        System.out.println("Matrice A :");
        afficherMatrice(a);

        System.out.println("Matrice B :");
        afficherMatrice(b);

        System.out.println("Somme des matrices A et B :");
        afficherMatrice(somme);
    }
    private static void saisirMatrice(Scanner in, int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                matrice[i][j] = in.nextInt();
            }
        }
    }


    private static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    }


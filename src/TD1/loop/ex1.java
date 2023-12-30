package TD1.loop;
import java.util.Scanner;

/*Ecrire un programme faisant calculer et afficher le factoriel d’un entier naturel N donné.
        Sachant que (pour N>0) : N! = N x (N-1) x (N-2) x ...... 3 x 2 x 1.*/

public class ex1 {
    public static void main (String[]args){
        int n ;
        int f=1;
        Scanner in = new Scanner(System.in);
        System.out.println("The N:");
        n = in.nextInt();
        for (int i = 1; i <=n ; i++) {
            f *= i;
        }

        System.out.println("fact= "+ f );

    }
    }


package TD1.tableaux;
import java.util.Scanner;
/*Ecrire un programme permettant la saisie d’un entier N et l’affichage de sa représentation
en binaire.*/
public class ex2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("donner N");
        int n=in.nextInt();
        int []a = new int[32];
            int i = 0;
            while (n > 0) {
                a[i] = n % 2;
                n /= 2;
                i++;
            }
        System.out.println("Représentation binaire : ");
        for (int j =i - 1; j >= 0; j--) {
            System.out.print(a[j]);
        }

    }
}

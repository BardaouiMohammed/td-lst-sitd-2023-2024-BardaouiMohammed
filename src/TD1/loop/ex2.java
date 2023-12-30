package TD1.loop;
import java.util.Scanner;
/*Ecrire un programme qui permet de lire un entier N et calcule la somme des entiers impairs
inférieurs à N.*/
public class ex2 {
    public static void main(String[] args) {
            int n ;
            int s=0 ;
            Scanner in = new Scanner(System.in);
            System.out.println("The N:");
            n = in.nextInt();
            for (int i = 1; i < n ; i++) {
                if (i%2!=0){
                    s += i;
                }
            }

            System.out.println("somme = "+s);


        }
    }


package TD1.loop;

import java.util.Scanner;

/*Ecrire un programme qui permet de déterminer la somme des chiffres d’un nombre entier
donné (Exemple : pour N=25418, on aura 2+5+4+1+8=20)*/
public class ex9 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n;
        do{
            System.out.println("donner un nbr N");
            n=in.nextInt();
        }while(n<=0);
 int sum=0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("La somme des chiffres  est : " + sum);
    }
}

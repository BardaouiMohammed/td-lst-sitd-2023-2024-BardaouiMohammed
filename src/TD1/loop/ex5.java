package TD1.loop;

import java.util.Scanner;
/*La suite de Fibonacci est définie par :
0 = 1
        1 = 1
        = −1 + −2 ≥ 2
Ecrire un programme qui lit un entier positif n et calcule le nème terme de la suite.*/
public class ex5 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n , un=0, un1=1, un2=1;
        System.out.println("entrer la valeur de N");
        n = in.nextInt();
        if (n==0 || n==1) {
            System.out.println(1);
            return;
        }
        System.out.print("1 1 ");
        for (int i = 2; i <= n; i++) {
            un = un1 + un2;
            un2 = un1;
            un1 = un;
            System.out.print(un + " ");
        }

    }
}

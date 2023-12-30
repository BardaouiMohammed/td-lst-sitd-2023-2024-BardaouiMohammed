package TD1.loop;

import java.util.Scanner;

/*Ecrire l'algorithme permettant d’afficher le triangle suivant, le nombre de lignes étant donné
par l'utilisateur :
        1
        12
        123
        1234
        12345
        123456*/
public class ex7 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n;
        do{
            System.out.println("donner un nbr N");
            n=in.nextInt();
        }while(n<=0);
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}

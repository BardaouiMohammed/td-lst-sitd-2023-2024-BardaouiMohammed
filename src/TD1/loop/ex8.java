package TD1.loop;

import java.util.Scanner;

/*Ecrire un programme qui permet d’afficher un ensemble d’étoiles sous cette forme :
        *
        **
        ***
        ****
        *****
        ****
        ***
        **
        **/
public class ex8 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n;
        do{
            System.out.println("donner un nbr N");
            n=in.nextInt();
        }while(n<=0);

        for(int i=0; i<n ;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=n; i>0 ;i--){
            for (int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}

package TD1.loop;

import java.util.Scanner;

/*Ecrire un programme qui lit deux entiers positifs non nuls a et b et qui calcule le PGCD de
ces deux nombres en utilisant l’algorithme d’Euclide sachant que :
PGCD (a, b) = PGCD (b, r) avec r =a mod b*/
public class ex4 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a , b;
        do{
      System.out.println("donnner deux enteires positifs non nuls");
      a=in.nextInt();
       b= in.nextInt();
  }while(a<=0 || b<=0 );
     int r ;
     while(b !=0) {
         r= a%b;
         a=b;
         b=r;
     }
        System.out.println("PGCD = "+a);

    }
}

package TD1.condition;

import java.util.Scanner;

/*Écrire un programme qui saisit le numéro du mois et affiche le nombre de jours de ce mois.
Pour le cas de février, on lit l'année, si l'année est bissextile, le nombre de jours est 29,
sinon c'est 28 jours.
L’Année saisie doit être compris entre 1900 et 2100.*/
public class ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mo;
        do {
            System.out.println("saisit le numéro du mois");
            mo=in.nextInt();
        }while(mo <1 || mo > 12);

       switch(mo){
           case 1: case 3: case 5: case 7: case 8: case 10: case 12:
               System.out.println("le nombre de jours : 31");break;
           case 4: case 6: case 9: case 11:
               System.out.println("le nombre de jours : 30");break;
           case 2:
               int an;
               do{
                   System.out.println("saisie L’Année qui doit etre compris entre 1900 et 2100");
                   an =in.nextInt();
               }while(an < 1900 || an > 2100);
               if(an%4 == 0)
                   System.out.println("le nobre de jours : 29");
               else
                   System.out.println("le nobre de jours : 28");
               break;
       }
    }
}

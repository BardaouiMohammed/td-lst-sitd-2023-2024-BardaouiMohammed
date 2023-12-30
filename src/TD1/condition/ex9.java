package TD1.condition;

import java.util.Scanner;
/*Écrire un programme qui lit deux variables au clavier et les affiche dans l’ordre croissant,
quitte à les modifier*/

public class ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("donne deux variables ");
        int a=in.nextInt();
        int b= in.nextInt();
        if(a>b){
            int c=a;
            a=b;
            b=c;
        }
        System.out.println(""+a+"-"+b);
    }
}

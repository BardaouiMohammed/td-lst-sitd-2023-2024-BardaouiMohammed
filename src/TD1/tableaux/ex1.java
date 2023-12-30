package TD1.tableaux;

import java.util.Random;
import java.util.Scanner;

/*Soit T un tableau contenant N entiers (10≤N≤50). On propose d’écrire un programme qui
permet de déterminer et d’afficher la valeur maximale et la valeur minimale de T.*/
public class ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("donner N ");
        int N= in.nextInt();
        int tab[] = new int[N];
        Random r = new Random();
        for (int i = 0; i <N; i++) {
            tab[i] = r.nextInt(100);
        }
        int min=tab[0];
        int max=tab[0];
        for (int t : tab){
            System.out.println(t);
            if (t<min)
                min=t;
            if(t>max)
                max=t;
        }
        System.out.println(" max = "+max+"  min = "+min);

    }

}

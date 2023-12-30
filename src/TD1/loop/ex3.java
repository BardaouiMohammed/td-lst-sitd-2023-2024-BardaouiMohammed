package TD1.loop;
import java.util.Scanner;
/*1. Ecrire un programme qui demande successivement 20 nombres à l’utilisateur, et
affiche le maximum de ces 20 nombres :
2. Modifier le programme pour que le programme affiche en quelle position avait été
saisie ce nombre.
3. Modifier le programme afin qu’il affiche le maximum d’une suite saisie au clavier qui
se termine par 0.*/

public class ex3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int max=0;
        int position = 0;
       for (int i=1; i<=20 ; i++){
           System.out.print("nbr numero "+i+" =");
           int a = in.nextInt();
           if(a > max){
               max=a;
           position =i;}
       }
        System.out.print("max = "+max+" & position ="+position);
    }
}

package TD1.condition;
import java.util.Scanner;
/*Écrire un programme qui lit la moyenne d’un étudiant et affiche la mention correspondante.
La mention est définie comme suit :
Moyenne>=16 T.Bien
14<=Moyenne<16 Bien
12<=Moyenne<14 A.Bien
10<=Moyenne<12 Passable*/
public class ex4 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("la moyenne : ");
        int moyen = in.nextInt();
        if (moyen>=16) System.out.println("T.Bien");
        else if (moyen>= 14) System.out.println("Bien");
        else if (moyen>= 12) System.out.println("A.bien");
        else if (moyen>=10) System.out.println("Passable");
        else System.out.println("NV");
    }
}

package TD1.condition;
import java.util.Scanner;
/*
Écrire un programme qui permet de saisir un entier de trois chiffres non nuls, de déterminer
et d’afficher tous les nombres qui peuvent êtres formés par les chiffres de N. Exemple :
N=427
Les nombres formés par les chiffres de N sont : 427, 472, 724, 742, 247, 274.
*/
public class ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A;
        do {
            System.out.println("saisir un entier de 3 chiffres non nuls ");
            A = in.nextInt();
        } while (A < 100 || A > 999);
        int a = A / 100;
        int b = (A / 10) % 10;
        int c = A % 10;
        System.out.println(""+a+""+b+""+c);
        System.out.println(""+a+""+c+""+b);
        System.out.println(""+b+""+a+""+c);
        System.out.println(""+b+""+c+""+a);
        System.out.println(""+c+""+b+""+a);
        System.out.println(""+c+""+a+""+b);


    }
}

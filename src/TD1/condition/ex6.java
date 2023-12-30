package TD1.condition;
import java.util.Scanner;

/*Écrivez un programme qui lit deux valeurs entières (A et B) au clavier et qui affiche le signe
du produit de A et B sans faire la multiplication.*/
public class ex6 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("donner la valeur de A = ");
        int A = in.nextInt();
        System.out.print("donner la valeur de B = ");
        int B = in.nextInt();
        if(A<0 && B<0)
            System.out.println("le produit AxB est positif + ");
        else if (A<0 && B>0)
            System.out.println("le produit AxB est negatif - ");
        else if (A>0 && B>0)
            System.out.println("le produit AxB est positif + ");
        else if (A>0 && B<0)
            System.out.println("le produit AxB est negatif - ");
        else
            System.out.println("le produti et null");

    }
}

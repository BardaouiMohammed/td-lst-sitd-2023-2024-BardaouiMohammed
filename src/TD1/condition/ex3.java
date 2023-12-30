package TD1.condition;
import java.util.Scanner;

/*Écrire un programme qui lit deux nombres entiers a et b et donne le choix à l’utilisateur :
1. de savoir si la somme a + b est paire ;
2. de savoir si le produit ab est pair ;
3. de connaître le signe de la somme a + b ;
4. de connaître le signe du produit ab.*/
public class ex3 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        System.out.print("valeur de a = ");
        int a = in.nextInt();
        System.out.println("");
        System.out.print("valeur de b = ");
        int b = in.nextInt();
        System.out.println("1.\tde savoir si la somme a + b est paire ;\n" +
                "2.\tde savoir si le produit ab est pair ;\n" +
                "3.\tde connaître le signe de la somme a + b ;\n" +
                "4.\tde connaître le signe du produit ab.\n ");

        int option = in.nextInt();
        switch (option) {
            case 1:
                if ((a + b) % 2 == 0)
                    System.out.println("la somme est paire");
                else
                    System.out.println("la somme est impaire");
                break;
            case 2:
                if ((a * b) % 2 == 0)
                    System.out.println("le produit est paire");
                else
                    System.out.println("le produit est impaire");
                break;

            case 3:
                if ((a + b) > 0)
                    System.out.println("le sommme est positive");
                else
                    System.out.println("le somme est negative");
                break;

            case 4:
                if ((a * b) > 0)
                    System.out.println("le produit est positif");
                else
                    System.out.println("le produit est negatif ");
                break;
            default:
                System.out.println("the end");
                break;

        }
    }
}

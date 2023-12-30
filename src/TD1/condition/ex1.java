package TD1.condition;
import java.util.Scanner;

//Écrire un programme qui lit trois variables au clavier et affiche le maximum des trois.
public class ex1 {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        System.out.println(" donner trois variable ");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        int max=a;
        if(b>a && b>c)
             max=b;
        if(c>a && c>b)
             max=c;
        System.out.println("max = "+max);

    }
}

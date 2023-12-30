package TD1.condition;
import java.util.Scanner;

/*Écrire un programme permettant de résoudre l’équation ax2+bx+c=0 en fonction des
valeurs de a, b et c. */

public class ex2 {
    public static void main (String[]args){
        Scanner in =new Scanner(System.in);
        System.out.println("donner a,b et c : ax^2+bx+c=0 ");
        System.out.print("a =");
        int a =in.nextInt();
        System.out.print("b =");
        int b =in.nextInt();
        System.out.print("c =");
        int c =in.nextInt();

        double delta = Math.pow(2,b)-(4*a*c);

          double s= (-b)/(2*a);

          double s1=((-b)+Math.sqrt(delta))/(2*a);
        double s2=((-b)-Math.sqrt(delta))/(2*a);

        if(delta==0){
            System.out.println("la solution = "+s);
        } else if (delta >0) {
            System.out.println("s1=" +s1+" s2="+s2);

        }else {
            System.out.println("s1 ="+(-b/2*a)+"+i"+(Math.sqrt(-delta)/(2*a)));
            System.out.println("s2 ="+(-b/2*a)+"-i"+(Math.sqrt(-delta)/(2*a)));
        }

    }



}

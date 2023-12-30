package TD2;
import java.util.Scanner;
/*Réaliser une classe Point permettant de représenter un point sur un axe.
Chaque point sera caractérisé par un nom (de type char) et une abscisse (de type double).
On prévoira :
 ➢ Un constructeur recevant en arguments le nom et l’abscisse d’un point,
➢ Une méthode affiche imprimant (en fenêtre console) le nom du point et son abscisse,
➢ Une méthode translate effectuant une translation définie par la valeur de son argument.
Écrire un petit programme utilisant cette classe pour créer un point, en afficher les caractéristiques,
le déplacer et en afficher à nouveau les caractéristiques.*/
public class ex1 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("donner le nom du point ");
        char a=in.nextLine().charAt(0);
        System.out.println("donner l'absisse du point ");
        double b=in.nextDouble();
    Point A=new Point(a,b);
    A.affiche();
        System.out.println("effectuer un translation de ");
        double c=in.nextDouble();
    A.translate(c);
    A.affiche();

    }
}
class Point {
    private char nom;
    private double absisse ;

    public Point(char nom,double absisse){
        this.nom=nom;
        this.absisse=absisse;
    }
    public  void  affiche (){
        System.out.println("nom du point :"+nom);
        System.out.println("nom d'absisse :"+absisse);
    }
    public void translate(double translation) {
        this.absisse += translation;
    }
}

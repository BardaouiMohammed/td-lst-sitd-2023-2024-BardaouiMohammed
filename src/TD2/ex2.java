package TD2;

import java.util.Scanner;

/*Définir une classe Pointe caractérisée par son abscisse et ses coordonnées.
        Définir :
        ➢ Le constructeur par défaut et d’initialisation de la classe.
        ➢ A l’aide des getters et les setters les méthodes d’accès aux attributs de la classe
➢ La méthode Norme ( ) qui retourne la distance entre l’origine du repère et le point en cours
Écrire un programme permettant de tester la classe*/
public class ex2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        Pointe a=new Pointe();
        System.out.println("donner l'abscise et x et y du point ");
        double abscise =in.nextDouble();
        double x =in.nextDouble();
        double y =in.nextDouble();
        a.setAbscisse(abscise);
        a.setX(x);
        a.setY(y);
        System.out.println("l'abscice: "+a.getAbscisse()+"   A("+a.getX()+","+a.getY()+")");
        System.out.println("la norme : "+a.norme());

    }
}
class Pointe{
    private double abscisse;
    private double x;
    private double y;

    public Pointe(){}

    public Pointe(double abscisse, double x,double y){
        this.abscisse=abscisse;
        this.x=x;
        this.y=y;
    }
    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(double abscisse) {
        this.abscisse = abscisse;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double norme(){
        return  Math.sqrt(this.x*this.x + Math.pow(this.getY(),2));
    }
}


package TD2;

/*Ecrivez une classe Rectangle avec les attributs suivants:
        ➢ longueur,
        ➢ largeur.
La classe Rectangle doit disposer des constructeurs suivants:
        ➢ Rectangle(): constructeur par défaut,
        ➢ Rectangle(longueur, largeur),
➢ Rectangle(Rectangle).
La classe Rectangle doit contenir des accesseurs et mutateurs (qui vérifient que les valeurs sont
        positives) pour les différents attributs. Elle doit aussi contenir les méthodes:
        ➢ perimetre: Le périmètre est égal à 2 * (longueur + largeur),
        ➢ aire: L'aire est égale à longueur * largeur,
        ➢ isCarre: vérifie si le rectangle est un carré,
        ➢ toString: donne une représentation d'un rectangle.
Ecrivez aussi une classe testRectangle afin de tester la classe Rectangle.*/

public class ex5 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5, 7);
        System.out.println(rectangle1.toString());

        Rectangle rectangle2 = new Rectangle(rectangle1);
        System.out.println(rectangle2.toString());

        rectangle2.setLongueur(8);
        rectangle2.setLargeur(-8);
        System.out.println(rectangle2.toString());

    }
}
class Rectangle {
    private double longueur;
    private double largeur ;
    public Rectangle(){}
    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
    public Rectangle(Rectangle rectangle){
        this(rectangle.getLongueur(),rectangle.getLargeur());
    }
    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur >= 0) {
            this.longueur = longueur;
        } else {
            this.longueur = Math.abs(longueur);
        }
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur >= 0) {
            this.largeur = largeur;
        } else {
            this.largeur = Math.abs(largeur);
        }
    }

    public double perimetre(){
        return  2*(this.longueur+this.largeur);
    }
    public double aire(){
        return this.largeur * this.longueur;
    }
  /*  public void isCarre(){
        if(this.largeur == this.longueur)
            System.out.println("le retangle est un carre");
        else
            System.out.println("le rectangle n'est pas un carr");

    }*/
  public boolean isCarre(){
      return  this.largeur == this.longueur;
  }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", perimetre=" + perimetre() +
                ", aire=" + aire() +
                ", isCarre=" + (isCarre() ? "Oui" : "Non") +
                '}';
    }
}


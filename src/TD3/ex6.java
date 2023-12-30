package TD3;
/*Ecrivez une classe abstraite Figure avec les attributs suivants:
● nom: Le nom de la figure.
● getPerimeter()Le perimeter de la figure (abstraite).
● getAire():L'aire de la figure (abstraite).
● toString(): Donne une représentation de la figure.
Ecrivez un classe Disque héritant de Figure avec les attributs suivants:
● centre: Le centre du disque,
● rayon: Le rayon du disque.
La classe Disque doit disposer des constructeurs suivants:
● Disque(),
● Disque(centre, rayon).
● Disque(centre, rayon,nom).
La classe Disque doit contenir des accesseurs et mutateurs pour les différents attributs et
l’implémentation des méthodes de la classe Figure.
Ecrivez un classe Rectangle héritant de Figure avec les attributs suivants:
● longueur: La longueur du rectangle,
● largeur: La largeur du rectangle.
La classe Rectangle doit disposer des constructeurs suivants:
● Rectangle(),
Rectangle(longueur, largeur).
● Rectangle(longueur, largeur,nom).
La classe Rectangle doit contenir des accesseurs et mutateurs pour les différents attributs et
l’implémentation des méthodes de la classe Figure.
Ecrivez aussi une classe de testFigure afin de tester les classes. */
public class ex6 {
    public static void main(String[] args) {
        Disque disque1 = new Disque(new Poinnt(2, 3), 5.0, "Disque");
        System.out.println(disque1.toString());
        System.out.println("Périmètre : " + disque1.getPerimeter());
        System.out.println("Aire : " + disque1.getAir());
        showDisk(disque1);

        Rectangle rectangle1 = new Rectangle(4.0, 6.0, "Rectangle");
        System.out.println(rectangle1.toString());
        System.out.println("Périmètre : " + rectangle1.getPerimeter());
        System.out.println("Aire : " + rectangle1.getAir());

        showRectangle(rectangle1);
    }

    static void show(Figure f) {
        System.out.println("Perimeter: " + f.getPerimeter() + " Area: " + f.getAir());
    }

    static void showDisk(Disque disque) {
        System.out.println("Perimeter: " + disque.getPerimeter() + " Area: " + disque.getAir());
    }

    static void showRectangle(Rectangle rectangle) {
        System.out.println("Perimeter: " + rectangle.getPerimeter() + " Area: " + rectangle.getAir());
    }
}

abstract class Figure {
    String nom;

    public abstract double getPerimeter();
    public abstract double getAir();

    @Override
    public String toString() {
        return "Figure{" +
                "nom='" + nom + '\'' +
                '}';
    }
}

class Disque extends Figure {
    Poinnt centre;
    double rayon;

    public Disque() {
    }

    public Disque(Poinnt centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public Disque(Poinnt centre, double rayon, String nom) {
        this(centre, rayon);
        this.nom = nom;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.rayon;
    }

    @Override
    public double getAir() {
        return Math.PI * Math.pow(this.rayon, 2);
    }

    @Override
    public String toString() {
        return "Disque{" +
                "centre=" + centre +
                ", rayon=" + rayon +
                ", nom='" + nom + '\'' +
                '}';
    }
}

class Rectangle extends Figure {
    double longueur;
    double largeur;

    public Rectangle() {
    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle(double longueur, double largeur, String nom) {
        this(longueur, largeur);
        this.nom = nom;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.longueur + this.largeur);
    }

    @Override
    public double getAir() {
        return this.longueur * this.largeur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                ", nom='" + nom + '\'' +
                '}';
    }
}

class Poinnt {
    private double x, y;

    public Poinnt() {
    }

    public Poinnt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

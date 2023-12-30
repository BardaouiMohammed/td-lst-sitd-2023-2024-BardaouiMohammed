package TD3;
/*On dispose de la classe suivante :
class Point {
 public Point(int x, int y) {
 this.x = x;
 this.y = y;
 }
 public void affCoord() {
 System.out.println("Coordonnees : " + x + " " + y);
 }
 public void affiche() {
 System.out.println("Coordonnees : " + x + " " + y);
 }
 private int x, y;
}
Réaliser une classe Centre, dérivée de Point permettant de manipuler des points définis par leurs
coordonnées (entières) et un nom (caractère). On y prévoira les méthodes suivantes :
• constructeur pour définir les coordonnées et le nom d’un objet de type Centre,
• affNom pour afficher le nom d’un objet de type Centre.
• affiche pour afficher les coordonnées et le nom d’un objet de type Centre.
Définir une classe Cercle héritant de la classe Centre. Vous prendrez soin de ne pas recoder des
choses déjà codées.
Écrire un petit programme utilisant la classe Centre et Cercle.*/
public class ex3 {
    public static void main(String[]args){
            Cercle c = new Cercle(4,6,"cercle");
            centre s = new centre(2,2,"s");
            s.affiche();
            c.affiche();

        }
    }
    class Pointe {
        private int x, y;
        public Pointe(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void affCoorde() {
            System.out.println("Coordonnees : " + x + " " + y);
        }
        public void affiche() {
            System.out.println("Coordonnees : " + x + " " + y);
        }

    }
    class centre extends Pointe {
        String name;
        public centre(int x, int y, String name){
            super(x,y);
            this.name=name;
        }
        public void affNom(){
            System.out.println("name= "+this.name);
        }
        public void affiche(){
            super.affiche();
            this.affNom();
        }

    }
    class  Cercle extends centre{

        public Cercle(int x, int y, String name){
            super(x,y,name);

        }
        public void affiche(){
            super.affiche();
        }
    }



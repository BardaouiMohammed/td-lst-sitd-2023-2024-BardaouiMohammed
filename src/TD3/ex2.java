package TD3;

/*On dispose de la classe suivante :
class Point {
 public void Point(int x, int y) {
 this.x = x;
 this.y = y;
 }
 public void deplace(int dx, int dy) {
 x += dx;
 y += dy;
 }
 public void affCoord() {
 System.out.println("Coordonnees : " + x + " " + y);
 }
 private int x, y;
}
Réaliser une classe PointNom, dérivée de Point permettant de manipuler des points définis par deux
coordonnées (int) et un nom (caractère). On y prévoira les méthodes suivantes :
● setPointNom pour définir les coordonnées et le nom d’un objet de type PointNom,
● setNom pour définir seulement le nom d’un tel objet,
● affCoordNom pour afficher les coordonnées et le nom d’un objet de type PointNom.
Écrire un petit programme utilisant la classe PointNom.*/
public class ex2 {

      public static void main (String[]args){
            PointNom a = new PointNom();
            a.setPointNom(1,5,"a");
            a.affCoordNom();
            a.deplace(2,5);
            a.affCoordNom();
        }

    }
    class pointe {
        public void pointe(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void deplace(int dx, int dy) {
            x += dx;
            y += dy;
        }
        public void affCoord() {
            System.out.println("Coordonnees : " + x + " " + y);
        }
        private int x, y;

    }
    class PointNom extends pointe{
        private String nom;

        public void  setPointNom(int x, int y, String nom){
            super.pointe(x,y);
            this.nom=nom;
        }
        public void setNom(String nom){
            this.nom= nom;
        }


        public void affCoordNom(){
            super.affCoord();
            System.out.println("name"+this.nom);
        }


    }



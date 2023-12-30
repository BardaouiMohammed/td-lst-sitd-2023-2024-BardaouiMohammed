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
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    private int x, y;
}
Réaliser une classe PointA, dérivée de Point disposant d’une méthode affiche affichant (en fenêtre
console) les coordonnées d’un point.
Ecrire un petit programme utilisant les deux classes Point et PointA.
Que se passerait-il si la classe Point ne disposait pas des méthodes getX et getY ?*/
public class ex1 {
        public static void main(String[]args){
            PointA a =new PointA();
            a.Point(4,8);
            System.out.println(a.Affiche());


        }
    }

    class Point {
        private int x, y ;
        public void Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public void Deplace(int dx, int dy) {
            x += dx;
            y += dy;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }
    }

    class PointA extends Point{
        public String Affiche(){
            return "("+super.getX()+","+super.getY()+")";
        }
    }



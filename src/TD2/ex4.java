package TD2;
/*Ecrivez une classe Temps avec les attributs suivants:
        ➢ heures: De 0 à 23,
        ➢ minutes: De 0 à 59,
        ➢ secondes: De 0 à 59.
La classe Temps doit disposer des constructeurs suivants:
        ➢ Temps(): constructeur par défaut,
        ➢ Temps(heures),
➢ Temps(heures, minutes),
➢ Temps(heures, minutes, secondes),
➢ Temps(Temps).
La classe Temps doit contenir des accesseurs et mutateurs pour les différents attributs. Elle doit aussi
contenir les méthodes:
        ➢ ajouterHeures(heures),
➢ ajouterMinutes(minutes),
➢ ajouterSecondes(secondes),
➢ toString() donnant une représentation de la classe Temps.
Ecrivez aussi une classe de Main afin de tester la classe Temps.*/
public class ex4 {
    public static void main(String[] args) {
        Temps t1=new Temps(2,21,31);
        System.out.println(t1.toString());
        t1.ajouterHeures(12);
        t1.ajouterMinutes(213);
        t1.ajouterSecondes(211);
        System.out.println(t1.toString());
    }
}
class Temps{
    private int heures;
    private int minutes;
    private int secondes;

    public Temps(){}
    public Temps (int heures){
        this.heures=heures;
    }
    public Temps(int heures, int minutes){
        this(heures);
        this.minutes=minutes;
    }
    public Temps(int heures, int minutes,int secondes){
        this(heures,minutes);
        this.secondes=secondes;
    }
    public Temps(Temps temps){
        this(temps.getHeures(),temps.getMinutes(),temps.getSecondes());
    }

    public void setHeures(int heures){
        this.heures=heures;
    }
    public int getHeures(){
        return heures;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecondes() {
        return secondes;
    }

    public void setSecondes(int secondes) {
        this.secondes = secondes;
    }

    public void ajouterHeures(int heures){
        this.setHeures(this.getHeures() + heures);
    }
    public void ajouterMinutes(int minutes){
        minutes += this.getMinutes();
        ajouterHeures(minutes/60);
        this.setMinutes(minutes % 60);
    }
    public void ajouterSecondes(int secondes){
        secondes += this.getSecondes();
        ajouterMinutes(secondes/60);
        this.setSecondes(secondes % 60);

    }
    @Override
    public String toString() {
        return "Temps{" +
                "heures=" + heures +
                ", minutes=" + minutes +
                ", secondes=" + secondes +
                '}';
    }
}

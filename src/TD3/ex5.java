package TD3;
/*Exercice 5
1. Ecrivez une classe Vehicule contenant un champ : private int nbPassager; dans laquelle
vous définirez un constructeur Vehicule(int n) initialisant le nombre de passagers du
véhicule, et une méthode toString retournant une chaîne de caractères indiquant le
nombre de passager d’un véhicule.
2. Écrivez maintenant une classe Moto étendant la classe Véhicule contenant un champ :
private int nbRoues=2; mais pas de constructeur. Le programme compile-t-il ? Justifiez
votre réponse et proposez une solution le cas échéant.
3. Ecrivez maintenant une classe Avion étendant la classe Véhicule contenant un champ :
private int nbMoteur;
4. En utilisant les méthodes this et super, écrivez un constructeur Avion(int nbP) puis
Avion(int nbP, nbM) initialisant le nombre nbP de passagers de l’Avion et le nombre nbM
de moteurs.
5. Faites de même avec une classe Triporteur qui hérite de la classe Moto.
6. Rreprésentez la hiérarchie des classes sous forme d’un diagramme de classes permettant
de mieux « classer » les classes Avion, Moto et Triporteur*/
public class ex5 {
    public static void main(String[] args) {


    }
}
 class Vehicule {
    private int nbpassager;

     public Vehicule(){}
     public Vehicule(int nbpassager) {
         this.nbpassager = nbpassager;
     }

     @Override
     public String toString() {
         return "Vehicule{" +
                 "nbpassager=" + nbpassager +
                 '}';
     }
 }
class Moto extends Vehicule{
    private int nbRoues =2;

    public Moto(){

    }
    public Moto(int nbRoues) {
        this.nbRoues = nbRoues;
    }

    public Moto(int nbpassager, int nbRoues) {
        super(nbpassager);
        this.nbRoues = nbRoues;
    }
}
class Avion extends Vehicule{
    private int nbMoteur;

    Avion(int nbpassanger){

        super(nbpassanger);
    }

    public Avion(int nbpassager, int nbMoteur) {
        super(nbpassager);
        this.nbMoteur = nbMoteur;
    }
}
class  Triporteur extends Moto{
    public Triporteur() {
    }
    public Triporteur(int nbpassager,int nbrRoues) {
       super(nbpassager,nbrRoues);
    }

}

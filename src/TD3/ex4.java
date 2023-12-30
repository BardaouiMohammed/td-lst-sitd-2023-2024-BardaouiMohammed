package TD3;
/*Ecrivez une classe Bâtiment avec les attributs suivants:
• adresse.
La classe Bâtiment doit disposer des constructeurs suivants:
• Batiment()
• Batiment(adresse).
La classe Bâtiment doit contenir des accesseurs et mutateurs pour les différents attributs. La classe
Bâtiment doit contenir une méthode toString() donnant une représentation du Bâtiment.
Ecrivez une classe Maison héritant de Bâtiment avec les attributs suivants:
• nbChambres: Le nombre de pièces de la maisonLa classe Maison doit disposer des constructeurs suivants:
• Maison(),
• Maison(adresse, nbChambres).
La classe Maison doit contenir des accesseurs et mutateurs pour les différents attributs. La classe
Maison doit contenir une méthode toString() donnant une représentation de la Maison.
Ecrivez une classe Immeuble héritant de Bâtiment avec les attributs suivants:
• nbAppart: Le nombre d'appartements de l'immeuble.
La classe Immeuble doit disposer des constructeurs suivants:
• Immeuble(),
• Immeuble(adresse, nbAppart).
La classe Immeuble doit contenir des accesseurs et mutateurs pour les différents attributs. La classe
Immeuble doit contenir une méthode toString() donnant une représentation de l'Immeuble.
Ecrivez aussi une classe de testBatiment afin de tester les classes.*/
public class ex4 {
        public static void main (String[]args){
            testBatiment B = new testBatiment("addd rue 23 ",228);
            System.out.println(B.toString());

        }

    }
    class Batiment{
        private String adresse;
        public Batiment(){

        }
        public Batiment(String adresse){
            this.adresse=adresse;
        }
        public void setAdresse(String adresse){
            this.adresse=adresse;
        }
        public String getAdresse(){
            return this.adresse;
        }

        @Override
        public String toString() {
            return "Batiment{" +
                    "adresse='" + adresse + '\'' + '}';
        }

    }
    class Maison extends Batiment{
        private int nbChambres;

        public Maison() {

        }

        public Maison(String adresse, int nbChambres) {
            super(adresse);
            this.nbChambres = nbChambres;
        }

        public int getNbChambres() {
            return nbChambres;
        }

        public void setNbChambres(int nbChambres) {
            this.nbChambres = nbChambres;
        }

        @Override
        public String toString() {
            return "Maison{" +
                    "nbChambres=" + nbChambres +
                    '}';
        }
    }
    class  Immeuble extends Batiment{
        private int nbAppart;

        public Immeuble() {

        }

        public Immeuble(String adresse, int nbAppart) {
            super(adresse);
            this.nbAppart = nbAppart;
        }

        @Override
        public String toString() {
            return "Immeuble{" +
                    "nbAppart=" + nbAppart +
                    '}';
        }
    }
    class testBatiment extends Maison{
        public testBatiment() {
        }

        public testBatiment(String adresse, int nbChambres) {
            super(adresse, nbChambres);
        }

        @Override
        public String toString() {
            return "la maison du numero "+super.getNbChambres()+"est aussi a la dresse "+super.getAdresse();
        }
    }


package TD2;

/*Ecrivez une classe Livre avec les attributs suivants:
        ➢ titre: Le titre du livre,
➢ auteur: L'auteur du livre,
        ➢ prix: Le prix du livre,
➢ annee: L'année du livre.
La classe Livre doit disposer des constructeurs suivants:
        ➢ Livre()
    ➢ Livre(titre),
➢ Livre(titre, auteur),
➢ Livre(titre, auteur, prix),
➢ Livre(titre, auteur, prix, annee),
➢ Livre(Livre).
La classe Livre doit contenir des accesseurs et mutateurs pour les différents attributs. Elle doit aussi
contenir une méthode toString() donnant une représentation de la classe Livre. Ecrivez aussi une
classe de Main afin de tester la classe Livre.*/

public class ex3 {
    public static void main(String[] args) {
        livre  livre1 = new livre();

        // Création d'un livre avec le constructeur Livre(titre)
        livre livre2 = new livre("Titre1");

        // Création d'un livre avec le constructeur Livre(titre, auteur)
        livre livre3 = new livre("Titre2", "Auteur1");

        // Création d'un livre avec le constructeur Livre(titre, auteur, prix)
        livre livre4 = new livre("Titre3", "Auteur2", 30);

        // Création d'un livre avec le constructeur Livre(titre, auteur, prix, annee)
        livre livre5 = new livre("Titre4", "Auteur3", 40, 2022);

        // Création d'un livre avec le constructeur Livre(Livre)
        livre livre6 = new livre(livre5);

        // Affichage des livres
        System.out.println(livre1);
        System.out.println(livre2);
        System.out.println(livre3);
        System.out.println(livre4);
        System.out.println(livre5);
        System.out.println(livre6);

    }
}
class livre{
    private String titre;
    private String auteur;
    private int prix;
    private int anne;
    public livre(){}
    public livre(String titre){
        this.titre=titre;
    }
    public livre(String titre,String auteur){
        this(titre);
        this.auteur=auteur;
    }
    public livre(String titre ,String auteur,int prix){
        this(titre,auteur);
        this.prix=prix;
    }

    public livre(String titre ,String auteur,int prix,int anne){
        this(titre,auteur,prix);
        this.anne=anne;
    }
    public livre(livre livre ){
        this(livre.getTitre(),livre.getAuteur(),livre.getPrix(),livre.getAnne());
    }
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getAnne() {
        return anne;
    }

    public void setAnne(int anne) {
        this.anne = anne;
    }

    @Override
    public String toString() {
        return "livre{" +
                "titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", prix=" + prix +
                ", anne=" + anne +
                '}';
    }
}
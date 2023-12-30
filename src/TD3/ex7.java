package TD3;

/*Ecrivez une classe abstraite Employe avec les attributs suivants:
• nom: Le nom de famille de l'employé,
• prenom: Le prénom de l'employé.
La classe Employe doit disposer des constructeurs suivants:
• Employe(),
• Employe(nom, prenom).
La classe Employe doit contenir des accesseurs et mutateurs pour les différents attributs et les
méthodes suivantes:
• toString(): retourne une représentation d'un employé
• gains(): retourne le salaire (abstraite).
Ecrivez une classe Patron héritant de Employé avec les attributs suivants:
• salaire: Le salaire mensuel.
La classe Patron doit disposer des constructeurs suivants:
• Patron(),
• Patron(nom, prenom, salaire).
La classe Patron doit contenir des accesseurs et mutateurs pour les différents attributs et les
méthodes suivantes:
• toString(): retourne une représentation du patron
• gains(): retourne le salaire du patron.
Ecrivez une classe TravailleurCommission héritant de Employe avec les attributs suivants:
• salaire: Le salaire mensuel de base,
• commission: Montant de la commission par article vendus,
• quantite: nombre d'articles vendus par mois.
La classe TravailleurCommission doit disposer des constructeurs suivants:
• TravailleurCommission(),
• TravailleurCommission(nom, prenom, salaire, commision).
La classe TravailleurCommission doit contenir des accesseurs et mutateurs pour les différents
attributs et les méthodes suivantes:
• toString(): retourne une représentation du travailleur à la commission
• gains(): retourne le salaire du travailleur à la commission.
Ecrivez une classe TravailleurHoraire héritant de Employe avec les attributs suivants:
• retribution: La rétrubution horaire,
• heures: Le nombre d'heures de travail par mois.
La classe TravailleurHoraire doit disposer des constructeurs suivants:
• TravailleurHoraire(),
• TravailleurHoraire(nom, prenom, retribution).
La classe TravailleurHoraire doit contenir des accesseurs et mutateurs pour les différents attributs et
les méthodes suivantes:
• toString(): retourne une représentation du travailleur horaire,
• gains(): retourne le salaire du travailleur horaire.
Ecrivez aussi une classe de testEmploye afin de tester les classes.
*/
public class ex7 {
    public static void main(String[] args) {

        TravailleurHoraire travailleurHoraire = new TravailleurHoraire("med", "moh", 20.0, 40);
        System.out.println("TravailleurHoraire:");
        System.out.println(travailleurHoraire.toString());
        System.out.println("Gains: " + travailleurHoraire.gains());
        System.out.println();


        Test test = new Test("bar", "aoui");
        System.out.println(test.toString());
        System.out.println("Gains: " + test.gains());
    }
}

abstract class Employe {
    private String nom;
    private String prenom;

    public Employe() {
    }

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public abstract double gains();

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}

class Patron extends Employe {
    private double salaire;

    public Patron() {
    }

    public Patron(String nom, String prenom, double salaire) {
        super(nom, prenom);
        this.salaire = salaire;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return "Patron{" +
                "salaire=" + salaire +
                '}';
    }

    @Override
    public double gains() {
        return salaire;
    }

}

class TravailleurCommission extends Employe {
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission() {
    }

    public TravailleurCommission(String nom, String prenom, double salaire, double commission, int quantite) {
        super(nom, prenom);
        this.salaire = salaire;
        this.commission = commission;
        this.quantite = quantite;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "TravailleurCommission{" +
                "salaire=" + salaire +
                ", commission=" + commission +
                ", quantite=" + quantite +
                '}';
    }

    @Override
    public double gains() {
        return this.salaire +commission;
    }
}

class TravailleurHoraire extends Employe {
    private double retribution;
    private int heures;

    public TravailleurHoraire() {
    }

    public TravailleurHoraire(String nom, String prenom, double retribution, int heures) {
        super(nom, prenom);
        this.retribution = retribution;
        this.heures = heures;
    }

    @Override
    public double gains() {
        return retribution*heures;
    }

    @Override
    public String toString() {
        return "TravailleurHoraire{" +
                "retribution=" + retribution +
                ", heures=" + heures +
                '}';
    }
}

class Test extends Employe {
    public Test() {
    }

    public Test(String nom, String prenom) {
        super(nom, prenom);
    }

    @Override
    public double gains() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

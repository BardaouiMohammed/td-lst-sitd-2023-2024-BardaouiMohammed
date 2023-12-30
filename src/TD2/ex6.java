package TD2;

public class ex6 {
    public static void main(String[] args) {
        Banke compte=new Banke( 1, 5000.75f, "AB 1200");
        System.out.println(compte.toString());
        System.out.println("votre solde "+compte.avoirSolde());
        compte.deposer(500);
        System.out.println(compte.toString());
        System.out.println("votre solde "+compte.avoirSolde());
        compte.reitrer(200);
        System.out.println(compte.toString());
        System.out.println("votre solde "+compte.avoirSolde());

    }

}
class Banke{
    private int ncompte;
    private float solde;
    private String cin;

    public Banke(int ncompte,float solde ,String cin ){
        this.ncompte =ncompte;
        this.solde=solde;
        this.cin=cin;

    }
    public void deposer(float somme){
        solde+= somme;
        System.out.println("la somme "+somme+" est deposer par succes ");
    }
    public void reitrer(float somme){
        if(solde<somme){
            System.out.println("solde insuffisant ");
        }
        else{solde-=somme;
            System.out.println("la somme "+somme+" est retirer par succes ");
        }

    }
    public float avoirSolde(){
        return solde;
    }

    @Override
    public String toString() {
        return "Banke{" +
                "ncompte=" + ncompte +
                ", solde=" + solde +
                ", cin='" + cin + '\'' +
                '}';
    }
}
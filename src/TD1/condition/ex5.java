package TD1.condition;
import java.util.Scanner;

/*Écrire un programme qui affiche, selon l’heure saisie, un des messages suivants :
o Bonjour apparaît lorsque l’heure est comprise entre 0 et 18 heures.
o Bonsoir de 18h à 22h.
o Bonne nuit après 22h.
Modifier le programme de telle sorte qu’il prenne en compte le choix de la langue avec
laquelle il va afficher le message. Exemple : l’utilisateur choisit ‘f’ pour afficher en français
et ‘a’ en anglais.
o Good Morning apparaît lorsque l’heure est comprise entre 0 et 18 heures.
o Good Evening de 18h à 22h.
o Good Night après 22h.*/
public class ex5 {
    public static void main (String[]args){
        Scanner in =new Scanner(System.in);
        char choix;
        do {
            System.out.println("chosir votre langue : f->francais & a->anglais");
             choix = in.nextLine().charAt(0);
       }while(!(choix == 'a' || choix =='f'));
        switch (choix){
          case 'f' : {
                System.out.println("saisi l'heure : ");
                int hr = in.nextInt();
                if(hr>0 && hr<18 )
                    System.out.println("Bonjour");
                else if (hr>=18 && hr<22) {
                    System.out.println("Bonsoir");
                }
                else
                    System.out.println("Bonne nuit");
                break;
            }
           case  'a' : {
                System.out.println("type your hours ");
                int hr = in.nextInt();
                if(hr>0 && hr<18 )
                    System.out.println("good Morning");
                else if (hr>=18 && hr<22) {
                    System.out.println("Good Evening");
                }
                else
                    System.out.println("Good Night");
                break;
            }

        }
    }
}

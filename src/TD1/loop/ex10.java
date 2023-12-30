package TD1.loop;

import java.util.Scanner;
/*Un entier naturel de trois chiffres est dit cubique s’il est égal à la somme des cubes de ses
trois chiffres.
Exemple : 153 est cubique car 153=13+53+33.
Ecrire un programme qui cherche et affiche tous les entiers cubiques de trois chiffres.*/
public class ex10 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                for (int k = 0; k <= 9; k++) {
                    int t = (int) (Math.pow(i,3) + Math.pow(j,3) + Math.pow(k,3));
                    int nbr = Integer.parseInt(""+ i+j+k);

                    if (t == nbr)
                        System.out.println(i+"^3 + "+j+" ^3 + "+ k +"^3 ="+t);

                }
            }
        }


    }
}

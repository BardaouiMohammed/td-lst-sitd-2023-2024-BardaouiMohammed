package TD1.tableaux;

/*Ecrire un programme effectuant le décalage des éléments d'un tableau.
Exemple :
-Tableau initial D E C A L A G E
-Tableau modifié E C A L A G E D*/
public class ex5 {
    public static void main(String[] args) {
        char[] tab = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

        // Stocker le premier élément
        char premierElement = tab[0];

        // Décalage des éléments
        for (int i = 0; i < tab.length - 1; i++) {
            tab[i] = tab[i + 1];
        }

        // Placer le premier élément à la fin
        tab[tab.length - 1] = premierElement;

        // Affichage du tableau modifié
        for (char j : tab) {
            System.out.print(j + " ");
        }
    }
}

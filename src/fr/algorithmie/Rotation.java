package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] tableau = {0,1,2,3};

        int[] tableauCopie = new int[tableau.length];
        for (int i = 0; i < tableau.length; i++) {
            tableauCopie[i] = tableau[i];
        }
        // On cree une copie du tableau original

        for (int i = 1; i <= tableau.length-1; i++) {
            tableau[i] = tableauCopie[i-1];
        }
        tableau[0] = tableauCopie[tableauCopie.length-1];
        // on Transmet les valeurs du tableau copie vers le tableau d'origine en creant un decalage à partir de la premiere valeur puis on la modifie

        System.out.print("Tableau : ");
        for (int nombre : tableau) {
            System.out.print(nombre + " ");
        }


    }
}

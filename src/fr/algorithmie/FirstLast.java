package fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] tableau = {2,3,3,2};

        boolean sameFirstLast = false;

        if (tableau.length >= 1 && tableau[0] == tableau[tableau.length-1]) {
            sameFirstLast = true;
        }

        if (sameFirstLast == true) {
            System.out.println("Les première et dernière valeurs du tableau sont égales");
        } else if (tableau.length < 1) {
            System.out.println("Tableau vide");
        } else {
            System.out.println("Les première et dernière valeurs du tableau ne sont pas égales");
        }
    }
}

package fr.algorithmie;

import java.util.Scanner;

public class InteractifLePlusGrand {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb;

        int[] tableau = new int[10];
        int compteur = 0;
        // On cree un tableau qui va accueillir les valeurs scanne et un compteur qui nous donne le nombre de valeurs rentre

        do {
            nb = scanner.nextInt();
            tableau[compteur] = nb;
            compteur ++;
        } while (compteur < 10);
        // On scanne tant que le compteur n'a pas atteint 10

        int valeurMax = tableau[0];
        for (int i = 1; i < tableau.length; i++) {
            if (tableau[i] > valeurMax) {
                valeurMax = tableau[i];
            }
        }
        // On cree une variable valeurMax, on lui donne la valeur du premier index puis on la compare avec les autres index

        System.out.println(valeurMax);
        scanner.close();
    }
}

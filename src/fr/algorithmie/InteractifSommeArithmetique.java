package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();

        int[] tableau = new int[nb];
        // On cree un tableau de la longueur du nombre donne par l'utilisateur

        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = i + 1;
        }
        // On rempli ce tableau de 1 au nombre donne

        int somme = 0;
        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }
        // On additionne l'ensemble des nombres du tableau dans la variable somme et on l'affiche

        System.out.println(somme);
        scanner.close();
    }
}

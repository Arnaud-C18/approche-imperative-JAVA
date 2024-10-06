package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifFibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb = scanner.nextInt();
        long valeur;
        long[] tableauRang = new long[nb+1];

        if (nb > 1) {
            tableauRang[0] = 0;
            tableauRang[1] = 1;
            for (int i = 2; i < nb+1; i++) {
                tableauRang[i] = tableauRang[i-1] + tableauRang[i-2];
            }
            valeur = tableauRang[tableauRang.length-1];
        } else if (nb < 0) {

            return;
        } else {
            valeur = nb;
        }
        System.out.println(valeur);

    }
}

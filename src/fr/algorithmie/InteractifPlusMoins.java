package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Random random = new Random();

        //int nbATrouver = 50;
        int nbATrouver = random.nextInt(100)+1;
        // On genere un nombre compris entre 0 et 99 puis on ajoute 1

        Scanner scanner = new Scanner(System.in);
        int nb;
        int compteurFautes = 1;

        do {
            nb = scanner.nextInt();
            if (nb > nbATrouver) {
                System.out.println("Le nombre à trouver est plus petit");
                compteurFautes ++;
            } else if (nb < nbATrouver) {
                System.out.println("Le nombre à trouver est plus grand");
                compteurFautes ++;
            } else {
                System.out.println("Bravo vous avez trouvé en " + compteurFautes + " coups");
                scanner.close();
            }
        } while (nb != nbATrouver);
    }
}

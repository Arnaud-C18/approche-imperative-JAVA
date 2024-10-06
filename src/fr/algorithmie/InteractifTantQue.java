package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Ouverture du scan de la console
        int nb;
        // Declaration de la variable qui va accueillir l'input

        do {
            nb = scanner.nextInt();
        } while (nb < 1 || nb > 10);
        // On verifie que l'input rempli les conditions :
        //  -Si c'est le cas on renvoie la valeur et ferme le scan
        //  -Sinon on ne renvoie rien et on continu le scan

        System.out.println(nb);
        scanner.close();
    }
}

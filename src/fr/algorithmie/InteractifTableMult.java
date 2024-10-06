package fr.algorithmie;
import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {

        int[] table = {1,2,3,4,5,6,7,8,9,10};
        // On cree un tableau qui nous permet de stocker les multiplicateurs
        Scanner scanner = new Scanner(System.in);
        int nb;

        do {
            nb = scanner.nextInt();
        } while (nb < 1 || nb > 10);

        for (int i = 0; i < table.length; i++)
            System.out.println(nb*table[i]);
        // Meme chose que precedement mais on affiche chaque multiplication

        scanner.close();

    }
}

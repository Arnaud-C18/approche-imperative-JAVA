package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
        public static void main(String[] args) {

            int[] table = {1,2,3,4,5,6,7,8,9,10};

            Scanner scanner = new Scanner(System.in);
            int nb = scanner.nextInt();

            for (int i = 0; i < table.length; i++)
                System.out.println(nb+table[i]);

            scanner.close();

        }
}


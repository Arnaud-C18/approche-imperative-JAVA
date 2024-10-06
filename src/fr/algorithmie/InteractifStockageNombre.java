package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int nb ;
        int menu;
        int[] tableau = new int[10];
        int index = -1;
        // On declare 2 variable, nb pour le nombre a enregistrer et menu pour niviguer dans le programme
        // On declare egalement le tableau qui va enregistrer les nombres et une variable "index" qui va nous permettre de suivre le remplissage du tableau

        do {
            System.out.println("1: Ajouter un nombre\n2: Consulter le tableau\n3: Quitter le programme");
            menu = scanner.nextInt();
            //Menu de navigation avec 3 choix
            if (menu == 1) {
                System.out.println("Écrivez le nombre à ajouter au tableau");
                nb = scanner.nextInt();
                //On recupere le nombre, index augmente sa valeur de 1
                index += 1;
                if (index == tableau.length-1) {
                    // On regarde si le tableau est plein, si c'est le cas on en recreer un avec 10 emplacements en plus
                    int[] tableauProvisoire = new int[tableau.length];
                    for (int i = 0; i < tableau.length; i++) {
                        tableauProvisoire[i] = tableau[i];
                    }
                    tableau = new int[index+11];
                    for (int i = 0; i < tableauProvisoire.length; i++) {
                        tableau[i] = tableauProvisoire[i];
                    }
                }
                tableau[index] = nb;
                // on ajoute notre nombre au tableau

            }else if (menu == 2) {
                System.out.println("Tableau :\n" + Arrays.toString(tableau) + "\n");
            }
        } while( menu != 3);

    }
}

package fr.algorithmie;

import java.util.Scanner;
import java.util.Random;

public class Interactif21Batons {

    static int batons = 21;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bienvenue dans le jeu des 21 bâtons !\n" +
                "Il y a 21 bâtons présents devant vous, à tour de rôle vous devez en retirer 1, 2 ou 3.\n" +
                "Le but du jeu est de ne pas être le joueur à retirer le dernier bâton, bonne chance!"
        );

        // Demander qui doit commencer
        System.out.println(
                "Qui doit commencer la partie?\n" +
                "1 : Moi\n" +
                "2 : L'ordinateur"
        );
        int premier = scanner.nextInt();
        System.out.println("Il y a 21 bâtons");

        // Boucle principale du jeu
        while (batons > 0) {
            // Tour du joueur s'il joue en premier
            if (premier == 1) {
                tourJoueur(scanner);
                if (batons <= 0) {
                    System.out.println("Le joueur a perdu, l'ordinateur gagne !");
                    break;
                }
            }
            //Tour de l'ordinateur
            tourOrdinateur(random);
            if (batons <= 0) {
                System.out.println("L'ordinateur a perdu, le joueur gagne !");
                break;
            }
            // Tour du joueur s'il joue en second
            if (premier == 2) {
                tourJoueur(scanner);
                if (batons <= 0) {
                    System.out.println("Le joueur a perdu, l'ordinateur gagne !");
                    break;
                }
            }
        }
        scanner.close();
    }

    // Méthode pour le tour du joueur
    public static void tourJoueur(Scanner scanner) {
        int choix = 0;

        System.out.print("Votre tour ! Combien de bâton(s) voulez-vous retirer (1-2-3) ? ");
        while (choix < 1 || choix >3) {
            choix = scanner.nextInt();
            if (choix > 3 || choix < 1) {
                System.out.println("Vous ne pouvez choisir que 1, 2 ou 3 bâton(s)");
            }
        };
        batons -= choix;
        afficherBatons();
    }

    // Méthode pour le tour de l'ordinateur
    public static void tourOrdinateur(Random random) {
        int choix = 0;

        if (batons <= 1) {
            choix = batons;
        } else if (batons <= 4) {
            choix = batons - 1;
        } else {
            if ((batons-1) % 4 != 0) {
                choix = (batons - 1) % 4;
            } else {
                choix = random.nextInt(3) + 1;
            }
        }
        System.out.println("L'ordinateur retire " + choix + " bâton(s).");
        batons -= choix;
        afficherBatons();
    }

    // Méthode pour afficher le nombre de bâtons restants
    public static void afficherBatons() {
        System.out.println("Il reste " + batons + " bâton(s).");
    }
}

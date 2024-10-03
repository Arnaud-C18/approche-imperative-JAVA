package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        // On affiche tous les nombres entier avant 11 en commencant par 1

        String NomPrenom = "CLAVIER Arnaud";
        for (int i = 1; i < 21; i++) {
            System.out.println(NomPrenom);
        }
        // on affiche 20 fois la variable "NomPrenom" avec la technique precedente

        for (int i = 1; i < 51; i++) {
            System.out.println(i*2);
        }
        // On augmente i de 1 a 50 en affichant i multiplie par 2 a chaque etape

        for (int i = 1; i < 51; i++) {
            System.out.println(i*2-1);
        }
        // Meme principe que l'etape precedente mais on soustrait 1 avant chaque impression pour n'obtenir que des nombres impairs


    }
}

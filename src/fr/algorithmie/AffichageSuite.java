package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {

        System.out.println("Entiers de 1 à 10");
        for(int i=0; i<10; i++) {
            System.out.println(i+1);
        }

        System.out.println("\nEntiers de 0 à 10");
        for(int i=-1; i<10; i++) {
            System.out.println(i+1);
        }

        System.out.println("\nEntiers de 0 à 9");
        for(int i=-1; i<9; i++) {
            System.out.println(i+1);
        }


        System.out.println("\nEntiers de 1 à 10 avec while");
        int i = 1;
        while (i < 11) {
            System.out.println(i);
            i++;
        }

        System.out.println("\nEntiers de 0 à 10 avec while");
        i = 0;
        while (i < 11) {
            System.out.println(i);
            i++;
        }

        System.out.println("\nEntiers de 0 à 9 avec while");
        i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }
}

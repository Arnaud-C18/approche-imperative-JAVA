package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        // Creation du tableau d'entiers

        System.out.println("Tableau dans l'ordre");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        // On parcourt le tableau et on imprime chaque element

        System.out.println("\nTableau dans l'ordre inverse");
        for (int i = 1; i < array.length+1; i++) {
            System.out.println(array[array.length-i]);
        }
        // On parcourt le tableau et on imprime chaque element mais en commencant par la fin

        System.out.println("\nSeulement les valeurs supérieurs à 3");
        for (int i = 0; i < array.length; i++) {
            if (array[i]>3){
                System.out.println(array[i]);
            }
        }
        // On parcourt le tableau et on imprime chaque element superieur à 3

        System.out.println("\nSeulement les entiers pairs");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0){
                System.out.println(array[i]);
            }
        }
        // On parcourt le tableau et on imprime chaque entier pair


        System.out.println("\nSeulement les valeurs d'index pairs");
        for (int i = 0; i < array.length; i++) {
            if (i%2 == 0){
                System.out.println(array[i]);
            }
        }
        // On parcourt le tableau et on imprime chaque element d'index pair

        System.out.println("\nSeulement les valeurs d'index impairs");
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0){
                System.out.println(array[i]);
            }
        }
        // On parcourt le tableau et on imprime chaque entier impair
    }
}

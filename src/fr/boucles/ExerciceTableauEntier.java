package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        byte[] tableauEntiers = {1,2,3,4,5,6,7,8,9,10};
        // Creation du tableau d'entiers

        System.out.println(tableauEntiers[0]);
        // Affichage du premier element du tableau

        System.out.println(tableauEntiers.length);
        // Affichage de la longueur du tableau

        System.out.println(tableauEntiers[tableauEntiers.length-1]);
        // Affichage du dernier element du tableau via la methode longueur du tableau moins 1

        tableauEntiers[4] = 8;
        // Modification de la valeur d'index 4 par la valeur 8

        System.out.println(tableauEntiers[4]);
        // Verification de la modification
    }

}

package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {

        byte[] tableauNombres = {8,-7,12,1,-2,14,17,9};
        // Creation du tableau

        System.out.println(tableauNombres[0]);
        // Affichage du premier element du tableau

        System.out.println(tableauNombres.length);
        // Affichage de la longueur du tableau

        System.out.println(tableauNombres[tableauNombres.length-1]);
        // Affichage du dernier element du tableau

        System.out.println(tableauNombres[10]);
        /* "Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 8
        at fr.tableaux.ExerciceDeclarationTab.main(ExerciceDeclarationTab.java:18)"

        Erreur du au fait que l'on cherche à afficher le 10eme element d'un tableau qui n'en comporte que 8
        */

    }
}

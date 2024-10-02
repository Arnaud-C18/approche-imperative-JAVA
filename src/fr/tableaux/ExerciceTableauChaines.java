package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {

        String[] tableauVilles = {"Bourges","Bordeaux","Marseille","Toulouse","Montpellier"};
        // Declaration du tableau

        for (String tableauVille : tableauVilles) {
            System.out.println(tableauVille);
        }
        // On parcourt le tableau avec une boucle "for" et on affiche chaque elements

        System.out.println(tableauVilles.length);
        // On affiche la longueur du tableau

        tableauVilles[3] = "Reims";
        // On modifie l'element d'index 3 "Toulouse" par "Reims"

        for (String tableauVille : tableauVilles) {
            System.out.println(tableauVille);
        }
        // On re-affiche tous les elements du tableau 
    }
}

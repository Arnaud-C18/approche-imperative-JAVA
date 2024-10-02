package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String[] args) {

        byte entierTresCourt = 1;
        // Entier compris entre -128 et 127

        short entierCourt = 1^3;
        // Entier compris entre -32768 et 32767
        // Les puissances s'écrivent 1^10

        int entier = 100000;
        // Entier compris entre -2.147.483.648 et 2.147.483.647

        long entierLong = 1_000_000_000L;
        // Entier compris entre -9.223.372.036.854.776.000 et 9.223.372.036.854.776.000, a ecrire avec un "L"
        // Astuce: ajouter un tiret bas à un chiffre permet de le rendre plus visible et ne sera pas lu par le compilateur

        float decimal = 0.1F;
        // Decimal compris entre -3,4*10e38 et 3,4*10e38, a ecrire avec un "F"

        double decimalPrecis = 5E-3D;
        // Decimal compris entre -1,7*10e308 et 1,7*10e308, on peut ajouter un "D" mais ce n'est pas obligatoire
        // L'ecriture 10E-3 est lu comme une multiplication par une puissance de 10, cette méthode n'est utilisable qu'avec les types "double" et "float"

        boolean VraiFaux = true;
        // Valeur true ou false

        char caractere = 'a';
        // Caractere simple, a ecrire avec des guillemets simples

        String chaineCaractere = "abcd";
        // Chaine de caracteres, a ecrire avec des guillemets doubles

        String randomString = "Voici le résultat d'un calcul :\n1+5=6";

        System.out.println(randomString);
    }
}

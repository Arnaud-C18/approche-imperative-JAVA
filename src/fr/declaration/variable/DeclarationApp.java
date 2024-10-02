package fr.declaration.variable;

public class DeclarationApp {
    public static void main(String args[]) {

        byte entierTresCourt = 1;
        // Entier compris entre -128 et 127

        short entierCourt = 10;
        // Entier compris entre -32768 et 32767

        int entier = 100;
        // Entier compris entre -2.147.483.648 et 2.147.483.647

        long entierLong = 1000;
        // Entier compris entre -9.223.372.036.854.776.000 et 9.223.372.036.854.776.000

        float decimal = 0.1f;
        // Decimal compris entre -3,4*10e38 et 3,4*10e38, a ecrire avec un "f"

        double decimalPrecis = 0.01;
        // Decimal compris entre -1,7*10e308 et 1,7*10e308

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

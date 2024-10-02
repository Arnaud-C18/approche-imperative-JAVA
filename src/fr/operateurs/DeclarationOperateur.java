package fr.operateurs;

public class DeclarationOperateur {
    public static void main(String args[]) {
        int a = 10;
        int b = 20;
        boolean testEt = a>0 && b<10;
        // Verifie si les 2 valeurs sont vraies

        boolean testOu = a>0 || b<10;
        // Verifie si au moins une des valeurs est vraies

        a=a+1;
        a++;
        a+=1;
        // Incrémente la valeur a de 1

        String c = a>0 ? "a est plus grand que 0":"a est inférieur à 0";
        // Verifie si la valeur de a est superieur à 0, si c'est le cas attribue la premiere option, sinon la deuxieme

        System.out.println(c);
    }
}

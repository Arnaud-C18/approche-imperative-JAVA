package fr.algorithmie;

public class FabriquerMur {
    public static void main(String[] args) {
        // Tests de vérification
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }
    
    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        boolean resultat = false;
        
        if (nbSmall + nbBig*5 >= longueur && (longueur % 5 == 0 || (longueur - ((longueur / 5)*5)) <= nbSmall)) {
            // On vérifie 3 choses:
            //  -Que la longueur totale de briques est superieur ou egale a la longueur voulu du mur ET
            //  -Que la longueur est divisible par 5 sans retourner de reste OU
            //  -Que le reste de cette division est inférieur ou egale au nombre de petite briques
            resultat = true;
        }

        return resultat;
    }
    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b) {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " + longueur + ") NON passant.");
        }
    }
}

package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1 = {1,15,-3,8,7,4,-2,28,-1,17,2,3,0,14,-4};
        int[] array2 = {3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};

        int longueurTableau;
        if (array1.length >= array2.length) {
            longueurTableau = array2.length;
        } else {
            longueurTableau = array1.length;
        }

        int totalCommunAvecIndice = 0;
        for (int i = 0; i < longueurTableau; i++) {
            if (array1[i] == array2[i]) {
                totalCommunAvecIndice += 1;
            }
        }

        int totalCommunSansIndice = 0;
        for (int i = 0; i < array1.length-1; i++) {
            for (int j = 0; j < array2.length-1; j++) {
                if (array1[i] == array2[j]) {
                    totalCommunSansIndice += 1;
                }
            }
        }

        System.out.println("Il y a " + totalCommunAvecIndice + " élément(s) avec le même nombre et le même indice et " + totalCommunSansIndice + " élément(s) avec le même nombre mais un indice différent");

    }
}

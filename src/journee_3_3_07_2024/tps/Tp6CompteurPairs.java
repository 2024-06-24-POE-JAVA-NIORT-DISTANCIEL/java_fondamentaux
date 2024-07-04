package journee_3_3_07_2024.tps;

public class Tp6CompteurPairs {
    public static int nombresPairsTableau(int[] tableau) {
        int compte = 0;
        for (int nombre : tableau) {
            if (nombre % 2 == 0) compte++;
        }
        return compte;
    }

    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Tableau : " + java.util.Arrays.toString(tableau));
        System.out.println("Nombre de nombres pairs : " + nombresPairsTableau(tableau));
    }
}

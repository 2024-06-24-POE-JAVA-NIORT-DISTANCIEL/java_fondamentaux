package journee_3_3_07_2024.tps;

import java.util.Arrays;

public class Tp7Coordonnees {
    public static int[] calculDirections(String[] directions) {
        int x = 0, y = 0;
        for (String direction : directions) {
            switch (direction.toLowerCase()) {
                case "haut"-> y++;
                case "bas"->y--;
                case "gauche"->x--;
                case "droite"-> x++;
            }
        }
        return new int[]{x, y};
    }

    public static void main(String[] args) {
        String[] directions = {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        int[] resultat = calculDirections(directions);
        System.out.println(Arrays.toString(resultat));
    }
}
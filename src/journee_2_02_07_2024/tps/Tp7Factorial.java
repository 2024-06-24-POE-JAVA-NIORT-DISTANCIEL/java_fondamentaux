package journee_2_02_07_2024.tps;

import java.util.Scanner;

public class Tp7Factorial {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Veuillez saisir un nombre pour lequel vous voulez calculer la factorielle : ");

        int nombre = keyboard.nextInt();
        long factorielle = 1;

        String detailCalcul = "";

        for (int i = 1; i <= nombre; i++) {
            factorielle *= i;

            if (i > 1) {
                detailCalcul += " x " + i;
            } else {
                detailCalcul += i;
            }
        }

        System.out.printf("Factorielle de %d : %s = %d\n", nombre, detailCalcul, factorielle);
    }
}

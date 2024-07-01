package journee_1_01_07_2024.tps;

import java.util.Scanner;

public class Tp2CalculSurface {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Entrez le diamètre du cercle : ");
        double diametre = keyboard.nextDouble();
        double rayon = diametre / 2;
        double surface = rayon * rayon * Math.PI;
        System.out.printf("La surface du cercle est : %.2f\n", surface);
        keyboard.close();
    }
}

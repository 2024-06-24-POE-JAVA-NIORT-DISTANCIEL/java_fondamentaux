package journee_1_01_07_2024.tps;

import java.time.Year;
import java.util.Scanner;

public class Tp6Age {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Donnez votre âge : ");
        int age = keyboard.nextInt();
        int anneeActuelle = Year.now().getValue();
        int annee = anneeActuelle - age;
        System.out.printf("Votre année de naissance est : %d\n", annee);
        keyboard.close();
    }
}

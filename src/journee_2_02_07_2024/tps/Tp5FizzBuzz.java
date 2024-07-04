package journee_2_02_07_2024.tps;

import java.util.Scanner;

public class Tp5FizzBuzz {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Entrez un nombre n : ");
        int n = keyboard.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("fizzbuzz");
            } else if (i % 3 == 0) {
                System.out.println("fizz");
            } else if (i % 5 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

        keyboard.close();
    }
}
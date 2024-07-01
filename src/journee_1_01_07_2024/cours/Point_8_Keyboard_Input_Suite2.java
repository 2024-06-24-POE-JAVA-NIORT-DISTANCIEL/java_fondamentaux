package journee_1_01_07_2024.cours;

import java.util.Scanner;

public class Point_8_Keyboard_Input_Suite2 {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Votre nom : ");
        String nom=keyboard.nextLine();

        System.out.printf("Votre nom est %s",nom);
    }
}

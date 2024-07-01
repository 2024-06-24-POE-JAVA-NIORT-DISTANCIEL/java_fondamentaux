package journee_1_01_07_2024.cours;

import java.util.Scanner;

public class Point_7_Keyboard_Input_Suite {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.println("Entrez vos données personnelles.");

        String nom=keyboard.next();
        int age=keyboard.nextInt();


        System.out.printf("Nom : %s \nAge : %d",nom,age);
    }
}

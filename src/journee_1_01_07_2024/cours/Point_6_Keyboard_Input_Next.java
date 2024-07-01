package journee_1_01_07_2024.cours;

import java.util.Scanner;

public class Point_6_Keyboard_Input_Next {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);

        System.out.print("Votre nom : ");

        String prenom=keyboard.next();
        String nom=keyboard.next();
        String pays=keyboard.next();

        System.out.printf("Votre nom: %s\nVotre prenom : %s\nVotre pays : %s",nom,prenom,pays);
    }
}

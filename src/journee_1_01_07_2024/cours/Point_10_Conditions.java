package journee_1_01_07_2024.cours;

import java.util.Scanner;

public class Point_10_Conditions {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Votre age svp: ");
        int age=keyboard.nextInt();
        boolean estMajeur=age>=18;
        /*age>18 || age==18*/
        if (estMajeur) {
            System.out.println("Vous êtes majeur");
        }else{
            System.out.println("Vous êtes mineur");
        }
    }
}

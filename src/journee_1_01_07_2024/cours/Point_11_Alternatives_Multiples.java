package journee_1_01_07_2024.cours;

import java.util.Scanner;

public class Point_11_Alternatives_Multiples {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Votre langue : ");
        String langue=keyboard.nextLine();

        if(langue.equals("english")){
            System.out.println("Hello");
        }else if(langue.equals("french")){
            System.out.println("Salut");
        } else if (langue.equals("spanish")) {
            System.out.println("Hola!!");
        } else if (langue.equals("german")) {
            System.out.println("Guten tag");
        }else if (langue.equals("mandarin")){
            System.out.println("Ni hao");
        }else {
            System.out.println("Langue non supportée");
        }
    }
}

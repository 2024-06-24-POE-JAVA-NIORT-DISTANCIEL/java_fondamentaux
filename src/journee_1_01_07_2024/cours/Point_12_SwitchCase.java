package journee_1_01_07_2024.cours;

import java.util.Scanner;

public class Point_12_SwitchCase {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Votre langue : ");
        String langue = keyboard.nextLine();
        langue = langue.toLowerCase();


        switch (langue) {
            case "english" -> System.out.println("Hello");
            case "french" -> System.out.println("Salut");
            case "spanish" -> System.out.println("Hola!!");
            case "german" -> System.out.println("Guten tag");
            case "chinese" -> System.out.println("Ni hao");
            default -> System.out.println("Langue non supportée");
        }

//        switch (langue){
//            case "english":
//                System.out.println("Hello");
//                break;
//            case "french":
//                System.out.println("Salut");
//                break;
//            case "spanish":
//                System.out.println("Hola!!");
//                break;
//            case "german":
//                System.out.println("Guten tag");
//                break;
//            case "chinese":
//                System.out.println("Ni hao");
//                break;
//            default:
//                System.out.println("Langue non supportée");
//        }
    }
}

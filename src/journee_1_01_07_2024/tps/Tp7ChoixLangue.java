package journee_1_01_07_2024.tps;

import java.util.Scanner;

public class Tp7ChoixLangue {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Votre langue : ");
        String langue = keyboard.nextLine().toLowerCase();

        String greeting = switch (langue) {
            case "english" -> "Hello";
            case "french" -> "Salut";
            case "spanish" -> "Hola!!";
            case "german" -> "Guten tag";
            case "mandarin" -> "Ni hao";
            default -> "Langue non supportée";
        };

        System.out.println(greeting);

        keyboard.close();
    }
}

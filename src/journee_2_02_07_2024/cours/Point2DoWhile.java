package journee_2_02_07_2024.cours;

import java.util.Scanner;

public class Point2DoWhile {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Veuillez créer un code pin : ");
        int codePin=keyboard.nextInt(); // 4321

        int codePinATester;
        do{
            System.out.print("Veuillez entrer le code pin pour débloquer l'appareil : ");
            codePinATester=keyboard.nextInt(); // 4321
        }while (codePinATester!=codePin);//4321 != 4321 => true
    }
}

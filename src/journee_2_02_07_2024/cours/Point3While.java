package journee_2_02_07_2024.cours;

import java.util.Scanner;

public class Point3While {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Veuillez créer un code pin : ");
        int codePin=keyboard.nextInt(); // 4321

        int codePinATester = 0;

        while (codePinATester!=codePin){
            System.out.print("Veuillez entrer le code pin pour débloquer l'appareil : ");
            codePinATester=keyboard.nextInt(); // 4321
        }
    }
}

package journee_2_02_07_2024.cours;

import java.util.Scanner;

public class Point4TestInsideWhile {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Veuillez créer un code pin : ");
        int codePin=keyboard.nextInt();

        int codePinATester;
        do{
            System.out.print("Veuillez entrer le code pin pour débloquer l'appareil : ");
            codePinATester=keyboard.nextInt();
            if(codePinATester!=codePin){
                System.out.println("Code pin incorrect, veuillez reessayer");
            }else{
                System.out.println("Welcome!!!");
            }
        }while (codePinATester!=codePin);
    }
}

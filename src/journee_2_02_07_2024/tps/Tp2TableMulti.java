package journee_2_02_07_2024.tps;

import java.util.Scanner;

public class Tp2TableMulti {
    public static void main(String[] args) {
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Nombre : ");
        int nombre=keyboard.nextInt();

        System.out.println("Table de "+nombre);
        System.out.println("============\n");
        for (int i = 1; i <=11 ; i++) {
            System.out.printf("%d x %d = %d\n",nombre,i,(nombre*1));
        }
    }
}
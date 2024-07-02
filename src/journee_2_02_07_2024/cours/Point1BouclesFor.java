package journee_2_02_07_2024.cours;

public class Point1BouclesFor {
    public static void main(String[] args) {
//        System.out.printf("Le carré de %d est %.1f\n",2,Math.pow(2,2));
//        System.out.printf("Le carré de %d est %.1f\n",3,Math.pow(3,2));
//        System.out.printf("Le carré de %d est %.1f\n",4,Math.pow(4,2));
//        System.out.printf("Le carré de %d est %.1f\n",5,Math.pow(5,2));

        for(int c=2;c<=5;c++){
            // n = 2; => Le carré de 2 est 4
            // n=n+1=>n=2+1=3 => Le carré de 3 est 9
            // n=n+1 => n=3+1 = 4 => Le carré de 4 est 16
            // n=n+1 => n=4+1 = 5 => Le carré de 5 est 25
            // n=n+1 => n=5+1 = 6
            System.out.printf("Le carré de %d est %.1f\n",c,Math.pow(c,2));
        }
    }
}

//




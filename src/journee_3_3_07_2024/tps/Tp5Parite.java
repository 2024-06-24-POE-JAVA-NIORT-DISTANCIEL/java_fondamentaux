package journee_3_3_07_2024.tps;

public class Tp5Parite {
    public static boolean estPair(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println("4 est pair : " + estPair(4));
        System.out.println("7 est pair : " + estPair(7));
    }
}

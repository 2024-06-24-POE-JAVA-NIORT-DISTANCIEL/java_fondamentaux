package journee_4_04_07_2024.tps.rectangle;


public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(500,250);
        System.out.println("Périmètre : "+rectangle.calculPerimetre());
        System.out.println("Aire "+rectangle.calculAire());
    }
}

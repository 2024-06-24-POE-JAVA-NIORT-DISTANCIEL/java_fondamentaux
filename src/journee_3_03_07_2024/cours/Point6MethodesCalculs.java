package journee_3_03_07_2024.cours;

public class Point6MethodesCalculs {
    public static int calculPerimetre(int longueur,int largeur){
//        int resultat=2*(longueur+largeur);
//        return resultat;
        return 2*(longueur+largeur);
    }


    public static int calculAire(int longueur,int largeur){
        return longueur*largeur;
    }

    public static void direBonjour(String name){
        System.out.printf("Bonjour %s",name);
    }



    public static void main(String[] args) {
        System.out.println("Perimetre : "+calculPerimetre(500,250));
        System.out.println("Aire : "+calculAire(500,250));

        int longueur=35;
        int largeur=19;
        int perimetre=calculPerimetre(longueur,largeur);
        int aire=calculAire(longueur,largeur);
        System.out.println("Perimetre2 : "+perimetre);
        System.out.println("Aire2 : "+aire);

        direBonjour("Yannis");
    }
}

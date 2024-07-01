package journee_1_01_07_2024.cours;

public class Point_5_Affichage {
    public static void main(String[] args) {
        int longueur=670;
        int largeur=220;
        int perimetre=2*(longueur+largeur);
        int aire=longueur*largeur;

        // périmètre = 2*(longueur+largeur) = 1500
        System.out.println("périmètre = 2*("+longueur+"+"+largeur+") = "+perimetre+" m");
        System.out.println("aire = "+longueur+"*"+largeur+" = "+aire+" m2");

        System.out.printf("périmètre = 2*(%d + %d) = %d m\n",longueur,largeur,perimetre);
        System.out.printf("aire = %d * %d = %d m2\n",longueur,largeur,aire);
    }
}

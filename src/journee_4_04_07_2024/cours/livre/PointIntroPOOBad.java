package journee_4_04_07_2024.cours.livre;

public class PointIntroPOOBad {
    public static void emprunterLivre(String titre,String auteur,int nombrePages,boolean emprunte){
        if(!emprunte){
            emprunte=true;
            System.out.printf("Le livre %s a été emprunté.",titre);
        }else{
            System.out.printf("Le livre %s est déjà emprunté.",titre);
        }
    }

    public static void main(String[] args) {
        String titre1="Le Petit Prince";
        String auteur1="Antoine de Saint-Exupéry";
        int nombrePages1=96;
        boolean emprunte1=false;

        String titre2="Clean Code";
        String auteur2="Uncle Bob";
        int nombrePages2=500;
        boolean emprunte2=true;

        String titre3="Art of thinking cleary";
        String auteur3="Roff Dhobbeli";
        int nombrePages3=300;
        boolean emprunte3=false;
    }
}

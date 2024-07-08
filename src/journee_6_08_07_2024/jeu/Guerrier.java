package journee_5_05_07_2024.cours.jeu;

public class Guerrier extends Personnage{
    private String arme;

    public Guerrier(String nom, int dureeDeVie, String arme) {
        super(nom,dureeDeVie);
        this.arme = arme;
        this.x=0;
    }


    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }
}

package journee_6_08_07_2024.jeu_2;

public abstract class Personnage {
    private String nom;
    private int dureeDeVie;
    private static int nombrePersonnage=0;

    public Personnage(String nom, int dureeDeVie) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
        nombrePersonnage++;
    }

    public static int getNombrePersonnage(){
        return nombrePersonnage;
    }

    public String getNom() {
        return nom;
    }

    public final void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    @Override
    public String toString() {
        return String.format("Nom : %s\nDurée de vie : %d",nom,dureeDeVie);
    }
}

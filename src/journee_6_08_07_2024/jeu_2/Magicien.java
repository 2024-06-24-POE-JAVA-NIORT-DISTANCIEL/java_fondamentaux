package journee_6_08_07_2024.jeu;

public class Magicien extends Personnage {
    private String baguetteMagique;

    public Magicien(String nom, int dureeDeVie, String baguetteMagique) {
        super(nom,dureeDeVie);
        this.baguetteMagique = baguetteMagique;
    }


    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) {
        this.baguetteMagique = baguetteMagique;
    }

    public void attaquer(){
        System.out.println("Je lance un sort...");
    }

    public void defendre(){
        System.out.println("Je crée un bouclier magique....");
    }
}

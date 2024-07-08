package journee_6_08_07_2024.jeu_2;

public class Magicien extends Personnage implements Combattant{
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

    @Override
    public void attaquer(){
        System.out.println("Je lance un sort...");
    }

    @Override
    public void defendre(){
        System.out.println("Je crée un bouclier magique....");
    }
}

package journee_6_08_07_2024.jeu;


// final : Signifiue que cette classe ne peut pas être étendue
public final class BossFinal extends Personnage{
    private int niveauDePuissance;

    public BossFinal(String nom, int dureeDeVie,int niveauDePuissance) {
        super(nom, dureeDeVie);
        this.niveauDePuissance=niveauDePuissance;
    }


    @Override
    public void attaquer() {
        System.out.println("Je vais t'écraser...");
    }

    @Override
    public void defendre() {
        System.out.println("Je suis un moi-même un bouclier...");
    }
}

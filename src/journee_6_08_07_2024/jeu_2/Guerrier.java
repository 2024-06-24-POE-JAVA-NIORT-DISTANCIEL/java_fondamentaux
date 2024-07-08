package journee_6_08_07_2024.jeu_2;

import journee_6_08_07_2024.armes.Arme;

public class Guerrier extends Personnage implements Combattant {
    private Arme arme;
    private final static int DUREE_DE_VIE_PAR_DEFAUT=200;

    public Guerrier(String nom, int dureeDeVie, Arme arme) {
        super(nom,dureeDeVie);
        this.arme = arme;
    }

    public Guerrier(String nom,Arme arme){
//        super(nom,100);
//        this.arme=arme;
        this(nom,DUREE_DE_VIE_PAR_DEFAUT,arme);
    }

//    public Guerrier(String nom){
//        super(nom,100);
//        this.arme="AK 47";
//    }

    public Arme getArme() {
        return arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    @Override
    public void attaquer() {
        System.out.println("Je vais te tuer...");
    }

    @Override
    public void defendre() {
        System.out.println("J'utilise mon bouclier....");
    }

    @Override
    public String toString() {
        return String.format("%s\nArme : %s",super.toString(),this.arme);
    }
}

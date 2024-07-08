package journee_6_08_07_2024.jeu;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Personnage p=new Personnage("Zozor",100);
        Guerrier alexandreTheGreat=new Guerrier("Alexandre",200,"Lance");
        Magicien yannis=new Magicien("Yannis",500,"ma baguette magique");
        BossFinal dominique=new BossFinal("Dominique",12000,7000);

        ArrayList<Personnage> personnages=new ArrayList<>();

        personnages.add(alexandreTheGreat);
        personnages.add(yannis);
        personnages.add(dominique);

        for(Personnage personnage:personnages){
            personnage.attaquer();
        }
    }
}

package journee_6_08_07_2024.jeu_2;

import journee_6_08_07_2024.armes.Epee;
import journee_6_08_07_2024.armes.Lance;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Epee epee=new Epee();
        Lance lance=new Lance();

        Guerrier alexandreTheGreat=new Guerrier("Alexandre",200,lance);
        Magicien yannis=new Magicien("Yannis",500,"ma baguette magique");
        BossFinal dominique=new BossFinal("Dominique",12000,7000);
        PNJ chris=new PNJ("Chris",10,"Bonjour!");


        Guerrier michael=new Guerrier("Michael",epee);

        System.out.println("Nombre : "+Personnage.getNombrePersonnage());



        List<Combattant> combattants=new ArrayList<>();

        combattants.add(alexandreTheGreat);
        combattants.add(yannis);
        combattants.add(dominique);

        for(Combattant combattant:combattants){
            combattant.attaquer();
        }

        List<Personnage> personnages=new ArrayList<>(List.of(alexandreTheGreat,yannis,dominique,chris));

        for(Personnage personnage:personnages){
            System.out.println(personnage+"\n");

        }
    }
}



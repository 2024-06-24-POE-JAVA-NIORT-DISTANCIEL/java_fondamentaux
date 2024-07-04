package journee_3_3_07_2024.cours;

import java.util.ArrayList;

public class Point3TableauxDynamiques {
    public static void main(String[] args) {
//        1. Demander à l'utloisateur combien de notes ils souhaite saisir(ne pas avoir des valeurs négatives ou nulles)
//        2. Entrer les valeurs à partir du clavier([0,20])
        ArrayList<Double> notesPhysique=new ArrayList();
        notesPhysique.add(12.0);
        notesPhysique.add(18.0);
        notesPhysique.add(15.0);
        notesPhysique.add(17.0);
        notesPhysique.add(9.5);
        notesPhysique.add(2.3);

        System.out.println("Taille : " + notesPhysique.size());

        double somme = 0;
        for (int i = 0; i < notesPhysique.size(); i++) {
            System.out.printf("notesPhysique[%d] : %.1f\n", i, notesPhysique.get(i));
            somme += notesPhysique.get(i);
        }

        double moyenne = somme / notesPhysique.size();

        System.out.println("Somme : " + somme);
        System.out.println("Moyenne : " + moyenne);
    }
}

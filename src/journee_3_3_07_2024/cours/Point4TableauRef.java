package journee_3_3_07_2024.cours;

import java.util.Arrays;
import java.util.Scanner;

public class Point4TableauRef {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] notes={12,13,14};
        int[] papy=notes;
        int[] papy2={500,13,14};

        System.out.println("1.notes : "+Arrays.toString(notes));
        System.out.println("1.papy : "+Arrays.toString(papy));

        papy[0]=500;

        System.out.println("2.notes : "+Arrays.toString(notes));
        System.out.println("2.papy : "+Arrays.toString(papy));
        System.out.println("2.papy 2 : "+Arrays.toString(papy2));

        System.out.println("Est-ce que notes==papy : "+(notes==papy));
        System.out.println("Est-ce que papy==papy2 : "+(papy==papy2));



        String nom="chris";
        String prenom="chris";

        System.out.print("Entrez votre nom : ");
        String postNom=scanner.nextLine();
//        postNom=postNom.intern();//Inclure la variable postNom dans le pool des littéraux

        System.out.println("Est-ce nom==prenom : "+(nom==prenom));
        System.out.println("Est-ce postNom==prenom : "+(postNom==prenom));
        System.out.println("Est-ce postNom==nom : "+(postNom==nom));
    }
}

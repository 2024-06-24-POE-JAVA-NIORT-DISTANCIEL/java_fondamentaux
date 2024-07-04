package journee_3_03_07_2024.cours;

public class Point5MethodesNotesDuplications {
    public static void main(String[] args) {
       //Physique
        double[] notesPhysique={12,18,15,17,9.5,2.3};
        double sommePhysique=0;
        for(int i=0;i<notesPhysique.length;i++){
            sommePhysique +=notesPhysique[i];
        }
        double moyennePhysique=sommePhysique/notesPhysique.length;

        System.out.println("Somme physique : "+sommePhysique);
        System.out.println("Moyenne physique : "+moyennePhysique);

       //Histoire
        double[] notesHistoire={12,18,15,17,9.5,2.3};
        double sommeHistoire=0;
        for(int i=0;i<notesHistoire.length;i++){
            sommeHistoire +=notesHistoire[i];
        }
        double moyenneHistoire=sommeHistoire/notesHistoire.length;

        System.out.println("Somme Histoire: "+sommeHistoire);
        System.out.println("Moyenne Histoire : "+moyenneHistoire);



        //Histoire
        double[] notesMath={12,18,15,17,9.5,2.3};
        double sommeMath=0;
        for(int i=0;i<notesMath.length;i++){
            sommeMath +=notesHistoire[i];
        }
        double moyenneMath=sommeMath/notesMath.length;

        System.out.println("Somme Math: "+sommeMath);
        System.out.println("Moyenne Math : "+moyenneMath);
    }
}

package journee_3_03_07_2024.cours;

public class Point2TableauxSuite {
    public static void main(String[] args) {
        double[] notesPhysique={12,18,15,17,9.5,2.3};
        System.out.println("Taille : "+notesPhysique.length);

        double somme=0;
        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("notesPhysique[%d] : %.1f\n",i,notesPhysique[i]);
            somme +=notesPhysique[i];
        }

        double moyenne=somme/notesPhysique.length;

        System.out.println("Somme : "+somme);
        System.out.println("Somme : "+moyenne);

        notesPhysique[0]=15;
        notesPhysique[4]=16;
        for(int i=0;i<notesPhysique.length;i++){
            System.out.printf("notesPhysique[%d] : %.1f\n",i,notesPhysique[i]);
        }
    }
}

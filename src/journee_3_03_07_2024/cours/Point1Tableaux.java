package journee_3_03_07_2024.cours;

public class Point1Tableaux {
    public static void main(String[] args) {
        // V1 : avant tableaux
        //        double note1=12;
//        double note2=18;
//        double note3=15;
//        double note4=17;
//        double note5=9.5;
//        double note6=2.3;

//        double somme=note1+note2+note3;
//        double moyenne=somme/3;
//
//        System.out.println("Somme : "+somme);
//        System.out.println("Moyenne : "+moyenne);



        // V2 : Avec les tableaux
        double[] notesPhysique={12,18,15,17,9.5,2.3};
        System.out.println("Taille : "+notesPhysique.length);

        double somme=0;
//        for(int i=0;i<=notesPhysique.length-1;i++){
        for(int i=0;i<notesPhysique.length;i++){
            // i=0; somme = somme + notesPhysique[0]=> somme=0+12 = 12
            // i=1; somme = somme + notesPhysique[1] => somme=12+18 = 30
            // i=2; somme = somme + notesPhysique[2] => somme=30+15 = 45
            // i=3;  somme = somme + notesPhysique[3] => somme=45+17 = 62
            // i=4;  somme = somme + notesPhysique[3] => somme=62+9.5 = 71.5
            // i=5;  somme = somme + notesPhysique[3] => somme= 71.5+2.3 = 73.8
            // i=6;
            System.out.printf("notesPhysique[%d] : %.1f\n",i,notesPhysique[i]);
            somme +=notesPhysique[i];
//            somme=somme+notesPhysique[i];
        }

        double moyenne=somme/notesPhysique.length;

        System.out.println("Somme : "+somme);
        System.out.println("Somme : "+moyenne);


        double[] notesMath;
        notesMath=new double[]{12,18,15,17,9.5,2.3,9,12};
//
        double[] notesHistoire=new double[6];//{0.0, 0.0, 0.0, 0.0, 0.0, 0.0}
    }
}

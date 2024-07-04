package journee_4_04_07_2024.cours.livre;

public class Livre {
//    attributs ou variables membres
    private String titre;
    private String auteur;
    private int nombrePages;
    private boolean emprunte;

    public Livre(String titre,String auteur,int nombrePages){
        this.titre=titre;
        this.auteur=auteur;
        this.nombrePages=nombrePages;
        this.emprunte=false;
    }


    String getTitre() {
        return titre;
    }

    String getAuteur() {
        return auteur;
    }

    int getNombrePages() {
        return nombrePages;
    }

    void setTitre(String titre){
        if(!titre.isEmpty()){
            this.titre=titre;
        }else{
            System.out.println("Le titre ne doit pas être vide.");
        }
    }

    void setAuteur(String auteur){
        this.auteur=auteur;
    }

    void setNombrePages(int nombrePages){
        if(nombrePages>0){
            this.nombrePages=nombrePages;
        }else{
            System.out.println("Le titre ne doit être strictement positif.");
        }
    }


    //    méthodes ou fonctions membres
    void emprunter(){
        if(!emprunte){
            emprunte=true;
            System.out.printf("Le livre %s a été emprunté.\n",titre);
        }else{
            System.out.printf("Le livre %s est déjà emprunté.\n",titre);
        }
    }
}

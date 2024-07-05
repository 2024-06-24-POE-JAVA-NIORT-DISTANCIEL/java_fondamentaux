package journee_4_04_07_2024.cours;

public class Personne {
    private String nom;
    private String prenom;
    private int age;

    public Personne(String nom, String prenom,int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public String getPrenom(){
        return prenom;
    }
}

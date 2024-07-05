package journee_4_04_07_2024.tps.imc;

public class Patient {
    private double poids;  // en kg
    private double taille; // en mètres

    public Patient(double poids, double taille) {
        this.poids = poids;
        this.taille = taille;
    }

    public double getTaille() {
        return taille;
    }

    public double getPoids() {
        return poids;
    }

    public double calculerIMC() {
        return poids / (taille * taille);
    }

    public void afficherDonnees() {
        System.out.println("Poids : " + poids + " kg");
        System.out.println("Taille : " + taille + " m");
        System.out.println("IMC : " + String.format("%.2f", calculerIMC()));
    }
}

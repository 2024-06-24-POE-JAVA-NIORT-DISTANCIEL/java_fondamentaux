package journee_4_04_07_2024.tps.tirelire;

public class Tirelire {
    private double montant;

    public Tirelire() {
        this.montant = 0;
    }

    public double getMontant() {
        return montant;
    }

    public void afficher() {
        if (montant == 0) {
            System.out.println("Vous êtes sans le sou.");
        } else {
            System.out.println("Vous avez : " + montant + " € dans votre tirelire.");
        }
    }

    public void secouer() {
        if (montant > 0) {
            System.out.println("Bing bing");
        }
    }

    public void remplir(double montant) {
        if (montant > 0) {
            this.montant += montant;
        }
    }

    public void vider() {
        this.montant = 0;
    }

    public void puiser(double montant) {
        if (montant > 0) {
            if (montant > this.montant) {
                this.montant = 0;
            } else {
                this.montant -= montant;
            }
        }
    }

    public double calculerSolde(double budget) {
        if (budget <= 0) {
            return this.montant;
        }
        return this.montant - budget;
    }
}

package journee_4_04_07_2024.tps.tirelire;

public class Main {
    public static void main(String[] args) {
        Tirelire tirelire = new Tirelire();

        tirelire.afficher();
        tirelire.secouer();
        tirelire.remplir(550.0);
        tirelire.secouer();
        tirelire.afficher();
        tirelire.puiser(15.0);
        tirelire.afficher();

        double budget = 450.0; // Vous pouvez changer cette valeur pour tester différents scénarios
        double solde = tirelire.calculerSolde(budget);

        if (solde >= 0) {
            System.out.println("Vous êtes assez riche pour partir en vacances ! il vous restera " + solde + " euros à la rentrée");
        } else {
            System.out.println("Il vous manque " + (-solde) + " euros pour partir en vacances !");
        }
    }
}
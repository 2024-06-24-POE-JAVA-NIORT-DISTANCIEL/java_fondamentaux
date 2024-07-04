package journee_4_04_07_2024.tps.rectangle;

class Rectangle{
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    double calculAire(){
        return longueur*largeur;
    }

    double calculPerimetre(){
        return 2*(longueur+largeur);
    }
}

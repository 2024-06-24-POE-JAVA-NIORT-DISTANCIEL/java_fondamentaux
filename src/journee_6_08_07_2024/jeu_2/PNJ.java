package journee_6_08_07_2024.jeu_2;

public class PNJ extends Personnage{
    private String dialogue;

    public PNJ(String nom, int dureeDeVie,String dialogue) {
        super(nom, dureeDeVie);
        this.dialogue=dialogue;
    }

    public String getDialogue() {
        return dialogue;
    }

    public void setDialogue(String dialogue) {
        this.dialogue = dialogue;
    }
}

package journee_4_04_07_2024.cours.livre;

public class LivreMain {
    public static void main(String[] args) {
        Livre lePetitPrince=null;
        lePetitPrince=new Livre("Le Petit Princez","Antoine de Saint-Exupéry",96);
        lePetitPrince.emprunter();

        System.out.println("Titre avant setters: "+lePetitPrince.getTitre());
        System.out.println("Pages avant setters: "+lePetitPrince.getNombrePages());
        System.out.println("Auteur : "+lePetitPrince.getAuteur());
        lePetitPrince.setTitre("Le Petit Prince");
        lePetitPrince.setNombrePages(150);
        System.out.println("Titre aprés setters: "+lePetitPrince.getTitre());
        System.out.println("Pages après setter: "+lePetitPrince.getNombrePages());



        Livre cleanCode=new Livre("Clean Code","Uncle Bob",500);
        cleanCode.emprunter();

        Livre artOfThinkingClearly=new Livre("Art of thinking clearly","Rolf Dobelli",300);
        artOfThinkingClearly.emprunter();
    }
}

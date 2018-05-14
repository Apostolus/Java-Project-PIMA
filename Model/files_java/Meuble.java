public class Meuble extends Mobilier{
    private String typeMeuble;   // Armoire, Tirroir , table
    private int hauteur, largeur, profondeur;

    public Meuble(String type, String description, Time timeOfPublish, double price, int quantite, String nom, String marque, String typeMeuble, int hauteur, int largeur, int profondeur){
        super("Meuble", description, timeOfPublish, price, quantite, nom, marque, 0.0);
        this.typeMeuble = typeMeuble;
    }

    public String getTypeMeuble() {
        return typeMeuble;
    }

    public int getHauteur() {
        return hauteur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getProfondeur() {
        return profondeur;
    }
}
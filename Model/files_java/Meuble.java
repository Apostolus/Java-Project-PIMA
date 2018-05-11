public class Meuble extends Mobilier{
    private String typeMeuble;   // Armoire, Tirroir , table etc
    private int hauteur, largeur, profondeur;
    private String matiere; // bois , verre etc

    public Meuble(String type, String description, Time timeOfPublish, double price, int quantite, String nom, String marque, String typeMeuble, int hauteur, int largeur, int profondeur, String matiere){
        super("Meuble", description, timeOfPublish, price, quantite, nom, marque, null);
        this.typeMeuble = typeMeuble;
        this.hauteur = hauteur:;
        this.largeur = largeur;
        this.profondeur = profondeur;
        this.matiere = matiere;
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

    public String getMatiere() {
        return matiere;
    }


}
public class Electromenager extends Mobilier {
    private int taille, puissance;

    public Electromenager(String type, String description, Time timeOfPublish, double price, int quantite, String nom, String marque, int taille, int puissance){
        super("Electromenager", description, timeOfPublish, price, quantite, nom, marque, null);
        this.taille = taille;
        this.puissance = puissance;
        //FinGarantie = FinGarantie.extraiteDateFromString(date):

    }

    public int getTaille() {
        return taille;
    }

    public int getPuissance() {
        return puissance;
    }

}
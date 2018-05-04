public class Electromenager extends Mobilier {
    private int taille, puissance;
    private Time dureGarantie;

    public Electromenager(String type, String description, Time timeOfPublish, double price, int quantite, String nom, String marque, int taille, int puissance){
        super("Electromenager", "Mobilier", description, timeOfPublish, price, quantite, nom, marque);
        this.taille = taille;
        this.puissance = puissance;
        this.FinGarantie = new Time();
        //FinGarantie = FinGarantie.extraiteDateFromString(date):

    }

    public int getTaille() {
        return taille;
    }

    public int getPuissance() {
        return puissance;
    }

    public int getDureGarantie() {
        return dureGarantie;
    }




}
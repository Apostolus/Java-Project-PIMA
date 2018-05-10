public class FondDeCommerce extends Immobilier{
    private String nomCommerce;
    private double chiffreDAffaire ;
    private double coteEmplacement ; // double entre 0 et 100 pour noter la qualité de l'emplacement.

    public FondDeCommerce(String type, String description, Time time, double price, double surface, int nbPiece, int nbMeubles, String nomCommerce, double chiffreDAffaire) {
        super("Maison", description, time, price, surface);
        this.nomCommerce = nomCommerce;
        this.chiffreDAffaire = chiffreDAffaire;
        price = (3*chiffreDAffaire)*(1+(coteEmplacement/100));
    }

    public String getNomCommerce() {
        return nomCommerce;
    }

    public void setNomCommerce(String nomCommerce) {
        this.nomCommerce = nomCommerce;
    }

    public double getChiffreDAffaire() {
        return chiffreDAffaire;
    }

    public FondDeCommerce setChiffreDAffaire(double chiffreDAffaire) {
        this.chiffreDAffaire = chiffreDAffaire;
        return this;
    }

    public double getCoteEmplacement() {
        return coteEmplacement;
    }

}
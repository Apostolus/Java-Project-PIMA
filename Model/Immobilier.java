package apostolus.application_vente;

public abstract class Immobilier extends Article {

    private Localisation localisation;
    private double Totalesurface;


    public Immobilier(String categorie, String description, Time timeOfPublish, double price) {

        super("Immbolier",categorie, description, timeOfPublish,price);
    }


}

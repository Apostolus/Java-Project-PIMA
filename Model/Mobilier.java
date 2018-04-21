package apostolus.application_vente;

public abstract class Mobilier extends Article {

    protected Mobilier(String type, String categorie, String description, Time timeOfPublish, double price) {
        super("Mobilier", categorie, description, timeOfPublish, price);
    }
}

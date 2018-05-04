public class Mobilier extends Article {
	private String nomMobilier;
	private String marque;

    public Mobilier(String type, String description, Time timeOfPublish, double price, int quantite, String nomMobilier, String marque) {
        super(type, "Mobilier", description, timeOfPublish, price);
        super.quantite = quantite;
        this.nomMobilier = nomMobilier;
        this.marque = marque;
    }
    
    public Mobilier() {
    	this("type","description",new Time(),0.0,0);
    }
    
    public Mobilier(Mobilier mobilier) {
    	this(mobilier.type,mobilier.description,mobilier.timeOfPublish,mobilier.price,mobilier.quantite);
    }
    
    
}

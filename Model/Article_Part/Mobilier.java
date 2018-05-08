public class Mobilier extends Article {
	

    public Mobilier(String type, String description, Time timeOfPublish, double price, int quantite) {
        super("Mobilier", type, description, timeOfPublish, price);
        super.quantite = quantite;
    }
    
    public Mobilier() {
    	this("type","description",new Time(),0.0,0);
    }
    
    public Mobilier(Mobilier mobilier) {
    	this(mobilier.type,mobilier.description,mobilier.time,mobilier.price,mobilier.quantite);
    }
    
    
}

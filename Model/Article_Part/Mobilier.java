import java.util.Calendar;
import java.util.Date;

public class Mobilier extends Article {
	private String marque;
	private Time dureeGarantie;

    public Mobilier(String type, String description, Time timeOfPublish, double price, int quantite, String nomMobilier, String marque, Time garantieDuration) {
        super(type, "Mobilier", description, timeOfPublish, price, nomMobilier);
        super.quantite = quantite;
        this.marque = marque;
        this.dureeGarantie = garantieDuration;
    }
    
    public Mobilier() {
    	this("type","description",new Time(),0.0,0, null, null, null);
    }
    
    public Mobilier(Mobilier mobilier) {
    	this(mobilier.type,mobilier.description,mobilier.time,mobilier.price,mobilier.quantite, mobilier.getNomArticle(), mobilier.marque, null);
    }
    
    @SuppressWarnings("deprecation")
	public Time garantieTimeRemaining() {
    	
    	Date dateOfBuy = (this.getTimeOfPublish()).getDate();
    	Date dateForGarantie = dureeGarantie.getDate();
    	if(dateOfBuy.getYear()>=dateForGarantie.getYear()) {
    		if(dateOfBuy.getMonth()>=dateForGarantie.getMonth()) {
    			
    		}
    	}
    	
    	return null;
    }
    
    
}

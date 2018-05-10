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
    
    /**
     * constructeur de test avec les valeur par défaut.
     * 
     */
    
    public Mobilier() {
    	this("type","description",new Time(),0.0,0, null, "marque", new Time());
    }
    
     /**
      * Constructeur par copie.
      * 
      * @param mobilier
      */
    public Mobilier(Mobilier mobilier) {
    	this(mobilier.type,mobilier.description,mobilier.time,mobilier.price,mobilier.quantite, mobilier.getNomArticle(), mobilier.marque, null);
    }
    
    
    
    /**
     * sur cette méthode, on suppose qu'on a déjà testé que la garantie est encore valide.
     * elle retourne la date de fin de garantie.
     * 
     * @return
     */
    
	public Date garantieTimeRemaining() {
    	
    	return (new Time()).addToCurrent(dureeGarantie.getDate());
    }
	
	
	
	/**
	 * cette méthode teste si la garantie est encore valide, elle retourne true si ele l'est,
	 * false sinon.
	 * 
	 * elle pourra servir dans les cas on a besoin de savoir quand est ce que la garantie de l'article en question va se terminer.
	 * 
	 * @return
	 */
    
    public boolean garantieIsAvailable() {
    	
    	Date timeNow = new Date();
    	Date tillBuy = (this.getTimeOfPublish()).addToCurrent(dureeGarantie.getDate());
    	
    	if(timeNow.compareTo(tillBuy) == -1) {
    		return true;
    	}
    	return false;
    }
    
    
}

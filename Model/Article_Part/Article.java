public abstract class Article {
	
	/**
	 * 
	 * l'attribut time : Time, si l'article est chez le vendeur,
	 * cet attribut désigne le temps de mis en ligne du produit,
	 * si il est chez l'acheteur il désigne le temps(date d'achat).
	 * 
	 */

    protected final int id;
    private static int nbArticle = 0;
    protected String type;
    protected String categorie;
    protected String description;
    protected Time time;
    protected double price;
    protected int etat;
    protected String numeroDeSerie;
    protected int quantite;
    
    /**
     * 
     * @param type
     * @param categorie
     * @param description
     * @param timeOfPublish
     * @param price
     * @param numeroSerie 
     */

    protected Article(String type,String categorie, String description, Time timeOfPublish, double price) { // PQ protected
        nbArticle++;
        this.id = nbArticle;
        this.type = type;
        this.description = description;
        this.time = timeOfPublish;
        this.categorie = categorie;
        this.price = price;
        this.numeroDeSerie = categorie.substring(0)+"-"+type.substring(0,2)+"-"+id;
        this.quantite = 1;
    }

    protected Article(Article article){                                                                                   // EST CE UN CONSTRUCTEUR PAR COPIE?
        this(article.type,article.categorie,article.description,article.time,article.price);
    }

    /**
     *
     * deux articles sont égaux s'ils sont de meme catégorie, type et sont dans le meme état.                                // le numero de serie !!!!!!!!!!!!!!! NUMS ET ETAT  on devrait abaisser l'etat des qu'il y a un acte de vente
     *
     * @param object
     * @return
     */
    
    @Override
    public boolean equals(Object object) {

    	Article article = (Article)object;
    	if(this.categorie.equals(article.categorie) && this.type.equals(article.type) && this.etat == article.etat) {
    		return true;
    	}
    	return false;
    }

    /**
     * 
     * @return
     */
    
    
    @Override
    public String toString() {
    	return "id : "+id+", type: "+", type : "+type+", categorie : "+categorie+", Date : "+description+time.getStringDateEtHeureFormat()+",price : "+price+", Serie : "+numeroDeSerie+", état : "+etat+", quantite : "+quantite;
    }
    
public String getType() {
        return type;
    }
    
    /**
     * 
     * @param type
     */

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Time getTimeOfPublish() {
        return time;
    }

    public void setTimeOfPublish(Time timeOfPublish) {
        this.time = timeOfPublish;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceAvecQuantite(){
    	return price*quantite;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
    
    public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
    
    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
    
    public void incrementeQuantite(int quantiteAjoute) {
    	this.quantite+=quantiteAjoute;
    }
}

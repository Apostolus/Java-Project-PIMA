



public abstract class Article {

    protected final int id;
    private static int nbArticle = 0;
    private String type;
    private String categorie;
    private String description;
    private Time timeOfPublish;
    private double price;
    private int quantite;
    
    /**
     * 
     * @param type
     * @param categorie
     * @param description
     * @param timeOfPublish
     * @param price
     * @param quantite
     */

    protected Article(String type,String categorie, String description, Time timeOfPublish, double price,int quantite) {
        nbArticle++;
        this.id = nbArticle;
        this.type = type;
        this.description = description;
        this.timeOfPublish = timeOfPublish;
        this.categorie = categorie;
        this.price = price;
        this.quantite = quantite;
    }

    /**
     * 
     * @return
     */
    
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
        return timeOfPublish;
    }

    public void setTimeOfPublish(Time timeOfPublish) {
        this.timeOfPublish = timeOfPublish;
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

    public void setPrice(double price) {
        this.price = price;
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

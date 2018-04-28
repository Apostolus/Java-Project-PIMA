import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public abstract class Article {

    protected final int id;
    private static int nbArticle = 0;
    private String type;
    private String categorie;
    private String description;
    private Time timeOfPublish;
    private double price;
    private int quantite;
    private int etat;
    private String numeroDeSerie;
    
    /**
     * 
     * @param type
     * @param categorie
     * @param description
     * @param timeOfPublish
     * @param price
     * @param quantite
     * @param numeroSerie 
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
        this.numeroDeSerie = ID_Gestion.generateArticleNumero(this);
    }

    protected Article(Article article){
        this(article.type,article.categorie,article.description,article.timeOfPublish,article.price,article.quantite);
    }

    @Override
    public Article clone(){
    	Class<?> classe = this.getClass();
    	Constructor<?> constructor;
		try {
			constructor = classe.getConstructor(Article.class);
			return (Article)constructor.newInstance(this);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException exceptionClone) {
            exceptionClone.printStackTrace();
        }
		return null;
    }

    /**
     *
     * deux articles sont égaux s'ils sont de meme catégorie, type et sont dans le meme état.
     *
     * @param object
     * @return
     */
    
    @Override
    public boolean equals(Object object) {
    	
    	if(super.equals(object)) {
    		Article article = (Article)object;
    		if(this.categorie.equals(article.categorie) && this.type.equals(article.type) && this.etat == article.etat) {
    			return true;
    		}
    	}
    	return false;
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

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
    
    public String getNumeroDeSerie() {
		return numeroDeSerie;
	}
}

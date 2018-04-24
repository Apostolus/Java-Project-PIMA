import java.util.ArrayList;

public abstract class Entite implements Acheter{

	private String nom;
    protected Cordonnees coordonnees;
    private CompteBanque compteBanque;
    protected ArrayList<Article> articleArray;


    protected Entite(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom) {
        this.coordonnees = new Cordonnees(country,departement,city,specificAdress,email,phoneNumber);
        this.compteBanque = new CompteBanque(this,decouvert, montantDecouvertAutorise, montantDecouvert, solde);
        this.articleArray = new ArrayList<>();
        this.nom = nom;
    }

    
    protected void addArticleArray(Article article, int quantiteAjoute) {
    	if(articleArray.contains(article)) {
    		
    		int index_art = articleArray.indexOf(article);
    		Article article_temp = articleArray.remove(index_art);
    		article_temp.incrementeQuantite(quantiteAjoute);
    	}
    }
    
    
    public Cordonnees getCoordonnees() {
        return coordonnees;
    }

	public String getNom() {
		return nom;
	}

	public CompteBanque getCompteBanque() {
		return compteBanque;
	}
}
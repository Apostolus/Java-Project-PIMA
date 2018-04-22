import java.util.ArrayList;

public abstract class Entite implements Vendre{

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
    
    public boolean verifierDisponibilite(Article article, int quantite) {
    	if(articleArray.contains(article)) {
    		int index_art = articleArray.indexOf(article);
    
    		if((articleArray.get(index_art).getQuantite())>=quantite) {
    			return true;
    		}
    	}
    	return false;
    }

    public Cordonnees getCoordonnees() {
        return coordonnees;
    }

    public CompteBanque getCompteBanque() {
        return compteBanque;
    }

	public String getNom() {
		return nom;
	}
	
	protected boolean payer(Commande commande) {
		
		return compteBanque.paye(commande.getArticleCommande(), commande.getQuantite());
	}

}
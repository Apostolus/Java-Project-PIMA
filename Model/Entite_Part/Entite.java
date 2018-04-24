import java.util.HashMap;
import java.util.Map;

public abstract class Entite implements Vendre{

	private String nom;
    protected Cordonnees coordonnees;
    private CompteBanque compteBanque;
    protected Map<Article, Integer> articleArray;


    protected Entite(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom) {
        this.coordonnees = new Cordonnees(country,departement,city,specificAdress,email,phoneNumber);
        this.compteBanque = new CompteBanque(this,decouvert, montantDecouvertAutorise, montantDecouvert, solde);
        this.articleArray = new HashMap<>();
        this.nom = nom;
    }


    protected void addArticleArray(Article article) {  // ajoute un article
    	if(articleArray.containsKey(article)) {
    		int quantite = articleArray.get(article);
    		quantite++;
    		articleArray.put(article,quantite);
    	}
    	articleArray.put(article,0);
    }
    
    public boolean verifierDisponibilite(Article article, int quantite) {
    	if(articleArray.containsKey(article)) {
    		if(articleArray.get(article)>=quantite) {
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

    /*


    public abstract void Achete();
    public abstract void ajouterArticleAchete();  // ajoute les objets acquis par la vente dans le tableaux des objets acquis
    
      
      pour moi ces méthodes ne servent à rien, on peut gerer directement ces actions dans les
      méthodes acheter et lancer la commande.
     
   	public abstract  void mettreEnVente();    Ajoute un objet a vendre
    public abstract void retirerArticleVendu();
    
    */


}
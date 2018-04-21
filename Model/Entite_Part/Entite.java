import java.util.HashMap;
import java.util.Map;

public abstract class Entite implements Acheter, Vendre{

    protected Cordonnees coordonnees;
    private CompteBanque compteBanque;
    protected Map<Article, Integer> articleArray;


    protected Entite(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde) {
        this.coordonnees = new Cordonnees(country,departement,city,specificAdress,email,phoneNumber);
        this.compteBanque = new CompteBanque(this,decouvert, montantDecouvertAutorise, montantDecouvert, solde);
        this.articleArray = new HashMap<>();
    }


    protected void addArticleArray(Article article) {
    	if(articleArray.containsKey(article)) {
    		int quantite = articleArray.get(article);
    		quantite++;
    		articleArray.put(article,quantite);
    	}
    	articleArray.put(article,0);
    }
    
    protected boolean acheter(Entite entite, Article article, int quantite) {
    	if(entite instanceof Particulier) {
    		//TO-DO en fonction du particulier
    		
    	}
    	if(entite instanceof Professionnel) {
    		//TO-DO en fonction du professionnel
    		if(entite.verifierDisponibilite(article, quantite)){
    			Commande commande = new Commande(this,article,quantite);
    			
    			commande.LancerCommande((Entrepot)entite);
    		}
    		
    	}
    	
    	return false;
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

    /*


    public abstract void Achete();
    public abstract void ajouterArticleAchete();  // ajoute les objets acquis par la vente dans le tableaux des objets acquis
    
      
      pour moi ces méthodes ne servent à rien, on peut gerer directement ces actions dans les
      méthodes acheter et lancer la commande.
     
   	public abstract  void mettreEnVente();    Ajoute un objet a vendre
    public abstract void retirerArticleVendu();
    
    */


}
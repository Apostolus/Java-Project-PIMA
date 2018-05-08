import java.util.ArrayList;

public abstract class Entite implements Acheter, Vendre{

	private static int entiteNumber = 0;
	private final int id;
	private String nom;
    protected Cordonnees coordonnees;
    private CompteBanque compteBanque;
    protected ArrayList<Article> articleArray;
    protected ArrayList<Commande> commandes;


    protected Entite(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom) {
        entiteNumber++;
    	this.coordonnees = new Cordonnees(country,departement,city,specificAdress,email,phoneNumber);
        this.compteBanque = new CompteBanque(this,decouvert, montantDecouvertAutorise, montantDecouvert, solde);
        this.articleArray = new ArrayList<>();
        this.nom = nom;
        this.id = entiteNumber;
        this.commandes = new ArrayList<>();
    }
    
    @Override
    public void addCommande(Commande commande) {
    	commandes.add(commande);
    }
    
    @Override
    public boolean verifierDisponibilite(Article article, int quantite) {
    	if(articleArray.contains(article)) {
    		
    		if(article instanceof Mobilier) {
    			int index_art = articleArray.indexOf(article);
    			Article temp = articleArray.get(index_art);
    			
    			if(((Mobilier)temp).getQuantite()>=quantite) {
    				return true;
    			}
    			return false;
    		}
    		return true;
    	}
    	return false;
    }

    
    protected void addArticleArray(Article article, int quantiteAjoute) {
    	if(articleArray.contains(article)) {
    		int index_art = articleArray.indexOf(article);
			Article article_temp = articleArray.remove(index_art);
    		
    		if(article instanceof Mobilier) {
    			article_temp.incrementeQuantite(quantiteAjoute);
    		}
    		articleArray.add(article_temp);
    	}
    	
    	article.setQuantite(quantiteAjoute);
    	articleArray.add(article);
    
    }
    
    @Override
	public boolean payeCommande(Commande commande,Professionnel professionnel) {

 		return compteBanque.paye(commande.getTotalPrice());
 	}

    public boolean payeMontant(double price) {
        return compteBanque.paye(price);
    }

    public boolean payeArticle(Article article, int quantite) {
        return compteBanque.paye(article, quantite);
    }
    
    public boolean verifierPaiement(double price) {
    	
    	int verifier = compteBanque.verifierPaiement(price);
    	if(verifier == 0 || verifier == 1) {
    		return true;
    	}
    	return false;
    }
    
    public void addToAccount(double montant) {
    	compteBanque.reflouer(montant);
    }
    
    public Cordonnees getCoordonnees() {
        return coordonnees;
    }

	public String getNom() {
		return nom;
	}
	
	public int getId() {
		return id;
	}
	
}

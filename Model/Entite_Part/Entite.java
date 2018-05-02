import java.util.ArrayList;

public abstract class Entite implements Acheter{

	private static int entiteNumber = 0;
	private final int id;
	private String nom;
    protected Cordonnees coordonnees;
    private CompteBanque compteBanque;
    protected ArrayList<Article> articleArray;


    protected Entite(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom) {
        entiteNumber++;
    	this.coordonnees = new Cordonnees(country,departement,city,specificAdress,email,phoneNumber);
        this.compteBanque = new CompteBanque(this,decouvert, montantDecouvertAutorise, montantDecouvert, solde);
        this.articleArray = new ArrayList<>();
        this.nom = nom;
        this.id = entiteNumber;
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



 	//faire une methode reflouer
    
    
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

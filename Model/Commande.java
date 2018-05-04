import java.util.ArrayList;

public class Commande{

	private static int nbCommande = 0;
    private final String numCommande;
    private Time dateDeCommande;
    private Entite destinataire;
    public ArrayList<Article> articlesCommande;
    private Time timeOfCommande;

    public Commande(Entite destinataire) {
    	nbCommande++;
        this.dateDeCommande = new Time();
        this.destinataire = destinataire;
        this.articlesCommande = new ArrayList<>();
        this.timeOfCommande = new Time();
        this.numCommande = timeOfCommande.getStringDateFormat()+"-"+nbCommande+"-"+destinataire.getId();
    }

    /**
     *
     * cette fonction prend en paramètre l'article à ajouter à la commande ainsi que la quantité.
     * l'attribut quantité de la classe Article qui représentait le nombre d'exemplaire,
     * est utilisé dans cette classe comme la quantité commandée par le client.
     *
     * @param article
     * @param quantite
     * @param professionnel
     */
    
    public boolean addCommande(Article article,int quantite,Professionnel professionnel) {
    	
    	
    	if(!professionnel.verifierDisponibilite(article, quantite)) {
    		return false;
    	}
    
    	if(articlesCommande.contains(article)) {
    		int index = articlesCommande.indexOf(article); // je prend l'index de l'articule
        	Article articleTemp = articlesCommande.remove(index);
        	
        	if(articleTemp instanceof Mobilier) {
        		((Mobilier)articleTemp).incrementeQuantite(quantite);
        	}
    		articlesCommande.add(articleTemp);
    		return true;
    	}
    	else {
    		
    		if(article instanceof Mobilier) {
        		((Mobilier)article).incrementeQuantite(quantite);
        	}
    		articlesCommande.add(article);
    		return true;
    	}
    	
    }
    


    public void LancerCommande(Entrepot entrepot){                                                                      // ne necessie pas le paiement?
    	entrepot.addCommande(this);
    }

    public String getNumCommande() {
        return numCommande;
    }

    public Time getDateDeCommande() {
        return dateDeCommande;
    }

    public Entite getDestinataire() {
        return destinataire;
    }

    public ArrayList<Article> getArticleCommande() {
        return articlesCommande;
    }

    public Time getTimeOfCommande() {
        return timeOfCommande;
    }
    
    public double getTotalPrice() {
    	double price = 0.;
    	
    	for(Article article : articlesCommande) {
    		
    		int quantite = 1;
    		if(article instanceof Mobilier) {
    			quantite = ((Mobilier)article).getQuantite();
    		}
    		price+= (article.getPrice()*quantite);
    	}
    	return price;
    }
    
    public int getNbCommande() {
		return nbCommande;
	}

	// modifs nathane
/*
    public void addArticle(Article article){
        articlesCommande.add(article);
    }
    
    */
    
    
}
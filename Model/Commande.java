import java.util.ArrayList;

public class Commande{

	private int nbCommande;
    private final String numCommande;
    private Time dateDeCommande;
    private Entite destinataire;
    private ArrayList<Article> articlesCommande;
    private Time timeOfCommande;

    public Commande(Entite destinataire,int quantite, int nbCommande) {
    	this.nbCommande = nbCommande;
        this.dateDeCommande = new Time();
        this.destinataire = destinataire;
        this.articlesCommande = new ArrayList<>();
        this.timeOfCommande = new Time();
        this.numCommande = ID_Gestion.generateArticleNumCommande(timeOfCommande, nbCommande, destinataire);
    }

    /**
     *
     * cette fonction prend en paramètre l'article à ajouter à la commande ainsi que la quantité.
     * l'attribut quantité de la classe Article qui représentait le nombre d'exemplaire,
     * est utilisé dans cette classe comme la quantité commandée par le client.
     *
     * @param article
     * @param quantite
     * @param entrepot
     */
    
    public boolean addCommande(Article article,int quantite,Entrepot entrepot) {
    	
    	
    	if(!entrepot.verifierDisponibilite(article, quantite)) {
    		return false;
    	}
    	
    	int index = articlesCommande.indexOf(article); // je prend l'index de l'articule
    	Article articleTemp = (articlesCommande.remove(index)).clone();
    	if(articlesCommande.contains(article)) {
    		articleTemp.incrementeQuantite(quantite);
    		articlesCommande.add(articleTemp);
    		return true;
    	}
    	else {
    		article.setQuantite(quantite);
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
    		price+= (article.getPrice()*article.getQuantite());
    	}
    	return price;
    }
    
    public int getNbCommande() {
		return nbCommande;
	}
    
    public void setNbCommande(int nbCommande) {
		this.nbCommande = nbCommande;
	}




    
}
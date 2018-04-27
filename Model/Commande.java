import java.util.ArrayList;

public class Commande{

    private final int numCommande;
    private Time dateDeCommande;
    private Entite destinataire;
    private ArrayList<Article> articlesCommande;
    private Time timeOfCommande;

    public Commande(Entite destinataire,int quantite) {
        this.dateDeCommande = new Time();
        this.destinataire = destinataire;
        this.articlesCommande = new ArrayList<>();
        this.numCommande = 0;
        this.timeOfCommande = new Time();
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
    	
    	int index = articlesCommande.indexOf(article);
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
    


    public void LancerCommande(Entrepot entrepot){
    	entrepot.addCommande(this);
    }

    public int getNumCommande() {
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
}
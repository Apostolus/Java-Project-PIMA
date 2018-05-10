import java.util.ArrayList;

public class Particulier extends Entite{

    private double note;
    private Commande panier;                                  // la commande qui sera envoyer a un PROFESSIONNEL
    private ArrayList<Article> acquis;

    public Particulier(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom) {
        super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
        this.acquis = new ArrayList<Article>();
        this.note=0;
    }

    public boolean addPanier(Professionnel professionnel,Article article, int quantite){
        return panier.addCommande(article, quantite, professionnel);
    }
 
    
    /**
     * 
     * TODO --On pourra rappeler à la suite les méthodes qui mettent en communication les deux paticuliers, 
     * pour finaliser la vente.
     * pour le moment, achèter à un particulier, reviens à payer le montant d'un article précis dont l'existence
     * est assurée.
     * 
     * cette méthode revoie un booléen, si c'est vraie, le particulier à qui on achète peut procèder à la livraison.
     * le temps de livraison est déterminé par les deux (entente entre les deux personnes).
     * 
     * @param particulier
     * @param article
     * @return
     */
    
    public boolean achete(Particulier particulier) {
    	
    	double price = panier.getTotalPrice();
    	if(this.verifierPaiement(price)) {
    		
    			this.payeMontant(price);
    			particulier.addToAccount(price);
    			particulier.addCommande(panier);
    			return true;
    	}
    	return false;
    }
    
    /**
     * 
     * @param article
     * @return
     */

    public Article retirerArticleVendu(Article article){
        int index = articleArray.indexOf(article);
        return articleArray.remove(index);
    }
    
    /**
     * 
     * @param articleAVendre
     */

    public void mettreEnVente(Article articleAVendre) {
        int index = acquis.indexOf(articleAVendre);
        articleArray.add(acquis.remove(index));
    }
    
    /**
     * 
     * 
     */

    public void noterVendeur(){ //on parcours les objets a vendre et on definit la note enfonction de l'etat de chaque objct
        double sommeEtat=0 ;
        int nbArticle=0;
        for(Article articleEnVente: articleArray){
            sommeEtat+= articleEnVente.getEtat();
            nbArticle++;
        }
        if(nbArticle != 0) this.note = (sommeEtat/nbArticle);
    }
    
    /**
     * 
     */

	@Override
	public boolean achete(Professionnel professionnel) {
		return this.payeCommande(panier,professionnel);
	}

	
	/**
	 * dans le cas où le particulier vend un article.
	 * la livraison se fait par entente.
	 * soit par courier postale, dans la mésure où l'on aura besoin de savoir les cordonnées de l'acheteur.
	 * soit l'acheteur pourra venir recuperer l'Article chez le vendeur.
	 * ou bien ils se fixent un point de rendez-vous.
	 * 
	 * Ceci est traité par le système de message qu'ils échangent.
	 * c'est à dire que nous on aura pas à gerer ces échanger.
	 * 
	 * cette méthode se contentera de notifier à l'acheteur la disponibilité de la commande.
	 * Ainsi pouront proceder comme ils l'entendent à l'echange.
	 * 
	 * Seulement, une fois la transaction effectué, 
	 * On voudra savoir si l'echange s'est bien passé.
	 * 
	 * Vu la complexité de la méthode, elle sera implémenté ultérieurement.
	 */
	
	@Override
	public void livrerCommande(Commande commande) {
		// TODO Auto-generated method stub
		
	}
	
}





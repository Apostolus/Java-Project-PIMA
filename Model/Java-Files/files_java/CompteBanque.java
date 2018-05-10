public class CompteBanque{
	
	private final int PAIEMENT_NON_AUTORISE = -1;
	private final int PAIEMENT_AUTORISE = 0;
	private final int PAIEMENT_AUTORISE_AVEC_DECOUVERT = 1;
	
    private static int id = 0;
    private final String numero; // je vais à la fin personnaliser le numéro du compte bancaire en fonction de l'entité
    private boolean decouvert;
    private int montantDecouvertAutorise;  // la limite maximal autorise
    private int montantDecouvert;     //le montant courant de decouvert
    private int solde;
    
    /**
     * 
     * @param entite : sert à generer le numéro du compte bancaire
     * @param decouvert
     * @param montantDecouvertAutorise
     * @param montantDecouvert
     * @param solde
     */

    public CompteBanque(Entite entite, boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde) {
    	
        id++;
        this.numero = ""+id;
        this.decouvert = decouvert;
        this.montantDecouvert = montantDecouvert;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
        this.solde = solde;
    }
    
    /**
     * 
     * @param article
     * @return
     */

    //verifier si il faut payer

    // diminue le solde par le prix du Article a
    public boolean paye(Article article,int quantite) {   // le cas ou il a pas l'argent alors on renvoie un false tq dans la fonction acheter(Article) on appel la fonction paye
    	
    	return paye(article.getPrice()*quantite);
    	
    }
    
    public boolean paye(double price) {
    	
    	switch (verifierPaiement(price)) {
		case PAIEMENT_AUTORISE:
			solde-=price;
			return true;
			
		case PAIEMENT_AUTORISE_AVEC_DECOUVERT:
			montantDecouvert -= (price - solde);
			solde-=price;
			return true;

		case PAIEMENT_NON_AUTORISE:
			return false;

			default:
			    return false;
		}
    }
    
    /**
     * 
     * 
     * 
     * @param montant
     */

    //fonction pour remplir le compte, lorsqu'un acheteur achete a un vendeur par exemple
    public void reflouer(double montant) {
        if (montantDecouvert < montantDecouvertAutorise) {
            if (montantDecouvert + montant < montantDecouvertAutorise)
                montantDecouvert += montant;
            else {
                montantDecouvert += (montantDecouvertAutorise - montantDecouvert);
                montant -= (montantDecouvertAutorise - montantDecouvert);
                solde += montant;
            }
        } else {
            solde += montant;
        }
    }
    
    public int verifierPaiement(double price) {
    	
    	if(solde>price) {
    		return PAIEMENT_AUTORISE;
    	}
    	else if(decouvert && montantDecouvert>=price) {
    		return PAIEMENT_AUTORISE_AVEC_DECOUVERT;
    	}
    	
    	return PAIEMENT_NON_AUTORISE;
    }

    //GETTERS
    public boolean isDecouvert() {
        return decouvert;
    }

    public int getMontantDecouvert() {
        return montantDecouvert;
    }

    public int getSolde() {
        return solde;
    }

    public int getMontantDecouvertAutorise() {
        return montantDecouvertAutorise;
    }

    public static int getId() {
        return id;
    }

    public String getNumero() {
        return numero;
    }
}
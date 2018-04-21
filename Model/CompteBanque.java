public class CompteBanque{
    private static int id = 0;
    private final String numero; // je vais à la fin personnaliser le numéro du compte bancaire en fonction de l'entité
    private boolean decouvert;
    private int montantDecouvertAutorise;
    private int montantDecouvert;
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

    // diminue le solde par le prix du Article a
    public boolean paye(Article article) {   // le cas ou il a pas l'argent alors on renvoie un false tq dans la onction acheter(Article) on appel la fonction paye

        if (solde > article.getPrice()){
            solde -= article.getPrice();
            return true;
        }
        if (decouvert && montantDecouvert >= article.getPrice()) {
            solde -= article.getPrice();
            montantDecouvert -= article.getPrice();
            return true;
        }
        return false;
    }

    //fonction pour remplir le compte, lorsqu'un acheteur achete a un vendeur par exemple
    public void reflouer(int montant) {
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
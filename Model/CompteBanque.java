public class CompteBanque{
    private static final int id = 0;
    //private final int numero;
    private boolean decouvert;
    private int montantDecouvertAutorise;
    private int montantDecouvert;
    private int solde;

    public CompteBanque(boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde) {
        id++;
        this.decouvert = decouvert;
        this.montantDecouvert = montantDecouvert;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
        this.solde = solde;
    }

    // diminue le solde par le prix du bien a
    public boolean paye(Bien a) {   // le cas ou il a pas l'argent alors on renvoie un false tq dans la onction acheter(bien) on appel la fonction paye
        if (solde > a.getPrix()){
            solde -= a.getPrix();
            return true;
        }
        if (decouvert && montantDecouvert >= a.getPrix()) {
            solde -= a.getPrix();
            montantDecouvert -= a.getPrix();
            return true;
        }
        return false;
    }

    //fonction pour remplir le compte, lorsqu'un acheteur chete a un vendeur par exemple
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

}
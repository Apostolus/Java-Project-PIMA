public class CompteBanque{
    private static final int id =0;
    //private final int numero;
    private boolean decouvert;
    private int montantDecouvertAutorise;
    private int montantDecouvert;
    private int solde;

    public CompteBanque(boolean decouvert, int montantDecouvertAutorise,int montantDecouvert, int solde){
        id++;
        this.decouvert = decouvert;
        this.montantDecouvert = montantDecouvert;
        this.montantDecouvertAutorise = montantDecouvertAutorise;
        this.solde = solde;
    }

    public boolean paye(Bien a){   // le cas ou il a pas l'argent alors on renvoie un false tq dans la onction acheter(bien) on appel la fonction paye
        if(solde>a.getPrix() ) {
            solde -= a.getPrix();
            return true;
        }
        if(decouvert && montantDecouvert>=a.getPrix()){
            solde -= a.getPrix();
            montantDecouvert-=a.getPrix();
            return true;

        }
        return false;

    }

    //fonction pour remplir le compte

}
public class Commande{

    private final int numCommande;
    private Time dateDeCommande;
    private Entite destinataire;
    private Article articleCommande;
    private int quantite;

    public Commande(Entite destinataire, Article articleCommande,int quantite) {
        this.quantite = quantite;
        this.dateDeCommande = new Time();
        this.destinataire = destinataire;
        this.articleCommande = articleCommande;
        this.numCommande = 0;
    }

    public void LancerCommande(Entrepot entrepot){

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

    public Article getArticleCommande() {
        return articleCommande;
    }

    public int getQuantite() {
        return quantite;
    }
}
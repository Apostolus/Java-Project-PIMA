public class Commande{

    private final int numCommande;
    private Time dateDeCommande;
    private Entite destinataire;
    private Article articleCommande; // faire un tableau ou array d'articles
    private int quantite;            // quantite de quoi ?

    public Commande(Entite destinataire, Article articleCommande,int quantite) {
        this.quantite = quantite;
        this.dateDeCommande = new Time();
        this.destinataire = destinataire;
        this.articleCommande = articleCommande;
        this.numCommande = 0;
    }

    public boolean LancerCommande(Entrepot entrepot){
    	return entrepot.addCommande(this);
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
import java.util.ArrayList;

public class Particulier extends Entite{

    private static int nb_personnes = 0;
    private double note;
    private int stock;
    private double recette;                                   // recette journaliere
    private Commande panier;                                  // la commande qui sera envoyer a un PROFESSIONNEL
    private ArrayList<Article> acquis;

    public Particulier(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom) {
        super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
        acquis = new ArrayList<Article>();
        note=0;
        recette =0;
    }


    public boolean addPanier(Professionnel professionnel,Article article, int quantite){
        return panier.addCommande(article, quantite, professionnel);
    }

    public boolean reglerPanier(Professionnel professionnel){
        return this.payeCommande(panier,professionnel);
    }
    
    /**
     * 
     * on considère que le particulier a déjà l'article
     * 
     * @param particulier
     * @param article
     * @param objectifVente
     */

    public boolean acheteParticulier(Particulier particulier, Article article){
        if(this.payeArticle(article, article.getQuantite() )){
            particulier.addToAccount(article.getPriceAvecQuantite());
            return true;
        }
        return false;
    }

    public Article retirerArticleVendu(Article article){
        int index = articleArray.indexOf(article);
        return articleArray.remove(index);
    }

    public void mettreEnVente(Article articleAVendre) {
        int index = acquis.indexOf(articleAVendre);
        articleArray.add(acquis.remove(index));
    }

    public void noterVendeur(){ //on parcours les objets a vendre et on definit la note enfonction de l'etat de chaque objct
        double sommeEtat=0 ;
        int nbArticle=0;
        for(Article articleEnVente: articleArray){
            sommeEtat+= articleEnVente.getEtat();
            nbArticle++;
        }
        if(nbArticle != 0) note = (sommeEtat/nbArticle);
    }

	@Override
	public boolean Achete(Professionnel professionnel) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean payer(Commande commande) {
		// TODO Auto-generated method stub
		return false;
	}
	
}





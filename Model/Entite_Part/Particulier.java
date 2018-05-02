import java.util.ArrayList;

public class Particulier extends Entite{

    private static int nb_personnes = 0;
    private double note;
    private int stock;
    private double recette;                                   // recette journaliere
    private Commande panier;                                  // la commande qui sera envoyer a un PROFESSIONNEL
    private ArrayList<Article> acquis;

    public Particulier(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom)
        super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
        acquis = new ArrayList<Article>();
        note=0;
        recette =0;
    }


    public addPanier(Article article, int quantite){
        panier.addCommande(article, quantite);
    }

    public boolean reglerPanier(Professionnel professionnel){
        return this.payeCommande(panier);
    }

    public void acheteParticulier(Particulier particulier, Article article, boolean objectifVente){
        if(this.payeArticle(article, article.getQuantite() )){
            particulier.reflouer(article.getPriceAvecQuantite());

            if(objectifVente){ articleArray.add(retirerArticleVendu(article)) ;}
            else{
                // juste l'enlever de chez le vendeur
            }
        }

        else{
            System.out.println("L'article " + article.getType() + article.getDescription()+ " ne peut etre acheté");
        }
    }

    public Article retirerArticleVendu(Article a){
        int i= articleArray.(indexOf(a));
        if (this.paye((i!=-1)) return articleArray.remove(i);
    } // pour l'achat chez un particulier uniquement

    public void mettreEnVente(Article articleAVendre) {
        int index = acquis.getOfIndex(articleAVendre);
        acquis.remove(index);
        articleArray.add(articleAVendre);
    }

    public void noterVendeur(){ //on parcours les objets a vendre et on definit la note enfonction de l'etat de chaque objct
        double sommeEtat=0 ;
        int nbArticle=0;
        for(Artcile articleEnVente: articleArray()){
            sommeEtat+= articleEnVentegetEtat();
            nbArticle++;
        }
        if(nbArticle != 0) note = (sommeEtat/nbArticle);
    }

	@Override
	public boolean Achete(Entrepot entrepot, Article article, int quantite) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean payer(Commande commande) {
		// TODO Auto-generated method stub
		return false;
	}





import java.util.ArrayList;

public class Particulier extends Entite{

    private static int nb_personnes = 0;
   private double note;
    private int stock;
    private double recette;                                   // recette journaliere
    private Commande panier;                                  // la commande qui sera envoyer a un PROFESSIONNEL
    private ArrayList articleChoisi;                          // repertorie la liste des article que le particulier voudrait acheter chez un PROFESSIONNEL

    public Particulier(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom)
        super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
        this.stock = stock;
        note=0;
        recette =0;
    }

    public boolean Achete(Entite entite, Article articleAVendre, boolean objectifVente, int quantiteVoulu) { // livraison
        if (this.payeArticle(articleAVendre, quantiteVoulu)) { // on verifie qu'on a l'oseil
            panier.addCommande();                              // on ajote au panier
            entite.reflouer(articleAVendre.getPriceAvecQuantite(quantiteVoulu)); // le vendeur prend l'argent
            if(objectifVente){ articleArray.add(articleAVendre);}                // on le met en vente s'il est necessaire
            return true;
        }

        else {
            System.out.println("Impossible de payer");
            return false;

        }
    } // paye un unique type d'article avec sa quantite

    public void reglerArticleChoisi(Professionel professionel, ArrayList articleChoisi, boolean[] objectifVente){
        int i=0;
        for(Article article : articleChoisi){

            if( this.achete(professionel , article , objectifVente[i]) ) {
                panier.remove(articleDuPanier);
            }
            else{
                System.out.println("L'article n°"+i +" de type : " +articleDuPanier.getType()+ " de la categorie :" +articleDuPanier.getCategorie() + " de la commande ne peut etre payé.");
            }
            i++;
        }
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

    public void ajouterAuxArticlesChoisis(Artcile article, Professionnel professionnel) {
        articleChoisi.add(article);
    }


    public void mettreEnVente(Article articleAVendre){
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

/*

    public void ajouterArticleAchete(Entite e,Article a) {
        if(e instanceof Particulier) acquisP.add(a);
        else acquisM.add(a);
    }

*/




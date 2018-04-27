import java.util.ArrayList;

public class Particulier extends Entite{

    private static int nb_personnes = 0;
   // private String nom, prenom;
   // private ArrayList<Article> acquisP;                    ce qu'il va acheter chez un PARTICULIER
   // private ArrayList<Article> acquisM;                    ce qu'il va acheter chez un MAGASIN
   // private ArrayList<Article> aVendre;                     // ce qu'il veut vendre
    private double note;
    private int stock;
    private double recette;                                   // recette journaliere
    private Commande panier;





    public Particulier(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom)
        super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
        this.stock = stock;
        note=0;
        recette =0;
    }


    public void Achete(Particulier p, Article articleAVendre, boolean objectifVente) { // livraison
        if (this.paye(articleAVendre)) { // Si le particulier courant a l'argent (ou le decouvert) pour acheter a
            p.retirerArticleVendu(articleAVendre);  // on retir l'Article du tableaux de ventes du vendeur p
            //this.ajouterArticleP(a);   // on ajoute l'article au tableau acquisP tu courant
            p.reflouer(articleAVendre.getPrix());   // on modifie le compte en banque du vendeur p
        }

            if(objectifVente){ articleArrayadd(articleAVendre);}

            else {
            System.out.println("Impossible de payer")
        }
    }
    
    public void retirerArticleVendu(Article a){ // ajouter la quantite
        int i= articleArray.(indexOf(a));
        if(i!=-1) articleArray.remove(i);
    }

    public void ajouterAuPanier(Artcile artic00000000le){}

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




}
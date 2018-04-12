import java.util.ArrayList;

public abstract class Particulier implements Acheter, Vendre {

    private static int nb_personnes = 0;
    private String nom, prenom, numeroTel, email;
    protected CompteBanque cb;                        // il faut voir s'il y a moyen de passer en private
    private ArrayListe<Article> acquisP;                   // ce qu'il va acheter chez un PARTICULIER
    private ArrayListe<Article> acquisM;                   // ce qu'il va acheter chez un MAGASIN
    private ArrayList<Article> aVendre;                     // ce qu'il veut vendre
    //private ArrayList<boolean> satisfaitPA;                    // tableaux referençant la satisfaction pour chaque produit acheter A UN PARTICULIER
    private double note;
    private int stock;
    //private double recetteJ;                             // recette journaliere





    public Particulier(String nom, String prenom, String numeroTel, String email, int stock){
        this.nom = nom ;
        this.prenom = prenom ;
        this.adresse = adresse;

        acquisP = new ArrayList<Article>() ;
        acquisM = new ArrayList<Article>() ;
       // satisfaitPA = new ArrayList<boolean>();
        aVendre = new ArrayList<Article>();

        this.stock = stock;
        note=0;

    }



    public void Achete(Particulier p, Article a) {
        if (cb.paye(a)) { // Si le particulier courant a l'argent (ou le decouvert) pour acheter a
            p.retirerArticleVendu(a);  // on retir l'Article du tableaux de ventes du vendeur p
            this.ajouterArticleP(a);   // on ajoute l'article au tableau acquisP tu courant
            p.reflouer(a.getPrix());   // on modifie le compte en banque du vendeur p
        } else {
            System.out.println("Impossible de payer")
        }
    }

    public void retirerArticleVendu(Article a){
        int i= aVendre.(indexOf(a));
        if(i!=-1) aVendre.remove(i);
        /*for(Arcticle art : aVendre){
            i++;
            if(art==a)
                aVendre.remove(i);
        */

        }

    public void ajouterArticleAcheteP(Article a) {
        acquisP.add(a);
    }

    public void ajouterArticleAcheteM(Article a) {
        acquisM.add(a);
    }

    public void mettreEnVente(Article a){
        aVendre.add(a);
    }

    public void Achete(Magasin p, Article a){}



    public void noterVendeur(){ //on parcours les objets a vendre et on definit la note enfonction de l'etat de chaque objct
        double d=0 ,i=0;
        for(boolean s : a.getEtat()){
            if(s) d++;
            i++;
        }
        if(i!=0) note = (d/i)*10;
    }

    // LES GETTERS
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


}
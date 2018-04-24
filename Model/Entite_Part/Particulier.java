import java.util.ArrayList;

public class Particulier extends Entite{

    private static int nb_personnes = 0;
   // private String nom, prenom;
   // private ArrayList<Article> acquisP;                    ce qu'il va acheter chez un PARTICULIER
   // private ArrayList<Article> acquisM;                    ce qu'il va acheter chez un MAGASIN
    private ArrayList<Article> aVendre;                     // ce qu'il veut vendre
    //private ArrayList<boolean> satisfaitPA;                    // tableaux referençant la satisfaction pour chaque produit acheter A UN PARTICULIER
    private double note;
    private int stock;
    //private double recetteJ;                             // recette journaliere





    public Particulier(String nom, String prenom, String numeroTel, String email, int stock, CompteBanque cb){
        super(numeroTel, email, cb);
        this.nom = nom ;
        this.prenom = prenom ;


        acquisP = new ArrayList<Article>() ;
        acquisM = new ArrayList<Article>() ;
       // satisfaitPA = new ArrayList<boolean>();
        aVendre = new ArrayList<Article>();

        this.stock = stock;
        note=0;


    }

/*
    public void Achete(Particulier p, Article a) {
        if (getCb().paye(a)) { // Si le particulier courant a l'argent (ou le decouvert) pour acheter a
            p.retirerArticleVendu(a);  // on retir l'Article du tableaux de ventes du vendeur p
            this.ajouterArticleP(a);   // on ajoute l'article au tableau acquisP tu courant
            p.reflouer(a.getPrix());   // on modifie le compte en banque du vendeur p
        } else {
            System.out.println("Impossible de payer")
        }
    } // verifier que le particulier qui vend a bien l'article
    
    */
    
    

    public void retirerArticleVendu(Article a){
        int i= aVendre.(indexOf(a));
        if(i!=-1) aVendre.remove(i);
        /*for(Arcticle art : aVendre){
            i++;
            if(art==a)
                aVendre.remove(i);
        */

        }
    
    /*

    public void ajouterArticleAchete(Entite e,Article a) {
        if(e instanceof Particulier) acquisP.add(a);
        else acquisM.add(a);
    }

*/
    public void mettreEnVente(Article a){
        aVendre.add(a);
    }


    public void noterVendeur(){ //on parcours les objets a vendre et on definit la note enfonction de l'etat de chaque objct
        double d=0 ,i=0;
        for(boolean s : a.getEtat()){
            if(s) d++;
            i++;
        }
        if(i!=0) note = (d/i)*10;
    }

    // LES GETTERS on ne get pas le cb
/*    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }*/
    public static int getNb_personnes() {
        return nb_personnes;
    }
    public String getEmail() {
        return email;
    }
    public double getNote() {
        return note;
    }
    public ArrayList<Article> getaVendre() {
        return aVendre;
    }
    /*
    public ArrayListe<Article> getAcquisP() {
        return acquisP;
    }
    public ArrayListe<Article> getAcquisM() {
        return acquisM;
    }
    */
    public int getStock() {
        return stock;
    }


}
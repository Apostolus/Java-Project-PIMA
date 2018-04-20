import java.util.Map;
import java.util.HashMap ;
import java.util.ArrayList ;


public abstract class Professionnel extends Entite{
    private Map<Article, Integer> objetAVendre ;
    private String adresse;


    public Professionnel(String numeroTel, Sting email, String adresse, CompteBanque cb){
        super(numeroTel, email, cb);
        this.adresse = adresse;
        objetAVendre = new HashMap<>();
    }



    //les methodes à implementer de la classe Entite.
    public abstract void Achete();
    public abstract void ajouterArticleAchete();  // ajoute les objets acquis par la vente dans le tableaux des objets acquis
    public abstract  void mettreEnVente();        // Ajoute un objet a vendre
    public abstract void retirerArticleVendu();



    // Les methodes specifiques a Professionnel qui seront a implementer dans Magasin et Entrepot



}
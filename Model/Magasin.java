import java.util.Map;
import java.util.HashMap ;

public class Magasin extends Professionnel{
    private String marque ;
    private Map<Article , Integer> Panier;

    //emetteur de commande
    //date
    // dico d'articles


    public Magasin(String numeroTel, String email,String adresse, String marque, CompteBanque cb) {
        super(numeroTel, email, adresse, cb);
        this.marque = marque;
        aCommander = new HashMap<>();
    }


    //Methodes ENTITE
    public void achete(Entrepot e,Article a){

    }

    public void ajouterALaCommande(Article article, int quantite){
        aCommander.put(a, quantite);
    }
    public void ravitailler(Entrepot e){

    }


    }

}
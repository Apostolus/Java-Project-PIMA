import java.util.ArrayList ;

public class Entrepot extends Professionnel{
    private ArrayList<Commande> commandes;



    public Entrepot(String numeroTel, String email,String adresse, String marque), CompteBanque cb;{
        super(numeroTel, email, adresse, cb);
        commandes = new HashMap<>();

    }




}
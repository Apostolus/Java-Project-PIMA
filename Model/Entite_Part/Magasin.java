
import java.util.ArrayList;


public class Magasin extends Professionnel implements Acheter{

    @SuppressWarnings("unused")
	private ArrayList<Article> panier;



    public Magasin(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde,String nom){
        super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
        panier = new ArrayList<>();
    }

	@Override
	public boolean Achete(Entrepot entrepot, Article article,int quantite) {
		
		Commande commande = new Commande(this,article,quantite);
		if(entrepot.addCommande(commande)) {
			return this.payer(commande);
		}
        return false;
	}

}
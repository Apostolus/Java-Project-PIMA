
import java.util.ArrayList;


public class Magasin extends Professionnel{

    @SuppressWarnings("unused")
	private ArrayList<Article> panier;
    private double recetteJ;



    public Magasin(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde,String nom){
        super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
        panier = new ArrayList<>();
    }

	@Override
	public boolean Achete(Entrepot entrepot, Article article, int quantite) {
		// TODO Auto-generated method stub
		return false;
	}
}

public class Entrepot extends Professionnel{

	private Map<String, Article>;
    
    public Entrepot(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde,String nom){
    	 super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
    
    }

	@Override
	public boolean Achete(Entrepot entrepot, Article article, int quantite) {
		// TODO Auto-generated method stub
		return false;
	}



}

public class Entrepot extends Professionnel{
    
    public Entrepot(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde,String nom){
    	 super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
    
    }
    
    public Entrepot() {
    	this(null,null,null,null,null,null,true,0,0,0,null);
    }

	@Override
	public boolean Achete(Entrepot entrepot, Article article, int quantite) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean payer(Commande commande) {
		// TODO Auto-generated method stub
		return false;
	}

}
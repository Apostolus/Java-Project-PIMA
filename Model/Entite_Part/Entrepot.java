import java.util.ArrayList ;

public class Entrepot extends Professionnel{
    
	private ArrayList<Commande> commandes;

    public Entrepot(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde,String nom){
    	 super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
    	 commandes = new ArrayList<>();
    }
    
    public boolean addCommande(Commande commande) {
    	
    	if(this.verifierDisponibilite(commande.getArticleCommande(), commande.getQuantite())) {
    		commandes.add(commande);
    		return true;
    	}
    	return false;
    }

}
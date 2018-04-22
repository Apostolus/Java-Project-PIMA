import java.util.Map;
import java.util.HashMap ;

public class Magasin extends Professionnel implements Acheter{
    
	//private String marque ; cet attribut existe deja, sous forme de nom dans la classe entité
    private Map<Article , Integer> panier;

    //emetteur de commande
    //date
    // dico d'articles


    public Magasin(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde,String nom){
        super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
        //this.marque = marque;  
         panier = new HashMap<>();
    }

	@Override
	public boolean Achete(Entrepot entrepot, Article article,int quantite) {
		
		Commande commande = new Commande(this,article,quantite);
		if(entrepot.addCommande(commande)) {
			return this.payer(commande);
		}
        return false;
	}
	
	@Override
	public Map<Article,Integer> Achete(Entrepot entrepot) {
		
		
		
		return panier;
	}

}
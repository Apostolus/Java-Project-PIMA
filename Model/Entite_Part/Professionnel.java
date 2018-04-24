import java.util.ArrayList;

public abstract class Professionnel extends Entite implements Vendre{
	
	private ArrayList<Commande> commandes;

     public Professionnel(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom){
        super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
        this.commandes = new ArrayList<>();
     }
     
     @Override
     public boolean addCommande(Commande commande) {
     	
     	if(this.verifierDisponibilite(commande.getArticleCommande(), commande.getQuantite())) {
     		commandes.add(commande);
     		return true;
     	}
     	return false;
     }
     
     @Override
 	public boolean envoyerCommande(Commande commande) {
 		// TODO Auto-generated method stub
 		
 		return false;
 	}
     
     @Override
     public boolean verifierDisponibilite(Article article, int quantite) {
     	if(articleArray.contains(article)) {
     		int index_art = articleArray.indexOf(article);
     
     		if((articleArray.get(index_art).getQuantite())>=quantite) {
     			return true;
     		}
     	}
     	return false;
     }
 
}
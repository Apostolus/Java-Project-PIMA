import java.util.ArrayList;

public abstract class Professionnel extends Entite implements Vendre{
	
	private ArrayList<Commande> commandes;

     public Professionnel(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom){
        super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
        this.commandes = new ArrayList<>();
     }
     
     @Override
     public void addCommande(Commande commande) {
     	commandes.add(commande);
     }
     
     @Override
 	public boolean envoyerCommande(Commande commande) {
 		// TODO Auto-generated method stub
 		
 		return false;
 	}
     
     @Override
     public boolean verifierDisponibilite(Article article, int quantite) {
     	if(articleArray.contains(article)) {
     		
     		if(article instanceof Mobilier) {
     			int index_art = articleArray.indexOf(article);
     			Article temp = articleArray.get(index_art);
     			
     			if(((Mobilier)temp).getQuantite()>=quantite) {
     				return true;
     			}
     			return false;
     		}
     		return true;
     	}
     	return false;
     }
 
}
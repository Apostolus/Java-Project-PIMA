
public abstract class Professionnel extends Entite{
	
     public Professionnel(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom){
        super(country,departement,city,specificAdress,email,phoneNumber,nom);
     }
     
     @Override
 	public void livrerCommande(Commande commande) {
    	 
    	 Entite client = commande.getDestinataire();
    	 for (Article article : commande.articlesCommande) {
    		 client.addArticleArray(article, article.getQuantite());
    		 this.suppressToArticleArray(article, 1);
    	 }
 	}
     
     public void livreAll() {
    	 for(Commande commande : Otherscommandes) {
    		 this.livrerCommande(commande);
    	 }
     }
}
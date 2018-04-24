
public interface Vendre {
    
	boolean verifierDisponibilite(Article article, int quantite);
	boolean addCommande(Commande commande);
	boolean envoyerCommande(Commande commande);
	

}

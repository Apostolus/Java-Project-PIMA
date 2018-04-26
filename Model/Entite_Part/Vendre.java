
public interface Vendre {
    
	boolean verifierDisponibilite(Article article, int quantite);
	void addCommande(Commande commande);
	boolean envoyerCommande(Commande commande);
	

}

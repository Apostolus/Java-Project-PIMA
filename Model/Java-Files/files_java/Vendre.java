
public interface Vendre {
    
	boolean verifierDisponibilite(Article article, int quantite);
	void addCommande(Commande commande);
	void livrerCommande(Commande commande);
}

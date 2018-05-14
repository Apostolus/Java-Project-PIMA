
public interface Vendre {
    
	boolean verifierDisponibilite(Article article, int quantite);
	void recevoirCommande(Commande commande);
	void livrerCommande(Commande commande);
}

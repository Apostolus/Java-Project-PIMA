
public interface Acheter{
	

	boolean Achete(Entrepot entrepot, Article article, int quantite);
	boolean payer(Commande commande);
	
}
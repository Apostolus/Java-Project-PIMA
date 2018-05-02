
public interface Acheter{
	

	boolean Achete(Professionnel professionnel);
	boolean payer(Commande commande);
	public boolean payeCommande(Commande commande,Professionnel professionnel);
	
}
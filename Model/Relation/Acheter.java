
public interface Acheter{
	

	boolean achete(Professionnel professionnel);
	boolean payer(Commande commande);
	public boolean payeCommande(Commande commande,Professionnel professionnel);
	
}
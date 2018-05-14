public class TestClass {

	public static void main(String[] args) {
		
		Professionnel entrepot = new Entrepot();
		Particulier destinataire = new Particulier();
		Banque banque = new Banque();
		entrepot.createAcount(banque);
		destinataire.createAcount(banque);
		Article article = new Mobilier();
		Article art = new Mobilier();
		entrepot.addToAccount(1000000);
		destinataire.addToAccount(2000);
		
		System.out.println(article);
		System.out.println(art);
		
		System.out.println("\n\n les entités\n");
		System.out.println(entrepot);
		System.out.println(destinataire);
		
		entrepot.addArticleArray(new Mobilier((Mobilier)art), 20);
		
		System.out.println("\n\nVendeur : \n-------------------");
		entrepot.afficheAllArticleArrays();

		destinataire.createPanier(entrepot);
		destinataire.addPanier(((Mobilier)art),5);
		destinataire.addPanier(((Mobilier)article),1);
		
		System.out.println("\n\n le Panier\n");
		
		//destinataire.afficherPanier();
		
		destinataire.achete();
		
		System.out.println("Affichage Commande : \n-------------------");
		entrepot.afficherAllcommande();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		entrepot.livreAll();
		entrepot.afficherAllcommande();
		
		System.out.println("\n\nAcheteur : \n-------------------");
		destinataire.afficheAllArticleArrays();
		System.out.println("\n\nVendeur : \n-------------------");
		entrepot.afficheAllArticleArrays();
		
		//System.out.println("\n\n les entités\n\n");
		//System.out.println(entrepot);
		//System.out.println(destinataire);
		
		

	}

}

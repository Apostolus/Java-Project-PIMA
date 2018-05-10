import com.sun.java_cup.internal.runtime.Scanner;
import com.sun.java_cup.internal.runtime.Symbol;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Professionnel entrepot = new Entrepot();
		Entite destinataire = new Magasin();
		Commande commande = new Commande(destinataire);
		Article article = new Mobilier();
		Article art = new Mobilier();
		
		System.out.println(article);
		System.out.println(art);
		
		entrepot.addArticleArray(new Mobilier((Mobilier)art), 20);
		
		/*
		for(Article a: entrepot.articleArray) {
			System.out.println(a.toString());
			a.setPrice(100);
			System.out.println(a.toString());
		}
		*/
		
		//System.out.println(art);
		commande.addCommande(new Mobilier((Mobilier)art), 17, entrepot);
		commande.addCommande(new Mobilier((Mobilier)art), 3, entrepot);
		
		for(Article a : commande.articlesCommande) {
			System.out.println(a.toString());
		}

	}

}

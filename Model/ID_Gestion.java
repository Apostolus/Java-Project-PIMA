
public class ID_Gestion {


    /**
     * Le numero d'un article dans un magasin est composé de 3 parties:
     * la première décrit la catégorie, la deuxième le type, et la troisième son id.
     * 
     * si c'est un mobilier c'est la lettre M qui commence sinon la lettre I
     * la seconde partie est faite par les 3 premières lettres de son type
     * puis la dernière son id.
     * 
     * @param article
     * @return
     */
	
	public static String generateArticleNumero(Article article) {
		return article.getCategorie().substring(0)+"-"+article.getType().substring(0,2)+"-"+article.id;
	}
	
	/**
	 * 
	 * Le numéro d'une commande est est faite de la date, puis le nbCommade de la commande et l'id de l'acheteur
	 * 
	 * @param commande
	 * @return
	 */
	
	public static String generateArticleNumCommande(Time time, int nbCommande, Entite entite) {
		return time.getStringDateFormat()+"-"+nbCommande+"-"+entite.getId();
	}
	

}

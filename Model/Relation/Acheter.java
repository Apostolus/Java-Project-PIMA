import java.util.Map;

public interface Acheter{

	boolean Achete(Entrepot entrepot, Article article, int quantite);
	public Map<Article,Integer> Achete(Entrepot entrepot) ;

}
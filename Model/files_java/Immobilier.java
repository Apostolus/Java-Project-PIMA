import java.util.ArrayList;

public class Immobilier extends Article {

    private double Totalesurface;



    public Immobilier(String type, String description, Time time, double price, double surface) {

        super(type, "Immbolier", description, time,price, null);
        this.Totalesurface = surface;
    }
    
    public Immobilier(Immobilier mobilier) {
    	this(mobilier.type,mobilier.description,mobilier.time,mobilier.price,10.0);
    }
    
    @Override
    protected Immobilier clone() {
    	// TODO Auto-generated method stub
    	return new Immobilier(this);
    }
    
    public Immobilier() {
    	this("type","description",new Time(),0.0,0);
    }
    
    public double getTotalesurface() {
		return Totalesurface;
	}
    
    public void setTotalesurface(double totalesurface) {
		Totalesurface = totalesurface;
	}

	@Override
	protected void addArticleArray(ArrayList<Article> articleArray, int quantite) {
		Immobilier immobilier = this.clone();
		immobilier.setQuantite(1);
		articleArray.add(immobilier);
	}

	@Override
	protected void suppressToArticleArray(ArrayList<Article> articleArray, int quantite) {
		if(articleArray.contains(this)) {
			articleArray.remove(this);
		}
		else {
			System.out.println("Le produit n'existe pas dans L'array");
		}
		
	}

}

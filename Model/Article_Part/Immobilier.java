
public class Immobilier extends Article {

    private double Totalesurface;


    public Immobilier(String type, String description, Time timeOfPublish, double price, double surface) {

        super(type,"Immbolier", description, timeOfPublish,price);
        this.Totalesurface = surface;
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
}

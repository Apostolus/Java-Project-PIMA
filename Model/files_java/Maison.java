import java.util.ArrayList;

public class Maison extends Immobilier{
    private int nbPiece;
    private ArrayList<Meuble> meubles;

    public Maison(String type, String description, Time time, double price, double surface, int nbPiece) {
        super("Maison", description, time, price, surface);
        this.nbPiece = nbPiece;
        this.meubles = new ArrayList<>();
    }
    
    public void addMeuble(Meuble meuble) {
    	meubles.add(meuble);
    }
    
    public int getNbMeubles() {
    	return meubles.size();
    }
    
    public ArrayList<Meuble> getMeubles() {
		return meubles;
	}

    public double prixLocationMensuel(){
        return price * 0.005;
    }
    
    public int getNbPiece() {
		return nbPiece;
	}
    
    public void setNbPiece(int nbPiece) {
		this.nbPiece = nbPiece;
	}

}
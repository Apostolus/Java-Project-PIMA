public class Maison extends Immobilier{
    private int nbPiece;
    private Meuble[] meubles;

    public Maison(String type, String description, Time time, double price, double surface, int nbPiece, int nbMeubles) {
        super("Maison", description, time, price, surface);
        this.nbPiece = nbPiece;
        meubles = new Meuble[nbMeubles];
    }

    public Maison(String type, String description, Time time, double price, double surface,int nbPiece, Meuble[] meubles) {
        super("Maison", description, time, price, surface);
        this.nbPiece = nbPiece;
        this.meubles = meubles;
    }

    public int PriceLocationParMois(){
        return price*(1.005);
    }



}
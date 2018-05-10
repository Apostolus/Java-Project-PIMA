public class Maison extends Immobilier{
    private int nbPiece;
    private Meuble[] meubles;

    public Maison(String type, String description, Time time, double price, double surface, int nbPiece, Meuble[] meubles) {
        super("Maison", description, time, price, surface);
        this.nbPiece = nbPiece;
        this.meubles = meubles;
    }

    public int prixLocationMensuel(){
        return price * 0.005;
    }




}
import java.util.ArrayList;

public class Acheteur extends Particulier{
    private ArrayListe<Bien> acquis;                   // ce qu'il va acheter chez un particulier ou dans un magasin, tu pense qu'il faut faire 2 array pour differencier les 2 types d'achats ?
    private boolean[] satisfait;
    private int stock;
    private int stockDispo;


    public Acheteur(String nom, String prenom, int stock, int stockDispo){
        super(nom, prenom);
        acquis = new ArrayList<Bien>() ;
        this.stock = stock;
        this.stockDispo = stockDispo;
        satisfait = new boolean[stock];
    }

    public double noterP(){
        double d=0;
        int i=0;
        for(boolean s : satisfait){
            if(s)
                d++;
            i++;
        }
        if(i!=0)
            return double/i;
        return 0;
    }



}
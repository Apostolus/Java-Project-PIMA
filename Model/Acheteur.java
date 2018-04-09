import java.util.ArrayList;

public class Acheteur extends Particulier{
    private ArrayListe<Bien> acquis;                   // ce qu'il va acheter chez un particulier ou dans un magasin, tu pense qu'il faut faire 2 array pour differencier les 2 types d'achats ?



    public Acheteur(String nom, String prenom){
        super(nom, prenom);
        acquis = new ArrayList<Bien>() ;
    }


}
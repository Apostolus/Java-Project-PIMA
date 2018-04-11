import java.util.ArrayList;

public class Vendeur extends Particulier {
    private ArrayList<Bien> acquis;
    private ArrayList<Bien> aVendre;                     // ce qu'il veut vendre, et c'est la difference avec la classe 'Acheteur' qui ne possede pas ce type d'Array, QU'EN PENSES-TU BRO ?
    //private double recetteJ;                             // recette journaliere
    private boolean stockEcoule;                         // Peut etre utile de savoir qu'en penses tu?
    private int note;                                    // C'est peut etre sympa de donner la possibilité a l'ACHETEUR de donner une note au vendeur pour certifier la qualité des produits qu'en penses tu ?


    public Vendeur(String nom, String prenom) {
        super(nom, prenom);
        acquis = new ArrayList<Bien>();
        aVendre = new ArrayList<Bien>();
        recetteJ = 0;
        stockEcoule = false;
    }

    public void ajouterUnBienAV(Bien a){
        aVendre.add(a);
    }




}


public abstract class Particulier {                 // Je defini la class en abstract pour la methode acheter aux magasins
    private String nom, prenom;
    protected compteBanque cb;                        // il faut definir une classe compte en banque, et voir s'il y a moyen de passer en private
    private Adresse adresse;



    public Particulier(String nom, String prenom, Adresse adresse){
        this.nom = nom ;
        this.prenom = prenom ;
        this.adresse = adresse;
    }

    //METHODES ABSTRACT
    public abstract void acheterMagasins();         // à definir de façon précise, modifier les parametres d'entrées et de sorti probablement

    // LES GETTERS
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }


}
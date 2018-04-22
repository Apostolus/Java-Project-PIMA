


public abstract class Professionnel extends Entite{

     Professionnel(String country, String departement, String city, String specificAdress, String email, String phoneNumber,boolean decouvert, int montantDecouvertAutorise, int montantDecouvert, int solde, String nom){
        super(country,departement,city,specificAdress,email,phoneNumber,decouvert,montantDecouvertAutorise,montantDecouvert,solde,nom);
    }


    /*
    //les methodes à implementer de la classe Entite.
    public abstract void Achete();
    public abstract void ajouterArticleAchete();  // ajoute les objets acquis par la vente dans le tableaux des objets acquis
    public abstract  void mettreEnVente();        // Ajoute un objet a vendre
    public abstract void retirerArticleVendu();



    // Les methodes specifiques a Professionnel qui seront a implementer dans Magasin et Entrepot

	*/

}
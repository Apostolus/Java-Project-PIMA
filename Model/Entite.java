public abstract class Entite implements Acheter, Vendre{
    private String numeroTel, email;
    private CompteBanque cb;


    public Entite(String numeroTel, String email) {
        this.numeroTel = numeroTel;
        this.email = email;
    }

    public abstract void Achete();
    public abstract void ajouterArticleAchete();  // ajoute les objets acquis par la vente dans le tableaux des objets acquis
    public abstract  void mettreEnVente();        // Ajoute un objet a vendre
    public abstract void retirerArticleVendu();

    public String getEmail() {
        return email;
    }

    public String getNumeroTel() {
        return numeroTel;
    }
    protected CompteBanque getCb(){ return cb;}

}
public class Vehicule extends Mobilier{
    private String[] options; // Le vehicule a certaines options (climatisation, gps integré..)
    private String calibreDuVehicule ; // 2 roues, 4 roues. Permet de savoir si c'est une moto ou une voiture ou un camionx
    private int nbOption;
    private boolean valideControleTechnique;
    private int nbKm;

    public Vehicule(String type, String description, Time timeOfPublish, double price, int quantite, String nom, String marque, int tailleOptions, String calibreDuVehicule, boolean valideControleTechnique, int nbKm) {
        super("Vehicule",  description, timeOfPublish, price, quantite, nom, marque, null);
        options = new String[tailleOptions];
        this.calibreDuVehicule = calibreDuVehicule:
        nbOption =0;
        this.valideControleTechnique = valideControleTechnique;
        this.nbKm = nbKm;

    }

    public boolean addOption(String option, double priceOption){
        if(nbOption < options.length){
            options[nbOption]= option;
            nbOption++;
            price += priceOption;
            return true;
        }
        return false;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCalibreDuVehicule() {
        return calibreDuVehicule;
    }

    public boolean isValideControleTechnique(){
        if(etat == 5) return true;  // si le vezhicule est neuf

        return valideControleTechnique;
    }

    public int getNbOption() {
        return nbOption;
    }

    public int getNbKm() {
        return nbKm;
    }

}
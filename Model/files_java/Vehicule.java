public class Vehicule extends Mobilier{
    private String[] options; // hque voiture a certaines options (climatisation, gps..)


    public Vehicule(String type, String description, Time timeOfPublish, double price, int quantite, String nom, String marque, int tailleOptions) {
        super("Vehicule",  description, timeOfPublish, price, quantite, nom, marque, 0.0);
        options = new String[tailleOptions];
    }

    public String[] getOptions() {
        return options;
    }
}
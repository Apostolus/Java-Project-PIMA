public class Voiture extends Mobilier{
    private String[] options; // hque voiture a certaines options (climatisation, gps..)


    public Voiture(String type, String description, Time timeOfPublish, double price, int quantite, String nom, String marque, int tailleOptions) {
        super("Voiture",  description, timeOfPublish, price, quantite, nom, marque, null);
        options = new String[tailleOptions];
    }

    public String[] getOptions() {
        return options;
    }
}
public class Voiture extends Mobilier{
    private String[] options; // hque voiture a certaines options (climatisation, gps..)
    private Time gatantie; //JEAN-LUC gere


    public Voiture(String type, String description, Time timeOfPublish, double price, int quantite, String nom, String marque, int tailleOptions) {
        super("Voiture",  description, timeOfPublish, price, quantite, nom, marque);
        option = new String[tailleOptions];
    }

    public String[] getOptions() {
        return options;
    }
}
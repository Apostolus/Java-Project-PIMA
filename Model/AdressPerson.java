/**
 * cette classe décris l'adresse d'une personne.
 * elle est créée pour regrouper les attributs en rapport avec l'adresse
 */
public interface AdressPerson {

	private String country;
	private String departement;
	private String city;
	private String specificAdress;


    public AdressPerson(String country, String departement, String city, String specificAdress) {
        this.country = country;
        this.departement = departement;
        this.city = city;
        this.specificAdress = specificAdress;
    }


    public String getDepartement() {
		return this.departement;
	}

	/**
	 * 
	 * @param departement
	 */
	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getCity() {
		return this.city;
	}

	/**
	 * 
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	public String getSpecificAdress() {
		return this.specificAdress;
	}

	/**
	 * 
	 * @param specificAdress
	 */
	public void setSpecificAdress(String specificAdress) {
		this.specificAdress = specificAdress;
	}

}
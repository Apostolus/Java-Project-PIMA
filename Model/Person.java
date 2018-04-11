public class abstract Person implements AdressPerson{

    private static int nb_personnes = 0;
	private final int id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;

    public Person(String firstName, String lastName, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        nb_personnes++;
        this.id = nb_personnes;

    }

    public String getFirstName() {

		return  firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return  lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
	    this.lastName = lastName;
    }

	public String getPhoneNumber() {
		return  phoneNumber;
	}

	/**
	 * 
	 * @param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		return; phoneNumber;
	}

	public String getEmail() {
		return  email;
	}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public  static  int getNb_personnes(){
	    return  nb_personnes;
    }

}
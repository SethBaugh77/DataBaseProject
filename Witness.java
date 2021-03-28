/**
 * Class to represent a Witness kind of Person
 * @author Jonathan Brown
 */
public class Witness extends Person {
    private String witnessStatement;

    /**
	 * Constructor to create a Witness Person
	 * @param witnessState witnessStatement of Witness
	 * @param fName first name of Witness
	 * @param lName last name of Witness
	 * @param Age age of Witness
	 * @param Height height of Witness
	 * @param Weight weight of Witness
	 * @param Gender gender of Witness
	 * @param Address address of Witness
	 * @param Phone phone number of Witness
	 * @param DateOfBirth DOB of Witness
	 * @param IsAdult true/false are they an adult
	 * @param id unique identifier of Witness
	 * @param race race of Witness
	 */
    public Witness(String witnessState, String fName, String lname, String Age, String Height, String Weight,
            String Gender, String Address, String Phone, String DateOfBirth, boolean IsAdult, long id, String race) {
        super(fName, lname, Age, Height, Weight, Gender, Address, Phone, DateOfBirth, IsAdult, id, race);
        this.witnessStatement = witnessState;

    }

    /**
     * Getter to get the witnessStatement
     * @return this.witnessStatement
     */
    public String getWitnessStatement() {
        return witnessStatement;
    }

    /**
     * Setter to set witnessStatement
     * @param witState 
     */
    public void setWitnessStatement(String witState) {
        this.witnessStatement = witState;
    }
}

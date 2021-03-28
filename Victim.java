/**
 * Class to represent a Victim Person
 * @author Nick Brady
 */
public class Victim extends Person {
	private String victimStatement;
	private boolean isHealthy;

	/**
	 * Constructor to create a Victim Person
	 * @param isHealthy true/false are they healthy
	 * @param victimState victimStatement of Victim
	 * @param fName first name of Victim
	 * @param lName last name of Victim
	 * @param Age age of Victim
	 * @param Height height of Victim
	 * @param Weight weight of Victim
	 * @param Gender gender of Victim
	 * @param Address address of Victim
	 * @param Phone phone number of Victim
	 * @param DateOfBirth DOB of Victim
	 * @param IsAdult true/false are they an adult
	 * @param id unique identifier of Victim
	 * @param race race of Victim
	 */
	public Victim(boolean isHealthy, String victimState, String fName, String lName, String Age, String Height,
			String Weight, String Gender, String Address, String Phone, String DateOfBirth, boolean IsAdult, long id,
			String race) {

		super(fName, lName, Age, Height, Weight, Gender, Address, Phone, DateOfBirth, IsAdult, id, race);
		this.victimStatement = victimState;
		this.isHealthy = isHealthy;
	}
/**
 * Getter to get victimStatement
 * @return victimStatement
 */
	public String getVictimStatement() {

		return victimStatement;
	}

	/**
	 * Setter to set victimStatement
	 * @param victimstatement
	 */
	public void setVictimStatement(String victimstatement) {

		this.victimStatement = victimstatement;
	}

	/**
	 * checks if isHealthy is true or false
	 * @return this.isHealthy
	 */
	public boolean isIsHealthy() {
		return this.isHealthy;
	}

	/**
	 * Getter to get boolean isHealthy
	 * @return isHealthy 
	 */
	public boolean getIsHealthy() {
		return this.isHealthy;
	}

	/**
	 * Setter to set boolean isHealhy
	 * @param isHealthy 
	 */
	public void setIsHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}

}

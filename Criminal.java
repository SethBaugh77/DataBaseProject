import java.util.ArrayList;

/**
 * Class to represent a Criminal kind of person.
 * @author Nick Brady
 */
public class Criminal extends Person {
    private boolean inJail;
    private String notes;
    private String numCrimes;
    private String crimeType;
    private String hairColor;
/**
 * Parameterized constructor that creates a Criminal and sets its indicated variables.
 * @param fname first name of criminal
 * @param lname last name of criminal
 * @param Age age of criminal
 * @param Height height of criminal 
 * @param Weight weight of criminal
 * @param crimeType type of crime
 * @param Gender gender of criminal
 * @param Address address of criminal
 * @param Phone phone number of criminal
 * @param DateOfBirth DOB of criminal
 * @param IsAdult true/false are they an adult
 * @param inJail true/false are they in jail
 * @param notes additional info about criminal
 * @param numCrimes how many crimes they have commited
 * @param ID unique indicator
 * @param race race of person
 * @param hairColor color of hair of criminal
 */
    public Criminal(String fname, String lname, String Age, String Height, String Weight, String crimeType,
            String Gender, String Address, String Phone, String DateOfBirth, boolean IsAdult, boolean inJail,
            String notes, String numCrimes, long ID, String race, String hairColor) {
        super(fname, lname, Age, Height, Weight, Gender, Address, Phone, DateOfBirth, IsAdult, ID, race);
        this.inJail = inJail;
        this.notes = notes;
        this.numCrimes = numCrimes;
        this.crimeType = crimeType;
        this.hairColor = hairColor;
    }

     /**
   	* Gets the hair color.
   	* @return this hair color.
   	*/
    public String getHairColor() {
        return this.hairColor;
    }

     /**
   	* Changes the hair color.
   	* @param string hair color.  
   	*/
    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

     /**
   	* Gets the jail status.
   	* @return this boolean status.
   	*/
    public boolean isInJail() {
        return this.inJail;
    }

     /**
   	* Gets the in jail status.
   	* @return this in jail status.
   	*/
    public boolean getInJail() {
        return this.inJail;
    }

     /**
   	* Changes the in jail status.
   	* @param boolean inJail.  
   	*/
    public void setInJail(boolean inJail) {
        this.inJail = inJail;
    }

     /**
   	* Changes the number of crimes.
   	* @param string number of crimes.  
   	*/
    public void setNumCrimes(String numCrimes) {
        this.numCrimes = numCrimes;
    }

     /**
   	* Gets the crime type.
   	* @return this crime type.
   	*/
    public String getCrimeType() {
        return this.crimeType;
    }

     /**
   	* Changes the crime type.
   	* @param string crime type.  
   	*/
    public void setCrimeType(String crimeType) {
        this.crimeType = crimeType;
    }

    /**
     * Gets if the criminal is in jail or not.
     * 
     * @return inJail.
     */
    public boolean getJail() {
        return inJail;
    }

    /**
     * Changes in jail status.
     * 
     * @param boolean
     */
    public void setJail(boolean inJail) {
        this.inJail = true;
    }

    /**
     * Gets notes on the criminal.
     * 
     * @return notes.
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Changes notes.
     * 
     * @param String.
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }

    /**
     * Gets the number of crimes.
     * 
     * @return numCrimes.
     */
    public String getNumCrimes() {
        return numCrimes;
    }

}

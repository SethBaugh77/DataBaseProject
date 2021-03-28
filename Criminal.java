import java.util.ArrayList;

public class Criminal extends Person {
    private boolean inJail;
    private String notes;
    private String numCrimes;
    private String crimeType;
    private String hairColor;

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

    public String getHairColor() {
        return this.hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public boolean isInJail() {
        return this.inJail;
    }

    public boolean getInJail() {
        return this.inJail;
    }

    public void setInJail(boolean inJail) {
        this.inJail = inJail;
    }

    public void setNumCrimes(String numCrimes) {
        this.numCrimes = numCrimes;
    }

    public String getCrimeType() {
        return this.crimeType;
    }

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

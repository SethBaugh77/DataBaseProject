
/**
 * Class that creates a person of interest
 * 
 * @author Nick Brady
 */

public class PersonOfInterest extends Person {
    protected String occupation;
    protected String lastLocation;
    protected String poiNotes;
    protected String hairColor;

    /**
     * Gets the notes for poi.
     * 
     * @return this poi notes.
     */

    public String getPoiNotes() {
        return this.poiNotes;
    }

    /**
     * Changes poi notes.
     * 
     * @param poiNotes
     */

    public void setPoiNotes(String poiNotes) {
        this.poiNotes = poiNotes;
    }

    public PersonOfInterest(String fname, String lname, String age, String height, String weight, String gender,
            String address, String phone, String dateOfBirth, boolean isAdult, String occupation, String lastLocation,
            long ID, String race, String Notes, String hairColor) {
        super(fname, lname, age, height, weight, gender, address, phone, dateOfBirth, isAdult, ID, race);
        this.occupation = occupation;
        this.lastLocation = lastLocation;
        this.poiNotes = Notes;
        this.hairColor = hairColor;

    }

    /**
     * Gets the hair color for poi.
     * 
     * @return this poi hair color
     */

    public String getHairColor() {
        return this.hairColor;
    }

    /**
     * Changes poi hair color.
     * 
     * @param hairColor
     */

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    /**
     * Gets the occupation for poi.
     * 
     * @return this poi occupation.
     */

    public String getOccupation() {
        return occupation;
    }

    /**
     * Changes poi occupation.
     * 
     * @param occupation
     */

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

     /**
     * Gets the notes for poi.
     * 
     * @return this poi notes.
     */

    public String getpoiNotes() {
        return poiNotes;
    }

    /**
     * Changes poi notes.
     * 
     * @param poiNotes
     */

    public void setpoiNotes(String poiNotes) {
        this.poiNotes = poiNotes;
    }

     /**
     * Gets the last location for poi.
     * 
     * @return this poi last location.
     */

    public String getLastLocation() {
        return lastLocation;
    }

    /**
     * Changes poi last location.
     * 
     * @param lastLocation
     */

    public void setLastLocation(String lastLocation) {
        this.lastLocation = lastLocation;
    }

}

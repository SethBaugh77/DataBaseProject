
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
 * Constructor to create a PersonOfInterest
 * @param fname first name of POI
 * @param lname last name of POI
 * @param age age of POI
 * @param height height of POI
 * @param weight weight of POI
 * @param gender gender of POI
 * @param address address of POI
 * @param phone phone number of POI
 * @param dateOfBirth DOB of POI
 * @param isAdult true/false are they an adult
 * @param occupation occupation of POI
 * @param lastLocation lastLocation of POI
 * @param ID unique identifier of POI
 * @param race race of POI
 * @param Notes additional notes for POI
 * @param hairColor hairColor of POI
 */
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

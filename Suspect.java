
import java.util.ArrayList;

import javax.swing.text.StringContent;

/**
 * Class to represent a Suspect kind of person.
 * @author Sophie Bacon
 */
public class Suspect extends PersonOfInterest {
    private String bodyType;
    private boolean isCriminal;

    /**
 * Constructor to create a Suspect
 * @param fname first name of Suspect
 * @param lname last name of Suspect
 * @param age age of Suspect
 * @param height height of Suspect
 * @param weight weight of Suspect
 * @param gender gender of Suspect
 * @param address address of Suspect
 * @param phone phone number of Suspect
 * @param dateOfBirth DOB of Suspect
 * @param isAdult true/false are they an adult
 * @param occupation occupation of Suspect
 * @param lastLocation lastLocation of Suspect
 * @param ID unique identifier of Suspect
 * @param race race of Suspect
 * @param Notes additional notes for Suspect
 * @param hairColor hairColor of Suspect
 * @param bodyType bodyType of Suspect
 * @param isCriminal true/false are they already a criminal
 */
    public Suspect(String fname, String lname, String age, String height, String weight, String gender, String address,
            String phone, String dateOfBirth, boolean isAdult, long id, String occupation, String lastLocation,
            String bodyType, boolean isCriminal, String race, String Notes, String hairColor) {
        super(fname, lname, age, height, weight, gender, address, phone, dateOfBirth, isAdult, occupation, lastLocation,
                id, race, Notes, hairColor);
        this.bodyType = bodyType;
        this.isCriminal = isCriminal;
        this.hairColor = hairColor;

    }

    /**
     * Getter to return isCriminal
     * @return this.isCriminal
     */
    public boolean isIsCriminal() {
        return this.isCriminal;
    }

    /**
     * Gets the body type.
     * 
     * @return this body type.
     */
    public String getBodyType() {
        return this.bodyType;
    }

    /**
     * Changes body type.
     * 
     * @param string
     */
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    /**
     * Gets the criminal status.
     * 
     * @return this status.
     */
    public boolean getIsCriminal() {
        return this.isCriminal;
    }

    /**
     * Changes criminal status.
     * 
     * @param boolean
     */
    public void setIsCriminal(boolean isCriminal) {
        this.isCriminal = isCriminal;
    }

}

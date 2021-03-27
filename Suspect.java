
import java.util.ArrayList;

import javax.swing.text.StringContent;

public class Suspect extends PersonOfInterest {
    private String bodyType;
    private boolean isCriminal;
    

    // 
   // ArrayList<Suspect> relatives = new ArrayList<Suspect>();

    public Suspect(String fname, String lname, String age, String height, String weight, String gender, String address,
            String phone, String dateOfBirth, boolean isAdult, long id, String occupation,String lastLocation, String bodyType, boolean isCriminal, String race,String Notes, String hairColor) {
        super(fname, lname, age, height, weight, gender, address, phone, dateOfBirth, isAdult, occupation, lastLocation, id, race,Notes, hairColor);
        this.bodyType = bodyType;
        this.isCriminal = isCriminal;
        this.hairColor = hairColor;
        //this.relatives = relatives;
    }
    public boolean isIsCriminal() {
        return this.isCriminal;
    }

    // 

    /**
    * Gets the body type.
    * @return this body type.
    */
    public String getBodyType() {
        return this.bodyType;
    }

    /**
   	* Changes body type.
 	* @param string
	*/
    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    /**
    * Gets the criminal status.
    * @return this status.
    */
    public boolean getIsCriminal() {
        return this.isCriminal;
    }

    /**
   	* Changes criminal status.
 	* @param boolean
	*/
    public void setIsCriminal(boolean isCriminal) {
        this.isCriminal = isCriminal;
    }

}

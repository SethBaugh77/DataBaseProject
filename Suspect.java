
import java.util.ArrayList;

public class Suspect extends PersonOfInterest {
    protected String bodyType;
    protected boolean isCriminal;
   // ArrayList<Suspect> relatives = new ArrayList<Suspect>();

    public Suspect(String fname, String lname, long age, long height, long weight, String gender, String address,
            String phone, String dateOfBirth, boolean isAdult, long id, String occupation,String lastLocation, String bodyType, boolean isCriminal, String race,String Notes ,String tatoos) {
        super(fname, lname, age, height, weight, gender, address, phone, dateOfBirth, isAdult, occupation, lastLocation, id, race,Notes ,tatoos);
        this.bodyType = bodyType;
        this.isCriminal = isCriminal;
        //this.relatives = relatives;
    }

    public String getBodyType() {
        return this.bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public boolean getIsCriminal() {
        return this.isCriminal;
    }

    public void setIsCriminal(boolean isCriminal) {
        this.isCriminal = isCriminal;
    }

}

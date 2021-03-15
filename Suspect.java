

import java.util.ArrayList;

public class Suspect extends PersonOfInterest{
    protected String bodyType;
    protected boolean isCriminal;
    ArrayList<Suspect> relatives = new ArrayList<Suspect>();

    public Suspect(String name, int age, int height, int weight, 
    String gender, String address, String phone, String dateOfBirth, 
    boolean isAdult, int id, String occupation, String crimeConnectionString, 
    String lastLocation, String bodyType, boolean isCriminal, ArrayList<Suspect> relatives) {
        super( name,  age,  height,  weight, 
        gender,  address,  phone,  dateOfBirth, 
         isAdult,  id,  occupation,  crimeConnectionString, 
         lastLocation);
         this.bodyType = bodyType;
         this.isCriminal = isCriminal;
         this.relatives = relatives;
    }

    public String getBodyType() {
        return bodyType;
    }

    public boolean getIsCriminal() {
        return isCriminal;
    }
     
    // get relatives String[]

    public void setBodyType() {

    }
    
    public void setIsCriminal() {

    }

    // set relatives

}

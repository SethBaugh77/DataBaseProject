package groupproj;

import java.util.ArrayList;

public class Suspect {
    protected String bodyType;
    protected boolean isCriminal;
    ArrayList<Suspect> relatives = new ArrayList<Suspect>();

    public Suspect() {

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

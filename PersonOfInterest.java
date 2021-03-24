
public class PersonOfInterest extends Person {
    protected String occupation;
    protected String lastLocation;
    protected String poiNotes;

    public PersonOfInterest(String fname, String lname, long age, long height, long weight, String gender, String address,
            String phone, String dateOfBirth, boolean isAdult, String occupation, String lastLocation, long ID) {
        super(fname, lname, age, height, weight, gender, address, phone, dateOfBirth, isAdult, ID);
        this.occupation = occupation;
        this.lastLocation = lastLocation;
        this.poiNotes = poiNotes;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getpoiNotes() {
        return poiNotes;
    }

    public void setpoiNotes(String poiNotes) {
        this.poiNotes = poiNotes;
    }

    public String getLastLocation() {
        return lastLocation;
    }

    public void setLastLocation(String lastLocation) {
        this.lastLocation = lastLocation;
    }

}

package groupproj;

public class PersonOfInterest extends Person {
    private String occupation;
    private String crimeConnection;
    private String lastLocation;

    public PersonOfInterest(String name, int age, int height, int weight, 
    String gender, String address, String phone, String dateOfBirth, 
    boolean isAdult, int id, String occupation, String crimeConnectionString, 
    String lastLocation)
    {
        super(name, age, height, weight, gender, address, phone, dateOfBirth,
        isAdult, id);
        this.occupation = occupation;
        this.lastLocation = lastLocation;
        this.crimeConnection = crimeConnection;

    }
    public String getOccupation()
    {
        return occupation;
    }
    public String getCrimeConnection()
    {
        return crimeConnection;
    }
    public String getLastLocation()
    {
        return lastLocation;
    }
    
}

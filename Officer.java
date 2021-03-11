package groupproj;

public class Officer extends Person {
    private int badgeNumber;
    private String officerRank;
    private String officerStatement;

    public Officer(String name, int age, int height, int weight, 
    String gender, String address, String phone, String dateOfBirth, 
    boolean isAdult, int id, int badgeNumber,
    String officerRank, String officerStatement) 
    {
        super(name, age, height, weight, gender, address, phone, dateOfBirth,
        isAdult, id);
        this.badgeNumber = badgeNumber;
        this.officerRank = officerRank;
        this.officerStatement = officerStatement;
    }
    public int getBadgeNumber()
    {
        return badgeNumber;
    }
    public String getOfficerRank()
    {
        return officerRank;
    }
    public String getOfficerStatement()
    {
        return officerStatement;
    }
}

/**
 * Class to represent an Officer kind of Person.
 * @author Sophie Bacon
 */
public class Officer extends Person {
    private String badgeNumber;
    private String officerRank;
    private String officerStatement;

    /**
     * Constructor to create an Officer kind of person and sets its attributes to inputted values.
     * @param bnum badgeNumber of Officer
     * @param officerRank Rank of Officer
     * @param officerState Officer Statement
     * @param fName first name of Officer
     * @param lname last name of Officer
     * @param Age Age of Officer
     * @param Height Height of Officer
     * @param Weight Weight of Officer
     * @param Gender Gender of Officer
     * @param Address address of Officer
     * @param Phone phone number of Officer
     * @param DateOfBirth DOB of Officer
     * @param IsAdult true/false are they an adult
     * @param id unique ID of Officer
     * @param race race of Officer
     */
    public Officer(String bnum, String officerRank, String officerState, String fName, String lname, String Age,
            String Height, String Weight, String Gender, String Address, String Phone, String DateOfBirth,
            boolean IsAdult, long id, String race) {
        super(fName, lname, Age, Height, Weight, Gender, Address, Phone, DateOfBirth, IsAdult, id, race);
        badgeNumber = bnum;
        this.officerRank = officerRank;
        this.officerStatement = officerState;
    }

    /**
     * Gets the badge number of the officer.
     * 
     * @return this officer badge number.
     */
    public String getBadgeNumber() {
        return this.badgeNumber;
    }

    /**
     * Changes badge number .
     * 
     * @param int
     */
    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    /**
     * Gets the Officer rank.
     * 
     * @return this Officer rank.
     */
    public String getOfficerRank() {
        return this.officerRank;
    }

    /**
     * Changes officer rank.
     * 
     * @param string
     */
    public void setOfficerRank(String officerRank) {
        this.officerRank = officerRank;
    }

    /**
     * Gets the officer's statement.
     * 
     * @return this officer's statement.
     */
    public String getOfficerStatement() {
        return this.officerStatement;
    }

    /**
     * Changes in officer statement.
     * 
     * @param string
     */
    public void setOfficerStatement(String officerStatement) {
        this.officerStatement = officerStatement;
    }
}

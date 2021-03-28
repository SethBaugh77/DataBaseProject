public class Officer extends Person {
    private String badgeNumber;
    private String officerRank;
    private String officerStatement;

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

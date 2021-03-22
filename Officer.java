public class Officer extends Person {
    protected long badgeNumber;
    protected String officerRank;
    protected String officerStatement;

    public Officer(long bnum, String officerRank, String officerState, String fName, String lname, long Age, long Height,
            long Weight, String Gender, String Address, String Phone, String DateOfBirth, boolean IsAdult, long id) {
        super(fName, lname, Age, Height, Weight, Gender, Address, Phone, DateOfBirth, IsAdult, id);
        badgeNumber = bnum;
        this.officerRank = officerRank;
        this.officerStatement = officerState;
    }

    public long getBadgeNumber() {
        return this.badgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getOfficerRank() {
        return this.officerRank;
    }

    public void setOfficerRank(String officerRank) {
        this.officerRank = officerRank;
    }

    public String getOfficerStatement() {
        return this.officerStatement;
    }

    public void setOfficerStatement(String officerStatement) {
        this.officerStatement = officerStatement;
    }
}

public class Officer extends Person {
    protected int badgeNumber;
    protected String officerRank;
    protected String officerStatement;

    public Officer(int bnum, String officerRank, String officerState, String Name, int Age,int Height,int Weight, String Gender,String Address,
    String Phone, String DateOfBirth,boolean IsAdult,int id) {
        super(Name, Age, Height, Weight,  Gender,Address,
        Phone,  DateOfBirth, IsAdult, id);
        badgeNumber = bnum;
        this.officerRank = officerRank;
        this.officerStatement = officerState;
    }

    public int getBadgeNumber() {
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

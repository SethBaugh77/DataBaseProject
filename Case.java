import java.util.ArrayList;

public class Case {
    private int CaseID;
    private ArrayList<Criminal> criminals = new ArrayList<Criminal>();
    private ArrayList<Victim> victims = new ArrayList<Victim>();
    private ArrayList<Witness> witnesses = new ArrayList<Witness>(); // -CaseID: int
    private ArrayList<Officer> officers = new ArrayList<Officer>();
    private ArrayList<PersonOfInterest> poi = new ArrayList<PersonOfInterest>();
    private String crime;
    private String date;
    private boolean isSolved;
    private int severity;
    private boolean isFederal;

    Case(ArrayList<Criminal> Criminals, ArrayList<Victim> Victims, ArrayList<Witness> Witnesses,
            ArrayList<Officer> Officers, ArrayList<String> poi, int _CaseID, String crime, String date,
            boolean isSolved, int _Severity, boolean isFederal) {

    }

    public String getCrime() {
        return this.crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean getIsSolved() {
        return this.isSolved;
    }

    public void setIsSolved(boolean isSolved) {
        this.isSolved = isSolved;
    }

    public int getSeverity() {
        return this.severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public boolean getIsFederal() {
        return this.isFederal;
    }

    public void setIsFederal(boolean isFederal) {
        this.isFederal = isFederal;
    }

}

// + case(criminal[],String[],String,String,boolean,int,boolean)
// + getCriminals():ArrayList<Criminal>
// + getVictims():ArrayList<Victim>
// + getWitnesses():ArrayList<Witness>
// + getOfficers():ArrayList<Officer>
// + getPOI():ArrayList<String>
// + getCrime():String
// + getDate():String
// + getSolved():boolean
// + getSeverity(): int
// + setCriminals(criminal[]):void
// + setPOI(String[]):void
// + setCrime(String):void
// + setDate(String):void
// + setSolved(boolean):void
// + setSeverity(int):void
// + setFederal(boolean):void

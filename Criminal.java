import java.util.ArrayList;

public class Criminal extends Person {
    private boolean inJail;
    private String notes;
    private long numCrimes;

    public Criminal(String fname, String lname, long Age, double Height, double Weight, String Gender, String Address,
            String Phone, String DateOfBirth, boolean IsAdult, boolean inJail, String notes, long numCrimes) {
        super(fname, lname, Age, Height, Weight, Gender, Address, Phone, DateOfBirth, IsAdult);
        this.inJail = inJail;
        this.notes = notes;
        this.numCrimes = numCrimes;
    }

    public boolean getJail() {
        return inJail;
    }

    public void setJail(boolean inJail) {
        this.inJail = true;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public long getNumCrimes() {
        return numCrimes;
    }

    public void setNumCrimes(ArrayList<Case> cases) {
        for (Case caseCheck : cases) {
            if (caseCheck.getCriminals() != null && caseCheck.getCriminals().contains(this.getFname()) && caseCheck.getCriminals().contains(this.getLname())) {
                numCrimes++;
            }
        }
    }
}

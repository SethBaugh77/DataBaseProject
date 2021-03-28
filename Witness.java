
public class Witness extends Person {
    private String witnessStatement;

    public Witness(String witnessState, String fName, String lname, String Age, String Height, String Weight,
            String Gender, String Address, String Phone, String DateOfBirth, boolean IsAdult, long id, String race) {
        super(fName, lname, Age, Height, Weight, Gender, Address, Phone, DateOfBirth, IsAdult, id, race);
        this.witnessStatement = witnessState;

    }

    public String getWitnessStatement() {
        return witnessStatement;
    }

    public void setWitnessStatement(String witState) {
        this.witnessStatement = witState;
    }
}


public class Witness extends Person {
    protected String witnessStatement;

    public Witness(String witnessState, String fName, String lname, long Age, long Height, long Weight, String Gender,
            String Address, String Phone, String DateOfBirth, boolean IsAdult, long id, String race) {
        super(fName, lname, Age, Height, Weight, Gender, Address, Phone, DateOfBirth, IsAdult, id,race);
        this.witnessStatement = witnessState;

    }

    public String getWitnessStatement() {
        return witnessStatement;
    }

    public void setWitnessStatement(String witState) {
        this.witnessStatement = witState;
    }
}

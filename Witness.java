

public class Witness extends Person{
    protected String witnessStatement;

    public Witness(String witnessState, String Name, int Age,int Height,int Weight, String Gender,String Address,
    String Phone, String DateOfBirth,boolean IsAdult,int id) {
        super(Name, Age, Height, Weight,  Gender,Address,
        Phone,  DateOfBirth, IsAdult, id);
        this.witnessStatement = witnessState;

    }
    public String getWitnessStatement()
	{
		return witnessStatement;
    }
    
    public void setWitnessStatement(String witState)
	{
		this.witnessStatement = witState;
	}
}

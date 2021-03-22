
public class Victim extends Person {
	protected String victimStatement;
	protected boolean isHealthy;


	public Victim(boolean isHealthy, String victimState,  String fName,String lName ,long Age, long Height,
			long Weight, String Gender, String Address, String Phone, String DateOfBirth, boolean IsAdult, long id) {

		super(fName,lName ,Age, Height, Weight, Gender, Address, Phone, DateOfBirth, IsAdult, id);
		this.victimStatement = victimState;
		this.isHealthy = isHealthy;
	}

	public String getVictimStatement() {

		return victimStatement;
	}

	public void setVictimStatement(String victimstatement) {

		this.victimStatement = victimstatement;
	}

	public boolean isIsHealthy() {
		return this.isHealthy;
	}

	public boolean getIsHealthy() {
		return this.isHealthy;
	}

	public void setIsHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}

}

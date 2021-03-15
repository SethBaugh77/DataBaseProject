
public class Victim extends Person {
	protected String victimStatement;
	protected boolean isHealthy;

	public Victim(boolean isHealthy, String victimState, String witnessState, String Name, int Age, int Height,
			int Weight, String Gender, String Address, String Phone, String DateOfBirth, boolean IsAdult, int id) {

		super(Name, Age, Height, Weight, Gender, Address, Phone, DateOfBirth, IsAdult, id);
				this.victimStatement = victimState;
				this.isHealthy = isHealthy;
	}

	public String getVictimStatement() {

		return victimStatement;
	}

	public void setVictimStatement(String victimstatement) {

		this.victimStatement = victimstatement;
	}
}

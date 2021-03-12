
public class Victim {
	protected String victimStatement;
	protected boolean isHealthy;
    private String name;
    private int age;
    private double height;
    private double weight;
    private String gender;
    private String dateOfBirth;
    private boolean isAdult;
	
	public Victim(String Name, int Age,double Height, double Weight, String Gender,
			String DateOfBirth,boolean IsAdult,boolean isHealthy) {
		this.name = Name;
		this.age = Age;
		this.height = Height;
		this.weight = Weight;
		this.gender = Gender;
		this.dateOfBirth =DateOfBirth;
		this.isAdult=IsAdult;
		this.isHealthy = isHealthy;
		
	}
	public String getVictimStatement()
	{
		return victimStatement;
    }
    
    public void setVictimStatement(String victimstatement)
	{
		victimStatement = victimstatement;
	}
}
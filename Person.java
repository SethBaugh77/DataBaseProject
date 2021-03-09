
public class Person {
	protected String name;
	protected int age ;
	protected int height;
	protected int weight;
	protected String gender;
	protected String  address;
	protected String phone;
	protected String dateOfBirth;
	protected boolean isAdult;
	protected int ID;
	
	public Person(String Name, int Age,int Height,int Weight, String Gender,String Address,
			String Phone, String DateOfBirth,boolean IsAdult,int id) {
		this.name = Name;
		this.age = Age;
		this.height = Height;
		this.weight = Weight;
		this.gender = Gender;
		this.address = Address;
		this.phone = Phone;
		this.dateOfBirth =DateOfBirth;
		this.isAdult=IsAdult;
		this.ID=id;
		
	}
	public String toString()
	{
		return name+" "+age+" "+height+" "+weight+" "+gender+" "+ address +" "+phone+" "+dateOfBirth+" "+isAdult+" "+ID;
	}
}

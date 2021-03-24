
public class Person {
	protected String fname;
	protected String lname;
	protected long age;
	protected long height;
	protected long weight;
	protected String gender;
	protected String address;
	protected String phone;
	protected String dateOfBirth;
	protected boolean isAdult;
	protected long ID;

	public String getFname() {
		return this.fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return this.lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getAge() {
		return this.age;
	}

	public void setAge(long age) {
		this.age = age;
	}

	public long getHeight() {
		return this.height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public long getWeight() {
		return this.weight;
	}

	public void setWeight(long weight) {
		this.weight = weight;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isIsAdult() {
		return this.isAdult;
	}

	public boolean getIsAdult() {
		return this.isAdult;
	}

	public void setIsAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}

	public long getID() {
		return this.ID;
	}

	public void setID(long ID) {
		this.ID = ID;
	}

	public Person(String fName, String lname, long Age, long Height, long Weight, String Gender, String Address,
			String Phone, String DateOfBirth, boolean IsAdult,long ID) {
		this.fname = fName;
		this.lname = lname;
		this.age = Age;
		this.height = Height;
		this.weight = Weight;
		this.gender = Gender;
		this.address = Address;
		this.phone = Phone;
		this.dateOfBirth = DateOfBirth;
		this.isAdult = IsAdult;
		this.ID = ID;
		

	}

	public String toString() {
		return fname + " " + lname + " " + age + " " + height + " " + weight + " " + gender + " " + address + " "
				+ phone + " " + dateOfBirth + " " + isAdult + " " + ID;
		
	}
}

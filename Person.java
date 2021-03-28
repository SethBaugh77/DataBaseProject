/**
 * Class to represent a Person Class.
 * @author Jonathan Brown
 */
public class Person {
	protected String fname;
	protected String lname;
	protected String age;
	protected String height;
	protected String weight;
	protected String gender;
	protected String address;
	protected String phone;
	protected String dateOfBirth;
	protected boolean isAdult;
	protected long ID;
	protected String race;
/**
 * Normal constructor to create a null Person.
 */
	public Person() {

	}

	/**
	 * Constructor to create a Person and sets its indicated values
	 * @param fName first name of Person
	 * @param lname last name of Person
	 * @param Age Age of Person
	 * @param Height Height of Person
	 * @param Weight Weight of Person
	 * @param Gender Gender of Person
	 * @param Address Address of Person
	 * @param Phone Phone number of Person
	 * @param DateOfBirth DOB of Person
	 * @param IsAdult true/false are they an adult
	 * @param ID unique identifier of Person
	 * @param race race of Person
	 */
	public Person(String fName, String lname, String Age, String Height, String Weight, String Gender, String Address,
			String Phone, String DateOfBirth, boolean IsAdult, long ID, String race) {
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
		this.race = race;
		

	}

	/**
	 * Gets the race of the person.
	 * 
	 * @return this race.
	 */
	public String getRace() {
		return this.race;
	}

	/**
	 * Changes race.
	 * 
	 * @param string
	 */
	public void setRace(String race) {
		this.race = race;
	}

	/**
	 * Gets the first name of the person.
	 * 
	 * @return this first name.
	 */
	public String getFname() {
		return this.fname;
	}

	/**
	 * Changes first name.
	 * 
	 * @param string
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * Gets the last name of the person.
	 * 
	 * @return this last name.
	 */
	public String getLname() {
		return this.lname;
	}

	/**
	 * Changes last name.
	 * 
	 * @param string
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}

	/**
	 * Gets the age of the person.
	 * 
	 * @return this age.
	 */
	public String getAge() {
		return this.age;
	}

	/**
	 * Changes age.
	 * 
	 * @param String
	 */
	public void setAge(String age) {
		this.age = age;
	}

	/**
	 * Gets the height of the person.
	 * 
	 * @return this height.
	 */
	public String getHeight() {
		return this.height;
	}

	/**
	 * Changes height.
	 * 
	 * @param String
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * Gets the weight of the person.
	 * 
	 * @return this weight.
	 */
	public String getWeight() {
		return this.weight;
	}

	/**
	 * Changes weight.
	 * 
	 * @param String
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}

	/**
	 * Gets the gender of the person.
	 * 
	 * @return this gender.
	 */
	public String getGender() {
		return this.gender;
	}

	/**
	 * Changes gender.
	 * 
	 * @param string
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * Gets the address of the person.
	 * 
	 * @return this address.
	 */
	public String getAddress() {
		return this.address;
	}

	/**
	 * Changes address.
	 * 
	 * @param string
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the phone of the person.
	 * 
	 * @return this phone.
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * Changes phone.
	 * 
	 * @param string
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the date of birth of the person.
	 * 
	 * @return this date of birth
	 */
	public String getDateOfBirth() {
		return this.dateOfBirth;
	}

	/**
	 * Changes date of birth.
	 * 
	 * @param string
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean isIsAdult() {
		return this.isAdult;
	}

	/**
	 * Gets the status of age of the person.
	 * 
	 * @return this status of age.
	 */
	public boolean getIsAdult() {
		return this.isAdult;
	}

	/**
	 * Changes age status.
	 * 
	 * @param boolean
	 */
	public void setIsAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}

	/**
	 * Gets the ID of the person.
	 * 
	 * @return this ID.
	 */
	public long getID() {
		return this.ID;
	}

	/**
	 * Changes ID.
	 * 
	 * @param String
	 */
	public void setID(long ID) {
		this.ID = ID;
	}

}

import java.util.*;

public class DataBase {
	public static DataBase getInstance() {
		if (dbase == null)
			dbase = new DataBase();
		return dbase;
	}

	static private DataBase dbase;
	private ArrayList<Criminal> criminals = new ArrayList<Criminal>();
	private ArrayList<Case> cases = new ArrayList<Case>();
	private ArrayList<User> users = new ArrayList<User>();
	private ArrayList<Victim> victims = new ArrayList<Victim>();
	private ArrayList<Witness> witnesses = new ArrayList<Witness>();
	private ArrayList<Officer> officers = new ArrayList<Officer>();
	private ArrayList<PersonOfInterest> POI = new ArrayList<PersonOfInterest>();
	private ArrayList<Suspect> suspects = new ArrayList<Suspect>();
	private DataBase()
	{
		criminals=DataLoader.loadCriminal();
		POI = DataLoader.loadPOI();
		officers = DataLoader.loadOfficer();
		suspects = DataLoader.loadSuspect();
		witnesses = DataLoader.loadWitness();
		victims = DataLoader.loadVictim();
		users =DataLoader.loadUsers();
		// witnesses=DataLoader.loadWitness();
		// suspects=DataLoader.loadSuspect();
		// officers=DataLoader.loadOfficer();
		// POI=DataLoader.loadPOI();
		// victims=DataLoader.loadVictim();
		// dbase.cases = DataLoader.loadCases();
		// dbase.users = DataLoader.loadUsers();


	}

	public ArrayList<Criminal> getCriminals() {
		this.criminals = this.criminals;
		return this.criminals;
		
	}

	public void setCriminals(ArrayList<Criminal> criminals) {
		this.criminals = criminals;
	}

	public ArrayList<Case> getCases() {
		return this.cases;
	}

	public void setCases(ArrayList<Case> cases) {
		this.cases = cases;
	}

	public ArrayList<User> getUsers() {
		return this.users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public ArrayList<Victim> getVictims() {
		return this.victims;
	}

	public void setVictims(ArrayList<Victim> victims) {
		this.victims = victims;
	}

	public ArrayList<Witness> getWitnesses() {
		return this.witnesses;
	}

	public void setWitnesses(ArrayList<Witness> witnesses) {
		this.witnesses = witnesses;
	}

	public ArrayList<Officer> getOfficers() {
		return this.officers;
	}

	public void setOfficers(ArrayList<Officer> officers) {
		this.officers = officers;
	}

	public ArrayList<PersonOfInterest> getPOI() {
		return this.POI;
	}

	public void setPOI(ArrayList<PersonOfInterest> POI) {
		this.POI = POI;
	}

	public ArrayList<Suspect> getSuspects() {
		return this.suspects;
	}

	public void setSuspects(ArrayList<Suspect> suspects) {
		this.suspects = suspects;
	}

	public void printData() {

		System.out.print("Person of Interst");

		for (String data : POI) {

			System.out.print(data);
		}

		for (String data : suspects) {

			System.out.println(data);
		}

		for (Criminal data : criminals) {

			System.out.println(data);
		}

		for (Case data : cases) {

			System.out.print(data);
		}

		for (User data : users) {

			System.out.println(data);
		}

		for (Victim data : victims) {

			System.out.println(data);

		}

		for (Witness data : witnesses) {

			System.out.println(data);

		}

		for (Officer data : officers) {

			System.out.println(data);

		}

	}

}

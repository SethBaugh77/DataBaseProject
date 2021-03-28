import java.util.*;

 /**
  * DataBase
  * @return this dbase.
  */
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
	private ArrayList<Evidence> evidence = new ArrayList<Evidence>();

	private DataBase() {
		criminals = DataLoader.loadCriminal();
		POI = DataLoader.loadPOI();
		officers = DataLoader.loadOfficer();
		suspects = DataLoader.loadSuspect();
		witnesses = DataLoader.loadWitness();
		victims = DataLoader.loadVictim();
		users = DataLoader.loadUsers();
		cases = DataLoader.loadCases();
		evidence = DataLoader.loadEvidence();

	}

	 /**
   	* Gets the evidence.
   	* @return this evidence.
   	*/
	public ArrayList<Evidence> getEvidence() {
		return this.evidence;
	}

	 /**
   	* Changes the evidence.
   	* @param arraylist evidence.  
   	*/
	public void setEvidence(ArrayList<Evidence> evidence) {
		this.evidence = evidence;
	}

	 /**
   	* Gets the criminal.
   	* @return this criminal.
   	*/
	public ArrayList<Criminal> getCriminals() {

		return this.criminals;
	}

	 /**
   	* Changes the criminal.
   	* @param arraylist criminal.  
   	*/
	public void setCriminals(ArrayList<Criminal> criminals) {
		this.criminals = criminals;
	}

	 /**
   	* Gets the case.
   	* @return this case.
   	*/
	public ArrayList<Case> getCases() {
		return this.cases;
	}

	 /**
   	* Changes the case.
   	* @param arraylist case.  
   	*/
	public void setCases(ArrayList<Case> cases) {
		this.cases = cases;
	}

	 /**
   	* Gets the user.
   	* @return this user.
   	*/
	public ArrayList<User> getUsers() {
		return this.users;
	}

	 /**
   	* Changes the users.
   	* @param arraylist users.  
   	*/
	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	 /**
   	* Gets the victim.
   	* @return this victim.
   	*/
	public ArrayList<Victim> getVictims() {
		return this.victims;
	}

	 /**
   	* Changes the victim.
   	* @param arraylist victim.  
   	*/
	public void setVictims(ArrayList<Victim> victims) {
		this.victims = victims;
	}

	 /**
   	* Gets the witness.
   	* @return this witness.
   	*/
	public ArrayList<Witness> getWitnesses() {
		return this.witnesses;
	}

	 /**
   	* Changes the witness.
   	* @param arraylist witness.  
   	*/
	public void setWitnesses(ArrayList<Witness> witnesses) {
		this.witnesses = witnesses;
	}

	 /**
   	* Gets the officers.
   	* @return this officer.
   	*/
	public ArrayList<Officer> getOfficers() {
		return this.officers;
	}

	 /**
   	* Changes the officers.
   	* @param arraylist officer.  
   	*/
	public void setOfficers(ArrayList<Officer> officers) {
		this.officers = officers;
	}

	 /**
   	* Gets the POI.
   	* @return this POI.
   	*/
	public ArrayList<PersonOfInterest> getPOI() {
		return this.POI;
	}

	 /**
   	* Changes the POI.
   	* @param arraylist POI.  
   	*/
	public void setPOI(ArrayList<PersonOfInterest> POI) {
		this.POI = POI;
	}

	 /**
   	* Gets the suspect.
   	* @return this suspect.
   	*/
	public ArrayList<Suspect> getSuspects() {
		return this.suspects;
	}

	 /**
   	* Changes the suspect.
   	* @param arraylist suspect.  
   	*/
	public void setSuspects(ArrayList<Suspect> suspects) {
		this.suspects = suspects;
	}

}

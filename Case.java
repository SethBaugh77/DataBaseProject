import java.util.ArrayList;

public class Case {
	private long CaseID;
	private ArrayList<Long> criminals = new ArrayList<Long>();
	private ArrayList<Long> victims = new ArrayList<Long>();
	private ArrayList<Long> witnesses = new ArrayList<Long>(); // -CaseID: int
	private ArrayList<Long> officers = new ArrayList<Long>();
	private ArrayList<Long> poi = new ArrayList<Long>();
	private ArrayList<Long> suspects = new ArrayList<Long>();
	private ArrayList<Long> evidence = new ArrayList<Long>();

	private String name;
	private String crime;
	private String date;
	private boolean isSolved;
	private long severity;
	private boolean isFederal;

	public Case()
	{
		
	}
	public Case(String name, String crime, String date, boolean isSolved, long severity, boolean isFederal, long ID,
			ArrayList<Long> criminals, ArrayList<Long> victims, ArrayList<Long> witnesses, ArrayList<Long> officers,
			ArrayList<Long> poi, ArrayList<Long> suspects) {
		this.name = name;
		this.crime = crime;
		this.date = date;
		this.isSolved = isSolved;
		this.severity = severity;
		this.isFederal = isFederal;
		this.CaseID = ID;
		this.criminals = criminals;
		this.victims = victims;
		this.witnesses = witnesses;
		this.officers = officers;
		this.poi = poi;
		this.suspects = suspects;

	}

	public ArrayList<Long> getEvidence() {
		return this.evidence;
	}

	public void setEvidence(ArrayList<Long> evidence) {
		this.evidence = evidence;
	}

	public ArrayList<Long> getSuspects() {
		return this.suspects;
	}

	public void setSuspects(ArrayList<Long> suspects) {
		this.suspects = suspects;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isIsSolved() {
		return this.isSolved;
	}

	public boolean isIsFederal() {
		return this.isFederal;
	}



	public long getCaseID() {
		return CaseID;
	}

	public void setCaseID(int caseID) {
		CaseID = caseID;
	}

	public ArrayList<Long> getCriminals() {
		return criminals;
	}

	public void setCriminals(ArrayList<Long> criminals) {
		this.criminals = criminals;
	}

	public ArrayList<Long> getVictims() {
		return victims;
	}

	public void setVictims(ArrayList<Long> victims) {
		this.victims = victims;
	}

	public ArrayList<Long> getWitnesses() {
		return witnesses;
	}

	public void setWitnesses(ArrayList<Long> witnesses) {
		this.witnesses = witnesses;
	}

	public ArrayList<Long> getOfficers() {
		return officers;
	}

	public void setOfficers(ArrayList<Long> officers) {
		this.officers = officers;
	}

	public ArrayList<Long> getPoi() {
		return poi;
	}

	public void setPoi(ArrayList<Long> poi) {
		this.poi = poi;
	}

	public void setSolved(boolean isSolved) {
		this.isSolved = isSolved;
	}

	public void setFederal(boolean isFederal) {
		this.isFederal = isFederal;
	}

	public String getCrime() {
		return this.crime;
	}

	public void setCrime(String crime) {
		this.crime = crime;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean getIsSolved() {
		return this.isSolved;
	}

	public void setIsSolved(boolean isSolved) {
		this.isSolved = isSolved;
	}

	public long getSeverity() {
		return this.severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	public boolean getIsFederal() {
		return this.isFederal;
	}

	public void setIsFederal(boolean isFederal) {
		this.isFederal = isFederal;
	}

}

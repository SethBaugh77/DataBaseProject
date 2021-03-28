import java.util.ArrayList;
/**
 * Class that holds all the attributes for any given case.
 * @author Nick Brady
 */
public class Case {
	private long CaseID;
	private ArrayList<Long> criminals = new ArrayList<Long>();
	private ArrayList<Long> victims = new ArrayList<Long>();
	private ArrayList<Long> witnesses = new ArrayList<Long>();
	private ArrayList<Long> officers = new ArrayList<Long>();
	private ArrayList<Long> poi = new ArrayList<Long>();
	private ArrayList<Long> suspects = new ArrayList<Long>();
	private ArrayList<Long> evidence = new ArrayList<Long>();

	private String name;
	private String crime;
	private String date;
	private boolean isSolved;
	private String severity;
	private boolean isFederal;

	/**
	 * normal constructor. Used to create a null Case.
	 */
	public Case() {

	}

	/**
	 * Parameterized constructor used to create a case with the inputed attributes.
	 * @param name of the case
	 * @param crime crimeType
	 * @param date the crime occured
	 * @param isSolved true/false
	 * @param severity 1-5
	 * @param isFederal true/false
	 * @param ID caseID
	 * @param criminals IDs of criminals related
	 * @param victims IDs of victims related
	 * @param witnesses IDs of witnesses related
	 * @param officers IDS of officers related
	 * @param poi IDs of poi related
	 * @param suspects IDs of suspects related
	 * @param evidence IDs of evidence related
	 */
	public Case(String name, String crime, String date, boolean isSolved, String severity, boolean isFederal, long ID,
			ArrayList<Long> criminals, ArrayList<Long> victims, ArrayList<Long> witnesses, ArrayList<Long> officers,
			ArrayList<Long> poi, ArrayList<Long> suspects, ArrayList<Long> evidence) {
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
		this.evidence = evidence;

	}

	/**
	 * Gets arraylist of evidence.
	 * @return this.evidence
	 */
	public ArrayList<Long> getEvidence() {
		return this.evidence;
	}

	/**
	 * sets this.evidence variable to parameter evidence
	 * @param evidence
	 */
	public void setEvidence(ArrayList<Long> evidence) {
		this.evidence = evidence;
	}

	/**
	 * Gets arraylist of suspects.
	 * @return this.suspects
	 */
	public ArrayList<Long> getSuspects() {
		return this.suspects;
	}

	/**
	 * sets this.suspects variable to parameter suspects
	 * @param evidence
	 */
	public void setSuspects(ArrayList<Long> suspects) {
		this.suspects = suspects;
	}

	/**
	 * Gets name of case
	 * @return this.name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * sets this.name variable to parameter name
	 * @param evidence
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets boolean of isSolved
	 * @return this.isSolved
	 */
	public boolean isIsSolved() {
		return this.isSolved;
	}

	/**
	 * Gets boolean of isFederal
	 * @return this.isFederal
	 */
	public boolean isIsFederal() {
		return this.isFederal;
	}

	/**
	 * Gets long of CaseID
	 * @return this.evidence
	 */
	public long getCaseID() {
		return CaseID;
	}

	/**
	 * sets this.ID variable to parameter ID
	 * @param evidence
	 */
	public void setCaseID(long caseID) {
		CaseID = caseID;
	}

	/**
	 * Gets arraylist of Criminals
	 * @return this.criminals
	 */
	public ArrayList<Long> getCriminals() {
		return criminals;
	}

	/**
	 * sets this.criminals variable to parameter criminals
	 * @param evidence
	 */
	public void setCriminals(ArrayList<Long> criminals) {
		this.criminals = criminals;
	}

	/**
	 * Gets arraylist of victims.
	 * @return this.victims
	 */
	public ArrayList<Long> getVictims() {
		return victims;
	}

	/**
	 * sets this.victims variable to parameter victims
	 * @param evidence
	 */
	public void setVictims(ArrayList<Long> victims) {
		this.victims = victims;
	}

	/**
	 * Gets arraylist of witnesses.
	 * @return this.witnesses
	 */
	public ArrayList<Long> getWitnesses() {
		return witnesses;
	}

	/**
	 * sets this.witnesses variable to parameter witnesses
	 * @param evidence
	 */
	public void setWitnesses(ArrayList<Long> witnesses) {
		this.witnesses = witnesses;
	}

	/**
	 * Gets arraylist of officers.
	 * @return this.officers
	 */
	public ArrayList<Long> getOfficers() {
		return officers;
	}

	/**
	 * sets this.officers variable to parameter officers
	 * @param evidence
	 */
	public void setOfficers(ArrayList<Long> officers) {
		this.officers = officers;
	}

	/**
	 * Gets arraylist of poi.
	 * @return this.poi
	 */
	public ArrayList<Long> getPoi() {
		return poi;
	}

	/**
	 * sets this.poi variable to parameter poi
	 * @param evidence
	 */
	public void setPoi(ArrayList<Long> poi) {
		this.poi = poi;
	}

	/**
	 * sets this.isSolved variable to parameter isSolved
	 * @param evidence
	 */
	public void setSolved(boolean isSolved) {
		this.isSolved = isSolved;
	}

	/**
	 * sets this.isFederal variable to parameter isFederal
	 * @param evidence
	 */
	public void setFederal(boolean isFederal) {
		this.isFederal = isFederal;
	}

	/**
	 * Gets getCrime method
	 * @return this.crime
	 */
	public String getCrime() {
		return this.crime;
	}

	/**
	 * sets this.crime variable to parameter crime
	 * @param evidence
	 */
	public void setCrime(String crime) {
		this.crime = crime;
	}

	/**
	 * Gets dataDate method
	 * @return this.date
	 */
	public String getDate() {
		return this.date;
	}

	/**
	 * sets this.date variable to parameter date
	 * @param evidence
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * Gets boolean of isSolved
	 * @return this.isSolved
	 */
	public boolean getIsSolved() {
		return this.isSolved;
	}

	/**
	 * sets this.isSolved variable to parameter isSolved
	 * @param evidence
	 */
	public void setIsSolved(boolean isSolved) {
		this.isSolved = isSolved;
	}

	/**
	 * Gets arraylist of evidence.
	 * @return this.evidence
	 */
	public String getSeverity() {
		return this.severity;
	}

	/**
	 * sets this.Severity variable to parameter severity
	 * @param evidence
	 */
	public void setSeverity(String severity) {
		this.severity = severity;
	}

	/**
	 * Gets arraylist of evidence.
	 * @return this.evidence
	 */
	public boolean getIsFederal() {
		return this.isFederal;
	}

	/**
	 * sets this.isFederal variable to parameter isFederal
	 * @param evidence
	 */
	public void setIsFederal(boolean isFederal) {
		this.isFederal = isFederal;
	}

}

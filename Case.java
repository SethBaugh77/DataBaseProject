
public class Case {
	 private int CaseID;
	    private ArrayList<Criminal> criminals = new ArrayList<Criminal>();
	    private ArrayList<Victim> victims = new ArrayList<Victim>();
	    private ArrayList<Witness> witnesses = new ArrayList<Witness>(); // -CaseID: int
	    private ArrayList<Officer> officers = new ArrayList<Officer>();
	    private ArrayList<PersonOfInterest> poi = new ArrayList<PersonOfInterest>();
	    private String crime;
	    private String date;
	    private boolean isSolved;
	    private int severity;
	    private boolean isFederal;

	    public Case(ArrayList<Criminal> Criminals, ArrayList<Victim> Victims, ArrayList<Witness> Witnesses,
	            ArrayList<Officer> Officers, ArrayList<String> poi, int _CaseID, String crime, String date,
	            boolean isSolved, int _Severity, boolean isFederal) {

	    }

	    public int getCaseID() {
			return CaseID;
		}

		public void setCaseID(int caseID) {
			CaseID = caseID;
		}

		public ArrayList<Criminal> getCriminals() {
			return criminals;
		}

		public void setCriminals(ArrayList<Criminal> criminals) {
			this.criminals = criminals;
		}

		public ArrayList<Victim> getVictims() {
			return victims;
		}

		public void setVictims(ArrayList<Victim> victims) {
			this.victims = victims;
		}

		public ArrayList<Witness> getWitnesses() {
			return witnesses;
		}

		public void setWitnesses(ArrayList<Witness> witnesses) {
			this.witnesses = witnesses;
		}

		public ArrayList<Officer> getOfficers() {
			return officers;
		}

		public void setOfficers(ArrayList<Officer> officers) {
			this.officers = officers;
		}

		public ArrayList<PersonOfInterest> getPoi() {
			return poi;
		}

		public void setPoi(ArrayList<PersonOfInterest> poi) {
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

	    public int getSeverity() {
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

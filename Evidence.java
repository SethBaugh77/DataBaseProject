 
	 /**
   	* a public class of evidence
   	* 
   	*/
public class Evidence {
	private long ID;

	private String vehicle;

	private String bloodEvidence;
	private String fingerprintEvidence;
	private String weaponEvidence;
	private String otherEvidence;

	 /**
   	* has the evidence 
   	*/
	public Evidence(long ID, String Vehicle, String bloodEvidence, String fingerPrintEvidence, String weaponEvidence,
			String otherEvidence) {
		this.ID = ID;
		this.vehicle = Vehicle;
		this.bloodEvidence = bloodEvidence;
		this.fingerprintEvidence = fingerPrintEvidence;
		this.weaponEvidence = weaponEvidence;
		this.otherEvidence = otherEvidence;
	}
 
	 /**
   	* Changes the ID.
   	* @param int ID.  
   	*/
	public void setID(long ID) {
		this.ID = ID;
	}

	 /**
   	* Gets the evidence.
   	* @return this evidence.
   	*/
	public String getOtherEvidence() {
		return this.otherEvidence;
	}

	 /**
   	* Changes the set other evidence.
   	* @param string evidence.  
   	*/
	public void setOtherEvidence(String otherEvidence) {
		this.otherEvidence = otherEvidence;
	}

	 /**
   	* Gets the ID.
   	* @return this ID.
   	*/
	public long getID() {
		return this.ID;
	}

	 /**
   	* Gets the vehicle.
   	* @return this vehicle.
   	*/
	public String getVehicle() {
		return vehicle;
	}

	 /**
   	* Changes the vehicle.
   	* @param string vehicle.  
   	*/
	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	 /**
   	* Gets the blood evidence.
   	* @return this blood evidence.
   	*/
	public String getBloodEvidence() {
		return bloodEvidence;
	}

	 /**
   	* Changes the blood evidence.
   	* @param string blood evidence.  
   	*/
	public void setBloodEvidence(String bloodEvidence) {
		this.bloodEvidence = bloodEvidence;
	}

	 /**
   	* Gets the finger print.
   	* @return this finger print.
   	*/
	public String getFingerprintEvidence() {
		return fingerprintEvidence;
	}

	 /**
   	* Changes the finger print.
   	* @param string fingerprint.  
   	*/
	public void setFingerprintEvidence(String fingerprintEvidence) {
		this.fingerprintEvidence = fingerprintEvidence;
	}

	 /**
   	* Gets the weapon.
   	* @return this weapon.
   	*/
	public String getWeaponEvidence() {
		return weaponEvidence;
	}

	 /**
   	* Changes the weapon.
   	* @param string weapon.  
   	*/
	public void setWeaponEvidence(String weaponEvidence) {
		this.weaponEvidence = weaponEvidence;
	}

}

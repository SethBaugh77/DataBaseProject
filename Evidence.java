
public class Evidence {
	private long ID;

	private String vehicle;

	private String bloodEvidence;
	private String fingerprintEvidence;
	private String weaponEvidence;
	private String otherEvidence;
	//

	public Evidence(long ID, String Vehicle, String bloodEvidence, String fingerPrintEvidence, String weaponEvidence,
			String otherEvidence) {
		this.ID = ID;
		this.vehicle = Vehicle;
		this.bloodEvidence = bloodEvidence;
		this.fingerprintEvidence = fingerPrintEvidence;
		this.weaponEvidence = weaponEvidence;
		this.otherEvidence = otherEvidence;
	}

	public void setID(long ID) {
		this.ID = ID;
	}

	public String getOtherEvidence() {
		return this.otherEvidence;
	}

	public void setOtherEvidence(String otherEvidence) {
		this.otherEvidence = otherEvidence;
	}

	public long getID() {
		return this.ID;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getBloodEvidence() {
		return bloodEvidence;
	}

	public void setBloodEvidence(String bloodEvidence) {
		this.bloodEvidence = bloodEvidence;
	}

	public String getFingerprintEvidence() {
		return fingerprintEvidence;
	}

	public void setFingerprintEvidence(String fingerprintEvidence) {
		this.fingerprintEvidence = fingerprintEvidence;
	}

	public String getWeaponEvidence() {
		return weaponEvidence;
	}

	public void setWeaponEvidence(String weaponEvidence) {
		this.weaponEvidence = weaponEvidence;
	}

}

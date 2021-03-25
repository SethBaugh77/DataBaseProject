
public class Evidence {
	private long ID;

	private String vehicle;

	private String bloodEvidence;
	private String fingerprintEvidence;
	private String weaponEvidence;

	public Evidence(long ID, String Vehicle, String bloodEvidence, String fingerPrintEvidence, String weaponEvidence) {
		this.ID = ID;
		this.vehicle = Vehicle;
		this.bloodEvidence = bloodEvidence;
		this.fingerprintEvidence = fingerPrintEvidence;
		this.weaponEvidence = weaponEvidence;
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

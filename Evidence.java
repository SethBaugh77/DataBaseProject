
public class Evidence {
private String time;
private String date;
private String location;
private String vehicle;
private String DNAEvidence;
private String bloodEvidence;
private String fingerprintEvidence;
private String weaponEvidence;
private String sceneDescription;
private boolean hasWitness;

	public Evidence(String Time,String Date, String Location, String Vehicle, String dnaEvidence,
			String BloodEvidence, String FingerprintEvidence, String WeaponEvidence, 
			String SceneDescription, boolean HasWitness)
{
		this.time = Time;
		this.date = Date;
		this.location = Location;
		this.vehicle = Vehicle;
		this.DNAEvidence = dnaEvidence;
		this.bloodEvidence = BloodEvidence;
		this.fingerprintEvidence = FingerprintEvidence;
		this.weaponEvidence = WeaponEvidence;
		this.sceneDescription = SceneDescription;
		this.hasWitness = HasWitness;
	
}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getDNAEvidence() {
		return DNAEvidence;
	}

	public void setDNAEvidence(String dNAEvidence) {
		DNAEvidence = dNAEvidence;
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

	public String getSceneDescription() {
		return sceneDescription;
	}

	public void setSceneDescription(String sceneDescription) {
		this.sceneDescription = sceneDescription;
	}

	public boolean isHasWitness() {
		return hasWitness;
	}

	public void setHasWitness(boolean hasWitness) {
		this.hasWitness = hasWitness;
	}
	
}

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.google.gson.*;

/**
 * Class that takes the data in the database and writes it to json files.
 * @author Seth Baugh
 */
public class DataWriter extends DataConstants {

    /**
     * Method that collects data from the crimArray and then writes the data to the
     * json files.
     */
    public static void saveCriminal() {

        ArrayList<Criminal> crimArray = DataBase.getInstance().getCriminals();

        JSONArray jsonFriends = new JSONArray();

        for (int i = 0; i < crimArray.size(); i++) {
            jsonFriends.add(getCriminalJSON(crimArray.get(i)));

        }

        try (FileWriter file = new FileWriter(CRIMINAL_FILE_NAME)) {

            file.write(jsonFriends.toJSONString());

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that takes in an instance of a Criminal, gets all the attributes of
     * the Criminal, converts it into a json object, then returns it.
     * @param criminal used to get its attributes.
     * @return jsonObject of the criminal input.
     */
    public static JSONObject getCriminalJSON(Criminal criminal) {

        JSONObject crimDetails = new JSONObject();
        crimDetails.put(PERSON_FIRST_NAME, criminal.getFname());
        crimDetails.put(PERSON_LAST_NAME, criminal.getLname());
        crimDetails.put(PERSON_PHONE, criminal.getPhone());

        crimDetails.put(PERSON_AGE, criminal.getAge());
        crimDetails.put(PERSON_HEIGHT, criminal.getHeight());
        crimDetails.put(PERSON_WEIGHT, criminal.getWeight());

        crimDetails.put(PERSON_ADDRESS, criminal.getAddress());
        crimDetails.put(PERSON_GENDER, criminal.getGender());
        crimDetails.put(PERSON_PHONE, criminal.getPhone());

        crimDetails.put(PERSON_DOB, criminal.getDateOfBirth());
        crimDetails.put(PERSON_IS_ADULT, criminal.getIsAdult());
        crimDetails.put(PERSON_ID, criminal.getID());

        crimDetails.put(PERSON_IN_JAIL, criminal.getJail());
        crimDetails.put(PERSON_NOTES, criminal.getNotes());
        crimDetails.put(PERSON_NUM_CRIMES, criminal.getNumCrimes());
        crimDetails.put(PERSON_RACE, criminal.getRace());

        return crimDetails;
    }

    /**
     * Method that collects data from the vicArray and then writes the data to the
     * json files.
     */
    public static void saveVictim() {

        ArrayList<Victim> vicArray = DataBase.getInstance().getVictims();

        JSONArray jsonFriends = new JSONArray();

        for (int i = 0; i < vicArray.size(); i++) {
            jsonFriends.add(getVictimJSON(vicArray.get(i)));

        }

        try (FileWriter file = new FileWriter(VICTIM_FILE_NAME)) {

            file.write(jsonFriends.toJSONString());

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that takes in an instance of a Victim, gets all the attributes of the
     * Victim, converts it into a json object, then returns it.
     * @param victim used to get its attributes.
     * @return jsonObject of the victim input.
     */
    public static JSONObject getVictimJSON(Victim victim) {

        JSONObject victimDetails = new JSONObject();
        victimDetails.put(PERSON_FIRST_NAME, victim.getFname());
        victimDetails.put(PERSON_LAST_NAME, victim.getLname());
        victimDetails.put(PERSON_PHONE, victim.getPhone());

        victimDetails.put(PERSON_AGE, victim.getAge());
        victimDetails.put(PERSON_HEIGHT, victim.getHeight());
        victimDetails.put(PERSON_WEIGHT, victim.getWeight());

        victimDetails.put(PERSON_ADDRESS, victim.getAddress());
        victimDetails.put(PERSON_GENDER, victim.getGender());
        victimDetails.put(PERSON_PHONE, victim.getPhone());

        victimDetails.put(PERSON_DOB, victim.getDateOfBirth());
        victimDetails.put(PERSON_IS_ADULT, victim.getIsAdult());
        victimDetails.put(PERSON_ID, victim.getID());

        victimDetails.put(PERSON_STATEMENT, victim.getVictimStatement());
        victimDetails.put(PERSON_IS_HEALTHY, victim.getIsHealthy());
        victimDetails.put(PERSON_RACE, victim.getRace());

        return victimDetails;
    }

    /**
     * Method that collects data from the officerArray and then writes the data to
     * the json files.
     */
    public static void saveOfficer() {

        ArrayList<Officer> officerArray = DataBase.getInstance().getOfficers();

        JSONArray jsonFriends = new JSONArray();

        for (int i = 0; i < officerArray.size(); i++) {
            jsonFriends.add(getOfficerJSON(officerArray.get(i)));

        }

        try (FileWriter file = new FileWriter(OFFICER_FILE_NAME)) {

            file.write(jsonFriends.toJSONString());

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that takes in an instance of an Officer, gets all the attributes of
     * the Officer, converts it into a json object, then returns it.
     * @param officer used to get its attributes.
     * @return jsonObject of the officer input.
     */
    public static JSONObject getOfficerJSON(Officer officer) {

        JSONObject officerDetails = new JSONObject();
        officerDetails.put(PERSON_FIRST_NAME, officer.getFname());
        officerDetails.put(PERSON_LAST_NAME, officer.getLname());
        officerDetails.put(PERSON_PHONE, officer.getPhone());

        officerDetails.put(PERSON_AGE, officer.getAge());
        officerDetails.put(PERSON_HEIGHT, officer.getHeight());
        officerDetails.put(PERSON_WEIGHT, officer.getWeight());

        officerDetails.put(PERSON_ADDRESS, officer.getAddress());
        officerDetails.put(PERSON_GENDER, officer.getGender());
        officerDetails.put(PERSON_PHONE, officer.getPhone());

        officerDetails.put(PERSON_DOB, officer.getDateOfBirth());
        officerDetails.put(PERSON_IS_ADULT, officer.getIsAdult());
        officerDetails.put(PERSON_ID, officer.getID());

        officerDetails.put(PERSON_OFFICER_RANK, officer.getOfficerRank());
        officerDetails.put(PERSON_BADGE_NUMBER, officer.getBadgeNumber());
        officerDetails.put(PERSON_STATEMENT, officer.getOfficerStatement());
        officerDetails.put(PERSON_RACE, officer.getRace());

        return officerDetails;
    }

    /**
     * Method that collects data from the poiArray and then writes the data to the
     * json files.
     */
    public static void savepoi() {

        ArrayList<PersonOfInterest> poiArray = DataBase.getInstance().getPOI();

        JSONArray jsonFriends = new JSONArray();

        for (int i = 0; i < poiArray.size(); i++) {
            jsonFriends.add(getPOIJSON(poiArray.get(i)));

        }

        try (FileWriter file = new FileWriter(POI_FILE_NAME)) {

            file.write(jsonFriends.toJSONString());

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that takes in an instance of a PersonOfInterest, gets all the
     * attributes of the PersonOfInterest, converts it into a json object, then
     * returns it.
     * @param poi used to get its attributes.
     * @return jsonObject of the poi input.
     */
    public static JSONObject getPOIJSON(PersonOfInterest poi) {

        JSONObject poiDetails = new JSONObject();
        poiDetails.put(PERSON_FIRST_NAME, poi.getFname());
        poiDetails.put(PERSON_LAST_NAME, poi.getLname());
        poiDetails.put(PERSON_PHONE, poi.getPhone());

        poiDetails.put(PERSON_AGE, poi.getAge());
        poiDetails.put(PERSON_HEIGHT, poi.getHeight());
        poiDetails.put(PERSON_WEIGHT, poi.getWeight());

        poiDetails.put(PERSON_ADDRESS, poi.getAddress());
        poiDetails.put(PERSON_GENDER, poi.getGender());
        poiDetails.put(PERSON_PHONE, poi.getPhone());

        poiDetails.put(PERSON_DOB, poi.getDateOfBirth());
        poiDetails.put(PERSON_IS_ADULT, poi.getIsAdult());
        poiDetails.put(PERSON_ID, poi.getID());

        poiDetails.put(PERSON_LAST_LOCATION, poi.getLastLocation());
        poiDetails.put(PERSON_OCCUPATION, poi.getOccupation());
        poiDetails.put(PERSON_RACE, poi.getRace());

        // poiDetails.put(PERSON_TATOOS, poi.getTatoos());
        poiDetails.put(PERSON_NOTES, poi.getpoiNotes());

        return poiDetails;
    }

    /**
     * Method that collects data from the suspectArray and then writes the data to
     * the json files.
     */
    public static void saveSuspect() {

        ArrayList<Suspect> suspectArray = DataBase.getInstance().getSuspects();

        JSONArray jsonFriends = new JSONArray();

        for (int i = 0; i < suspectArray.size(); i++) {
            jsonFriends.add(getSuspectJSON(suspectArray.get(i)));

        }

        try (FileWriter file = new FileWriter(SUSPECT_FILE_NAME)) {

            file.write(jsonFriends.toJSONString());

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that takes in an instance of a Suspect, gets all the attributes of the
     * Suspect, converts it into a json object, then returns it.
     * @param suspect used to get its attributes.
     * @return jsonObject of the suspect input.
     */
    public static JSONObject getSuspectJSON(Suspect suspect) {

        JSONObject suspectDetails = new JSONObject();
        suspectDetails.put(PERSON_FIRST_NAME, suspect.getFname());
        suspectDetails.put(PERSON_LAST_NAME, suspect.getLname());
        suspectDetails.put(PERSON_PHONE, suspect.getPhone());

        suspectDetails.put(PERSON_AGE, suspect.getAge());
        suspectDetails.put(PERSON_HEIGHT, suspect.getHeight());
        suspectDetails.put(PERSON_WEIGHT, suspect.getWeight());

        suspectDetails.put(PERSON_ADDRESS, suspect.getAddress());
        suspectDetails.put(PERSON_GENDER, suspect.getGender());
        suspectDetails.put(PERSON_PHONE, suspect.getPhone());

        suspectDetails.put(PERSON_DOB, suspect.getDateOfBirth());
        suspectDetails.put(PERSON_IS_ADULT, suspect.getIsAdult());
        suspectDetails.put(PERSON_ID, suspect.getID());

        suspectDetails.put(PERSON_LAST_LOCATION, suspect.getLastLocation());
        suspectDetails.put(PERSON_OCCUPATION, suspect.getOccupation());
        suspectDetails.put(PERSON_NOTES, suspect.getpoiNotes());

        suspectDetails.put(PERSON_BODY_TYPE, suspect.getBodyType());
        suspectDetails.put(PERSON_IS_CRIMINAL, suspect.getIsCriminal());
        suspectDetails.put(PERSON_RACE, suspect.getRace());

        // suspectDetails.put(PERSON_TATOOS, suspect.getTatoos());

        return suspectDetails;
    }

    /**
     * Method that collects data from the witnessArray and then writes the data to
     * the json files.
     */
    public static void saveWitness() {

        ArrayList<Witness> witnessArray = DataBase.getInstance().getWitnesses();

        JSONArray jsonFriends = new JSONArray();

        for (int i = 0; i < witnessArray.size(); i++) {
            jsonFriends.add(getWitnessJSON(witnessArray.get(i)));

        }

        try (FileWriter file = new FileWriter(WITNESS_FILE_NAME)) {

            file.write(jsonFriends.toJSONString());

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that takes in an instance of a Witness, gets all the attributes of the
     * Witness, converts it into a json object, then returns it.
     * @param witness used to get its attributes.
     * @return jsonObject of the witness input.
     */
    public static JSONObject getWitnessJSON(Witness witness) {

        JSONObject witnessDetails = new JSONObject();
        witnessDetails.put(PERSON_FIRST_NAME, witness.getFname());
        witnessDetails.put(PERSON_LAST_NAME, witness.getLname());
        witnessDetails.put(PERSON_PHONE, witness.getPhone());

        witnessDetails.put(PERSON_AGE, witness.getAge());
        witnessDetails.put(PERSON_HEIGHT, witness.getHeight());
        witnessDetails.put(PERSON_WEIGHT, witness.getWeight());

        witnessDetails.put(PERSON_ADDRESS, witness.getAddress());
        witnessDetails.put(PERSON_GENDER, witness.getGender());
        witnessDetails.put(PERSON_PHONE, witness.getPhone());

        witnessDetails.put(PERSON_DOB, witness.getDateOfBirth());
        witnessDetails.put(PERSON_IS_ADULT, witness.getIsAdult());
        witnessDetails.put(PERSON_ID, witness.getID());

        witnessDetails.put(PERSON_STATEMENT, witness.getWitnessStatement());
        witnessDetails.put(PERSON_RACE, witness.getRace());

        return witnessDetails;
    }

    /**
     * Method that collects data from the userArray and then writes the data to the
     * json files.
     */
    public static void saveUser() {

        ArrayList<User> userArray = DataBase.getInstance().getUsers();

        JSONArray jsonFriends = new JSONArray();

        for (int i = 0; i < userArray.size(); i++) {
            jsonFriends.add(getUSERJSON(userArray.get(i)));

        }

        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {

            file.write(jsonFriends.toJSONString());

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that takes in an instance of a User, gets all the attributes of the
     * User, converts it into a json object, then returns it.
     * @param user used to get its attributes.
     * @return jsonObject of the user input.
     */
    public static JSONObject getUSERJSON(User user) {

        JSONObject userDetails = new JSONObject();
        userDetails.put(PERSON_FIRST_NAME, user.getFirstName());
        userDetails.put(PERSON_LAST_NAME, user.getLastName());
        userDetails.put(PERSON_PASSWORD, user.getPassword());

        userDetails.put(PERSON_IS_ADMIN, user.getAdmin());
        userDetails.put(PERSON_USERNAME, user.getUsername());
        userDetails.put(PERSON_EMAIL, user.getEmail());

        userDetails.put(PERSON_ID, user.getId());
        userDetails.put(PERSON_PHONE, user.getPhone());

        return userDetails;
    }

    /**
     * Method that collects data from the caseArray and then writes the data to the
     * json files.
     */
    public static void saveCase() {

        ArrayList<Case> caseArray = DataBase.getInstance().getCases();

        JSONArray jsonFriends = new JSONArray();

        for (int i = 0; i < caseArray.size(); i++) {
            jsonFriends.add(getCaseJSON(caseArray.get(i)));

        }

        try (FileWriter file = new FileWriter(CASE_FILE_NAME)) {

            file.write(jsonFriends.toJSONString());

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that takes in an instance of a Case, gets all the attributes of the
     * Case, converts it into a json object, then returns it.
     * @param _case used to get its attributes.
     * @return jsonObject of the _case input.
     */
    public static JSONObject getCaseJSON(Case _case) {

        JSONObject caseDetails = new JSONObject();

        caseDetails.putIfAbsent(CASE_NAME, _case.getName());
        caseDetails.putIfAbsent(CASE_CRIME, _case.getCrime());
        caseDetails.putIfAbsent(CASE_DATE, _case.getDate());

        caseDetails.putIfAbsent(CASE_IS_FEDERAL, _case.getIsFederal());
        caseDetails.putIfAbsent(CASE_IS_SOLVED, _case.getIsSolved());
        caseDetails.putIfAbsent(CASE_SEVERITY, _case.getSeverity());

        caseDetails.putIfAbsent(CASE_ID, _case.getCaseID());
        caseDetails.putIfAbsent(CASE_CRIMINALS_ID, _case.getCriminals());
        caseDetails.putIfAbsent(CASE_VICTIMS_ID, _case.getVictims());

        caseDetails.putIfAbsent(CASE_WITNESSES_ID, _case.getWitnesses());
        caseDetails.putIfAbsent(CASE_OFFICERS_ID, _case.getOfficers());
        caseDetails.putIfAbsent(CASE_POI_ID, _case.getPoi());
        caseDetails.putIfAbsent(CASE_SUSPECTS_ID, _case.getSuspects());
        caseDetails.put(CASE_EVIDENCE, _case.getEvidence());

        return caseDetails;

    }

    /**
     * Method that collects data from the evidenceArray and then writes the data to
     * the json files.
     */
    public static void saveEvidence() {

        ArrayList<Evidence> evidenceArray = DataBase.getInstance().getEvidence();

        JSONArray jsonFriends = new JSONArray();

        for (int i = 0; i < evidenceArray.size(); i++) {
            jsonFriends.add(getEvidenceJSON(evidenceArray.get(i)));

        }

        try (FileWriter file = new FileWriter(EVIDENCE_FILE_NAME)) {

            file.write(jsonFriends.toJSONString());

            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method that takes in an instance of a Evidence, gets all the attributes of
     * the Evidence, converts it into a json object, then returns it.
     * @param evidence used to get its attributes.
     * @return jsonObject of the evidence input.
     */
    public static JSONObject getEvidenceJSON(Evidence evidence) {

        JSONObject evidenceDetails = new JSONObject();

        evidenceDetails.put(EVIDENCE_BLOOD, evidence.getBloodEvidence());
        evidenceDetails.put(EVIDENCE_VEHICLE, evidence.getVehicle());
        evidenceDetails.put(EVIDENCE_FINGER_PRINT, evidence.getFingerprintEvidence());
        evidenceDetails.put(EVIDENCE_WEAPON, evidence.getWeaponEvidence());
        evidenceDetails.put(PERSON_ID, evidence.getID());

        return evidenceDetails;
    }

}
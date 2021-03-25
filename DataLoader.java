import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {

    public static ArrayList loadCriminal() {

        ArrayList<Criminal> crim = new ArrayList();
        try {
            FileReader reader = new FileReader(CRIMINAL_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String firstName = (String) personJSON.get(PERSON_FIRST_NAME);
                String lastName = (String) personJSON.get(PERSON_LAST_NAME);
                long age = (long) personJSON.get(PERSON_AGE);
                long height = (long) personJSON.get(PERSON_HEIGHT);
                long weight = (long) personJSON.get(PERSON_WEIGHT);
                String address = (String) personJSON.get(PERSON_ADDRESS);
                String gender = (String) personJSON.get(PERSON_GENDER);
                String phone = (String) personJSON.get(PERSON_PHONE);
                String DOB = (String) personJSON.get(PERSON_DOB);
                boolean isAdult = (boolean) personJSON.get(PERSON_IS_ADULT);
                long ID = (long) personJSON.get(PERSON_ID);
                boolean inJail = (boolean) personJSON.get(PERSON_IN_JAIL);
                String Notes = (String) personJSON.get(PERSON_NOTES);
                long numCrimes = (long) personJSON.get(PERSON_NUM_CRIMES);
                String Race = (String) personJSON.get(PERSON_RACE);

                crim.add(new Criminal(firstName, lastName, age, height, weight, gender, address, phone, DOB, isAdult,
                        inJail, Notes, numCrimes, ID, Race));
            }

            // return crim;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return crim;

    }

    public static ArrayList loadWitness() {

        ArrayList<Witness> wit = new ArrayList();
        try {
            FileReader reader = new FileReader(WITNESS_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String firstName = (String) personJSON.get(PERSON_FIRST_NAME);
                String lastName = (String) personJSON.get(PERSON_LAST_NAME);
                long age = (long) personJSON.get(PERSON_AGE);
                long height = (long) personJSON.get(PERSON_HEIGHT);
                long weight = (long) personJSON.get(PERSON_WEIGHT);
                String address = (String) personJSON.get(PERSON_ADDRESS);
                String gender = (String) personJSON.get(PERSON_GENDER);
                String phone = (String) personJSON.get(PERSON_PHONE);
                String DOB = (String) personJSON.get(PERSON_DOB);
                boolean isAdult = (boolean) personJSON.get(PERSON_IS_ADULT);
                long ID = (long) personJSON.get(PERSON_ID);
                String witnessStatement = (String) personJSON.get(PERSON_STATEMENT);
                String Race = (String) personJSON.get(PERSON_RACE);

                wit.add(new Witness(witnessStatement, firstName, lastName, age, height, weight, gender, address, phone,
                        DOB, isAdult, ID, Race));
            }

            // return wit;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return wit;

    }

    public static ArrayList loadSuspect() {

        ArrayList<Suspect> sus = new ArrayList();
        try {
            FileReader reader = new FileReader(SUSPECT_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String firstName = (String) personJSON.get(PERSON_FIRST_NAME);
                String lastName = (String) personJSON.get(PERSON_LAST_NAME);
                long age = (long) personJSON.get(PERSON_AGE);
                long height = (long) personJSON.get(PERSON_HEIGHT);
                long weight = (long) personJSON.get(PERSON_WEIGHT);
                String address = (String) personJSON.get(PERSON_ADDRESS);
                String gender = (String) personJSON.get(PERSON_GENDER);
                String phone = (String) personJSON.get(PERSON_PHONE);
                String DOB = (String) personJSON.get(PERSON_DOB);
                boolean isAdult = (boolean) personJSON.get(PERSON_IS_ADULT);
                long ID = (long) personJSON.get(PERSON_ID);
                String occupation = (String) personJSON.get(PERSON_OCCUPATION);
                String lastLocation = (String) personJSON.get(PERSON_LAST_LOCATION);
                String poiNotes = (String) personJSON.get(PERSON_NOTES);
                String bodyType = (String) personJSON.get(PERSON_BODY_TYPE);
                boolean isCriminal = (boolean) personJSON.get(PERSON_IS_CRIMINAL);
                String Race = (String) personJSON.get(PERSON_RACE);
                String Tatoos = (String) personJSON.get(PERSON_TATOOS);

                sus.add(new Suspect(firstName, lastName, age, height, weight, gender, address, phone, DOB, isAdult, ID,
                        occupation, lastLocation, bodyType, isCriminal, Race, poiNotes, Tatoos));
            }

            // return sus;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return sus;

    }

    public static ArrayList loadVictim() {

        ArrayList<Victim> vic = new ArrayList();
        try {
            FileReader reader = new FileReader(VICTIM_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String firstName = (String) personJSON.get(PERSON_FIRST_NAME);
                String lastName = (String) personJSON.get(PERSON_LAST_NAME);
                long age = (long) personJSON.get(PERSON_AGE);
                long height = (long) personJSON.get(PERSON_HEIGHT);
                long weight = (long) personJSON.get(PERSON_WEIGHT);
                String address = (String) personJSON.get(PERSON_ADDRESS);
                String gender = (String) personJSON.get(PERSON_GENDER);
                String phone = (String) personJSON.get(PERSON_PHONE);
                String DOB = (String) personJSON.get(PERSON_DOB);
                boolean isAdult = (boolean) personJSON.get(PERSON_IS_ADULT);
                long ID = (long) personJSON.get(PERSON_ID);
                boolean isHealthy = (boolean) personJSON.get(PERSON_IS_HEALTHY);
                String victimStatement = (String) personJSON.get(PERSON_STATEMENT);
                String Race = (String) personJSON.get(PERSON_RACE);

                vic.add(new Victim(isHealthy, victimStatement, firstName, lastName, age, height, weight, gender,
                        address, phone, DOB, isAdult, ID, Race));
            }

            // return vic;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return vic;

    }

    public static ArrayList loadOfficer() {

        ArrayList<Officer> off = new ArrayList();
        try {
            FileReader reader = new FileReader(OFFICER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String firstName = (String) personJSON.get(PERSON_FIRST_NAME);
                String lastName = (String) personJSON.get(PERSON_LAST_NAME);
                long age = (long) personJSON.get(PERSON_AGE);
                long height = (long) personJSON.get(PERSON_HEIGHT);
                long weight = (long) personJSON.get(PERSON_WEIGHT);
                String address = (String) personJSON.get(PERSON_ADDRESS);
                String gender = (String) personJSON.get(PERSON_GENDER);
                String phone = (String) personJSON.get(PERSON_PHONE);
                String DOB = (String) personJSON.get(PERSON_DOB);
                boolean isAdult = (boolean) personJSON.get(PERSON_IS_ADULT);
                long ID = (long) personJSON.get(PERSON_ID);
                long bNum = (long) personJSON.get(PERSON_BADGE_NUMBER);
                String officerRank = (String) personJSON.get(PERSON_OFFICER_RANK);
                String officerState = (String) personJSON.get(PERSON_STATEMENT);
                String Race = (String) personJSON.get(PERSON_RACE);

                off.add(new Officer(bNum, officerRank, officerState, firstName, lastName, age, height, weight, gender,
                        address, phone, DOB, isAdult, ID, Race));
            }

            // return off;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return off;

    }

    public static ArrayList loadPOI() {

        ArrayList<PersonOfInterest> poi = new ArrayList();
        try {
            FileReader reader = new FileReader(POI_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String firstName = (String) personJSON.get(PERSON_FIRST_NAME);
                String lastName = (String) personJSON.get(PERSON_LAST_NAME);
                long age = (long) personJSON.get(PERSON_AGE);
                long height = (long) personJSON.get(PERSON_HEIGHT);
                long weight = (long) personJSON.get(PERSON_WEIGHT);
                String address = (String) personJSON.get(PERSON_ADDRESS);
                String gender = (String) personJSON.get(PERSON_GENDER);
                String phone = (String) personJSON.get(PERSON_PHONE);
                String DOB = (String) personJSON.get(PERSON_DOB);
                boolean isAdult = (boolean) personJSON.get(PERSON_IS_ADULT);
                long ID = (long) personJSON.get(PERSON_ID);
                String occupation = (String) personJSON.get(PERSON_OCCUPATION);
                String lastLocation = (String) personJSON.get(PERSON_LAST_LOCATION);
                String poiNotes = (String) personJSON.get(PERSON_NOTES);
                String Race = (String) personJSON.get(PERSON_RACE);
                String Notes = (String) personJSON.get(PERSON_NOTES);
                String Tatoos = (String) personJSON.get(PERSON_TATOOS);
                poi.add(new PersonOfInterest(firstName, lastName, age, height, weight, gender, address, phone, DOB,
                        isAdult, occupation, lastLocation, ID, Race, Notes, Tatoos));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return poi;

    }

    public static ArrayList loadUsers() {

        ArrayList<User> users = new ArrayList();
        try {
            FileReader reader = new FileReader(USER_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String firstName = (String) personJSON.get(PERSON_FIRST_NAME);
                String lastName = (String) personJSON.get(PERSON_LAST_NAME);
                boolean admin = (boolean) personJSON.get(PERSON_IS_ADMIN);
                String username = (String) personJSON.get(PERSON_USERNAME);
                String email = (String) personJSON.get(PERSON_EMAIL);
                String password = (String) personJSON.get(PERSON_PASSWORD);

                String phone = (String) personJSON.get(PERSON_PHONE);

                long ID = (long) personJSON.get(PERSON_ID);

                users.add(new User(ID, admin, firstName, lastName, username, email, password, phone));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;

    }

    public static ArrayList loadCases() {

        ArrayList<Case> _cases = new ArrayList();
        try {
            FileReader reader = new FileReader(CASE_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {

                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String Name = (String) personJSON.get(CASE_NAME);
                String Crime = (String) personJSON.get(CASE_CRIME);

                String Date = (String) personJSON.get(CASE_DATE);
                long Severity = (long) personJSON.get(CASE_SEVERITY);
                boolean isFederal = (boolean) personJSON.get(CASE_IS_FEDERAL);
                boolean isSolved = (boolean) personJSON.get(CASE_IS_SOLVED);
                ArrayList<Long> criminals = (ArrayList<Long>) personJSON.get(CASE_CRIMINALS_ID);
                ArrayList<Long> victims = (ArrayList<Long>) personJSON.get(CASE_VICTIMS_ID);
                ArrayList<Long> witnesses = (ArrayList<Long>) personJSON.get(CASE_WITNESSES_ID);
                ArrayList<Long> officers = (ArrayList<Long>) personJSON.get(CASE_OFFICERS_ID);
                ArrayList<Long> poi = (ArrayList<Long>) personJSON.get(CASE_POI_ID);
                ArrayList<Long> suspects = (ArrayList<Long>) personJSON.get(CASE_SUSPECTS_ID);

                long ID = (long) personJSON.get(PERSON_ID);

                _cases.add(new Case(Name, Crime, Date, isSolved, Severity, isFederal, ID, criminals, victims, witnesses,
                        officers, poi, suspects));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return _cases;

    }

    public static ArrayList loadEvidence() {

        ArrayList<Evidence> evidence = new ArrayList();
        try {
            FileReader reader = new FileReader(EVIDENCE_FILE_NAME);
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);

            for (int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject) peopleJSON.get(i);
                String Vehicle = (String) personJSON.get(EVIDENCE_VEHICLE);
                String fingerPrintEvidence = (String) personJSON.get(EVIDENCE_FINGER_PRINT);
                String bloodEvidence = (String) personJSON.get(EVIDENCE_BLOOD);
                String weaponEvidence = (String) personJSON.get(EVIDENCE_WEAPON);

                long ID = (long) personJSON.get(PERSON_ID);

                evidence.add(new Evidence(ID, Vehicle, bloodEvidence, fingerPrintEvidence, weaponEvidence));

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return evidence;

    }

}
import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {

    public static ArrayList loadCrim(String type, String file) {

        ArrayList<Criminal> crim = new ArrayList();
        try {
            FileReader reader = new FileReader(file);
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

                crim.add(new Criminal(firstName, lastName, age, height, weight, gender, address, phone, DOB, isAdult,
                        ID, inJail, Notes, numCrimes));
            }

            return crim;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public static ArrayList loadWit(String type, String file) {

        ArrayList<Witness> wit = new ArrayList();
        try {
            FileReader reader = new FileReader(file);
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

                wit.add(new Witness(firstName, LastName, age, height, weight, gender, address, phone, DOB, isAdult, ID,
                        inJail, Notes, numCrimes));
            }

            return wit;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public static ArrayList loadSus(String type, String file) {

        ArrayList<Suspect> sus = new ArrayList();
        try {
            FileReader reader = new FileReader(file);
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

                sus.add(new Suspect(firstName, lastName, age, height, weight, gender, address, phone, DOB, isAdult, ID,
                        inJail, Notes, numCrimes));
            }

            return sus;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public static ArrayList loadVic(String type, String file) {

        ArrayList<Victim> vic = new ArrayList();
        try {
            FileReader reader = new FileReader(file);
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

                vic.add(new Victim(firstName, lastName, age, height, weight, gender, address, phone, DOB, isAdult, ID,
                        inJail, Notes, numCrimes));
            }

            return vic;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public static ArrayList loadOfficer(String type, String file) {

        ArrayList<Officer> off = new ArrayList();
        try {
            FileReader reader = new FileReader(file);
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

                off.add(new Officer(firstName, lastName, age, height, weight, gender, address, phone, DOB, isAdult, ID,
                        inJail, Notes, numCrimes));
            }

            return off;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }

    public static ArrayList loadPOI(String type, String file) {

        ArrayList<PersonOfInterest> poi = new ArrayList();
        try {
            FileReader reader = new FileReader(file);
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

                POI.add(new PersonOfInterest(firstName, lastName, age, height, weight, gender, address, phone, DOB,
                        isAdult, ID, inJail, Notes, numCrimes));
            }

            return poi;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;

    }
}
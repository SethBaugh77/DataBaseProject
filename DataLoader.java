import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {

    public static ArrayList loadCriminal() {
        

        ArrayList<Criminal> crim = new ArrayList();
        try {
            FileReader reader = new FileReader("criminal.json");
            JSONParser parser = new JSONParser();
            JSONArray peopleJSON = (JSONArray) new JSONParser().parse(reader);
            
            // JSONParser parser = new JSONParser();
            // Object obj  = parser.parse("criminal.json");
            // JSONArray peopleJSON = new JSONArray();
            // peopleJSON.add(obj);
            

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
                     inJail, Notes, numCrimes, ID));
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
            FileReader reader = new FileReader("Witness.json");
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
                String witnessStatement =(String) personJSON.get(PERSON_STATEMENT);

                wit.add(new Witness(witnessStatement,firstName, lastName, age, height, weight, gender, address, phone, DOB, isAdult, ID));
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
            FileReader reader = new FileReader("Suspect.json");
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
                // protected String occupation;
                // protected String lastLocation;
                // protected String poiNotes;
    //             protected String bodyType;
    //             protected boolean isCriminal;

                sus.add(new Suspect(firstName, lastName, age, height, weight, gender, address, phone, DOB, isAdult, ID, occupation, lastLocation, poiNotes, bodyType, isCriminal));
            }

         //   return sus;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return sus;

    }

    public static ArrayList loadVictim() {

        ArrayList<Victim> vic = new ArrayList();
        try {
            FileReader reader = new FileReader("Victim.json");
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

                vic.add(new Victim(isHealthy,victimStatement,firstName, lastName, age, height, weight, gender, address, phone, DOB, isAdult, ID));
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
            FileReader reader = new FileReader("Officer.json");
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

                off.add(new Officer(bNum, officerRank, officerState,firstName, lastName, age, height, weight, gender, address, phone, DOB, isAdult, ID));
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
            FileReader reader = new FileReader("POI.json");
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

                poi.add(new PersonOfInterest(firstName, lastName, age, height, weight, gender, address, phone, DOB, 
                        isAdult, occupation, lastLocation, ID));
            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return poi;

    }
}
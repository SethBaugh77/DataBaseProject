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
                // protected String occupation;
                // protected String lastLocation;
                // protected String poiNotes;
    //             protected String bodyType;
    //             protected boolean isCriminal;

                sus.add(new Suspect(firstName, lastName, age, height, weight, gender, address, phone, DOB, isAdult, ID, occupation, lastLocation, bodyType, isCriminal));
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

                poi.add(new PersonOfInterest(firstName, lastName, age, height, weight, gender, address, phone, DOB, 
                        isAdult, occupation, lastLocation, ID));
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
                // String DOB = (String) personJSON.get(PERSON_DOB);
                // boolean isAdult = (boolean) personJSON.get(PERSON_IS_ADULT);
                 long ID = (long) personJSON.get(PERSON_ID);
                // String occupation = (String) personJSON.get(PERSON_OCCUPATION);
                // String lastLocation = (String) personJSON.get(PERSON_LAST_LOCATION);
                // String poiNotes = (String) personJSON.get(PERSON_NOTES);

                 users.add(new User (ID, admin, firstName, lastName, username, email, password, phone));
                //         isAdult, occupation, lastLocation, ID));
                        // protected long id;
                        // protected boolean admin;
                        // protected String firstName;
                        // protected String lastName;
                        // protected String username;
                        // protected String email;
                        // protected String password;
                        // protected String phone;
                        


            }

            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return users;

    }



}
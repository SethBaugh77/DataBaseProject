import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {

    public static void saveCrim(ArrayList<Criminal> aList) {
        // People people = People.getInstance();
        ArrayList<Criminal> crim = new ArrayList<Criminal>();
        JSONArray jsonFriends = new JSONArray();

        // creating all the json objects
        for (int i = 0; i < aList.size(); i++) {
            jsonFriends.add(getPersonJSON(aList.get(i)));
        }

        // Write JSON file
        try (FileWriter file = new FileWriter(CRIMINAL_FILE_NAME)) {

            file.write(jsonFriends.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getPersonJSON(Criminal crims) {
		JSONObject crimDetails = new JSONObject();
		crimDetails.put(PERSON_FIRST_NAME, crims.getFname());
		crimDetails.put(PERSON_LAST_NAME, crims.getLname());
		crimDetails.put(PERSON_PHONE, crims.getPhone());

        crimDetails.put(PERSON_AGE, crims.getAge());
		crimDetails.put(PERSON_HEIGHT, crims.getHeight()));
		crimDetails.put(PERSON_WEIGHT, crims.getWeight());

        crimDetails.put(PERSON_ADDRESS, crims.getAddress());
		crimDetails.put(PERSON_LAST_NAME, crims.getGender());
		crimDetails.put(PERSON_PHONE, crims.getPhone());

        crimDetails.put(PERSON_DOB, crims.getDateOfBirth());
		crimDetails.put(PERSON_IS_ADULT, crims.getIsAdult());
		crimDetails.put(PERSON_ID, crims.getID());

        crimDetails.put(PERSON_IN_JAIL, crims.getJail());
		crimDetails.put(PERSON_NOTES, crims.getNotes());
		crimDetails.put(PERSON_NUM_CRIMES, crims.getNumCrimes());

        
        
        return crimDetails;
	}
}
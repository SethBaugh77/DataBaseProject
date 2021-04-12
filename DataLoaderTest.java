import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Seth Baugh
 */
class DataLoaderTest {
    private DataBase dBase = DataBase.getInstance();
    private ArrayList<Criminal> criminals = dBase.getCriminals();
    private ArrayList<Case> cases = dBase.getCases();
    private ArrayList<User> users = dBase.getUsers();
    private ArrayList<Victim> victims = dBase.getVictims();
    private ArrayList<Witness> witnesses = dBase.getWitnesses();
    private ArrayList<Officer> officers = dBase.getOfficers();
    private ArrayList<PersonOfInterest> POI = dBase.getPOI();
    private ArrayList<Suspect> suspects = dBase.getSuspects();
    private ArrayList<Evidence> evidence = dBase.getEvidence();

    @BeforeEach
    public void setup() {
        
        criminals.clear();
        victims.clear();
        suspects.clear();
        officers.clear();
        witnesses.clear();
        POI.clear();
        evidence.clear();
        cases.clear();
        users.clear();
        DataWriter.saveCase();
        DataWriter.saveCriminal();
        DataWriter.saveEvidence();
        DataWriter.saveOfficer();
        DataWriter.saveSuspect();
        DataWriter.saveUser();
        DataWriter.saveVictim();
        DataWriter.saveWitness();
        DataWriter.savepoi();
        criminals.add(new Criminal("Bob", "Duncan", "55", "5'10", "200", "Robbery", "M", "123 idk lane", "123-456-1234",
                "2/2/22", true, true, "bad guy", "15", 12345, "white", "black"));
        victims.add(new Victim(true, "I saw the bad guy", "Tammy", "duncan", "23", "5'9", "123", "f", "123 idk lane",
                "123-123-4541", "2/2/22", true, 12312, "white"));
        suspects.add(new Suspect("Nate", "Bucannon", "34", "6'4", "190", "M", "123 sicamore lane", "321-321-4444",
                "5/4/33", false, 5555, "teacher", "school", "fit", false, "black", "dove tatoo", "black"));
        officers.add(new Officer("3213", "Deputy", "Im the best", "Margaret", "Bread", "31", "6'1", "140", "F",
                "777 bowling alley lane", "333-111-3333", "5/6/44", true, 9999, "white"));
        witnesses.add(new Witness("I saw the man come in with a gun", "Barry", "Bonds", "79", "6'10", "250", "M",
                "123 jailbreak road", "333-333-2222", "1/1/11", true, 543, "black"));
        POI.add(new PersonOfInterest("Veronica", "Lollipop", "30", "5'10", "150", "F", "555 flying saucer road",
                "123-999-0000", "3/2/22", true, "doctor", "house", 3333, "white", "dove tatoo", "brown"));
        ArrayList<Long> criminalsID = new ArrayList<Long>();
        ArrayList<Long> victimsID = new ArrayList<Long>();
        ArrayList<Long> witnessesID = new ArrayList<Long>();
        ArrayList<Long> officersID = new ArrayList<Long>();
        ArrayList<Long> poiID = new ArrayList<Long>();
        ArrayList<Long> suspectsID = new ArrayList<Long>();
        ArrayList<Long> evidenceID = new ArrayList<Long>();
        cases.add(new Case("havoc at gamestop", "robbery", "2/2/22", false, "5", false, 5555, criminalsID, victimsID,
                witnessesID, officersID, poiID, suspectsID, evidenceID));
        users.add(new User(555, true, "James", "Monroe", "jmon", "jmon@gmail.com", "idk", "555-555-5555"));
        evidence.add(new Evidence(1234, "minivan", "AB+", "N/A", "knife", "N/A"));
        DataWriter.saveCase();
        DataWriter.saveCriminal();
        DataWriter.saveEvidence();
        DataWriter.saveOfficer();
        DataWriter.saveSuspect();
        DataWriter.saveUser();
        DataWriter.saveVictim();
        DataWriter.saveWitness();
        DataWriter.savepoi();
        criminals.clear();
        victims.clear();
        suspects.clear();
        officers.clear();
        witnesses.clear();
        POI.clear();
        evidence.clear();
        cases.clear();
        users.clear();
       cases= DataLoader.loadCases();
        criminals = DataLoader.loadCriminal();
       evidence= DataLoader.loadEvidence();
        officers =DataLoader.loadOfficer();
        POI = DataLoader.loadPOI();
        suspects = DataLoader.loadSuspect();
        users = DataLoader.loadUsers();
        victims = DataLoader.loadVictim();
        witnesses = DataLoader.loadWitness();

    }

    @AfterEach
    public void tearDown() {
        dBase.getInstance().getUsers().clear();
        dBase.getInstance().getCriminals().clear();
        dBase.getInstance().getSuspects().clear();
        dBase.getInstance().getOfficers().clear();
        dBase.getInstance().getPOI().clear();
        dBase.getInstance().getVictims().clear();
        dBase.getInstance().getWitnesses().clear();
        dBase.getInstance().getCases().clear();
        dBase.getInstance().getEvidence().clear();
        DataWriter.saveCase();
        DataWriter.saveCriminal();
        DataWriter.saveEvidence();
        DataWriter.saveOfficer();
        DataWriter.saveSuspect();
        DataWriter.saveWitness();
        DataWriter.savepoi();
        DataWriter.saveVictim();
        DataWriter.saveUser();
    }

    // test to make sure size matches after loads
    @Test
    void testGetUsersSize() {
        // userList = DataLoader.getUsers();
        assertEquals(1, users.size());
    }

    @Test
    void testGetEvidenceSize() {
        // userList = DataLoader.getUsers();
        assertEquals(1, evidence.size());
    }

    @Test
    void testGetCaseSize() {
        // userList = DataLoader.getUsers();
        assertEquals(1, cases.size());
    }

    @Test
    void testGetSuspectsSize() {
        // userList = DataLoader.getUsers();
        assertEquals(1, suspects.size());
    }

    @Test
    void testGetVictimssSize() {
        // userList = DataLoader.getUsers();
        assertEquals(1, victims.size());
    }

    @Test
    void testGetWitnessesSize() {
        // userList = DataLoader.getUsers();
        assertEquals(1, witnesses.size());
    }

    @Test
    void testGetsPOISize() {
        // userList = DataLoader.getUsers();
        assertEquals(1, POI.size());
    }

    @Test
    void testGetOfficerssSize() {
        // userList = DataLoader.getUsers();
        assertEquals(1, officers.size());
    }

    @Test
    void testGetCriminalsSize() {
        // userList = DataLoader.getUsers();
        assertEquals(1, criminals.size());

    }



    //test to make sure attributes are loaded properly
    @Test
    void testGetUserName() {
        // userList = DataLoader.getUsers();
        assertEquals("James", users.get(0).getFirstName());
    }

    @Test
    void testGetEvidenceAttribute() {
        // userList = DataLoader.getUsers();
        assertEquals("AB+", evidence.get(0).getBloodEvidence());
    }

    @Test
    void testGetCaseName() {
        // userList = DataLoader.getUsers();
        assertEquals("havoc at gamestop", cases.get(0).getName());
    }

    @Test
    void testGetSuspectName() {
        // userList = DataLoader.getUsers();
        assertEquals("Nate", suspects.get(0).getFname());
    }

    @Test
    void testGetVictimsName() {
        // userList = DataLoader.getUsers();
        assertEquals("Tammy", victims.get(0).getFname());
    }

    @Test
    void testGetWitnessesName() {
        // userList = DataLoader.getUsers();
        assertEquals("Barry", witnesses.get(0).getFname());
    }

    @Test
    void testGetsPOIsName() {
        // userList = DataLoader.getUsers();
        assertEquals("Veronica", POI.get(0).getFname());
    }

    @Test
    void testGetOfficerssName() {
        // userList = DataLoader.getUsers();
        assertEquals("Margaret", officers.get(0).getFname());
    }

    @Test
    void testGetCriminalsName() {
        // userList = DataLoader.getUsers();
        assertEquals("Bob", criminals.get(0).getFname());

    }



}
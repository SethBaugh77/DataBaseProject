import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Nick Brady
 */
class DataWriterTest {
    private DataBase dBase = DataBase.getInstance();
    private ArrayList<User> userList = dBase.getUsers();
	private ArrayList<Case> caseList = dBase.getCases();
	private ArrayList<Witness> witList = dBase.getWitnesses();
	private ArrayList<Criminal> crimList = dBase.getCriminals();
	private ArrayList<Victim> vicList = dBase.getVictims();
	private ArrayList<Officer> offList = dBase.getOfficers();
	private ArrayList<PersonOfInterest> poiList = dBase.getPOI();
	private ArrayList<Suspect> susList = dBase.getSuspects();
	private ArrayList<Evidence> eviList = dBase.getEvidence();

    @BeforeEach
    public void setup() {
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
	//user method test cases
    @Test
    void testWritingZeroUsers() {
    	userList = dBase.getUsers();
		assertEquals(0, userList.size());
	}
	@Test
	void testWritingOneUser() {
		userList.add(new User(555, true, "James", "Monroe", "jmon", "jmon@gmail.com", "idk", "555-555-5555"));
		DataWriter.saveUser();
		assertEquals("jmon", userList.get(0).getUsername());
	}
	@Test
	void testWritingFiveUsers() {
		userList.add(new User(555, true, "James", "Monroe", "jmon", "jmon@gmail.com", "idk", "555-555-5555"));
		userList.add(new User(555, true, "James", "Monroe", "kmon", "jmon@gmail.com", "idk", "555-555-5555"));
		userList.add(new User(555, true, "James", "Monroe", "lmon", "jmon@gmail.com", "idk", "555-555-5555"));
		userList.add(new User(555, true, "James", "Monroe", "mmon", "jmon@gmail.com", "idk", "555-555-5555"));
		userList.add(new User(555, true, "James", "Monroe", "nmon", "jmon@gmail.com", "idk", "555-555-5555"));
		DataWriter.saveUser();
		assertEquals("nmon", dBase.getUsers().get(4).getUsername());
	}
	@Test
	void testWritingEmptyUser() {
		userList.add(new User(0, false, "", "", "", "", "", ""));
		DataWriter.saveUser();
		assertEquals("", dBase.getUsers().get(0).getUsername());
	}
	
	@Test
	void testWritingNullUser() {
		userList.add(new User(0, false, "", "", null, "", "", ""));
		DataWriter.saveUser();
		assertEquals(null, dBase.getUsers().get(0).getUsername());
	}
	//case method test cases
	@Test
	void testWritingZeroCases() {
    	caseList = dBase.getCases();
		assertEquals(0, caseList.size());
	}
	@Test
	void testWritingOneCase() {
		ArrayList <Long> criminalsID = new ArrayList<Long>();
        ArrayList <Long> victimsID = new ArrayList<Long>();
        ArrayList <Long> witnessesID = new ArrayList<Long>();
        ArrayList <Long> officersID = new ArrayList<Long>();
        ArrayList <Long> poiID = new ArrayList<Long>();
        ArrayList <Long> suspectsID = new ArrayList<Long>();
        ArrayList <Long> evidenceID = new ArrayList<Long>();
		caseList.add(new Case("havoc at gamestop", "robbery", "2/2/22", false, "5", false, 5555,
        criminalsID, victimsID, witnessesID, officersID,
         poiID, suspectsID, evidenceID));
		DataWriter.saveCase();
		assertEquals("havoc at gamestop", caseList.get(0).getName());
	}
	@Test
	void testWritingFiveCases() {
		ArrayList <Long> criminalsID = new ArrayList<Long>();
        ArrayList <Long> victimsID = new ArrayList<Long>();
        ArrayList <Long> witnessesID = new ArrayList<Long>();
        ArrayList <Long> officersID = new ArrayList<Long>();
        ArrayList <Long> poiID = new ArrayList<Long>();
        ArrayList <Long> suspectsID = new ArrayList<Long>();
        ArrayList <Long> evidenceID = new ArrayList<Long>();
		caseList.add(new Case("havoc at gamestop", "robbery", "2/2/22", false, "5", false, 5555,
        criminalsID, victimsID, witnessesID, officersID,
         poiID, suspectsID, evidenceID));
		 caseList.add(new Case("car jacking", "robbery", "2/2/22", false, "5", false, 5555,
        criminalsID, victimsID, witnessesID, officersID,
         poiID, suspectsID, evidenceID));
		 caseList.add(new Case("grandma fell", "robbery", "2/2/22", false, "5", false, 5555,
        criminalsID, victimsID, witnessesID, officersID,
         poiID, suspectsID, evidenceID));
		 caseList.add(new Case("Liquor store", "robbery", "2/2/22", false, "5", false, 5555,
        criminalsID, victimsID, witnessesID, officersID,
         poiID, suspectsID, evidenceID));
		 caseList.add(new Case("Bike theft", "robbery", "2/2/22", false, "5", false, 5555,
        criminalsID, victimsID, witnessesID, officersID,
         poiID, suspectsID, evidenceID));
		DataWriter.saveCase();
		assertEquals("Bike theft", dBase.getCases().get(4).getName());
	}
	@Test
	void testWritingEmptyCase() {
		ArrayList <Long> criminalsID = new ArrayList<Long>();
        ArrayList <Long> victimsID = new ArrayList<Long>();
        ArrayList <Long> witnessesID = new ArrayList<Long>();
        ArrayList <Long> officersID = new ArrayList<Long>();
        ArrayList <Long> poiID = new ArrayList<Long>();
        ArrayList <Long> suspectsID = new ArrayList<Long>();
        ArrayList <Long> evidenceID = new ArrayList<Long>();
		caseList.add(new Case("", "robbery", "2/2/22", false, "5", false, 5555,
        criminalsID, victimsID, witnessesID, officersID,
         poiID, suspectsID, evidenceID));
		DataWriter.saveCase();
		assertEquals("", dBase.getCases().get(0).getName());
	}
	@Test
	void testWritingNullCase() {
		ArrayList <Long> criminalsID = new ArrayList<Long>();
        ArrayList <Long> victimsID = new ArrayList<Long>();
        ArrayList <Long> witnessesID = new ArrayList<Long>();
        ArrayList <Long> officersID = new ArrayList<Long>();
        ArrayList <Long> poiID = new ArrayList<Long>();
        ArrayList <Long> suspectsID = new ArrayList<Long>();
        ArrayList <Long> evidenceID = new ArrayList<Long>();
		caseList.add(new Case(null, "robbery", "2/2/22", false, "5", false, 5555,
        criminalsID, victimsID, witnessesID, officersID,
         poiID, suspectsID, evidenceID));		
		DataWriter.saveCase();
		assertEquals(null, dBase.getCases().get(0).getName());
	}
	//witness method test cases
    @Test
    void testWritingZeroWitnesses() {
    	witList = dBase.getWitnesses();
		assertEquals(0, witList.size());
	}
	@Test
	void testWritingOneWitness() {
		witList.add(new Witness("I saw the man come in with a gun", "Barry", "Bonds", "79", "6'10", "250",
        "M", "123 jailbreak road", "333-333-2222", "1/1/11", true, 543, "black"));
		DataWriter.saveWitness();
		assertEquals("Barry", witList.get(0).getFname());
	}
	@Test
	void testWritingFiveWitness() {
		witList.add(new Witness("I saw the man come in with a gun", "Barry ", "Bonds", "79", "6'10", "250",
        "M", "123 jailbreak road", "333-333-2222", "1/1/11", true, 543, "black"));
		witList.add(new Witness("I saw the man come in with a gun", "Carry ", "Bonds", "79", "6'10", "250",
        "M", "123 jailbreak road", "333-333-2222", "1/1/11", true, 543, "black"));
		witList.add(new Witness("I saw the man come in with a gun", "Darry ", "Bonds", "79", "6'10", "250",
        "M", "123 jailbreak road", "333-333-2222", "1/1/11", true, 543, "black"));
		witList.add(new Witness("I saw the man come in with a gun", "Earry ", "Bonds", "79", "6'10", "250",
        "M", "123 jailbreak road", "333-333-2222", "1/1/11", true, 543, "black"));
		witList.add(new Witness("I saw the man come in with a gun", "Farry", "Bonds", "79", "6'10", "250",
        "M", "123 jailbreak road", "333-333-2222", "1/1/11", true, 543, "black"));
		DataWriter.saveWitness();
		assertEquals("Farry", dBase.getWitnesses().get(4).getFname());
	}
	@Test
	void testWritingEmptyWitness() {
		witList.add(new Witness("I saw the man come in with a gun", "", "Bonds", "79", "6'10", "250",
        "M", "123 jailbreak road", "333-333-2222", "1/1/11", true, 543, "black"));		
		DataWriter.saveWitness();
		assertEquals("", dBase.getWitnesses().get(0).getFname());
	}
	@Test
	void testWritingNullWitness() {
		witList.add(new Witness("I saw the man come in with a gun", null, "Bonds", "79", "6'10", "250",
        "M", "123 jailbreak road", "333-333-2222", "1/1/11", true, 543, "black"));
		DataWriter.saveWitness();
		assertEquals(null, dBase.getWitnesses().get(0).getFname());
	}
}

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

	//Test to check size
    @Test
    void testWritingZeroUsers() {
    	userList = dBase.getUsers();
		assertEquals(0, userList.size());
	}
	
	//test to make sure user was added
	@Test
	void testWritingOneUser() {
		userList.add(new User(555, true, "James", "Monroe", "jmon", "jmon@gmail.com", "idk", "555-555-5555"));
		DataWriter.saveUser();
		assertEquals("jmon", userList.get(0).getUsername());
	}
	//test to make sure multiple users are added 
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
	//tests to see if a user can be entered. Failed means it can be entered.
	//test to see if "" can be entered as inputs. Failure means an unwanted attribute can be entered, which we dont want.
	@Test
	void testWritingEmptyUser() {
		userList.add(new User(0, false, "", "", "", "", "", ""));
		DataWriter.saveUser();
		assertNotEquals("", dBase.getUsers().get(0).getUsername());
	}
	
	//test to see if other attributes can be entered as a user.
	@Test
	void testWritingNullUser() {
		userList.add(new User(0, false, "", "", null, "", "", ""));
		DataWriter.saveUser();
		assertNotEquals(null, dBase.getUsers().get(0).getUsername());
	}
	//case method test cases
	//test to see if size matches
	@Test
	void testWritingZeroCases() {
    	caseList = dBase.getCases();
		assertEquals(0, caseList.size());
	}

	//test to see if one case can be added
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
	//test to see if multiple cases can be added
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
	//test to see if a case can have a "" name
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
	//test to see if a case can have a null name
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
		assertNotEquals(null, dBase.getCases().get(0).getName());
	}

	//witness method test cases
	//test to see if size matches
    @Test
    void testWritingZeroWitnesses() {
    	witList = dBase.getWitnesses();
		assertEquals(0, witList.size());
	}
	
	//test to see if one witness can be entered
	@Test
	void testWritingOneWitness() {
		witList.add(new Witness("I saw the man come in with a gun", "Barry", "Bonds", "79", "6'10", "250",
        "M", "123 jailbreak road", "333-333-2222", "1/1/11", true, 543, "black"));
		DataWriter.saveWitness();
		assertEquals("Barry", witList.get(0).getFname());
	}

	//test to see if multiple witnesses can be entered
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

	//test to see if "" can be entered as a name
	@Test
	void testWritingEmptyWitness() {
		witList.add(new Witness("I saw the man come in with a gun", "", "Bonds", "79", "6'10", "250",
        "M", "123 jailbreak road", "333-333-2222", "1/1/11", true, 543, "black"));		
		DataWriter.saveWitness();
		assertEquals("", dBase.getWitnesses().get(0).getFname());
	}

	//test to see if null can be entered as a name
	@Test
	void testWritingNullWitness() {
		witList.add(new Witness("I saw the man come in with a gun", null, "Bonds", "79", "6'10", "250",
        "M", "123 jailbreak road", "333-333-2222", "1/1/11", true, 543, "black"));
		DataWriter.saveWitness();
		assertNotEquals(null, dBase.getWitnesses().get(0).getFname());
	}
	
	// criminal tests
	//test to see if one criminal can be added
    @Test
	void testWritingOneCriminal() {
        crimList.add(new Criminal("Hunter", "Lee", "30", "6'2", "200", null, "M", 
        "22 Lep Lane", "2226509802", "01/22/90", true, true, "limp", "10", 0645, "white", "brown" ));
		DataWriter.saveCriminal();
		assertEquals("Hunter", crimList.get(0).getFname());
    }
    
	//test to see if a criminal can have a null name
    @Test
	void testWritingNullCriminal() {
		crimList.add(new Criminal(null, "Lee", "30", "6'2", "200", null, "M", 
        "22 Lep Lane", "2226509802", "01/22/90", true, true, "limp", "10", 0645, "white", "brown" ));
		DataWriter.saveCriminal();
		assertNotEquals(null, dBase.getCriminals().get(0).getFname());
    }
    
    // suspect tests
	//test to see if one suspect can be added
    @Test
	void testWritingOneSuspect() {
		susList.add(new Suspect("Hunter", "Lee", "30", "6'2", "200", "M", "22 Sein Lane", null, null, false, 0, null, null, null, false, null, null, null));
		DataWriter.saveSuspect();
		assertEquals("Hunter", susList.get(0).getFname());
    }
    
	//test to see if a suspect can have a null name
    @Test
	void testWritingNullSuspect() {
		susList.add(new Suspect(null, "Lee", "30", "6'2", "200", "M", "22 Sein Lane", null, null, false, 0, null, null, null, false, null, null, null));
		DataWriter.saveSuspect();
		assertNotEquals(null, dBase.getSuspects().get(0).getFname());
    }
    
    // officer tests
	//test to see if an officer can be added
    @Test
	void testWritingOneOfficer() {
        offList.add(new Officer("1801", "Officer", "MD", "Anya", "Star", "30", 
        "5'10", "170", "F", "22 Sein Lane", "2023650982", "11/10/90", true, 0672, "white"));
		DataWriter.saveOfficer();
		assertEquals("Anya", offList.get(0).getFname());
    }
    
	//test to see if an officer can have a name of null
    @Test
	void testWritingNullOfficer() {
		offList.add(new Officer("1801", "Officer", "MD", null, "Star", "30", 
        "5'10", "170", "F", "22 Sein Lane", "2023650982", "11/10/90", true, 0672, "white"));
		DataWriter.saveOfficer();
		assertNotEquals(null, dBase.getOfficers().get(0).getFname());
    }
    
    // POI tests
	//test to see if a POI can be entered
    @Test
	void testWritingOnePOI() {
        poiList.add(new PersonOfInterest("Hunter", "Lee", "30", "6'2", "200", "M", 
        "22 Lep Lane", "2226509802", "01/22/90", true, "doctor", "PA", 2306, "white", "grey", null));
		DataWriter.savepoi();
		assertEquals("Hunter", poiList.get(0).getFname());
    }
    
	//test to see if a POI can have a null name
    @Test
	void testWritingNullPOI() {
		poiList.add(new PersonOfInterest(null, "Lee", "30", "6'2", "200", "M", 
        "22 Lep Lane", "2226509802", "01/22/90", true, "doctor", "PA", 2306, "white", "grey", null));
		DataWriter.savepoi();
		assertNotEquals(null, dBase.getPOI().get(0).getFname());
    }
    
    // victim test
	//test to see if a victim can be entered
    @Test
	void testWritingOneVictim() {
        vicList.add(new Victim(true, "I was scared", "Hunter", "Lee", "30", "6'2", "200", "M", 
        "22 Lep Lane", "2226509802", "01/22/90", true, 2306, "white"));
		DataWriter.saveVictim();
		assertEquals("Hunter", vicList.get(0).getFname());
    }
    
	//test to see if a victim can have a null name
    @Test
	void testWritingNullVictim() {
		vicList.add(new Victim(true, "I was scared", null, "Lee", "30", "6'2", "200", "M", 
        "22 Lep Lane", "2226509802", "01/22/90", true, 2306, "white"));
		DataWriter.saveVictim();
		assertNotEquals(null, dBase.getVictims().get(0).getFname());
    }
    
    // evidence tests
	//test to see if one evidence can be entered
    @Test
	void testWritingOneEvidence() {
        eviList.add(new Evidence(9210, "toyota", "type O", null, "gun", null));
		DataWriter.saveEvidence();
		assertEquals("toyota", eviList.get(0).getVehicle());
    }
    
	//test to see if an evidence can have a null attribute
    @Test
	void testWritingNullEvidence() {
		eviList.add(new Evidence(921, null, "type O", null, "gun", null));
		DataWriter.saveEvidence();
		assertNotEquals(null, dBase.getEvidence().get(0).getVehicle());
	}

	//test to see if two different accounts can have the same username
	@Test
	void testDuplicateUsername()
	{
	 userList.add(new User(555, true, "James", "Monroe", "jmon", "jmon@gmail.com", "idk", "555-555-5555"));
	 userList.add(new User(555, true, "James", "Monroe", "jmon", "jmon@gmail.com", "idk", "555-555-5555"));
	 assertEquals(null, userList.get(2).getUsername());
 
		
	}
	//test to see if two different accounts can have the same email
	@Test
	void testDuplicateEmail()
	{
	 userList.add(new User(555, true, "James", "Monroe", "jmon", "jmon@gmail.com", "idk", "555-555-5555"));
	 userList.add(new User(555, true, "James", "Monroe", "jmon", "jmon@gmail.com", "idk", "555-555-5555"));
	 assertEquals(null, userList.get(2).getEmail());
	 }





}

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

  /*
  * @author Nick Brady
  */

class DataWriterTest {
    private DataBase dBase = DataBase.getInstance();
    private ArrayList<User> userList = dBase.getUsers();

    @BeforeEach
    public void setup() {
        DataBase.getInstance().getUsers().clear();
        DataWriter.saveUser();
    }
    @AfterEach
    public void tearDown() {
        DataBase.getInstance().getUsers().clear();
        DataWriter.saveUser();
    }
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
}

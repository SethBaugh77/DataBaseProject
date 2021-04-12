package Project;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.*;
class DataBaseTest {
	
	DataBase Base = DataBase.getInstance();
	
	 ArrayList<Criminal> Crimlist = new ArrayList<>()
			
	Crimlist = Base.getCriminals();
	
String Haircolor = "black";	

Criminal c = new Criminal("Robert" , "Brown", "30 year old","6foot1inch", "160punds"  , "personal"," male", "123 westlane", "756-3245", "09/08/1998", true, false, "N/A", "0 crimes" ,23456345," hispanic", "black");
PersonOfInterest poi = new PersonOfInterst("lee" , "tesa", "22 year old","5foot9inch", "140punds"  ," male", "123 westlane", "756-3245", "09/08/1998", true, "Accountant", "McDonalds" ,7684364," black","watch on left hand", "black");
Witness Rb = new Witness(" destressed","Robert" , "Brown", "45 year old","5foot8inch", "135punds"  ," female", "321 eastlane", "756-3245", "09/08/1998", true,,23456345," hispanic");

@Test
	void testgetCriminals() {
	
	Base.getCriminals().add(new Criminal("Robert" , "Brown", "30 year old","6foot1inch", "160punds"  , "personal"," male", "123 westlane", "756-3245", "09/08/1998", true, false, "N/A", "0 crimes" ,23456345," hispanic", "black"));
		
	int f =Base.getCriminals().indexOf(c);
		
		assertSame(c, Base.getCriminals().get(f));
		
		fail("Not yet implemented");
	}

void testgetVictims() {
	//Project.Victim.Victim(boolean isHealthy, String victimState, String fName, String lName, String Age, String Height, String Weight, String Gender, String Address, String Phone, String DateOfBirth, boolean IsAdult, long id, String race)
	Base.getVictims().add(new Victim(false, "in hospital","Robert" , "Brown", "25 year old","5foot5inch", "120punds"  ," female", "321 eastlane", "756-3245", "09/08/1998", true,,23456345," hispanic"));
		
	int f =Base.getVictims().indexOf(c);
		
		assertSame(c, Base.getCriminals().get(f));
		
		fail("Not yet implemented");
	}

}

void testgetWitnesses() {
	// Witness(String witnessState, String fName, String lname, String Age, String Height, String Weight,String Gender, String Address, String Phone, String DateOfBirth, boolean IsAdult, long id, String race)
	Base.getWitnesses().add(new Witness(" destressed","Robert" , "Brown", "45 year old","5foot8inch", "135punds"  ," female", "321 eastlane", "756-3245", "09/08/1998", true,,23456345," hispanic"));
		
	int f =Base.getWitnesses().indexOf(c);
		
		assertSame(c, Base.getWitnesses().get(f));
		
		fail("Not yet implemented");
	}

void testgetCases() {
	// Case(ArrayList<Criminal> Criminals, ArrayList<Victim> Victims, ArrayList<Witness> Witnesses,ArrayList<Officer> Officers, ArrayList<String> poi, int _CaseID, String crime, String date,boolean isSolved, int _Severity, boolean isFederal
	Base.getCases().add(new Case(Base.getCriminals(),Base.getVictims() , Base.getWitnesses(), Base.getOfficers(),Base.getPOI(), 45, "bank robbery", "04/04/2004",false,5, false);

	int f =Base.getCases().indexOf(c);
		
		assertSame(c, Base.getCases().get(f));
		
		fail("Not yet implemented");
	}
}

import java.util.*;
public class DataBase {
	ArrayList<Criminal> criminals= new ArrayList<Criminal>();
	ArrayList<Case> cases= new ArrayList<Case>();
	ArrayList<User> users= new ArrayList<User>();
	ArrayList<Victim> victims= new ArrayList<Victim>();
	ArrayList<Witness> witnesses= new ArrayList<Witness>();
	ArrayList<Officer> officers= new ArrayList<Officer>();
	ArrayList<String> POI= new ArrayList<String>();
	ArrayList<String> suspects= new ArrayList<String>();

	public void DataBase(ArrayList<Criminal> Criminals,ArrayList<Case> Cases,ArrayList<User> Users,ArrayList<Victim> Victims,ArrayList<Witness> Witnesses,
			ArrayList<Officer> Officers,ArrayList<String> poi,ArrayList<String> Suspects)
	{
		this.criminals = Criminals;
		this.cases = Cases;
		this.users = Users;
		this.victims = Victims;
		this.witnesses= Witnesses;
		this.officers= Officers;
		this.POI=poi;
		this.suspects= Suspects;
		return;
		
	}
	
	public void printData()
	{
	
	System.out.print("Person of Interst");
	
	
	for(String data : POI) {
	
		System.out.print(data);
	}
	
	for(String data : suspects) {
		
		System.out.println(data);
	}
	
	for(Criminal data : criminals) {
	
		System.out.println(data);
	}
	
	for(Case data : cases){
		
		System.out.print(data);
	}
	
	for(User data : users) {
		
		System.out.println(data);
	}
	
	for(Victim data : victims) {
		 
		System.out.println(data);
		
	}
	
	for(Witness data : witnesses) {
	
	System.out.println(data);
	
	}
	
	for(Officer data : officers) {
		
	System.out.println(data);
	
	}
	
	}
	
	}	

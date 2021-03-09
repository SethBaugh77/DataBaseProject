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
		int num = 0;
		System.out.println("Criminal list: ");
	while(criminals.isEmpty!= null)
	{
	System.out.println(criminals(num));
	num++;
	}
	System.out.println();
	num=0;
	System.out.println("Cases: ");
	while(cases.isEmpty!= null)
	{
	System.out.println(cases(num));
	num++;
	}
	System.out.println();
	num=0;
	System.out.println("Users: ");
	while(users.isEmpty!= null)
	{
	System.out.println(users(num));
	num++;
	}
	System.out.println();
	num=0;
	System.out.println("Victims: ");
	while(victims.isEmpty!= null)
	{
	System.out.println(victims(num));
	num++;
	
	}
	System.out.println();
	num=0;
	System.out.println("Witnesses: ");
	while(witnesses.isEmpty!= null)
	{
	System.out.println(witnesses(num));
	num++;
	System.out.println();
	num=0;
	System.out.println("Officers: ");
	while(officers.isEmpty!= null)
	{
	System.out.println(officers(num));
	num++;
	System.out.println();
	num=0;
	System.out.println("Person of intrest: ");
	while(POI.isEmpty() =! null)
	{
	System.out.println(POI(num));
	num++;
	System.out.println();
	num=0;
	System.out.println("Suspects: ");
	while(suspects.isEmpty() =! null)
	{
	System.out.println(suspects(num));
	num++;

}

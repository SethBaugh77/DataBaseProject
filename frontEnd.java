import java.util.Scanner;
import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.IllegalFormatWidthException;
import java.util.concurrent.ThreadLocalRandom;

import javax.lang.model.util.ElementScanner6;

//import jdk.internal.org.jline.terminal.impl.jna.win.Kernel32.WINDOW_BUFFER_SIZE_RECORD;

import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;  // Import the IOException class to handle errors

//import jdk.vm.ci.meta.Assumptions.LeafType;

public class frontEnd {
    static Scanner keyboard = new Scanner(System.in);
    static DataBase dBase;

    public static void main(String args[]) {
// create instance
        dBase = DataBase.getInstance();
        
        frontEnd fEnd = new frontEnd();
        
        User user;
        
        while (true) {
            user = fEnd.promptForUsernameAndPassword();

            if (user != null) {

                while (true)
                    fEnd.doAction(dBase, user);
            }
        }

    }

    public User promptForUsernameAndPassword() {

        System.out.println("Enter username:");
        String inp = keyboard.nextLine();
        System.out.println("Enter password:");
        String inp2 = keyboard.nextLine();

        for (int i = 0; i < dBase.getUsers().size(); i++) {
            System.out.println(dBase.getUsers().get(i).getUsername());
            if (inp.equals(dBase.getUsers().get(i).getUsername())) {
                if (inp2.equals(dBase.getUsers().get(i).getPassword())) {
                    return dBase.getUsers().get(i);
                }
            }
        }
        return null;

    }

    public void doAction(DataBase dbase, User user) {
        System.out.println("Welcome to the database. What would you like to do?");
        System.out.println("1. Search for a person.");
        System.out.println("2. Search for a case.");
        System.out.println("3. Add new Person.");
        System.out.println("4. Add new case.");
        System.out.println("5. Remove Person.");
        System.out.println("6. Remove Case.");
        System.out.println("7. Add User.");
        System.out.println("8. Quit application");
        System.out.println("9. Write to file");
        int inp = keyboard.nextInt();

        if (inp == 1) {
            boolean search = false;
            String inp2;
            String inp3 = "";
            System.out.println("Would you like to search by name or attribute? 1 for name, 2 for attribute.");
            int search2 = keyboard.nextInt();
            if (search2 == 1) {
                search = true;
                System.out.println("Enter the first name of the person you would like to find");

                keyboard.nextLine();
                inp2 = keyboard.nextLine();
                System.out.println("Enter the last name of the person you would like to find");

                inp3 = keyboard.nextLine();
            } else {
                System.out.println("Enter the attribute you would like to search for.");
                String attribute = keyboard.nextLine();
                inp2 = keyboard.nextLine();
            }
            boolean remove = false;
            ArrayList<Person> names = new ArrayList<Person>();
            names = searchPerson(inp2, inp3, remove, search, false);
            displayPersonResults(names);
            System.out.println("Whose attributes would you like to see? Type their last name");
            String who = keyboard.nextLine();
            for (int i = 0; i < names.size(); i++) {
                if (names.get(i).getLname().equalsIgnoreCase(who)) {
                    System.out.println("First Name: " + names.get(i).getFname());
                    System.out.println("Last Name: " + names.get(i).getLname());
                    System.out.println("Addres: " + names.get(i).getAddress());
                    System.out.println("Age: " + names.get(i).getAge());
                    System.out.println("DOB: " + names.get(i).getDateOfBirth());
                    System.out.println("Gender " + names.get(i).getGender());
                    System.out.println("Height: " + names.get(i).getHeight());
                    System.out.println("ID: " + names.get(i).getID());
                    System.out.println("Phone: " + names.get(i).getPhone());
                    System.out.println("Race: " + names.get(i).getRace());
                    System.out.println("Weight: " + names.get(i).getWeight());
                    System.out.println("Is Adult: " + names.get(i).getIsAdult());
                    if(names.get(i) instanceof Criminal)
                    {
                        Criminal crim =(Criminal)names.get(i);
                        System.out.println("In Jail?: " + crim.getJail());
                        System.out.println("Notes: " + crim.getNotes());
                        System.out.println("NumCrimes: " + crim.getNumCrimes());
                        break;
                    }
                    else if(names.get(i) instanceof Suspect)
                    {
                       // else if(names.get(i).getLname().equalsIgnoreCase(who) && names.get(i) instanceof Suspect)
                        //{
                            Suspect suspect =(Suspect)names.get(i);
                    
        
                            System.out.println("bodyType: " + suspect.getBodyType());
                            System.out.println("isCriminal: " + suspect.getIsCriminal());
                            System.out.println("Occupation: " + suspect.getOccupation());
        
                            System.out.println("lastLocation: " + suspect.getLastLocation());
                            System.out.println("Notes: " + suspect.getPoiNotes());
                            System.out.println("Tatoos: " + suspect.getTatoos());
        
                        //}
                    }
                    else if(names.get(i) instanceof Officer)
                    {
                        Officer officer =(Officer)names.get(i);
                        System.out.println("badgeNumber: " + officer.getBadgeNumber());
                        System.out.println("officerRank: " + officer.getOfficerRank());
                        System.out.println("officerStatement: " + officer.getOfficerStatement());
                    }
                    else if(names.get(i) instanceof Witness)
                    {
                        Witness witness = (Witness)names.get(i);
                       System.out.println("Witness Statement: "+  witness.getWitnessStatement());
                    }
                    else if(names.get(i) instanceof Victim)
                    {
                        Victim victim = (Victim)names.get(i);
                        System.out.println("Is Healthy: "+  victim.getIsHealthy());
                        System.out.println("Victim Statement: "+  victim.getVictimStatement());
                        
                    }
                    else if(names.get(i) instanceof PersonOfInterest)
                    {
                        PersonOfInterest poi = (PersonOfInterest)names.get(i);
                        System.out.println("Occupation: "+  poi.getOccupation());
                        System.out.println("Location: "+  poi.getLastLocation());
                        System.out.println("Notes: "+  poi.getPoiNotes());
                        System.out.println("Tatoos: "+  poi.getTatoos());
                    }
                    

                }
                

            }
            System.out.println("Type anything to continue");
            String test = keyboard.nextLine();

        } else if (inp == 2) {

            System.out.println("Enter the ID of the case you would like to find");
            int inp2 = keyboard.nextInt();
            for (int i = 0; i < dBase.getCases().size(); i++) {
                if (dBase.getCases().get(i).getCaseID() == inp2)
                    displayCaseResults(dBase.getCases().get(i));

            }

        } else if (inp == 3) {
            System.out.println("Which kind of person will you be entering?");
            System.out.println("1. Criminal");
            System.out.println("2. Person of Interest");
            System.out.println("3. Suspect");
            System.out.println("4. Officer");
            System.out.println("5. Witness");
            System.out.println("6. Victim");
            int inp2 = keyboard.nextInt();
            addPerson(dbase, inp2);

        } else if (inp == 4) {
            System.out.println("Enter in the attributes for your case. Press enter after every insert.");
            System.out.println("1. Name 2.crimetype 3. Date 4. isSolved 5. Severity 6. isFederal 7.");

            keyboard.nextLine();
            String Name = keyboard.nextLine();
            String crimeType = keyboard.nextLine();
            String Date = keyboard.nextLine();
            boolean isSolved = keyboard.nextBoolean();
            long Severity = keyboard.nextLong();
            boolean isFederal = keyboard.nextBoolean();
            long ID = ThreadLocalRandom.current().nextInt(2000, 2997 + 1);
            ArrayList<Long> criminals = new ArrayList<Long>();
            ArrayList<Long> victims = new ArrayList<Long>();
            ArrayList<Long> witnesses = new ArrayList<Long>(); // -CaseID: int
            ArrayList<Long> officers = new ArrayList<Long>();
            ArrayList<Long> poi = new ArrayList<Long>();
            ArrayList<Long> suspects = new ArrayList<Long>();
            Case _case = new Case(Name, crimeType, Date, isSolved, Severity, isFederal, ID, criminals, victims,
                    witnesses, officers, poi, suspects);
            while (true) {
                System.out.println("Which type of person would you like to add to the case?");
                System.out.println("1. Criminal");
                System.out.println("2. Person of Interest");
                System.out.println("3. Suspect");
                System.out.println("4. Officer");
                System.out.println("5. Witness");
                System.out.println("6. Victim");

                int inp2 = keyboard.nextInt();
                if (inp2 == 1) {
                    _case.getCriminals().add((Long) addPerson(dbase, inp2).getID());

                } else if (inp2 == 2) {
                    _case.getPoi().add((Long) addPerson(dbase, inp2).getID());

                } else if (inp2 == 3) {
                    _case.getSuspects().add((Long) addPerson(dbase, inp2).getID());
                } else if (inp2 == 4) {
                    _case.getOfficers().add((Long) addPerson(dbase, inp2).getID());
                } else if (inp2 == 5) {
                    _case.getWitnesses().add((Long) addPerson(dbase, inp2).getID());
                } else if (inp2 == 6) {
                    _case.getVictims().add((Long) addPerson(dbase, inp2).getID());
                }

                System.out.println("Do you want to enter another person? Y/N");

                String ans = keyboard.nextLine();
                if (ans.equalsIgnoreCase("N") || ans.equalsIgnoreCase("No")) {

                    break;
                }

            }
            System.out.println("Would you like to add any evidence to the case? Y/N");
            String ans6 = keyboard.nextLine();
            if (ans6.equalsIgnoreCase("Y") || ans6.equalsIgnoreCase("Yes")) {
                System.out.println("Enter evidence. Press enter after each insert");
                System.out.println("1. Blood evidence 2. Vehicle evidence 3. fingerPrintEvidence 4. weaponEvidence 5.");

                String bloodEvidence = keyboard.nextLine();
                String vehicleEvidence = keyboard.nextLine();
                String fingerPrintEvidence = keyboard.nextLine();
                String weaponEvidence = keyboard.nextLine();

                Evidence evidence = new Evidence(ID, vehicleEvidence, bloodEvidence, fingerPrintEvidence,
                        weaponEvidence);
                _case.getEvidence().add(evidence.getID());

                dbase.getCases().add(_case);
                DataWriter.saveCase();

                dBase.getEvidence().add(evidence);

                DataWriter.saveEvidence();
            }

        } else if (inp == 5) {
            if (user.getAdmin() == true) {
                System.out.println("Enter the first name of the person you would like to remove.");
                System.out.println("Enter the last name of the person you would like to remove.");
                keyboard.nextLine();
                String input5 = keyboard.nextLine();
                String input6 = keyboard.nextLine();

                searchPerson(input5, input6, true, true, false);

            } else {
                adminErrorMessage();
            }

        } else if (inp == 6) {
        	
        	System.out.println("Enter the case number of the case you would like to remove.");
           
        	int input7 = keyboard.nextInt();
            
            ArrayList<Case> Caselist = dbase.getCases();
            
           Caselist.remove(input7);

        } else if (inp == 7) {
            System.out.println("Enter in attributes for person to be added. Press enter after each input.");
            System.out.println("1. firstName 2. lastName 3. username 4. password, 5. email 6. phone 7. Admin?");
            String fName, lName, Username, Password, Email, Phone;
            boolean Admin;
            keyboard.nextLine();
            fName = keyboard.nextLine();
            lName = keyboard.nextLine();
            Username = keyboard.nextLine();
            Password = keyboard.nextLine();
            Email = keyboard.nextLine();
            Phone = keyboard.nextLine();
            Admin = keyboard.nextBoolean();
            long ID = ThreadLocalRandom.current().nextInt(1000, 1997 + 1);
            User user1 = new User(ID, Admin, fName, lName, Username, Email, Password, Phone);
            dBase.getUsers().add(user1);
            DataWriter.saveUser();

        } else if (inp == 8) {
            System.exit(0);
        }
        else if(inp == 9)
        {
            System.out.println("Would you like to write a person to a file or a case? 1 for person 2 for case");
            int next = keyboard.nextInt();
            if(next == 1)
            {
                System.out.println("Enter the first name of the person you would like to write");
                keyboard.nextLine();
                String fName = keyboard.nextLine();
                System.out.println("Enter the last name fo the person you would like to write");
                String lName = keyboard.nextLine();
               ArrayList<Person> person = searchPerson(fName, lName, false, true, true);
                Case _case = new Case();
                _case = null;
            writeToFile(person, _case);
            }
        }

    }

    public void adminErrorMessage() {
        System.out.println("Error, you need to be an admin to access this.");
    }

    // search by name
    public ArrayList<Person> searchPerson(String input, String input2, boolean remove, boolean name, boolean write) {
        if (name == true) {
            if (remove == false) {
                if(write == false)
                {
                ArrayList<Person> names = new ArrayList<Person>();
                for (int i = 0; i < dBase.getCriminals().size(); i++) {
                    if (dBase.getCriminals().get(i).getFname().equalsIgnoreCase(input)
                            || dBase.getCriminals().get(i).getLname().equalsIgnoreCase(input2))
                        names.add(dBase.getCriminals().get(i));
                }
                for (int i = 0; i < dBase.getWitnesses().size(); i++) {
                    if (dBase.getWitnesses().get(i).getFname().equalsIgnoreCase(input)
                            || dBase.getWitnesses().get(i).getLname().equalsIgnoreCase(input2))
                        names.add(dBase.getWitnesses().get(i));
                }
                for (int i = 0; i < dBase.getSuspects().size(); i++) {
                    if (dBase.getSuspects().get(i).getFname().equalsIgnoreCase(input)
                            || dBase.getSuspects().get(i).getLname().equalsIgnoreCase(input2))
                        names.add(dBase.getSuspects().get(i));
                }
                for (int i = 0; i < dBase.getPOI().size(); i++) {
                    if (dBase.getPOI().get(i).getFname().equalsIgnoreCase(input)
                            || dBase.getPOI().get(i).getLname().equalsIgnoreCase(input2))
                        names.add(dBase.getPOI().get(i));
                }
                for (int i = 0; i < dBase.getVictims().size(); i++) {
                    if (dBase.getVictims().get(i).getFname().equalsIgnoreCase(input)
                            || dBase.getVictims().get(i).getLname().equalsIgnoreCase(input2))
                        names.add(dBase.getVictims().get(i));
                }
                for (int i = 0; i < dBase.getOfficers().size(); i++) {
                    if (dBase.getOfficers().get(i).getFname().equalsIgnoreCase(input)
                            || dBase.getOfficers().get(i).getLname().equalsIgnoreCase(input2))
                        names.add(dBase.getOfficers().get(i));
                }
                if (names.size() == 0)
                    System.out.println("No one was found");
                return names;
            }
            else{
                ArrayList<Person> names = new ArrayList<Person>();
                for (int i = 0; i < dBase.getCriminals().size(); i++) {
                    if (dBase.getCriminals().get(i).getFname().equalsIgnoreCase(input)
                            && dBase.getCriminals().get(i).getLname().equalsIgnoreCase(input2))
                        names.add(dBase.getCriminals().get(i));
                }
                for (int i = 0; i < dBase.getWitnesses().size(); i++) {
                    if (dBase.getWitnesses().get(i).getFname().equalsIgnoreCase(input)
                            && dBase.getWitnesses().get(i).getLname().equalsIgnoreCase(input2))
                        names.add(dBase.getWitnesses().get(i));
                }
                for (int i = 0; i < dBase.getSuspects().size(); i++) {
                    if (dBase.getSuspects().get(i).getFname().equalsIgnoreCase(input)
                            && dBase.getSuspects().get(i).getLname().equalsIgnoreCase(input2))
                        names.add(dBase.getSuspects().get(i));
                }
                for (int i = 0; i < dBase.getPOI().size(); i++) {
                    if (dBase.getPOI().get(i).getFname().equalsIgnoreCase(input)
                            && dBase.getPOI().get(i).getLname().equalsIgnoreCase(input2))
                        names.add(dBase.getPOI().get(i));
                }
                for (int i = 0; i < dBase.getVictims().size(); i++) {
                    if (dBase.getVictims().get(i).getFname().equalsIgnoreCase(input)
                            && dBase.getVictims().get(i).getLname().equalsIgnoreCase(input2))
                        names.add(dBase.getVictims().get(i));
                }
                for (int i = 0; i < dBase.getOfficers().size(); i++) {
                    if (dBase.getOfficers().get(i).getFname().equalsIgnoreCase(input)
                            || dBase.getOfficers().get(i).getLname().equalsIgnoreCase(input2))
                        names.add(dBase.getOfficers().get(i));
                }
                if (names.size() == 0)
                    System.out.println("No one was found");
                return names;
            }
            } else {
                for (int i = 0; i < dBase.getCriminals().size(); i++) {
                    if (dBase.getCriminals().get(i).getFname().equalsIgnoreCase(input)
                            && dBase.getCriminals().get(i).getLname().equalsIgnoreCase(input2)) {
                        dBase.getCriminals().remove(dBase.getCriminals().get(i));
                        DataWriter.saveCriminal();
                    }
                }
                for (int i = 0; i < dBase.getWitnesses().size(); i++) {
                    if (dBase.getWitnesses().get(i).getFname().equalsIgnoreCase(input)
                            && dBase.getWitnesses().get(i).getLname().equalsIgnoreCase(input2)) {
                        dBase.getWitnesses().remove(dBase.getWitnesses().get(i));
                        DataWriter.saveWitness();
                    }
                }
                for (int i = 0; i < dBase.getSuspects().size(); i++) {
                    if (dBase.getSuspects().get(i).getFname().equalsIgnoreCase(input)
                            && dBase.getSuspects().get(i).getLname().equalsIgnoreCase(input2)) {
                        dBase.getSuspects().remove(dBase.getSuspects().get(i));
                        DataWriter.saveSuspect();
                    }
                }
                for (int i = 0; i < dBase.getPOI().size(); i++) {
                    if (dBase.getPOI().get(i).getFname().equalsIgnoreCase(input)
                            && dBase.getPOI().get(i).getLname().equalsIgnoreCase(input2)) {
                        dBase.getPOI().remove(dBase.getPOI().get(i));
                        DataWriter.savepoi();
                    }
                }
                for (int i = 0; i < dBase.getVictims().size(); i++) {
                    if (dBase.getVictims().get(i).getFname().equalsIgnoreCase(input)
                            && dBase.getVictims().get(i).getLname().equalsIgnoreCase(input2)) {
                        dBase.getVictims().remove(dBase.getVictims().get(i));
                        DataWriter.saveVictim();
                    }
                }
                for (int i = 0; i < dBase.getOfficers().size(); i++) {
                    if (dBase.getOfficers().get(i).getFname().equalsIgnoreCase(input)
                            && dBase.getOfficers().get(i).getLname().equalsIgnoreCase(input2)) {
                        dBase.getOfficers().remove(dBase.getOfficers().get(i));
                        DataWriter.saveOfficer();
                    }
                }
                return null;
            }
        }
        // search by others
        else {
            ArrayList<Person> names = new ArrayList<Person>();
            for (int i = 0; i < dBase.getCriminals().size(); i++) {
                if (dBase.getCriminals().get(i).getNotes().equalsIgnoreCase(input))
                    names.add(dBase.getCriminals().get(i));
            }
            for (int i = 0; i < dBase.getSuspects().size(); i++) {
                if (dBase.getSuspects().get(i).getpoiNotes().equalsIgnoreCase(input))
                    names.add(dBase.getSuspects().get(i));
            }
            for (int i = 0; i < dBase.getPOI().size(); i++) {
                if (dBase.getPOI().get(i).getPoiNotes().equalsIgnoreCase(input))
                    names.add(dBase.getPOI().get(i));
            }
            if (names.size() == 0)
                System.out.println("No one was found");
            return names;
        }

    }

    public void displayPersonResults(ArrayList<Person> aList) {
        System.out.println("Searching database...");

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i).getFname() + " " + aList.get(i).getLname());
        }
        System.out.println("All eligible persons were found...");

    }

    public Person addPerson(DataBase dbase, int inp2) {

        if (inp2 == 1) {

            System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
            System.out.println(
                    "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
            System.out.println("10. inJail 11. numCrimes 12. crimeType 13. Age 14. Notes ");
            String fName, lName, Gender, Address, Phone, DOB, crimeType, Notes, race;
            long Age, Height, Weight, numCrimes;
            boolean Adult, inJail;

            long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);

            keyboard.nextLine();
            fName = keyboard.nextLine();
            lName = keyboard.nextLine();
            // keyboard.nextDouble();
            Height = keyboard.nextLong(); // Criminal
            Weight = keyboard.nextLong();
            keyboard.nextLine();
            Gender = keyboard.nextLine();
            Address = keyboard.nextLine();
            Phone = keyboard.nextLine();
            DOB = keyboard.nextLine();
            Adult = keyboard.nextBoolean();
            inJail = keyboard.nextBoolean();
            numCrimes = keyboard.nextLong();
            keyboard.nextLine();
            crimeType = keyboard.nextLine();
            Age = keyboard.nextLong();
            keyboard.nextLine();
            Notes = keyboard.nextLine();
            race = keyboard.nextLine();
            Criminal crim = new Criminal(fName, lName, Age, Height, Weight, Gender, Address, Phone, DOB, Adult, inJail,
                    Notes, numCrimes, ID, race);

            dbase.getCriminals().add(crim);
            // dbase.getCriminals().add(crim);
            DataWriter.saveCriminal();
            return crim;

        } else if (inp2 == 2) {
            System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
            System.out.println(
                    "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
            System.out.println("10. occupation? 11. lastLocation 12. age 13. Race 14. Tatoos 15. Notes ");

            String fName, lName, Gender, Address, Phone, DOB, crimeType, Occupation, lastLocation, Notes, Race, Tatoos;
            long Age, Height, Weight, numCrimes;
            boolean Adult;

            fName = "Billy";
            lName = "Bob";
            // keyboard.nextDouble();
            Height = 65; // Criminal
            Weight = 150;

            Gender = "M";
            Address = "999 idk lane";
            Phone = "888 888 8888"; // poi
            DOB = "2/2/22";
            Adult = true;
            // inJail =true;
            numCrimes = 15;

            crimeType = "Assault";
            Age = 65;
            Occupation = "teacher";
            lastLocation = "school";
            Race = "white";

            Notes = "bad guy";
            long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);

            Tatoos = keyboard.nextLine();
            Race = keyboard.nextLine();
            PersonOfInterest poi = new PersonOfInterest(fName, lName, Age, Height, Weight, Gender, Address, Phone, DOB,
                    Adult, Occupation, lastLocation, ID, Race, Notes, Tatoos);
            dbase.getPOI().add(poi);
            DataWriter.savepoi();
            return poi;

        } else if (inp2 == 3) {
            System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
            System.out.println(
                    "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
            System.out.println(
                    "10. occupation? 11. lastLocation 12. age 13. body type, 14. Race 15. Criminal 16. Tatoos 17. Notes");
            String fName, lName, Gender, Address, Phone, DOB, Occupation, lastLocation, bodyType, Notes, Race, Tatoos;
            long Age, Height, Weight, numCrimes;
            boolean Adult, inJail, isCriminal;

            long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);

            keyboard.nextLine();
            fName = keyboard.nextLine();
            lName = keyboard.nextLine();
            // age = keyboard.nextLong();
            Height = keyboard.nextLong();
            Weight = keyboard.nextLong(); // Suspect
            keyboard.nextLine();
            Gender = keyboard.nextLine();
            Address = keyboard.nextLine();
            Phone = keyboard.nextLine();
            DOB = keyboard.nextLine();
            Adult = keyboard.nextBoolean();
            keyboard.nextLine();
            Occupation = keyboard.nextLine();
            lastLocation = keyboard.nextLine();
            Age = keyboard.nextLong();
            keyboard.nextLine();
            bodyType = keyboard.nextLine();
            Race = keyboard.nextLine();
            isCriminal = keyboard.nextBoolean();
            keyboard.nextLine();
            Notes = keyboard.nextLine();
            Tatoos = keyboard.nextLine();
            // long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);
            Suspect suspect = new Suspect(fName, lName, Age, Height, Weight, Gender, Address, Phone, DOB, Adult, ID,
                    Occupation, lastLocation, bodyType, isCriminal, Race, Notes, Tatoos);
            dbase.getSuspects().add(suspect);
            DataWriter.saveSuspect();
            return suspect;
        } else if (inp2 == 4) {
            System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
            System.out.println(
                    "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
            System.out.println("10. badgeNumber 11. rank 12. statement 13. age 14. Race 15. Notes");

            String fName, lName, Gender, Address, Phone, DOB, Rank, Statement, Race, Notes;
            long Age, Height, Weight, badgeNumber;
            boolean Adult;

            fName = "Billy";
            lName = "Bob";
            // keyboard.nextDouble();
            Height = 65; // Criminal
            Weight = 150;

            Gender = "M";
            Address = "999 idk lane";
            Phone = "888 888 8888";
            DOB = "2/2/22";
            Adult = true;
            Rank = "Sheriff";
            badgeNumber = 123;
            // inJail =true;
            // numCrimes = 15;
            Race = "white";
            // crimeType = "Assault";
            Age = 65;

            Statement = "bad guy";
            long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);

            Race = keyboard.nextLine();
            // long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);
            Officer officer = new Officer(badgeNumber, Rank, Statement, fName, lName, Age, Height, Weight, Gender,
                    Address, Phone, DOB, Adult, ID, Race);
            dBase.getOfficers().add(officer);
            DataWriter.saveOfficer();
            return officer;
        } else if (inp2 == 5) {
            System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
            System.out.println(
                    "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
            System.out.println("10. Age 11. Statement 12. Race 13. Notes");
            String fName, lName, Gender, Address, Phone, DOB, Statement, Race, Notes;
            long Age, Height, Weight;
            boolean Adult;

            long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);

            keyboard.nextLine();
            fName = keyboard.nextLine();
            lName = keyboard.nextLine();
            // Age = keyboard.nextLong();
            Height = keyboard.nextLong();
            Weight = keyboard.nextLong(); // witness
            keyboard.nextLine();
            Gender = keyboard.nextLine();
            Address = keyboard.nextLine();
            Phone = keyboard.nextLine();
            DOB = keyboard.nextLine();
            Adult = keyboard.nextBoolean();
            Age = keyboard.nextLong();
            keyboard.nextLine();
            Statement = keyboard.nextLine();
            Race = keyboard.nextLine();
            // long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);
            Witness witness = new Witness(Statement, fName, lName, Age, Height, Weight, Gender, Address, Phone, DOB,
                    Adult, ID, Race);
            dBase.getWitnesses().add(witness);
            DataWriter.saveWitness();
            return witness;
        } else if (inp2 == 6) {
            System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
            System.out.println(
                    "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
            System.out.println("10. statement 11. isHealthy 12. age 13. Race 14. Notes");
            String fName, lName, Gender, Address, Phone, DOB, Statement, Race, Notes;
            long Age, Height, Weight;
            boolean Adult, isHealthy;

            fName = "Billy";
            lName = "Bob";
            // keyboard.nextDouble();
            Height = 65; // Criminal
            Weight = 150;

            Gender = "M";
            Address = "999 idk lane";
            Phone = "888 888 8888";
            DOB = "2/2/22";
            Adult = true;
            isHealthy = true;
            // inJail =true;
            // numCrimes = 15;
            Race = keyboard.nextLine();
            // crimeType = "Assault";
            Age = 65;

            Statement = "bad guy";
            long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);

            Victim victim = new Victim(isHealthy, Statement, fName, lName, Age, Height, Weight, Gender, Address, Phone,
                    DOB, Adult, ID, Race);
            dBase.getVictims().add(victim);
            DataWriter.saveVictim();
            return victim;
        }
        return null;
    }

    public void displayCaseResults(Case _case) {
        System.out.println("Searching database...");
        System.out.println("Cases were found... type 1 to view their names or 2 to quit.");
        int num4 = keyboard.nextInt();
        if (num4 == 1) {
            System.out.println(_case.getName());

            System.out.println("Case Name: " + _case.getName());
            System.out.println("Case CrimeType: " + _case.getCrime());
            System.out.println("Case ID: " + _case.getCaseID());
            System.out.println("Case Date: " + _case.getDate());
            System.out.println("Is Case Federal? " + _case.getIsFederal());
            System.out.println("Case Severity(1-5): " + _case.getSeverity());
            System.out.println("Is Case solved?: " + _case.getIsSolved());
            System.out.println("Persons related to case:");
            for (int k = 0; k < _case.getCriminals().size(); k++) {
                for (int i = 0; i < dBase.getCriminals().size(); i++) {
                    if (_case.getCriminals().get(k) == dBase.getCriminals().get(i).getID()) {
                        System.out.println(
                                dBase.getCriminals().get(i).getFname() + dBase.getCriminals().get(i).getLname());
                    }
                }
            }
            for (int k = 0; k < _case.getOfficers().size(); k++) {
                // System.out.println(aList.get(i).getCriminals())
                for (int i = 0; i < dBase.getOfficers().size(); i++) {
                    if (_case.getOfficers().get(k) == dBase.getOfficers().get(i).getID()) {
                        System.out
                                .println(dBase.getOfficers().get(i).getFname() + dBase.getOfficers().get(i).getLname());
                    }
                }
            }
            for (int k = 0; k < _case.getSuspects().size(); k++) {
                for (int i = 0; i < dBase.getSuspects().size(); i++) {
                    // System.out.println(aList.get(i).getCriminals())
                    if (_case.getSuspects().get(k) == dBase.getSuspects().get(i).getID()) {
                        System.out
                                .println(dBase.getSuspects().get(i).getFname() + dBase.getSuspects().get(i).getLname());
                    }
                }
            }
            for (int k = 0; k < _case.getPoi().size(); k++) {
                for (int i = 0; i < dBase.getPOI().size(); i++) {
                    // System.out.println(aList.get(i).getCriminals())
                    if (_case.getPoi().get(k) == dBase.getPOI().get(i).getID()) {
                        System.out.println(dBase.getPOI().get(i).getFname() + dBase.getPOI().get(i).getLname());
                    }
                }
            }
            for (int k = 0; k < _case.getWitnesses().size(); k++) {
                for (int i = 0; i < dBase.getWitnesses().size(); i++) {
                    // System.out.println(aList.get(i).getCriminals())
                    if (_case.getWitnesses().get(k) == dBase.getWitnesses().get(i).getID()) {
                        System.out.println(
                                dBase.getWitnesses().get(i).getFname() + dBase.getWitnesses().get(i).getLname());
                    }
                }
            }
            for (int k = 0; k < _case.getVictims().size(); k++) {
                for (int i = 0; i < dBase.getVictims().size(); i++) {
                    // System.out.println(aList.get(i).getCriminals())
                    if (_case.getVictims().get(k) == dBase.getVictims().get(i).getID()) {
                        System.out.println(dBase.getVictims().get(i).getFname() + dBase.getVictims().get(i).getLname());
                    }
                }
            }
            for (int k = 0; k < _case.getEvidence().size(); k++) {
                if (_case.getCaseID() == dBase.getEvidence().get(k).getID()) {
                    System.out.println("Evidence:");
                    System.out.println("___________________");
                    System.out.println("Blood Evidence: " + dBase.getEvidence().get(k).getBloodEvidence());
                    System.out.println("Vehicle Evidence: " + dBase.getEvidence().get(k).getVehicle());
                    System.out.println("Weapon Evidence: " + dBase.getEvidence().get(k).getWeaponEvidence());
                    System.out.println("FingerPrint Evidence: " + dBase.getEvidence().get(k).getFingerprintEvidence());
                }
            }

            System.out.println("Type anything once you are finished viewing.");
            keyboard.nextLine();
            String cont = keyboard.nextLine();

            // }
        }
    }

    public void writeToFile(ArrayList<Person> person, Case _case)
    {
        try {
            File myObj = new File("output.txt");
            if (myObj.createNewFile()) {
              System.out.println("File created: " + myObj.getName());
            } else {
              System.out.println("File already exists.");
            }
          } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
          //if case is null
          for(int i = 0 ; i < person.size(); i++)
          {
          if(_case == null)
          {
            
            
            
            if(person.get(i) instanceof Criminal)
            {
                try {
                    FileWriter myWriter = new FileWriter("output.txt");
                    Criminal crim =(Criminal)person.get(i);
                    myWriter.write(" First Name: " + person.get(i).getFname());
                myWriter.write(", Last Name: " + person.get(i).getLname());
                myWriter.write(", Addres: " + person.get(i).getAddress());
                myWriter.write(", Age: " + person.get(i).getAge());
                myWriter.write(", DOB: " + person.get(i).getDateOfBirth());
                myWriter.write(", Gender " + person.get(i).getGender());
                myWriter.write(", Height: " + person.get(i).getHeight());
                myWriter.write(", ID: " + person.get(i).getID());
                myWriter.write(", Phone: " + person.get(i).getPhone());
                myWriter.write(", Race: " + person.get(i).getRace());
                myWriter.write(", Weight: " + person.get(i).getWeight());
                myWriter.write(", Is Adult: " + person.get(i).getIsAdult());
                        myWriter.write(", In Jail?: " + crim.getJail());
                        myWriter.write(", Notes: " + crim.getNotes());
                        myWriter.write(", NumCrimes: " + crim.getNumCrimes());
                    // myWriter.write();
                    
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }
                }
            
            else if(person.get(i) instanceof Officer)
            {
                try {
                    FileWriter myWriter = new FileWriter("output.txt");
                    Officer officer =(Officer)person.get(i);
                    myWriter.write("First Name: " + person.get(i).getFname());
                myWriter.write("Last Name: " + person.get(i).getLname());
                myWriter.write("Addres: " + person.get(i).getAddress());
                myWriter.write("Age: " + person.get(i).getAge());
                myWriter.write("DOB: " + person.get(i).getDateOfBirth());
                myWriter.write("Gender " + person.get(i).getGender());
                myWriter.write("Height: " + person.get(i).getHeight());
                myWriter.write("ID: " + person.get(i).getID());
                myWriter.write("Phone: " + person.get(i).getPhone());
                myWriter.write("Race: " + person.get(i).getRace());
                myWriter.write("Weight: " + person.get(i).getWeight());
                myWriter.write("Is Adult: " + person.get(i).getIsAdult());
                    myWriter.write("badgeNumber: " + officer.getBadgeNumber());
                    myWriter.write("officerRank: " + officer.getOfficerRank());
                    myWriter.write("officerStatement: " + officer.getOfficerStatement());
                    //myWriter.write();
                    
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }
                }
            
            else if(person.get(i) instanceof Suspect)
            {
                try {
                    FileWriter myWriter = new FileWriter("output.txt");
                    Suspect suspect =(Suspect)person.get(i);
                    myWriter.write("First Name: " + person.get(i).getFname());
                myWriter.write("Last Name: " + person.get(i).getLname());
                myWriter.write("Addres: " + person.get(i).getAddress());
                myWriter.write("Age: " + person.get(i).getAge());
                myWriter.write("DOB: " + person.get(i).getDateOfBirth());
                myWriter.write("Gender " + person.get(i).getGender());
                myWriter.write("Height: " + person.get(i).getHeight());
                myWriter.write("ID: " + person.get(i).getID());
                myWriter.write("Phone: " + person.get(i).getPhone());
                myWriter.write("Race: " + person.get(i).getRace());
                myWriter.write("Weight: " + person.get(i).getWeight());
                myWriter.write("Is Adult: " + person.get(i).getIsAdult());
        
                            myWriter.write("bodyType: " + suspect.getBodyType());
                            myWriter.write("isCriminal: " + suspect.getIsCriminal());
                            myWriter.write("Occupation: " + suspect.getOccupation());
        
                            myWriter.write("lastLocation: " + suspect.getLastLocation());
                            myWriter.write("Notes: " + suspect.getPoiNotes());
                            myWriter.write("Tatoos: " + suspect.getTatoos());
                   // myWriter.write();
                    
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }
                }
            
            else if(person.get(i) instanceof Witness)
            {
                try {
                    FileWriter myWriter = new FileWriter("output.txt");
                    Witness witness = (Witness)person.get(i);
                    myWriter.write("First Name: " + person.get(i).getFname());
                myWriter.write("Last Name: " + person.get(i).getLname());
                myWriter.write("Addres: " + person.get(i).getAddress());
                myWriter.write("Age: " + person.get(i).getAge());
                myWriter.write("DOB: " + person.get(i).getDateOfBirth());
                myWriter.write("Gender " + person.get(i).getGender());
                myWriter.write("Height: " + person.get(i).getHeight());
                myWriter.write("ID: " + person.get(i).getID());
                myWriter.write("Phone: " + person.get(i).getPhone());
                myWriter.write("Race: " + person.get(i).getRace());
                myWriter.write("Weight: " + person.get(i).getWeight());
                myWriter.write("Is Adult: " + person.get(i).getIsAdult());
                    myWriter.write("Witness Statement: "+  witness.getWitnessStatement());
                    // myWriter.write();
                    
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }
                }
            
            else if(person.get(i) instanceof Victim)
            {
                try {
                    FileWriter myWriter = new FileWriter("output.txt");
                    Victim victim = (Victim)person.get(i);
                    myWriter.write("First Name: " + person.get(i).getFname());
                myWriter.write("Last Name: " + person.get(i).getLname());
                myWriter.write("Addres: " + person.get(i).getAddress());
                myWriter.write("Age: " + person.get(i).getAge());
                myWriter.write("DOB: " + person.get(i).getDateOfBirth());
                myWriter.write("Gender " + person.get(i).getGender());
                myWriter.write("Height: " + person.get(i).getHeight());
                myWriter.write("ID: " + person.get(i).getID());
                myWriter.write("Phone: " + person.get(i).getPhone());
                myWriter.write("Race: " + person.get(i).getRace());
                myWriter.write("Weight: " + person.get(i).getWeight());
                myWriter.write("Is Adult: " + person.get(i).getIsAdult());
                        myWriter.write("Is Healthy: "+  victim.getIsHealthy());
                        myWriter.write("Victim Statement: "+  victim.getVictimStatement());
                    //myWriter.write();
                    
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }
                }
            
            else if(person.get(i) instanceof PersonOfInterest)
            {
                try {
                    FileWriter myWriter = new FileWriter("output.txt");
                    myWriter.write("First Name: " + person.get(i).getFname());
                myWriter.write("Last Name: " + person.get(i).getLname());
                myWriter.write("Addres: " + person.get(i).getAddress());
                myWriter.write("Age: " + person.get(i).getAge());
                myWriter.write("DOB: " + person.get(i).getDateOfBirth());
                myWriter.write("Gender " + person.get(i).getGender());
                myWriter.write("Height: " + person.get(i).getHeight());
                myWriter.write("ID: " + person.get(i).getID());
                myWriter.write("Phone: " + person.get(i).getPhone());
                myWriter.write("Race: " + person.get(i).getRace());
                myWriter.write("Weight: " + person.get(i).getWeight());
                myWriter.write("Is Adult: " + person.get(i).getIsAdult());
                    PersonOfInterest poi = (PersonOfInterest)person.get(i);
                    myWriter.write("Occupation: "+  poi.getOccupation());
                    myWriter.write("Location: "+  poi.getLastLocation());
                    myWriter.write("Notes: "+  poi.getPoiNotes());
                    myWriter.write("Tatoos: "+  poi.getTatoos());
                    //myWriter.write();
                    
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                  } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                  }
                }
            
            }
        }


        //   try {
        //     FileWriter myWriter = new FileWriter("output.txt");
        //     myWriter.write();
            
        //     myWriter.close();
        //     System.out.println("Successfully wrote to the file.");
        //   } catch (IOException e) {
        //     System.out.println("An error occurred.");
        //     e.printStackTrace();
        //   }
        // }





        //   else
        //   {

        //   }
          //if person is null






    }

    





}
© 2021 GitHub, Inc.
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About

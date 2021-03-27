import java.util.Scanner;
//import java.lang.Thread.State;
import java.util.ArrayList;
//import java.util.IllegalFormatWidthException;
import java.util.concurrent.ThreadLocalRandom;
//import javax.lang.model.util.ElementScanner6;
import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors

/**
 * Class that contains all the frontEnd functionality and methods.
 * 
 * @author Seth Baugh and Jonathan Brown
 */
public class frontEnd {
    static Scanner keyboard = new Scanner(System.in);
    static DataBase dBase;

    /**
     * Main method that starts the program.
     * 
     * @param args
     */
    public static void main(String args[]) {

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

    /**
     * Method that gets the users username and password. Returns true if account is
     * found. Null otherwise.
     * 
     * @return User if account is found it is returned, otherwise null is returned.
     */
    public User promptForUsernameAndPassword() {
        System.out.println("Enter username:");
        String inp = keyboard.nextLine();
        System.out.println("Enter password:");
        String inp2 = keyboard.nextLine();
        for (int i = 0; i < dBase.getUsers().size(); i++) {
            // System.out.println(dBase.getUsers().get(i).getUsername());
            if (inp.equals(dBase.getUsers().get(i).getUsername())) {
                if (inp2.equals(dBase.getUsers().get(i).getPassword())) {
                    return dBase.getUsers().get(i);
                }
            }
        }
        return null;
    }

    /**
     * Method that does all of the actions of the program. Calls to other methods
     * depending on what is chosen by the user.
     * 
     * @param dbase instance of the database that is used to hold all the data.
     * @param user  instance of the user that is the account that was signed into.
     */
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
            String inp4 = "";
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
                System.out.println(
                        "Enter the 3 attributes you would like to search for. Type null for filters you dont use");
                System.out.println("First attribute");
                keyboard.nextLine();
                inp2 = keyboard.nextLine();
                System.out.println("Second attribute");
                inp3 = keyboard.nextLine();
                System.out.println("Third attribute");
                inp4 = keyboard.nextLine();
            }
            boolean remove = false;
            ArrayList<Person> names = new ArrayList<Person>();
            names = searchPerson(inp2, inp3, inp4, remove, search, false);
            System.out.println("Searching database...");
            System.out.println("All eligible persons were found...");
            displayPersonResults(names);
            printPersonAttributes(names);

            // System.out.println("Whose attributes would you like to see? Type their last
            // name");
            // String who = keyboard.nextLine();
            // for (int i = 0; i < names.size(); i++) {
            // if (names.get(i).getLname().equalsIgnoreCase(who)) {
            // System.out.println("First Name: " + names.get(i).getFname());
            // System.out.println("Last Name: " + names.get(i).getLname());
            // System.out.println("Addres: " + names.get(i).getAddress());
            // System.out.println("Age: " + names.get(i).getAge());
            // System.out.println("DOB: " + names.get(i).getDateOfBirth());
            // System.out.println("Gender " + names.get(i).getGender());
            // System.out.println("Height: " + names.get(i).getHeight());
            // System.out.println("ID: " + names.get(i).getID());
            // System.out.println("Phone: " + names.get(i).getPhone());
            // System.out.println("Race: " + names.get(i).getRace());
            // System.out.println("Weight: " + names.get(i).getWeight());
            // System.out.println("Is Adult: " + names.get(i).getIsAdult());
            // // System.out.println("CrimeType: " + names.get(i).getCrimeType());
            // if (names.get(i) instanceof Criminal) {
            // Criminal crim = (Criminal) names.get(i);
            // System.out.println("In Jail?: " + crim.getJail());
            // System.out.println("Notes: " + crim.getNotes());
            // System.out.println("NumCrimes: " + crim.getNumCrimes());
            // System.out.println("CrimeType: " + crim.getCrimeType());
            // System.out.println("HairColor: " + crim.getHairColor());
            // break;
            // } else if (names.get(i) instanceof Suspect) {

            // Suspect suspect = (Suspect) names.get(i);

            // System.out.println("bodyType: " + suspect.getBodyType());
            // System.out.println("isCriminal: " + suspect.getIsCriminal());
            // System.out.println("Occupation: " + suspect.getOccupation());
            // System.out.println("lastLocation: " + suspect.getLastLocation());
            // System.out.println("Notes: " + suspect.getPoiNotes());
            // System.out.println("HairColor: " + suspect.getHairColor());

            // } else if (names.get(i) instanceof Officer) {
            // Officer officer = (Officer) names.get(i);
            // System.out.println("badgeNumber: " + officer.getBadgeNumber());
            // System.out.println("officerRank: " + officer.getOfficerRank());
            // System.out.println("officerStatement: " + officer.getOfficerStatement());
            // } else if (names.get(i) instanceof Witness) {
            // Witness witness = (Witness) names.get(i);
            // System.out.println("Witness Statement: " + witness.getWitnessStatement());
            // } else if (names.get(i) instanceof Victim) {
            // Victim victim = (Victim) names.get(i);
            // System.out.println("Is Healthy: " + victim.getIsHealthy());
            // System.out.println("Victim Statement: " + victim.getVictimStatement());

            // } else if (names.get(i) instanceof PersonOfInterest) {
            // PersonOfInterest poi = (PersonOfInterest) names.get(i);
            // System.out.println("Occupation: " + poi.getOccupation());
            // System.out.println("Location: " + poi.getLastLocation());
            // System.out.println("Notes: " + poi.getPoiNotes());
            // System.out.println("HairColor: " + poi.getHairColor());
            // }

            // }

            // }
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
            keyboard.nextLine();
            String Severity = keyboard.nextLine();
            boolean isFederal = keyboard.nextBoolean();
            long ID = ThreadLocalRandom.current().nextInt(2000, 2997 + 1);
            ArrayList<Long> criminals = new ArrayList<Long>();
            ArrayList<Long> victims = new ArrayList<Long>();
            ArrayList<Long> witnesses = new ArrayList<Long>();
            ArrayList<Long> officers = new ArrayList<Long>();
            ArrayList<Long> poi = new ArrayList<Long>();
            ArrayList<Long> suspects = new ArrayList<Long>();
            ArrayList<Long> evidences = new ArrayList<Long>();
            Case _case = new Case(Name, crimeType, Date, isSolved, Severity, isFederal, ID, criminals, victims,
                    witnesses, officers, poi, suspects, evidences);

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
                System.out.println(
                        "1. Blood evidence 2. Vehicle evidence 3. fingerPrintEvidence 4. weaponEvidence 5. other evidence");
                String bloodEvidence = keyboard.nextLine();
                String vehicleEvidence = keyboard.nextLine();
                String fingerPrintEvidence = keyboard.nextLine();
                String weaponEvidence = keyboard.nextLine();
                String otherEvidence = keyboard.nextLine();
                Evidence evidence = new Evidence(ID, vehicleEvidence, bloodEvidence, fingerPrintEvidence,
                        weaponEvidence, otherEvidence);
                _case.getEvidence().add(evidence.getID());
                dbase.getCases().add(_case);
                dBase.getEvidence().add(evidence);
                DataWriter.saveEvidence();
                DataWriter.saveCase();
            }

        } else if (inp == 5) {
            if (user.getAdmin() == true) {
                System.out.println("Enter the first name of the person you would like to remove.");
                System.out.println("Enter the last name of the person you would like to remove.");
                keyboard.nextLine();
                String input5 = keyboard.nextLine();
                String input6 = keyboard.nextLine();
                searchPerson(input5, input6, "", true, true, false);

            } else {
                adminErrorMessage();
            }

        } else if (inp == 6) {
            if (user.getAdmin() == true) {
                System.out.println("Enter case ID to be deleted");
                long id = keyboard.nextLong();
                for (int i = 0; i < dBase.getCases().size(); i++) {
                    if (id == dBase.getCases().get(i).getCaseID()) {
                        dBase.getCases().remove(dBase.getCases().get(i));
                        DataWriter.saveCase();
                        break;
                    }
                }
            } else
                adminErrorMessage();
        } else if (inp == 7) {
            if (user.getAdmin() == true) {
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
            } else
                adminErrorMessage();

        } else if (inp == 8) {
            System.exit(0);
        } else if (inp == 9) {
            System.out.println("Would you like to write a person to a file or a case? 1 for person 2 for case");
            int next = keyboard.nextInt();
            if (next == 1) {
                System.out.println("Enter the first name of the person you would like to write");
                keyboard.nextLine();
                String fName = keyboard.nextLine();
                System.out.println("Enter the last name fo the person you would like to write");
                String lName = keyboard.nextLine();

                ArrayList<Person> person = searchPerson(fName, lName, "", false, true, true);
                Case _case = new Case();
                _case = null;
                writeToFile(person, _case);
            } else {
                System.out.println("Enter the ID of the case you would like to write.");

                long id = keyboard.nextLong();
                for (int i = 0; i < dBase.getCases().size(); i++) {
                    if (dBase.getCases().get(i).getCaseID() == id) {
                        ArrayList<Person> person = new ArrayList<Person>();
                        person = null;
                        Case _case = dBase.getCases().get(i);
                        writeToFile(person, _case);
                        break;
                    }
                }

            }
        }

    }

    /**
     * Prints out the error message if the user signed in is not an admin and tries
     * to do something only an admin can do.
     */
    public void adminErrorMessage() {
        System.out.println("Error, you need to be an admin to access this.");
    }

    /**
     * Method that searches through all of the lists of people to find whatever ones
     * were intended to be found.
     * 
     * @param input  first name of the person to be looked for.
     * @param input2 last name of the person to be looked for.
     * @param remove tells method whether the person is to be removed from the list
     *               or just found and printed out.
     * @param write  tells the method whether the person found is going to be
     *               written to another file or not.
     */
    public ArrayList<Person> searchPerson(String input, String input2, String input3, boolean remove, boolean name,
            boolean write) {
        if (name == true) {
            if (remove == false) {
                if (write == false) {
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
                } else {
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
        // notes
        else {
            ArrayList<Person> names = new ArrayList<Person>();
            for (int i = 0; i < dBase.getCriminals().size(); i++) {
                if (dBase.getCriminals().get(i).getNotes().equalsIgnoreCase(input)
                        || dBase.getCriminals().get(i).getNotes().equalsIgnoreCase(input2)
                        || dBase.getCriminals().get(i).getNotes().equalsIgnoreCase(input3))
                    names.add(dBase.getCriminals().get(i));
            }
            for (int i = 0; i < dBase.getSuspects().size(); i++) {
                if (dBase.getSuspects().get(i).getpoiNotes().equalsIgnoreCase(input)
                        || dBase.getSuspects().get(i).getpoiNotes().equalsIgnoreCase(input2)
                        || dBase.getSuspects().get(i).getpoiNotes().equalsIgnoreCase(input3))
                    names.add(dBase.getSuspects().get(i));
            }
            for (int i = 0; i < dBase.getPOI().size(); i++) {
                if (dBase.getPOI().get(i).getPoiNotes().equalsIgnoreCase(input)
                        || dBase.getPOI().get(i).getPoiNotes().equalsIgnoreCase(input2)
                        || dBase.getPOI().get(i).getPoiNotes().equalsIgnoreCase(input3))
                    names.add(dBase.getPOI().get(i));
            }

            // age

            for (int i = 0; i < dBase.getCriminals().size(); i++) {
                if (dBase.getCriminals().get(i).getAge().equalsIgnoreCase(input)
                        || dBase.getCriminals().get(i).getAge().equalsIgnoreCase(input2)
                        || dBase.getCriminals().get(i).getAge().equalsIgnoreCase(input3))
                    names.add(dBase.getCriminals().get(i));
            }
            for (int i = 0; i < dBase.getSuspects().size(); i++) {
                if (dBase.getSuspects().get(i).getAge().equalsIgnoreCase(input)
                        || dBase.getSuspects().get(i).getAge().equalsIgnoreCase(input2)
                        || dBase.getSuspects().get(i).getAge().equalsIgnoreCase(input3))
                    names.add(dBase.getSuspects().get(i));
            }
            for (int i = 0; i < dBase.getPOI().size(); i++) {
                if (dBase.getPOI().get(i).getAge().equalsIgnoreCase(input)
                        || dBase.getPOI().get(i).getAge().equalsIgnoreCase(input2)
                        || dBase.getPOI().get(i).getAge().equalsIgnoreCase(input3))
                    names.add(dBase.getPOI().get(i));
            }

            // hair color

            for (int i = 0; i < dBase.getCriminals().size(); i++) {
                if (dBase.getCriminals().get(i).getHairColor().equalsIgnoreCase(input)
                        || dBase.getCriminals().get(i).getHairColor().equalsIgnoreCase(input2)
                        || dBase.getCriminals().get(i).getHairColor().equalsIgnoreCase(input3))
                    names.add(dBase.getCriminals().get(i));
            }
            for (int i = 0; i < dBase.getSuspects().size(); i++) {
                if (dBase.getSuspects().get(i).getHairColor().equalsIgnoreCase(input)
                        || dBase.getSuspects().get(i).getHairColor().equalsIgnoreCase(input2)
                        || dBase.getSuspects().get(i).getHairColor().equalsIgnoreCase(input3))
                    names.add(dBase.getSuspects().get(i));
            }
            for (int i = 0; i < dBase.getPOI().size(); i++) {
                if (dBase.getPOI().get(i).getHairColor().equalsIgnoreCase(input)
                        || dBase.getPOI().get(i).getHairColor().equalsIgnoreCase(input2)
                        || dBase.getPOI().get(i).getHairColor().equalsIgnoreCase(input3))
                    names.add(dBase.getPOI().get(i));
            }

            // height

            for (int i = 0; i < dBase.getCriminals().size(); i++) {
                if (dBase.getCriminals().get(i).getHeight().equalsIgnoreCase(input)
                        || dBase.getCriminals().get(i).getNotes().equalsIgnoreCase(input2)
                        || dBase.getCriminals().get(i).getNotes().equalsIgnoreCase(input3))
                    names.add(dBase.getCriminals().get(i));
            }
            for (int i = 0; i < dBase.getSuspects().size(); i++) {
                if (dBase.getSuspects().get(i).getHeight().equalsIgnoreCase(input)
                        || dBase.getSuspects().get(i).getpoiNotes().equalsIgnoreCase(input2)
                        || dBase.getSuspects().get(i).getpoiNotes().equalsIgnoreCase(input3))
                    names.add(dBase.getSuspects().get(i));
            }
            for (int i = 0; i < dBase.getPOI().size(); i++) {
                if (dBase.getPOI().get(i).getHeight().equalsIgnoreCase(input)
                        || dBase.getPOI().get(i).getPoiNotes().equalsIgnoreCase(input2)
                        || dBase.getPOI().get(i).getPoiNotes().equalsIgnoreCase(input3))
                    names.add(dBase.getPOI().get(i));
            }

            return names;

            // if (names.size() == 0)
            // System.out.println("No one was found");
            // return names;
        }

    }

    /**
     * Method that takes in an ArrayList and prints out all persons in the list.
     * 
     * @param aList arrayList of Persons.
     */
    public void displayPersonResults(ArrayList<Person> aList) {
        // System.out.println("Searching database...");

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i).getFname() + " " + aList.get(i).getLname());
        }
        // System.out.println("All eligible persons were found...");

    }

    /**
     * Method that takes adds Persons to the database. Asks users for data and
     * creates Persons for the data.
     * 
     * @param dbase instance of the database to be searched.
     * @param inp2  kind of person to be added to the database.
     */
    public Person addPerson(DataBase dbase, int inp2) {

        if (inp2 == 1) {

            System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
            System.out.println(
                    "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
            System.out.println("10. inJail 11. numCrimes 12. crimeType 13. Age 14. Notes 15. Race 16. hairColor?");
            String fName, lName, Gender, Address, Phone, DOB, crimeType, Notes, race;
            String Age, Height, Weight, numCrimes, hairColor;
            boolean Adult, inJail;

            long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);
            keyboard.nextLine();
            fName = keyboard.nextLine();
            lName = keyboard.nextLine();
            Height = keyboard.nextLine(); // Criminal
            Weight = keyboard.nextLine();
            // keyboard.nextLine();
            Gender = keyboard.nextLine();
            Address = keyboard.nextLine();
            Phone = keyboard.nextLine();
            DOB = keyboard.nextLine();
            Adult = keyboard.nextBoolean();
            inJail = keyboard.nextBoolean();
            keyboard.nextLine();
            numCrimes = keyboard.nextLine();
            // keyboard.nextLine();
            crimeType = keyboard.nextLine();
            Age = keyboard.nextLine();
            // keyboard.nextLine();
            Notes = keyboard.nextLine();
            race = keyboard.nextLine();
            hairColor = keyboard.nextLine();
            Criminal crim = new Criminal(fName, lName, Age, Height, Weight, crimeType, Gender, Address, Phone, DOB,
                    Adult, inJail, Notes, numCrimes, ID, race, hairColor);

            dbase.getCriminals().add(crim);
            DataWriter.saveCriminal();
            return crim;

        } else if (inp2 == 2) {
            System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
            System.out.println(
                    "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
            System.out.println("10. occupation? 11. lastLocation 12. age 13. Race 14. Notes 15. hairColor");

            String fName, lName, Gender, Address, Phone, DOB, crimeType, Occupation, lastLocation, Notes, Race, Tatoos;
            String Age, Height, Weight, numCrimes, hairColor;
            boolean Adult;

            long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);
            keyboard.nextLine();
            fName = keyboard.nextLine();
            lName = keyboard.nextLine();
            Height = keyboard.nextLine(); // poi
            Weight = keyboard.nextLine();
            // keyboard.nextLine();
            Gender = keyboard.nextLine();
            Address = keyboard.nextLine();
            Phone = keyboard.nextLine();
            DOB = keyboard.nextLine();
            Adult = keyboard.nextBoolean();
            keyboard.nextLine();
            Occupation = keyboard.nextLine();
            lastLocation = keyboard.nextLine();
            Age = keyboard.nextLine();
            // keyboard.nextLine();
            Race = keyboard.nextLine();
            Notes = keyboard.nextLine();
            hairColor = keyboard.nextLine();
            PersonOfInterest poi = new PersonOfInterest(fName, lName, Age, Height, Weight, Gender, Address, Phone, DOB,
                    Adult, Occupation, lastLocation, ID, Race, Notes, hairColor);
            dbase.getPOI().add(poi);
            DataWriter.savepoi();
            return poi;

        } else if (inp2 == 3) {
            System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
            System.out.println(
                    "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
            System.out.println(
                    "10. occupation? 11. lastLocation 12. age 13. body type, 14. Race 15. isCriminal? 16. Notes 17. hairColor");
            String fName, lName, Gender, Address, Phone, DOB, Occupation, lastLocation, bodyType, Notes, Race, Tatoos;
            String Age, Height, Weight, numCrimes, hairColor;
            boolean Adult, inJail, isCriminal;

            long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);
            keyboard.nextLine();
            fName = keyboard.nextLine();
            lName = keyboard.nextLine();
            Height = keyboard.nextLine();
            Weight = keyboard.nextLine(); // Suspect
            // keyboard.nextLine();
            Gender = keyboard.nextLine();
            Address = keyboard.nextLine();
            Phone = keyboard.nextLine();
            DOB = keyboard.nextLine();
            Adult = keyboard.nextBoolean();
            keyboard.nextLine();
            Occupation = keyboard.nextLine();
            lastLocation = keyboard.nextLine();
            Age = keyboard.nextLine();
            // keyboard.nextLine();
            bodyType = keyboard.nextLine();
            Race = keyboard.nextLine();
            isCriminal = keyboard.nextBoolean();
            keyboard.nextLine();
            Notes = keyboard.nextLine();
            hairColor = keyboard.nextLine();
            Suspect suspect = new Suspect(fName, lName, Age, Height, Weight, Gender, Address, Phone, DOB, Adult, ID,
                    Occupation, lastLocation, bodyType, isCriminal, Race, Notes, hairColor);
            dbase.getSuspects().add(suspect);
            DataWriter.saveSuspect();
            return suspect;
        } else if (inp2 == 4) {
            System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
            System.out.println(
                    "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
            System.out.println("10. badgeNumber 11. rank 12. statement 13. age 14. Race");

            String fName, lName, Gender, Address, Phone, DOB, Rank, Statement, Race;
            String Age, Height, Weight, badgeNumber;
            boolean Adult;

            keyboard.nextLine();
            fName = keyboard.nextLine();
            lName = keyboard.nextLine();
            Height = keyboard.nextLine(); // officer
            Weight = keyboard.nextLine();
            // keyboard.nextLine();
            Gender = keyboard.nextLine();
            Address = keyboard.nextLine();
            Phone = keyboard.nextLine();
            DOB = keyboard.nextLine();
            Adult = keyboard.nextBoolean();
            keyboard.nextLine();
            badgeNumber = keyboard.nextLine();
            // keyboard.nextLine();
            Rank = keyboard.nextLine();
            Statement = keyboard.nextLine();
            Age = keyboard.nextLine();
            // keyboard.nextLine();
            Race = keyboard.nextLine();

            long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);

            Officer officer = new Officer(badgeNumber, Rank, Statement, fName, lName, Age, Height, Weight, Gender,
                    Address, Phone, DOB, Adult, ID, Race);
            dBase.getOfficers().add(officer);
            DataWriter.saveOfficer();
            return officer;
        } else if (inp2 == 5) {
            System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
            System.out.println(
                    "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
            System.out.println("10. Age 11. Statement 12. Race");
            String fName, lName, Gender, Address, Phone, DOB, Statement, Race, Notes;
            String Age, Height, Weight;
            boolean Adult;

            long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);

            keyboard.nextLine();
            fName = keyboard.nextLine();
            lName = keyboard.nextLine();
            Height = keyboard.nextLine();
            Weight = keyboard.nextLine(); // witness
            // keyboard.nextLine();
            Gender = keyboard.nextLine();
            Address = keyboard.nextLine();
            Phone = keyboard.nextLine();
            DOB = keyboard.nextLine();
            Adult = keyboard.nextBoolean();
            keyboard.nextLine();
            Age = keyboard.nextLine();
            // keyboard.nextLine();
            Statement = keyboard.nextLine();
            Race = keyboard.nextLine();

            Witness witness = new Witness(Statement, fName, lName, Age, Height, Weight, Gender, Address, Phone, DOB,
                    Adult, ID, Race);
            dBase.getWitnesses().add(witness);
            DataWriter.saveWitness();
            return witness;
        } else if (inp2 == 6) {
            System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
            System.out.println(
                    "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
            System.out.println("10. statement 11. isHealthy 12. age 13. Race");
            String fName, lName, Gender, Address, Phone, DOB, Statement, Race;
            String Age, Height, Weight;
            boolean Adult, isHealthy;

            long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);
            keyboard.nextLine();
            fName = keyboard.nextLine();
            lName = keyboard.nextLine();
            Height = keyboard.nextLine(); // victim
            Weight = keyboard.nextLine();
            // keyboard.nextLine();
            Gender = keyboard.nextLine();
            Address = keyboard.nextLine();
            Phone = keyboard.nextLine();
            DOB = keyboard.nextLine();
            Adult = keyboard.nextBoolean();
            keyboard.nextLine();
            Statement = keyboard.nextLine();
            isHealthy = keyboard.nextBoolean();
            keyboard.nextLine();
            Age = keyboard.nextLine();
            // keyboard.nextLine();
            Race = keyboard.nextLine();

            Victim victim = new Victim(isHealthy, Statement, fName, lName, Age, Height, Weight, Gender, Address, Phone,
                    DOB, Adult, ID, Race);
            dBase.getVictims().add(victim);
            DataWriter.saveVictim();
            return victim;
        }
        return null;
    }

    public void printPersonAttributes(ArrayList<Person> names) {
        System.out.println("Whose attributes would you like to see? Type their last name");
        // keyboard.nextLine();
        String who = keyboard.nextLine();
        boolean test = false;
        while (true) {
            // System.out.println("Whose attributes would you like to see? Type their last
            // name");
            // keyboard.nextLine();
            if (test == true)
                who = keyboard.nextLine();
            for (int i = 0; i < names.size(); i++) {
                if (names.get(i).getLname().equalsIgnoreCase(who)) {
                    test = true;
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
                    // System.out.println("CrimeType: " + names.get(i).getCrimeType());
                    if (names.get(i) instanceof Criminal) {
                        Criminal crim = (Criminal) names.get(i);
                        System.out.println("In Jail?: " + crim.getJail());
                        System.out.println("Notes: " + crim.getNotes());
                        System.out.println("NumCrimes: " + crim.getNumCrimes());
                        System.out.println("CrimeType: " + crim.getCrimeType());
                        System.out.println("HairColor: " + crim.getHairColor());
                        break;
                    } else if (names.get(i) instanceof Suspect) {

                        Suspect suspect = (Suspect) names.get(i);

                        System.out.println("bodyType: " + suspect.getBodyType());
                        System.out.println("isCriminal: " + suspect.getIsCriminal());
                        System.out.println("Occupation: " + suspect.getOccupation());
                        System.out.println("lastLocation: " + suspect.getLastLocation());
                        System.out.println("Notes: " + suspect.getPoiNotes());
                        System.out.println("HairColor: " + suspect.getHairColor());

                    } else if (names.get(i) instanceof Officer) {
                        Officer officer = (Officer) names.get(i);
                        System.out.println("badgeNumber: " + officer.getBadgeNumber());
                        System.out.println("officerRank: " + officer.getOfficerRank());
                        System.out.println("officerStatement: " + officer.getOfficerStatement());
                    } else if (names.get(i) instanceof Witness) {
                        Witness witness = (Witness) names.get(i);
                        System.out.println("Witness Statement: " + witness.getWitnessStatement());
                    } else if (names.get(i) instanceof Victim) {
                        Victim victim = (Victim) names.get(i);
                        System.out.println("Is Healthy: " + victim.getIsHealthy());
                        System.out.println("Victim Statement: " + victim.getVictimStatement());

                    } else if (names.get(i) instanceof PersonOfInterest) {
                        PersonOfInterest poi = (PersonOfInterest) names.get(i);
                        System.out.println("Occupation: " + poi.getOccupation());
                        System.out.println("Location: " + poi.getLastLocation());
                        System.out.println("Notes: " + poi.getPoiNotes());
                        System.out.println("HairColor: " + poi.getHairColor());
                    }

                }

            }
            System.out.println("Would you like to see another persons attributes? Y/N");
            String answer = keyboard.nextLine();
            if (answer.equalsIgnoreCase("N") || answer.equalsIgnoreCase("No"))
                break;
            System.out.println("Type their last name");
        }
    }

    /**
     * Method that takes in a case and displays all the values for that case.
     * 
     * @param _case specific case to have its values displayed.
     */
    public void displayCaseResults(Case _case) {
        System.out.println("Searching database...");
        System.out.println("Cases were found... type 1 to view their names or 2 to quit.");
        int num4 = keyboard.nextInt();
        ArrayList<Person> names = new ArrayList<Person>();
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
                        names.add(dBase.getCriminals().get(i));
                    }
                }
            }
            for (int k = 0; k < _case.getOfficers().size(); k++) {

                for (int i = 0; i < dBase.getOfficers().size(); i++) {
                    if (_case.getOfficers().get(k) == dBase.getOfficers().get(i).getID()) {
                        System.out
                                .println(dBase.getOfficers().get(i).getFname() + dBase.getOfficers().get(i).getLname());
                        names.add(dBase.getOfficers().get(i));
                    }
                }
            }
            for (int k = 0; k < _case.getSuspects().size(); k++) {
                for (int i = 0; i < dBase.getSuspects().size(); i++) {

                    if (_case.getSuspects().get(k) == dBase.getSuspects().get(i).getID()) {
                        System.out
                                .println(dBase.getSuspects().get(i).getFname() + dBase.getSuspects().get(i).getLname());
                        names.add(dBase.getSuspects().get(i));
                    }
                }
            }
            for (int k = 0; k < _case.getPoi().size(); k++) {
                for (int i = 0; i < dBase.getPOI().size(); i++) {

                    if (_case.getPoi().get(k) == dBase.getPOI().get(i).getID()) {
                        System.out.println(dBase.getPOI().get(i).getFname() + dBase.getPOI().get(i).getLname());
                        names.add(dBase.getPOI().get(i));
                    }
                }
            }
            for (int k = 0; k < _case.getWitnesses().size(); k++) {
                for (int i = 0; i < dBase.getWitnesses().size(); i++) {

                    if (_case.getWitnesses().get(k) == dBase.getWitnesses().get(i).getID()) {
                        System.out.println(
                                dBase.getWitnesses().get(i).getFname() + dBase.getWitnesses().get(i).getLname());
                        names.add(dBase.getWitnesses().get(i));
                    }
                }
            }
            for (int k = 0; k < _case.getVictims().size(); k++) {
                for (int i = 0; i < dBase.getVictims().size(); i++) {

                    if (_case.getVictims().get(k) == dBase.getVictims().get(i).getID()) {
                        System.out.println(dBase.getVictims().get(i).getFname() + dBase.getVictims().get(i).getLname());
                        names.add(dBase.getVictims().get(i));
                    }
                }
            }
            for (int k = 0; k < dBase.getEvidence().size(); k++) {
                if (_case.getCaseID() == dBase.getEvidence().get(k).getID()) {
                    System.out.println("Evidence:");
                    System.out.println("___________________");
                    System.out.println("Blood Evidence: " + dBase.getEvidence().get(k).getBloodEvidence());
                    System.out.println("Vehicle Evidence: " + dBase.getEvidence().get(k).getVehicle());
                    System.out.println("Weapon Evidence: " + dBase.getEvidence().get(k).getWeaponEvidence());
                    System.out.println("FingerPrint Evidence: " + dBase.getEvidence().get(k).getFingerprintEvidence());
                    System.out.println("Other Evidence: " + dBase.getEvidence().get(k).getOtherEvidence());
                    ;
                }
            }

            keyboard.nextLine();
            printPersonAttributes(names);

            System.out.println("Type anything once you are finished viewing.");
            // keyboard.nextLine();
            String cont = keyboard.nextLine();

            // }
        }
    }

    /**
     * Method that prints to a text document.
     * 
     * @param person Persons to be written to text file.
     * @param _case  Case to be written to text file.
     */
    public void writeToFile(ArrayList<Person> person, Case _case) {
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
        // if case is null
        if (_case == null) {
            for (int i = 0; i < person.size(); i++) {

                if (person.get(i) instanceof Criminal) {
                    try {
                        FileWriter myWriter = new FileWriter("output.txt", true);
                        Criminal crim = (Criminal) person.get(i);
                        myWriter.write("First Name: " + person.get(i).getFname() + "\n");

                        myWriter.write("Last Name: " + person.get(i).getLname() + "\n");
                        myWriter.write("Addres: " + person.get(i).getAddress() + "\n");
                        myWriter.write("Age: " + person.get(i).getAge() + "\n");
                        myWriter.write("DOB: " + person.get(i).getDateOfBirth() + "\n");
                        myWriter.write("Gender " + person.get(i).getGender() + "\n");
                        myWriter.write("Height: " + person.get(i).getHeight() + "\n");
                        myWriter.write("ID: " + person.get(i).getID() + "\n");
                        myWriter.write("Phone: " + person.get(i).getPhone() + "\n");
                        myWriter.write("Race: " + person.get(i).getRace() + "\n");
                        myWriter.write("Weight: " + person.get(i).getWeight() + "\n");
                        myWriter.write("Is Adult: " + person.get(i).getIsAdult() + "\n");
                        myWriter.write("In Jail?: " + crim.getJail() + "\n");
                        myWriter.write("Notes: " + crim.getNotes() + "\n");
                        myWriter.write("NumCrimes: " + crim.getNumCrimes() + "\n");
                        myWriter.write("hairColor: " + crim.getHairColor() + "\n");

                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }

                else if (person.get(i) instanceof Officer) {
                    try {
                        FileWriter myWriter = new FileWriter("output.txt");
                        Officer officer = (Officer) person.get(i);
                        myWriter.write("First Name: " + person.get(i).getFname() + "\n");
                        myWriter.write("Last Name: " + person.get(i).getLname() + "\n");
                        myWriter.write("Addres: " + person.get(i).getAddress() + "\n");
                        myWriter.write("Age: " + person.get(i).getAge() + "\n");
                        myWriter.write("DOB: " + person.get(i).getDateOfBirth() + "\n");
                        myWriter.write("Gender " + person.get(i).getGender() + "\n");
                        myWriter.write("Height: " + person.get(i).getHeight() + "\n");
                        myWriter.write("ID: " + person.get(i).getID() + "\n");
                        myWriter.write("Phone: " + person.get(i).getPhone() + "\n");
                        myWriter.write("Race: " + person.get(i).getRace() + "\n");
                        myWriter.write("Weight: " + person.get(i).getWeight() + "\n");
                        myWriter.write("Is Adult: " + person.get(i).getIsAdult() + "\n");
                        myWriter.write("badgeNumber: " + officer.getBadgeNumber() + "\n");
                        myWriter.write("officerRank: " + officer.getOfficerRank() + "\n");
                        myWriter.write("officerStatement: " + officer.getOfficerStatement() + "\n");

                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }

                else if (person.get(i) instanceof Suspect) {
                    try {
                        FileWriter myWriter = new FileWriter("output.txt");
                        Suspect suspect = (Suspect) person.get(i);
                        myWriter.write("First Name: " + person.get(i).getFname() + "\n");
                        myWriter.write("Last Name: " + person.get(i).getLname() + "\n");
                        myWriter.write("Addres: " + person.get(i).getAddress() + "\n");
                        myWriter.write("Age: " + person.get(i).getAge() + "\n");
                        myWriter.write("DOB: " + person.get(i).getDateOfBirth() + "\n");
                        myWriter.write("Gender " + person.get(i).getGender() + "\n");
                        myWriter.write("Height: " + person.get(i).getHeight() + "\n");
                        myWriter.write("ID: " + person.get(i).getID() + "\n");
                        myWriter.write("Phone: " + person.get(i).getPhone() + "\n");
                        myWriter.write("Race: " + person.get(i).getRace() + "\n");
                        myWriter.write("Weight: " + person.get(i).getWeight() + "\n");
                        myWriter.write("Is Adult: " + person.get(i).getIsAdult() + "\n");

                        myWriter.write("bodyType: " + suspect.getBodyType() + "\n");
                        myWriter.write("isCriminal: " + suspect.getIsCriminal() + "\n");
                        myWriter.write("Occupation: " + suspect.getOccupation() + "\n");
                        myWriter.write("hairColor: " + suspect.getHairColor() + "\n");
                        myWriter.write("lastLocation: " + suspect.getLastLocation() + "\n");
                        myWriter.write("Notes: " + suspect.getPoiNotes() + "\n");

                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }

                else if (person.get(i) instanceof Witness) {
                    try {
                        FileWriter myWriter = new FileWriter("output.txt");
                        Witness witness = (Witness) person.get(i);
                        myWriter.write("First Name: " + person.get(i).getFname() + "\n");
                        myWriter.write("Last Name: " + person.get(i).getLname() + "\n");
                        myWriter.write("Addres: " + person.get(i).getAddress() + "\n");
                        myWriter.write("Age: " + person.get(i).getAge() + "\n");
                        myWriter.write("DOB: " + person.get(i).getDateOfBirth() + "\n");
                        myWriter.write("Gender " + person.get(i).getGender() + "\n");
                        myWriter.write("Height: " + person.get(i).getHeight() + "\n");
                        myWriter.write("ID: " + person.get(i).getID() + "\n");
                        myWriter.write("Phone: " + person.get(i).getPhone() + "\n");
                        myWriter.write("Race: " + person.get(i).getRace() + "\n");
                        myWriter.write("Weight: " + person.get(i).getWeight() + "\n");
                        myWriter.write("Is Adult: " + person.get(i).getIsAdult() + "\n");
                        myWriter.write("Witness Statement: " + witness.getWitnessStatement() + "\n");

                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }

                else if (person.get(i) instanceof Victim) {
                    try {
                        FileWriter myWriter = new FileWriter("output.txt");
                        Victim victim = (Victim) person.get(i);
                        myWriter.write("First Name: " + person.get(i).getFname() + "\n");
                        myWriter.write("Last Name: " + person.get(i).getLname() + "\n");
                        myWriter.write("Addres: " + person.get(i).getAddress() + "\n");
                        myWriter.write("Age: " + person.get(i).getAge() + "\n");
                        myWriter.write("DOB: " + person.get(i).getDateOfBirth() + "\n");
                        myWriter.write("Gender " + person.get(i).getGender() + "\n");
                        myWriter.write("Height: " + person.get(i).getHeight() + "\n");
                        myWriter.write("ID: " + person.get(i).getID() + "\n");
                        myWriter.write("Phone: " + person.get(i).getPhone() + "\n");
                        myWriter.write("Race: " + person.get(i).getRace() + "\n");
                        myWriter.write("Weight: " + person.get(i).getWeight() + "\n");
                        myWriter.write("Is Adult: " + person.get(i).getIsAdult() + "\n");
                        myWriter.write("Is Healthy: " + victim.getIsHealthy() + "\n");
                        myWriter.write("Victim Statement: " + victim.getVictimStatement() + "\n");

                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }

                else if (person.get(i) instanceof PersonOfInterest) {
                    try {
                        FileWriter myWriter = new FileWriter("output.txt");
                        myWriter.write("First Name: " + person.get(i).getFname() + "\n");
                        myWriter.write("Last Name: " + person.get(i).getLname() + "\n");
                        myWriter.write("Addres: " + person.get(i).getAddress() + "\n");
                        myWriter.write("Age: " + person.get(i).getAge() + "\n");
                        myWriter.write("DOB: " + person.get(i).getDateOfBirth() + "\n");
                        myWriter.write("Gender " + person.get(i).getGender() + "\n");
                        myWriter.write("Height: " + person.get(i).getHeight() + "\n");
                        myWriter.write("ID: " + person.get(i).getID() + "\n");
                        myWriter.write("Phone: " + person.get(i).getPhone() + "\n");
                        myWriter.write("Race: " + person.get(i).getRace() + "\n");
                        myWriter.write("Weight: " + person.get(i).getWeight() + "\n");
                        myWriter.write("Is Adult: " + person.get(i).getIsAdult() + "\n");
                        PersonOfInterest poi = (PersonOfInterest) person.get(i);
                        myWriter.write("Occupation: " + poi.getOccupation() + "\n");
                        myWriter.write("Location: " + poi.getLastLocation() + "\n");
                        myWriter.write("Notes: " + poi.getPoiNotes() + "\n");
                        myWriter.write("hairColor: " + poi.getHairColor() + "\n");
                        myWriter.close();
                        System.out.println("Successfully wrote to the file.");
                    } catch (IOException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }

            }
        } else {
            try {
                FileWriter myWriter = new FileWriter("output.txt", true);
                myWriter.write("Case Details:" + "\n");
                myWriter.write("Case Name: " + _case.getName() + "\n");
                myWriter.write("Case ID:" + _case.getCaseID() + "\n");
                myWriter.write("Case crimeType:" + _case.getCrime() + "\n");
                myWriter.write("Case Date:" + _case.getDate() + "\n");
                myWriter.write("Case Severity:" + _case.getSeverity() + "\n");

                myWriter.write("Persons related to case:");
                for (int k = 0; k < _case.getCriminals().size(); k++) {
                    for (int i = 0; i < dBase.getCriminals().size(); i++) {
                        if (_case.getCriminals().get(k) == dBase.getCriminals().get(i).getID()) {
                            myWriter.write(dBase.getCriminals().get(i).getFname()
                                    + dBase.getCriminals().get(i).getLname() + "\n");
                        }
                    }
                }
                for (int k = 0; k < _case.getOfficers().size(); k++) {

                    for (int i = 0; i < dBase.getOfficers().size(); i++) {
                        if (_case.getOfficers().get(k) == dBase.getOfficers().get(i).getID()) {
                            myWriter.write(dBase.getOfficers().get(i).getFname() + dBase.getOfficers().get(i).getLname()
                                    + "\n");
                        }
                    }
                }
                for (int k = 0; k < _case.getSuspects().size(); k++) {
                    for (int i = 0; i < dBase.getSuspects().size(); i++) {

                        if (_case.getSuspects().get(k) == dBase.getSuspects().get(i).getID()) {
                            myWriter.write(dBase.getSuspects().get(i).getFname() + dBase.getSuspects().get(i).getLname()
                                    + "\n");
                        }
                    }
                }
                for (int k = 0; k < _case.getPoi().size(); k++) {
                    for (int i = 0; i < dBase.getPOI().size(); i++) {

                        if (_case.getPoi().get(k) == dBase.getPOI().get(i).getID()) {
                            myWriter.write(dBase.getPOI().get(i).getFname() + dBase.getPOI().get(i).getLname() + "\n");
                        }
                    }
                }
                for (int k = 0; k < _case.getWitnesses().size(); k++) {
                    for (int i = 0; i < dBase.getWitnesses().size(); i++) {

                        if (_case.getWitnesses().get(k) == dBase.getWitnesses().get(i).getID()) {
                            myWriter.write(dBase.getWitnesses().get(i).getFname()
                                    + dBase.getWitnesses().get(i).getLname() + "\n");
                        }
                    }
                }
                for (int k = 0; k < _case.getVictims().size(); k++) {
                    for (int i = 0; i < dBase.getVictims().size(); i++) {

                        if (_case.getVictims().get(k) == dBase.getVictims().get(i).getID()) {
                            myWriter.write(
                                    dBase.getVictims().get(i).getFname() + dBase.getVictims().get(i).getLname() + "\n");
                        }
                    }
                }
                for (int k = 0; k < dBase.getEvidence().size(); k++) {
                    if (_case.getCaseID() == dBase.getEvidence().get(k).getID()) {
                        myWriter.write("Evidence:" + "\n");
                        myWriter.write("___________________");
                        myWriter.write("Blood Evidence: " + dBase.getEvidence().get(k).getBloodEvidence() + "\n");
                        myWriter.write("Vehicle Evidence: " + dBase.getEvidence().get(k).getVehicle() + "\n");
                        myWriter.write("Weapon Evidence: " + dBase.getEvidence().get(k).getWeaponEvidence() + "\n");
                        myWriter.write(
                                "FingerPrint Evidence: " + dBase.getEvidence().get(k).getFingerprintEvidence() + "\n");
                        myWriter.write("Other Evidence: " + dBase.getEvidence().get(k).getOtherEvidence() + "\n");
                    }
                }

                myWriter.close();
                System.out.println("Successfully wrote to the file.");
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

}

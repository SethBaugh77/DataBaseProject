import java.util.Scanner;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
public class frontEnd {
    static Scanner keyboard = new Scanner(System.in);
    static DataBase dBase;

    public static void main(String args[]) {
        
        dBase = DataBase.getInstance();
        frontEnd fEnd = new frontEnd();
        fEnd.doAction(dBase);
        // Witness wit = new Witness("Help ive been hurt", "jon", 35, 64, 150, "M",
        // "102932 sicamore lane", "718501924",
        // "9/12/88", true, 9912);

        // ArrayList<Criminal> criminals= new ArrayList<Criminal>();
        // ArrayList<Case> _cases= new ArrayList<Case>();

        // User auser = new AdminUser(5, true, "bill", "jon", "BJ", "jalksdf",
        // "aj;lksdjf", "84914134", criminals, _cases);

    }

    public void promptForUsernameAndPassword() {
        // Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter username:");
        String inp = keyboard.nextLine();
        System.out.println("Enter password:");
        String inp2 = keyboard.nextLine();
    }

    public void doAction(DataBase dbase) {
        System.out.println("Welcome to the database. What would you like to do?");
        System.out.println("1. Search for a person.");
        System.out.println("2. Search for a case.");
        System.out.println("3. Add new Person.");
        System.out.println("4. Add new case.");
        System.out.println("5. Remove Person.");
        System.out.println("6. Remove Case.");
        System.out.println("7. Add User.");
        System.out.println("8. Quit application");
        int inp = keyboard.nextInt();

        if (inp == 1) {
            System.out.println("Enter the first name of the person you would like to find");
            String inp2;
            inp2 = keyboard.nextLine();
            System.out.println("Enter the last name of the person you would like to find");
            String inp3;
            inp3 = keyboard.nextLine();
            ArrayList<Person> names = new ArrayList<Person>();

            for (int i = 0; i < dBase.getCriminals().size(); i++) {
                if (dBase.getCriminals().get(i).getFname().equalsIgnoreCase(inp2)
                        || dBase.getCriminals().get(i).getFname().equalsIgnoreCase(inp3))
                    names.add(dBase.getCriminals().get(i));
            }
            for (int i = 0; i < dBase.getWitnesses().size(); i++) {
                if (dBase.getWitnesses().get(i).getFname().equalsIgnoreCase(inp2)
                        || dBase.getWitnesses().get(i).getFname().equalsIgnoreCase(inp3))
                    names.add(dBase.getCriminals().get(i));
            }
            for (int i = 0; i < dBase.getSuspects().size(); i++) {
                if (dBase.getSuspects().get(i).getFname().equalsIgnoreCase(inp2)
                        || dBase.getSuspects().get(i).getFname().equalsIgnoreCase(inp3))
                    names.add(dBase.getSuspects().get(i));
            }
            for (int i = 0; i < dBase.getPOI().size(); i++) {
                if (dBase.getPOI().get(i).getFname().equalsIgnoreCase(inp2)
                        || dBase.getPOI().get(i).getFname().equalsIgnoreCase(inp3))
                    names.add(dBase.getPOI().get(i));
            }
            for (int i = 0; i < dBase.getVictims().size(); i++) {
                if (dBase.getVictims().get(i).getFname().equalsIgnoreCase(inp2)
                        || dBase.getVictims().get(i).getFname().equalsIgnoreCase(inp3))
                    names.add(dBase.getVictims().get(i));
            }
            for (int i = 0; i < dBase.getOfficers().size(); i++) {
                if (dBase.getOfficers().get(i).getFname().equalsIgnoreCase(inp2)
                        || dBase.getOfficers().get(i).getFname().equalsIgnoreCase(inp3))
                    names.add(dBase.getOfficers().get(i));
            }
            displayPersonResults(names);

        } else if (inp == 2) {
            ArrayList<Case> cases = new ArrayList<Case>();
            System.out.println("Enter the name of the case you would like to find");
            String inp2 = keyboard.nextLine();
            for (int i = 0; i < dBase.getCases().size(); i++) {
                if (dBase.getCases().get(i).getName().equalsIgnoreCase(inp2))
                    cases.add(dBase.getCases().get(i));

            }
            displayCaseResults(cases);
        } else if (inp == 3) {
            System.out.println("Which kind of person will you be entering?");
            System.out.println("1. Criminal");
            System.out.println("2. Person of Interest");
            System.out.println("3. Suspect");
            System.out.println("4. Officer");
            System.out.println("5. Witness");
            System.out.println("6. Victim");
            int inp2 = keyboard.nextInt();
            if (inp2 == 1) {

                System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
                System.out.println(
                        "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
                System.out.println("10. inJail 11. numCrimes 12. crimeType 13. Age 14. Notes");
                String fName, lName, Gender, Address, Phone, DOB, crimeType, Notes;
                long Age, Height, Weight, numCrimes;
                boolean Adult, inJail;
                
                fName = "Billy";
                lName = "Bob";
                // keyboard.nextDouble();
                Height = 65;  // Criminal
                Weight =  150;
                
                Gender = "M";
                Address = "999 idk lane";
                Phone = "888 888 8888";
                DOB ="2/2/22";
                Adult = true;
                inJail =true;
                numCrimes =  15;
                
                crimeType = "Assault";
                Age = 65;
                
                Notes = "bad guy";
                long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);
                





                // keyboard.nextLine();
                // fName = keyboard.nextLine();
                // lName = keyboard.nextLine();
                // // keyboard.nextDouble();
                // Height =  keyboard.nextLong(); // Criminal
                // Weight =  keyboard.nextLong();
                // keyboard.nextLine();
                // Gender = keyboard.nextLine();
                // Address = keyboard.nextLine();
                // Phone = keyboard.nextLine();
                // DOB = keyboard.nextLine();
                // Adult = keyboard.nextBoolean();
                // inJail = keyboard.nextBoolean();
                // numCrimes =  keyboard.nextLong();
                // keyboard.nextLine();
                // crimeType = keyboard.nextLine();
                // Age = keyboard.nextLong();
                // keyboard.nextLine();
                // Notes = keyboard.nextLine();
                
                Criminal crim = new Criminal(fName, lName, Age, Height, Weight, Gender, Address, Phone, DOB, Adult, inJail, Notes, numCrimes, ID);
                
                dbase.getCriminals().add(crim);
                //dbase.getCriminals().add(crim);
                DataWriter.saveCriminal();
                
            } else if (inp2 == 2) {
                System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
                System.out.println(
                        "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
                System.out.println("10. occupation? 11. lastLocation 12. age ");

                String fName, lName, gender, address, phone, DOB, crimeType, occupation, lastLocation;
                long age, height, weight, numCrimes;
                boolean Adult;
                keyboard.nextLine();
                fName = keyboard.nextLine();
                lName = keyboard.nextLine();
                height = keyboard.nextLong();
                weight = keyboard.nextLong(); // POI
                keyboard.nextLine();
                gender = keyboard.nextLine();
                address = keyboard.nextLine();
                phone = keyboard.nextLine();
                DOB = keyboard.nextLine();
                Adult = keyboard.nextBoolean();
                keyboard.nextLine();
                occupation = keyboard.nextLine();
                lastLocation = keyboard.nextLine();
                long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);
                age = keyboard.nextLong();
                PersonOfInterest poi = new PersonOfInterest( fName,  lName,  age,  height,  weight, gender, address,
                 phone,  DOB,  Adult,   occupation,lastLocation, ID);
                 dbase.getPOI().add(poi);
                DataWriter.savepoi(poi);

            } else if (inp2 == 3) {
                System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
                System.out.println(
                        "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
                System.out.println("10. occupation? 11. lastLocation 12. age 13. body type, 14. criminal?");
                String fName, lName, gender, address, phone, DOB, crimeType, occupation, lastLocation, bodyType;
                long age, height, weight, numCrimes;
                boolean Adult, inJail, isCriminal;
                fName = keyboard.nextLine();
                lName = keyboard.nextLine();
                age = keyboard.nextLong();
                height = keyboard.nextLong();
                weight = keyboard.nextLong(); // Suspect
                gender = keyboard.nextLine();
                address = keyboard.nextLine();
                phone = keyboard.nextLine();
                DOB = keyboard.nextLine();
                Adult = keyboard.nextBoolean();
                occupation = keyboard.nextLine();
                lastLocation = keyboard.nextLine();
                age = keyboard.nextLong();
                bodyType = keyboard.nextLine();
                isCriminal = keyboard.nextBoolean();
                long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);

            } else if (inp2 == 4) {
                System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
                System.out.println(
                        "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
                System.out.println("10. badgeNumber 11. rank 12. statement");

                String name, gender, address, phone, DOB, rank, statement;
                long age, height, weight, badgeNumber;
                boolean Adult;
                name = keyboard.nextLine();
                age = keyboard.nextLong();
                height = keyboard.nextLong();
                weight = keyboard.nextLong(); // officer
                gender = keyboard.nextLine();
                address = keyboard.nextLine();
                phone = keyboard.nextLine();
                DOB = keyboard.nextLine();
                Adult = keyboard.nextBoolean();
                badgeNumber = keyboard.nextLong();
                rank = keyboard.nextLine();
                statement = keyboard.nextLine();
                long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);

            } else if (inp2 == 5) {
                System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
                System.out.println(
                        "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
                System.out.println("10. statement");
                String name, gender, address, phone, DOB, statement;
                long age, height, weight;
                boolean Adult;
                name = keyboard.nextLine();
                age = keyboard.nextLong();
                height = keyboard.nextLong();
                weight = keyboard.nextLong(); // witness
                gender = keyboard.nextLine();
                address = keyboard.nextLine();
                phone = keyboard.nextLine();
                DOB = keyboard.nextLine();
                Adult = keyboard.nextBoolean();
                statement = keyboard.nextLine();
                long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);
            } else if (inp2 == 6) {
                System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
                System.out.println(
                        "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
                System.out.println("10. statement 11. isHealthy");
                String name, gender, address, phone, DOB, statement;
                long age, height, weight;
                boolean Adult, isHealthy;
                name = keyboard.nextLine();
                age = keyboard.nextLong();
                height = keyboard.nextLong();
                weight = keyboard.nextLong(); // victim
                gender = keyboard.nextLine();
                address = keyboard.nextLine();
                phone = keyboard.nextLine();
                DOB = keyboard.nextLine();
                Adult = keyboard.nextBoolean();
                statement = keyboard.nextLine();
                isHealthy = keyboard.nextBoolean();
                long ID = ThreadLocalRandom.current().nextInt(0, 997 + 1);
            }

        } else if (inp == 4) {

        } else if (inp == 5) {

        } else if (inp == 6) {

        } else if (inp == 7) {

        } else if (inp == 8) {

        }

    }

    public void displayPersonResults(ArrayList<Person> aList) {
        System.out.println("Searching database...");
        System.out.println("All eligible persons were found... type 1 to view their names or 2 to quit.");
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i).getFname() + " " + aList.get(i).getLname());
        }

    }

    public void displayCaseResults(ArrayList<Case> aList) {
        System.out.println("Searching database...");
        System.out.println("All eligible Cases were found... type 1 to view their names or 2 to quit.");
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i).getName());
        }

    }

}

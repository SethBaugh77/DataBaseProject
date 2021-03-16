import java.util.Scanner;
import java.util.ArrayList;

public class frontEnd {
    static Scanner keyboard = new Scanner(System.in);
    static DataBase dBase;

    public static void main(String args[]) {
        dBase = DataBase.getInstance();
        frontEnd fEnd = new frontEnd();
        fEnd.doAction();
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

    public void doAction() {
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
            System.out.println("4. Criminal");
            System.out.println("5. Witness");
            System.out.println("6. Victim");
            int inp2 = keyboard.nextInt();
            if (inp2 == 1) {

                System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
                System.out.println(
                        "1. firstName 2. lastName 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
                System.out.println("10. inJail 11. numCrimes 12. crimeType 13. Age");
                String name, gender, address, phone, DOB, crimeType;
                long age, height, weight, numCrimes;
                boolean Adult, inJail;
                name = keyboard.nextLine();
                age = keyboard.nextLong();
                height = keyboard.nextLong();
                weight = keyboard.nextLong();
                gender = keyboard.nextLine();
                address = keyboard.nextLine();
                phone = keyboard.nextLine();
                DOB = keyboard.nextLine();
                Adult = keyboard.nextBoolean();
                inJail = keyboard.nextBoolean();
                numCrimes = keyboard.nextLong();
                crimeType = keyboard.nextLine();
            } else if (inp2 == 2) {
                System.out.println("Enter in the folliwng attributes for your person. Press enter after every insert");
                System.out.println("1. Name 2. age 3. height 4. weight 5. gender 6. address 7. phone 8. DOB 9. Adult?");
                System.out.println("10. Occupation 11. lastLocation");

                String name, gender, address, phone, DOB, crimeType, occupation, lastLocation;
                long age, height, weight, numCrimes;
                boolean Adult, inJail;
                name = keyboard.nextLine();
                age = keyboard.nextLong();
                height = keyboard.nextLong();
                weight = keyboard.nextLong();
                gender = keyboard.nextLine();
                address = keyboard.nextLine();
                phone = keyboard.nextLine();
                DOB = keyboard.nextLine();
                Adult = keyboard.nextBoolean();
                inJail = keyboard.nextBoolean();
                numCrimes = keyboard.nextLong();
                crimeType = keyboard.nextLine();
                occupation = keyboard.nextLine();
                lastLocation = keyboard.nextLine();
            } else if (inp2 == 3) {

                String name, gender, address, phone, DOB, crimeType;
                long age, height, weight, numCrimes;
                boolean Adult, inJail;
                name = keyboard.nextLine();
                age = keyboard.nextLong();
                height = keyboard.nextLong();
                weight = keyboard.nextLong();
                gender = keyboard.nextLine();
                address = keyboard.nextLine();
                phone = keyboard.nextLine();
                DOB = keyboard.nextLine();
                Adult = keyboard.nextBoolean();
                inJail = keyboard.nextBoolean();
                numCrimes = keyboard.nextLong();
                crimeType = keyboard.nextLine();
            } else if (inp2 == 4) {

                String name, gender, address, phone, DOB, crimeType;
                long age, height, weight, numCrimes;
                boolean Adult, inJail;
                name = keyboard.nextLine();
                age = keyboard.nextLong();
                height = keyboard.nextLong();
                weight = keyboard.nextLong();
                gender = keyboard.nextLine();
                address = keyboard.nextLine();
                phone = keyboard.nextLine();
                DOB = keyboard.nextLine();
                Adult = keyboard.nextBoolean();
                inJail = keyboard.nextBoolean();
                numCrimes = keyboard.nextLong();
                crimeType = keyboard.nextLine();
            } else if (inp2 == 5) {

                String name, gender, address, phone, DOB, crimeType;
                long age, height, weight, numCrimes;
                boolean Adult, inJail;
                name = keyboard.nextLine();
                age = keyboard.nextLong();
                height = keyboard.nextLong();
                weight = keyboard.nextLong();
                gender = keyboard.nextLine();
                address = keyboard.nextLine();
                phone = keyboard.nextLine();
                DOB = keyboard.nextLine();
                Adult = keyboard.nextBoolean();
                inJail = keyboard.nextBoolean();
                numCrimes = keyboard.nextLong();
                crimeType = keyboard.nextLine();
            } else if (inp2 == 6) {

                String name, gender, address, phone, DOB, crimeType;
                long age, height, weight, numCrimes;
                boolean Adult, inJail;
                name = keyboard.nextLine();
                age = keyboard.nextLong();
                height = keyboard.nextLong();
                weight = keyboard.nextLong();
                gender = keyboard.nextLine();
                address = keyboard.nextLine();
                phone = keyboard.nextLine();
                DOB = keyboard.nextLine();
                Adult = keyboard.nextBoolean();
                inJail = keyboard.nextBoolean();
                numCrimes = keyboard.nextLong();
                crimeType = keyboard.nextLine();
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

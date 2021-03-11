import java.util.Scanner;

public class frontEnd {
   static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[])
    {
        
        while(true)
        {
            promptForUsernameAndPassword();
            promptForAction();
            displaySearchResults();
            System.exit(0);
        }




    }
   static public void promptForUsernameAndPassword()
    {
       // Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter username:");
        String inp = keyboard.nextLine();
        System.out.println("Enter password:");
        String inp2 = keyboard.nextLine();
    }
   static public void promptForAction()
    {
        System.out.println("Welcome to the database. What would you like to do?");
        System.out.println("1. Search for a person.");
        System.out.println("2. Search for a case.");
        System.out.println("3. Add new Person.");
        System.out.println("4. Add new case.");
        System.out.println("5. Remove Person.");
        System.out.println("6. Remove Case.");
        System.out.println("7. Add User.");
        System.out.println("8. Quit application");
        String inp = keyboard.nextLine();
    }
   static public void displaySearchResults()
    {
        System.out.println("Searching database...");
        System.out.println("All eligible persons were found... type 1 to view their names or 2 to quit.");


    }




}

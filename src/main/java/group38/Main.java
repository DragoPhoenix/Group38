package group38;
import apoorv.*;
import java.util.*;
import himanshu.*;
import Aniket.*;

public class Main {

	private static Repository repository = new Repository();
	private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        loginMenu();
    }

    private static void loginMenu()
    {
    	System.out.println("\n1. Login as user");
        System.out.println("2. Login as admin");
        System.out.println("0. Exit");
        System.out.print("Enter a choice: ");
        int choice = sc.nextInt();
        while (!(choice >= 0 && choice <= 2)) {
        	System.out.print("Please enter a valid choice: ");
        	choice = sc.nextInt();
        }
    	if (choice == 0)
    		return;

        System.out.print("Enter email ID: ");
    	String emailID = sc.next();
		System.out.print("Enter password: ");
    	String password = sc.next();
        if (choice == 1) {
			int userID = repository.getUserID(emailID);
        	while (!repository.checkUserCredentials(emailID, password)) {
        		System.out.println("Invalid login details.");
        		System.out.print("Enter email ID: ");
		    	emailID = sc.next();
				userID = repository.getUserID(emailID);
		    	System.out.print("Enter password: ");
		    	password = sc.next();
        	}

        	System.out.println("User login successful.");
        	userFunctionality(userID, password);
        } else {
			int adminID = repository.getAdminID(emailID);
        	while (!repository.checkAdminCredentials(emailID, password)) {
        		System.out.println("Invalid login details.");
        		System.out.print("Enter email ID: ");
		    	emailID = sc.next();
				adminID = repository.getAdminID(emailID);
		    	System.out.print("Enter password: ");
		    	password = sc.next();
        	}

        	System.out.println("Admin login successful.");
        	adminFunctionality(adminID, password);
        }
    }

    private static void userFunctionality(int userID, String password) {
    	while (true) {
    		System.out.println("\n1. Book a cruise ship");
    		System.out.println("2. Book a cargo ship");
    		System.out.println("3. Search cargo ships");
    		System.out.println("4. Search cruise ships");
    		System.out.println("5. Cancel booking");
    		System.out.println("6. List bookings");
    		System.out.println("0. Logout");

    		System.out.print("Enter a choice: ");
    		int choice = sc.nextInt();

			if (choice == 0) {
				System.out.println("Logged out successfully.");
				loginMenu();
				break;
			}
    		if (choice == 1) {
    			CruiseShip cruiseShip;
    			CruiseBooking cruiseBooking;
    			System.out.print("Enter source: ");
    			String source = sc.next();
    			System.out.print("Enter destination: ");
    			String destination;
    		}
    	}
    }

    private static void adminFunctionality(int adminID, String password) {
    	while (true) {
    		System.out.println("\n1. Add a cruise ship");
    		System.out.println("2. Add a cargo ship");
    		System.out.println("3. Remove a cruise ship");
    		System.out.println("4. Remove a cargo ship");
    		System.out.println("5. Update a cruise ship");
    		System.out.println("6. Update a cargo ship");
			System.out.println("0. Logout");

    		System.out.print("Enter a choice: ");
    		int choice = sc.nextInt();

			if (choice == 0) {
				System.out.println("Logged out successfully.");
				loginMenu();
				break;
			}

			CruiseShip cruiseShip = new CruiseShip();
			CargoShip cargoShip = new CargoShip();
			if (choice == 1) {
				cruiseShip.addShip();
			}
    	}
    }
}
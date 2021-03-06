package projektdel3;

import java.util.Scanner;
/* Main - our Menu
 Our Main Class holds and runs our menu-methods;
 - menuOption with our options;
 - menuLayout with the looks of our menu, showing the user available options
 */
public class Main {
	public static void main(String[] args) {
		menuOption();
	}
	private static void menuOption() {
		Scanner myScanner=new Scanner(System.in); // initialize (class) Scanner to object myScanner
		Ticket myTicket=new Ticket(); // initialize class Ticket to object myTicket
		Passenger aPassenger = new Passenger();// initialize class Passenger to object aPassenger

		while(true) {
			menuLayout();
			char aInput = myScanner.next().charAt(0); // Scanner to read Conductors input

			switch(aInput) {
				case '1' -> aPassenger.addPassenger(myTicket); //class.method(object: myTicket) -> present Ticket class
				case '2' -> aPassenger.showPassengerList(); //class.method() -> present ArrayList in Passenger class
				case '0' -> System.exit(0);
				default -> System.out.println("Invalid input ");
			}
		}
	}
	private static void menuLayout() {
		System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
		System.out.println(" *      Welcome Conductor      *");
		System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
		System.out.println("       > Make an option <       ");
		System.out.println(" -------------------------------");
		System.out.println("-> (1) Add a passenger          ");
		System.out.println("-> (2) See the passenger list   ");
		System.out.println("-> (0) Exit the program         ");
		System.out.println(" -------------------------------");
	}
}
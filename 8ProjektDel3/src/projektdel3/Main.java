package projektdel3;

import java.util.Scanner;
/* Main - our Menu
 Our Main Class holds and runs our menu-methods;
 - menuOption with our options;
 - menuLayout with the looks of our menu, showing the user available options
 */
public class Main {
	public static void main(String[] args) { menuOption(); }
	private static void menuOption() {
		Scanner myScanner=new Scanner(System.in);
		Ticket myTicket=new Ticket();
		Passenger aPassenger = new Passenger();

		while(true) {
			menuLayout();
			char aInput = myScanner.next().charAt(0);

			switch(aInput) {
				case '1' -> aPassenger.addPassenger(myTicket);
				case '2' -> aPassenger.showPassengerList();
				case '0' -> System.exit(0);
				default -> System.out.println("Invalid input ");
			}
		}
	}
	private static void menuLayout() {
		System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ * ");
		System.out.println(" *     Welcome Conductor     * ");
		System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ * ");
		System.out.println("      > Make an option <       ");
		System.out.println(" ----------------------------- ");
		System.out.println("-> (1) Add a passenger         ");
		System.out.println("-> (2) See the passenger list  ");
		System.out.println("-> (0) Exit the program        ");
		System.out.println(" ----------------------------- ");
	}
}
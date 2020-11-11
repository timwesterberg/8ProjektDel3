package projektdel3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	
	//****** Menylayout ******//
	//make object of passenger in top


	public static void main(String[] args) {
		
		Menu();
	}
		
	private static void MenuLayout() {
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

		
	//****** Input/options för Passagerarlista ******//
	
		private static void Menu() {
			
			Scanner myScanner=new Scanner(System.in);
			Ticket myTicket=new Ticket();
			Passenger aPassenger = new Passenger();
			
			//passenger class
			
			
			while(true) {
				MenuLayout();
				char aInput = myScanner.next().charAt(0);
				
				switch(aInput) {
				
				//small letter at the start of "addP" and showP" [same in UML]
				
					case '1' -> aPassenger.AddPassenger(myTicket);
					
					case '2' -> aPassenger.ShowPassengerList();
					
					case '0' -> System.exit(0);
					
					default -> System.out.println("Invalid input ");
				}
			}
		}
		
		//****** Lägger till passagerare i lista ******//
		
		//copy paste to Passenger class
		//make object in menu
		

		
		//****** Visar passagerarlistan ******//
		//passenger class
		
		
	}
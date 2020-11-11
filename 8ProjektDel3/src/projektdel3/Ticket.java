package projektdel3;

import java.util.Scanner;

public class Ticket {
	
	//****** Visar biljett beroende av ålder******//
	public void showTicket(int aAge, String aName) {
		Scanner myScanner = new Scanner(System.in);
		
		while (true) {
			System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
            System.out.println(" *  Choose a ticket type   *");
            System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
            System.out.println(" ---------------------------");
            System.out.println("-> (1) Single " + returnSinglePrice(aAge) + " SEK");
            System.out.println("-> (2) Monthly " + returnMonthlyPrice(aAge) + " SEK");
            System.out.println("-> (0) Exit Program ");
            System.out.println(" ---------------------------");
			int aInput = myScanner.nextInt();

			if (aInput==1) {
				System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
	            System.out.println(" *    SINGLE TICKET          *");
	            System.out.println(" * ------------------------- *");
	            System.out.println("  Passenger: " + aName);
	            System.out.println("  Price: " + returnSinglePrice(aAge) + " SEK");
	            System.out.println("  Ticket type: " + returnTicketType(aAge));
	            System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
				break;
			}
			else if (aInput==2) {
				
				System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
                System.out.println(" *    MONTHLY TICKET         *");
                System.out.println(" * ------------------------- *");
                System.out.println("  Passenger: " + aName);
                System.out.println("  Price: " + returnMonthlyPrice(aAge) + " SEK");
                System.out.println("  Ticket type: " + returnTicketType(aAge));
                System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
				break;
			}	
			else { 
				System.out.println(" -------------------------------");
	            System.out.println("  > Invalid input, try again! < ");
	            System.out.println(" -------------------------------");
			}
		}
		//****** Pausar menylistan från att visas igen ******//
		pause();
	}
	
	//****** returnerar månadspris beroende på ålder ******//
	private int returnMonthlyPrice(int aAge) {
		int myPrice;
		if(aAge < 0) {
			myPrice=0;
		}
		else if (aAge>=18 & aAge<65) {
			myPrice=600;
		}
		else {
			myPrice=450;
		}
		return myPrice;
	}
	//****** returnerar enkelbiljett beroende på ålder ******//
	
	private int returnSinglePrice(int aAge) {
		int myPrice;
		if(aAge < 0) {
			myPrice=0;
		}
		else if (aAge>=18 & aAge<65) {
			myPrice=35;
		}
		else {
			myPrice=20;
		}
		return myPrice;
		
	}
	//****** returnerar ålderskategori ******//
	private String returnTicketType(int aAge) {
		String myTicketType;
		if (aAge<18) {
			myTicketType="KID";
		}
		else if (aAge<65) {
			myTicketType="ADULT";
		}
		else {
			myTicketType="SENIOR";
		}
		return myTicketType;
	}
	//****** pausmetoden******//
	private void pause() {
		System.out.println("Press any key to continue... ");
		new java.util.Scanner(System.in).nextLine();
	}
}

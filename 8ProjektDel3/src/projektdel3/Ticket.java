package projektdel3;

import java.util.Scanner;

public class Ticket {
	
	//****** Visar biljett beroende av ålder******//
	
	public void ShowTicket(int aAge, String aName) {
		Scanner myScanner = new Scanner(System.in);
		
		while (true) {
			System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
            System.out.println(" *  Choose a ticket type   *");
            System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
            System.out.println(" ---------------------------");
            System.out.println("-> (1) Single " + ReturnSinglePrice(aAge) + " SEK");
            System.out.println("-> (2) Monthly " + ReturnMonthlyPrice(aAge) + " SEK");
            System.out.println("-> (0) Exit Program ");
            System.out.println(" ---------------------------");

			
			int aInput = myScanner.nextInt();	
			if (aInput==1) {
				System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
	            System.out.println(" *    SINGLE TICKET          *");
	            System.out.println(" * ------------------------- *");
	            System.out.println("  Passenger: " + aName);
	            System.out.println("  Price: " + ReturnSinglePrice(aAge) + " SEK");
	            System.out.println("  Ticket type: " + ReturnTicketType(aAge));
	            System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");

				break;
			}
			else if (aInput==2) {
				
				System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
                System.out.println(" *    MONTHLY TICKET         *");
                System.out.println(" * ------------------------- *");
                System.out.println("  Passenger: " + aName);
                System.out.println("  Price: " + ReturnMonthlyPrice(aAge) + " SEK");
                System.out.println("  Ticket type: " + ReturnTicketType(aAge));
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
		Pause();
	}
	
	//****** returnerar månadspris beroende på ålder ******//
	private int ReturnMonthlyPrice(int aAge) {
		
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
	
	private int ReturnSinglePrice(int aAge) {
		
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
	private String ReturnTicketType(int aAge) {
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
	private void Pause() {
		System.out.println("Press any key to continue... ");
		new java.util.Scanner(System.in).nextLine();
		
	}
}

package projektdel3;

import java.util.ArrayList;
import java.util.Scanner;

public class Passenger {

    private String myName; 
    private int myAge;
	ArrayList<Passenger> aPassengerList = new ArrayList<>();
	//arraylist methods
    //put empty constructor (only to use for making the main object)
    public Passenger () {}

	public void addPassenger(Ticket aTicket) {
		Scanner myScanner = new Scanner(System.in);
		
	    System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
        System.out.println(" * Add new passenger *");
        System.out.println(" * ~ ~ ~ ~ ~ ~ ~ ~ ~ *");
        System.out.println(" ---------------------");
        System.out.println("    > Type a name <   ");
        System.out.println(" ---------------------");
		String aFullName = myScanner.nextLine();
		
		System.out.println(" ---------------------");
        System.out.println("  > Insert an  age < ");
        System.out.println(" ---------------------");

		int aAge = myScanner.nextInt();
		
		aPassengerList.add(new Passenger(aFullName, aAge));
		myName=aFullName; //String in front before. see if it works
		
		if(aAge>=0) {
			aTicket.showTicket(aPassengerList.get(aPassengerList.size()-1).getMyAge(), myName);
		}
		else {
			System.out.println(" -----------------------");
			System.out.println("  That is not possible! ");
			System.out.println(" -----------------------");

		}
	} // METHOD
	
	public void showPassengerList() {
		for (int index=0;index<aPassengerList.size();index++) {
			System.out.println((index+1)+". " + aPassengerList.get(index).getMyName() + ". Age: " + aPassengerList.get(index).getMyAge());
		}
		//****** Pausar menylistan ******//
		pause();
	} // METHOD

	private void pause() {
		System.out.println(" -------------------------------");
		System.out.println("  > Press any key to continue < ");
		System.out.println(" -------------------------------");
		new java.util.Scanner(System.in).nextLine();
	} // METHOD

  //****** Getter för myName ******//
	public String getMyName() {
		return myName;
	} // METHOD

  //****** Getter för myAge ******//
	public int getMyAge() {
        return myAge;
} // METHOD

  //****** Konstruktor för age och name ******//
	public Passenger (String aName, int aAge) {
	myName=aName;
	myAge=aAge;
	} // METHOD
}
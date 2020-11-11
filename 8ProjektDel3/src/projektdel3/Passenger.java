package projektdel3;

import java.util.ArrayList;
import java.util.Scanner;

public class Passenger {

    private String myName; 
    private int myAge;

	    //arraylist methods
    //put empty constructor (only to use for making the main object)
    public Passenger () {
    	
    }
    ArrayList<Passenger> aPassengerList = new ArrayList<>();
	public void AddPassenger(Ticket aTicket) {
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
		String myName=aFullName;
		
		if(aAge>=0) {
			aTicket.ShowTicket(aPassengerList.get(aPassengerList.size()-1).getMyAge(), myName);
		}
		else {
			System.out.println(" -----------------------");
			System.out.println("  That is not possible! ");
			System.out.println(" -----------------------");

		}
	}
	
	public void ShowPassengerList() {
		for (int index=0;index<aPassengerList.size();index++) {
			System.out.println((index+1)+". " + aPassengerList.get(index).getMyName() + ". Age: " + aPassengerList.get(index).getMyAge());
			
		}
		//****** Pausar menylistan ******//
		Pause();
	}
	private void Pause() {
		  System.out.println(" -------------------------------");
          System.out.println("  > Press any key to continue < ");
          System.out.println(" -------------------------------");

		new java.util.Scanner(System.in).nextLine();
		
	}
  //****** Getter för myName ******//
public String getMyName() {
    return myName;
}

  //****** Getter för myAge ******//
public int getMyAge() {
        return myAge;
}
    

  //****** Konstruktor för age och name ******//
	    public Passenger (String aName, int aAge) {
	    myName=aName;
	    myAge=aAge;
	    }
}
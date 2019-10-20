/** Display -- a vending machine output interaction  

    @author  Prajita Niraula 
     Grinnell College
     niraulap@grinnell.edu   

    An object on vending machine to display the vending machine operations. 
*/


package vedningMachine;

public class Display extends InsertionSlot{
	
	Display(){
		
	}
	
/*public void printAmountInserted(int NumberOfBills) {
System.out.print("Enter the number of $1 bills you want to insert: ");
System.out.println("You have inserted: " + insertMoney()); 
System.out.println("The amount inserted is: " +  NumberOfBills);	
}*/

public void printEmptyStock() {
	System.out.println("Stock is empty. Sorry for the inconvinience."); 
}


public  void printUnsuccessfulTransaction() {
	System.out.println("Insufficient Fund. Please try again"); 
}

public void ExcessAmountInserted() {
	System.out.println("Excess Amount Inserted. Please try again with the exact amount."); 
}

public void printAmountInserted() {
	System.out.println("The total amount inserted so far is $" +  totalInsertedAmount());
}
	

public void printdollarInserted() {
	System.out.println("**You currently inserted a $1 bill**");
}
}






/** InsertionSlot -- a vending machine insertion slot 

    @author  Prajita Niraula 
     Grinnell College
     niraulap@grinnell.edu   

    An object on vending machine insert $1 bills in the vending machine. 
*/

package vedningMachine;

import java.util.Scanner;


public class InsertionSlot extends BillBox{
	
/*The numberOfBills field stores the number of bills inserted by the user for the vending operation*/ 
	 protected  int numberOfBills; 
	
/* The InsertionSlot constructor sets the numberOfBills to 0.*/ 	 
	InsertionSlot()
	{
		numberOfBills = 0;
	}
	
		
	  /** The totalInsteredAmount method records the total amount inserted by the vending machine user. 
     @param none
     @return numberofBills which is the number of bills inserted by the user for the vending operation. 
     */
	
	public int totalInsertedAmount() {
		numberOfBills = ++numberOfBills;
		return numberOfBills; 
	}
	 
		
}//Insertion Slot 


/** BeverageReciever -- a vending machine slot to output the beverage receiving  operation   

    @author  Prajita Niraula 
     Grinnell College
     niraulap@grinnell.edu   

    An object on on vending machine to output the successful transaction upon receiving  the beverage . 
*/

package vedningMachine;

public class BeverageReciever {
 
	/*BeverageReciever constructor does not set anything.*/ 
	BeverageReciever(){
				
	}
	
	/**printSuccessfulTransaction method outputs successful transaction message.
	 *  @return none
	 *  @param  none*/ 
	public void printSuccessfulTransaction() {
		System.out.println("Item has been purchased successfully. Thank you."); 
	}
}




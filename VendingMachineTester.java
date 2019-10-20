/** VendingMachineTester -- a vending Machine tester      

			    @author  Prajita Niraula 
			     Grinnell College
			     niraulap@grinnell.edu   

			    An object that operates a vending machine. 
*/	

package vedningMachine;

public class VendingMachineTester {

	/*The constructor VendingMachineTester does nothing.*/
	VendingMachineTester(){
		
	}
	
	/** The method main creates an object for VendingMachine which manages the vending machine operation.
	 *  @param args
	 *  @return void 
	 */
	public static void main (String [] args) {
	VendingMachine myMachine = new VendingMachine();
	myMachine.vendingOperation(); 
	}
	
}

/*Help recieved from Prof. Hajiamini to understand how to implement the class.*/

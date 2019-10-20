/** Stockpile -- a vending machine stockpile     

    @author  Prajita Niraula 
     Grinnell College
     niraulap@grinnell.edu   

    An object on vending machine to manage and display the cost of the beverage. 
*/


package vedningMachine;

public class Stockpile {
 
	/*Field cost stores the cost of cost of the beverage */
     protected int cost;
     

    
    /** The method displayCost() displays the cost of the can
     * @param: none
     * @return: none */ 
	public void displayCost() {
	System.out.println("The cost of a can is " + cost);
	}
	
	
	/** The method getcost() gets the cost of the beverage. 
     * @param: none
     * @return: cost */ 
	public  int getCost() {
		return cost; 
	}
		
	
}

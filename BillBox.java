/** BillBox -- a vending machine Bill Box  

    @author  Prajita Niraula 
     Grinnell College
     niraulap@grinnell.edu   

    An object on vending machine to keep track of deposited amount and stock in the vending machine. 
*/


package vedningMachine;

public class BillBox {
	
		protected int depositedDollars; 
		protected int stockPile; 
	
	BillBox(){
		depositedDollars = 0; 
		stockPile = 10;
	}
	 
	
public  int getStockPile(){
return stockPile; 
}

public  int getdepositedDollars(){
return depositedDollars; 
}

public void dollarDeposited(int currentInsertedAmount) {
	depositedDollars = depositedDollars + currentInsertedAmount; 
}

public void recieveBeverage() {
	--stockPile; 
}

}

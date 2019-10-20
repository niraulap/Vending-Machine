/** VendingMachine -- a vending Machine     

			    @author  Prajita Niraula 
			     Grinnell College
			     niraulap@grinnell.edu   

			    An object that operates a vending machine for beverages. 
*/	

package vedningMachine;
import java.util.Scanner; 
				
								
public class VendingMachine {
/*Field Stockpile is an object of a stock for a vending machine.*/ 					
private  Stockpile mystock = new Stockpile (); 
/*Field BillBox is an object of a BillBox for a vending machine.*/ 
private  BillBox myBillBox = new BillBox (); 
/*Field BeverageReciever is an object that handles the recieving of beverage for the vending machine.*/ 
private  BeverageReciever myReciever = new BeverageReciever (); 
/* Field Insertion is an object that manages the insertion operation of the vending machine*/ 
private  InsertionSlot myInsertionSlot = new InsertionSlot(); 
/*Field Display in an object that handles the output of transactions in the vending machine operation.*/
private  Display myDisplay = new Display (); 
/*Field numberOfBillsInserted is a counter for the number of bills inserted by the user.*/ 
private  int numberOfBillsInserted; 

/*The constructor VendingMachine sets the cost of the beverage.*/ 
public VendingMachine(){
mystock.cost = 5; 
}

/**Method vendingOperation manages the entire vending operation when a user uses a vending machine.
 *@param: none
 *@return: none */
public  void vendingOperation (){
if (myBillBox.getStockPile() == 0){
myDisplay.printEmptyStock(); 
}//if 
else {
mystock.displayCost(); 
boolean found = true; 
						
while(found) {
Scanner sc = new Scanner(System.in);
System.out.println("Insert 'y' to insert a $1 bill. Insert any other character to terminate bill insertion.");
char userinput = sc.next().charAt(0); 
if (userinput == 'y'){
//myInsertionSlot.insertMoney();
myDisplay.printdollarInserted();
myDisplay.printAmountInserted();
numberOfBillsInserted++;} 
 else {
 found = false; 
 }
}
						
						 											
if (numberOfBillsInserted == mystock.getCost())	{
myBillBox.recieveBeverage(); 
myReciever.printSuccessfulTransaction(); 
myBillBox.dollarDeposited(numberOfBillsInserted); 
//System.out.println("Stock is now "+ myBillBox.getStockPile() + " and the total dollars deposited is "+ myBillBox.getdepositedDollars()); 
}
else if (numberOfBillsInserted < mystock.getCost()) {
myDisplay.printUnsuccessfulTransaction();
//System.out.println("Stock is now "+ myBillBox.getStockPile() + " and the total dollars deposited is "+ myBillBox.getdepositedDollars());
}
else if(numberOfBillsInserted > mystock.getCost()) {
myDisplay.ExcessAmountInserted();
//System.out.println("Stock is now "+ myBillBox.getStockPile() + " and the total dollars deposited is "+ myBillBox.getdepositedDollars());
}
else 
{
System.out.println("Technical Error. Please try again.");}
}//else
				
}
}

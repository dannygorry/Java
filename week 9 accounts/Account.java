/*
*
*@Edited by Daniel Gorry
*/
public class Account{
    private int openingBalance;
    private int currentBalance;
    private int creditLimit;
    private String accountHolderName;
    private String accountHolderAddress;
    //variable to store the variables inputted within the other class so i can format it here and the other class will follow this format
    public static int numOfAccounts = 0;

    /**
     * Constructor
     */
    public Account(int startAmount, int balance, int credit, String name, String address)  {
        openingBalance = startAmount;
        currentBalance = balance;
        creditLimit = credit;
    	accountHolderName = name;
    	accountHolderAddress = address;
        numOfAccounts++;
    }
    //above is the constructor used to make the format. 
    //i have told the code that the first 3 things within account will be integers and no matter what is put in this in another class when shown here it will be accessed as the
    //variables startAmount, balance, credit, name, address. these then get converted from that variable and then turned into the variables declared at the top of the page
    //so then i can use these later on within this class
    /**
     * Set the balance
     */
    public void setBalance( int amount)  {
        currentBalance = amount;
    }
    //this will set the balance as an interger know as amount and then this will convert the information stored within amount into the variable currentbalance 
    /**
     * Get the balance
     */
    public int getBalance()   {
        return currentBalance;
    }
    //this will display the string or integer declared in currentbalance after it has be converted in the set stage
    /**
     * Set the credit limit
     */
    public void setCreditLimit(int amount) {
        creditLimit = amount;
    }
    //this will set the creditlimit as an interger know as amount and then this will convert the information stored within amount into the variable creditlimit
    /**
     * Get the credit limit
     */
    public int getCreditLimit()   {
        return creditLimit;
    }
    //this will display the string or integer declared in creditlimit after it has be converted in the set stage
        public void setName(String name){
    	accountHolderName = name;
    }
    //this will set the name as a string know as name and then this will convert the information stored within amount into the variable accountHolderName 
    public String getName() {
    	return accountHolderName;
    }
    //this will display the string or integer declared in accountHolderName after it has be converted in the set stage
    public void setAddress(String address){
    	accountHolderAddress = address;
    }
    //this will set the address as a string know as amount and then this will convert the information stored within amount into the variable accountHolderAddress 
    public String getAddress() {
    	return accountHolderAddress;
    }
    //this will display the string or integer declared in accountHolderAddress after it has be converted in the set stage
    /**
     * Show the current balance and the credit limit
     */
    public void showData()     {
        System.out.println("balance = " + currentBalance + " credit = " + creditLimit);
    }
    //the code above prints out saying "balance =" then the information stored in the variable currentbalance
    //then it will show "credit =" then whatever is stored within the variable creditlimit
    //if i was to put account1.showData at the end of the code then it will only show this information
    public void showAddAndName() {
	   System.out.println("name = " + accountHolderName + "\n" + "adrress = " + accountHolderAddress);
    }
    //the code above prints out saying "name =" then the information stored in the variable accountHolderName
    //then it will show "address =" then whatever is stored within the variable accountHolderAddress
    //if i was to put account1.showAddAndName at the end of the code then it will only show this information
    public void showAll()     {
        System.out.println("name = " + accountHolderName + "\n" + "adrress = " + accountHolderAddress);
        System.out.println("your opening balance = " + openingBalance);
        System.out.println("balance = " + currentBalance);
        System.out.println("credit = " + creditLimit);
    }
    //the code above prints out saying "name =" then the information stored in the variable accountHolderName
    //then it will show "address =" then whatever is stored within the variable accountHolderAddress
    //then the code above prints out saying "balance =" then the information stored in the variable currentbalance
    //then it will show "credit =" then whatever is stored within the variable creditlimit    
    //if i was to put account1.showAll at the end of the code then it will only show this information
}

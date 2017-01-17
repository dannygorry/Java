import java.util.Scanner;
/*edited by Daniel Gorry 1600351
* 
* Program uses Account class,
* create 3 user inputted accounts .
* Prints collected data.
*/
public class ThreeAccounts {
    public static void main(String [] args) {
        Account account1, account2, account3;           
        
                Scanner keyboard4 = new Scanner(System.in);
        System.out.println("Please, enter your full Name: ");
        //this code above uses the scanner class and then allows the user to type in an answer to the question provided in this case it asks for your full name
        //it uses the vairiable "keyboard5" so i can later describe what the user has inputted and call it "keyboard4"
        
        String output4String = keyboard4.nextLine();
        //this code is converting the data kept within "keyboard4" into a string with the variable name "output4String" so it is easier to use later on in the code

                Scanner keyboard5 = new Scanner(System.in);
                System.out.println();
        System.out.println("Please, enter your full Address: ");
        //this code above uses the scanner class and then allows the user to type in an answer to the question provided in this case it asks for your full address
        //it uses the vairiable "keyboard5" so i can later describe what the user has inputted and call it "keyboard5"
        
        String output5String = keyboard5.nextLine();
        //this code is converting the data kept within "keyboard5" into a string with the variable name "output5String" so it is easier to use later on in the code
        
                account1 = new Account(100, 50, 30, output4String, output5String);
                account1.showAll();
        System.out.println(Account.numOfAccounts+" Account Created");
        /*
         * the code above refers to the account class and compare the information in that class and the information collected here and if it fits the format used by 
         * accounts class and then displays all the information withi that formatting.
         *and last line of code there allows you to add more total accounts to the account counter with in the account class and each time you make an account using 
         *this class it will go up by one and display that x amount of accounts have been created in total
         */
       
                Scanner keyboard44 = new Scanner(System.in);
                System.out.println();
        System.out.println("Please, enter your full Name: ");
        
        String output44String = keyboard44.nextLine();
        
        
                Scanner keyboard55 = new Scanner(System.in);
                System.out.println();
        System.out.println("Please, enter your full Address: ");
        
        String output55String = keyboard55.nextLine();
        
        
                account1 = new Account(500, 230, 115, output44String, output55String);
                account1.showAll();
        System.out.println(Account.numOfAccounts+" Accounts Created");


                Scanner keyboard444 = new Scanner(System.in);
                System.out.println();
        System.out.println("Please, enter your full Name: ");
        
        String output444String = keyboard444.nextLine();
        System.out.println();
        
                Scanner keyboard555 = new Scanner(System.in);
                System.out.println();
        System.out.println("Please, enter your full Address: ");
        
        String output555String = keyboard555.nextLine();
        
                account1 = new Account(240, 120, 60, output444String, output555String);
                account1.showAll();
        System.out.println(Account.numOfAccounts+" Accounts Created");
    }
}

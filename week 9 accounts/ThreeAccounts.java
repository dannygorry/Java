import java.util.Scanner;
/*edited by Daniel Gorry 1600351
* 
* Program uses Account class,
* create 3 pre created accounts .
* Prints collected data.
*/
public class ThreeAccounts {
    public static void main(String [] args) {
        Account account1, account2, account3;           
        
                Scanner keyboard4 = new Scanner(System.in);
        System.out.println("enter your Name: ");
        
        String output4String = keyboard4.nextLine();

                Scanner keyboard5 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your Address: ");
        
        String output5String = keyboard5.nextLine();
        
        
                account1 = new Account(100, 50, 30, output4String, output5String);
                account1.showAll();
        System.out.println(Account.numOfAccounts+" accounts opened");
                
                Scanner keyboard44 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your Name: ");
        
        String output44String = keyboard44.nextLine();
        
        
                Scanner keyboard55 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your Address: ");
        
        String output55String = keyboard55.nextLine();
        
        
                account1 = new Account(500, 230, 115, output44String, output55String);
                account1.showAll();
        System.out.println(Account.numOfAccounts+" accounts opened");


                Scanner keyboard444 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your Name: ");
        
        String output444String = keyboard444.nextLine();
        System.out.println();
        
                Scanner keyboard555 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your Address: ");
        
        String output555String = keyboard555.nextLine();
        
                account1 = new Account(240, 120, 60, output444String, output555String);
                account1.showAll();
        System.out.println(Account.numOfAccounts+" accounts opened");
    }
}

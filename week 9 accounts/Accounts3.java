import java.util.Scanner;
/*edited by Daniel Gorry 1600351
* 
* Program uses Account class,
* create 3 pre created accounts .
* Prints collected data.
*/
public class Accounts3 {
    public static void main(String [] args) {
        Account account1, account2, account3;
       
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("enter your starting balance: ");
        
        
        String output1String = keyboard1.nextLine();
        int output1Int = Integer.parseInt(output1String);
        
        
                Scanner keyboard2 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your current balance: ");
        
        String output2String = keyboard2.nextLine();
        int output2Int = Integer.parseInt(output2String);
        
        
                Scanner keyboard3 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your credit limit: ");
        
        String output3String = keyboard3.nextLine();
        int output3Int = Integer.parseInt(output3String);
        
        
                Scanner keyboard4 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your Name: ");
        
        String output4String = keyboard4.nextLine();
        
        
        
                Scanner keyboard5 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your Address: ");
        
        String output5String = keyboard5.nextLine();
        
        
                account1 = new Account(output1Int, output2Int, output3Int, output4String, output5String);
                account1.showAll();
        System.out.println(Account.numOfAccounts+" accounts opened");
        
                Scanner keyboard11 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your starting balance: ");
        
        String output11String = keyboard11.nextLine();
        int output11Int = Integer.parseInt(output11String);
        
        
                Scanner keyboard22 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your current balance: ");
        
        
        String output22String = keyboard22.nextLine();
        int output22Int = Integer.parseInt(output22String);
        System.out.println();
        
                Scanner keyboard33 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your credit limit: ");
        
        String output33String = keyboard33.nextLine();
        int output33Int = Integer.parseInt(output33String);
        
        
                Scanner keyboard44 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your Name: ");
        
        String output44String = keyboard44.nextLine();
        
        
                Scanner keyboard55 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your Address: ");
        
        String output55String = keyboard55.nextLine();
        
        
                account1 = new Account(output11Int, output22Int, output33Int, output44String, output55String);
                account1.showAll();
        System.out.println(Account.numOfAccounts+" accounts opened");

                Scanner keyboard111 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your starting balance: ");
        
        String output111String = keyboard111.nextLine();
        int output111Int = Integer.parseInt(output111String);
        
        
                Scanner keyboard222 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your current balance: ");
        
        String output222String = keyboard222.nextLine();
        int output222Int = Integer.parseInt(output222String);
        
        
                Scanner keyboard333 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your credit limit: ");
        
        String output333String = keyboard333.nextLine();
        int output333Int = Integer.parseInt(output333String);
        
        
                Scanner keyboard444 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your Name: ");
        
        String output444String = keyboard444.nextLine();
        System.out.println();
        
                Scanner keyboard555 = new Scanner(System.in);
                System.out.println();
        System.out.println("enter your Address: ");
        
        String output555String = keyboard555.nextLine();
        
                account1 = new Account(output111Int, output222Int, output333Int, output444String, output555String);
                account1.showAll();
        System.out.println(Account.numOfAccounts+" accounts opened");
    }
}

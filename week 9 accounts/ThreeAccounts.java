import java.util.Scanner;
/*edited by Daniel Gorry 1600351
* 
* Program uses Account class,
* create 1 user inputted account.
* Prints collected data.
*/
public class InputOnce {
    public static void main(String [] args)  {
        Account newClient;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter your full name:");
        //this code above uses the scanner class and then allows the user to type in an answer to the question provided in this case it asks for your full name
        //it uses the vairiable "keyboard" so i can later describe what the user has inputted and call it "keyboard"

        String output1 = keyboard.nextLine();
        System.out.println();
        //this code is converting the data kept within "keyboard" into a string with the variable name "output1" so it is easier to use later on in the code
        
        Scanner keyboard1 = new Scanner(System.in);
        System.out.println("Please, enter your full address:");
        //this code above uses the scanner class and then allows the user to type in an answer to the question provided in this case it asks for your full address
        //it uses the vairiable "keyboard1" so i can later describe what the user has inputted and call it "keyboard1"
        String output2 = keyboard.nextLine();
        System.out.println();
        //this code is converting the data kept within "keyboard1" into a string with the variable name "output2" so it is easier to use later on in the code
        newClient = new Account(150, 100, 60, output1, output2);
        newClient.showAll();
        /* the code above refers to the account class and compare the information in that class and the information collected here and if it fits the format used by 
         * accounts class and then displays all the information withi that formatting.
         */
    }
}

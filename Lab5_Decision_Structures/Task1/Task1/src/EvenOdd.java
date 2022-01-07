/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 30th 2021
 * Student Number: 251213353
 *
 * Description of program: Asks the user to input a value and returns a statement saying whether the variable is
 * an even number or an odd number.
 */

import java.util.Scanner; // import the Java Scanner class
public class EvenOdd {
    public static void main(String[] args) {
        int number; // declare a variable, "number", to store integer value that user inputs
        Scanner keyboard = new Scanner(System.in); // create a Scanner object, "keyboard", to receive input of user

        // Output a print statement asking the user to input a number to check if its even or odd
        System.out.print("Enter a number to check if its even or odd: ");

        number = keyboard.nextInt(); // store the value of the number the user entered into the "number" variable

        // Create a variable, "checker", that is equal to the remainder of the "number" variable when divided by 2
        int checker = number % 2;

        /* Create an if...else statement to print "EVEN" if the checker variable is equal to 0 and to print "ODD" if it
        is equal to any other value. This is because any even number will have a remainder of zero if divided by 2, and
        that is what the value of the checker variable would be if an even number was stored in it.
         */
        if (checker == 0) {
            System.out.println("\nEVEN"); // output a print statement that says "EVEN"

        } else {
            System.out.println("\nODD"); // output a print statement that says "ODD"
        }
    }
}

/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 13th 2021
 * Student Number: 251213353
 *
 * Description of program: Asks the user to input a positive nonzero integer value and outputs a sequence of all the
 * squares of natural numbers that do not exceed the positive nonzero integer value they entered, in ascending order.
 */


import java.util.Scanner; // import the Java Scanner class
import java.lang.Math; // import the Java Math class

public class PrintSquares {
    public static void main(String[] args) {
        int number; // declare a variable, "number", that stores the positive nonzero integer value from the user
        Scanner keyboard = new Scanner(System.in); // create a Scanner object, "keyboard", to receive input of user
        // Output a print statement asking the user to input a positive nonzero integer value
        System.out.println("Input a positive nonzero integer value: ");
        number = keyboard.nextInt(); // store the value the user entered into the "number" variable

        /* Create a variable, "counter", that will represent the natural numbers that are being squared to reach the
        value the user entered. The lowest value that the user can enter is 1, so the counter will be set to 1 as well.
        The "counterChecker" serves a similar purpose and will be used to anticipate if the square of the natural
        number after the current one will be greater than the value the user entered.
         */
        int counter = 1;
        int counterChecker = 1;

        /* Declare a variable, "square", that will eventually be used to store the value of the square of the natural
        number that the counter variable is equal to. The variable "squareChecker" serves a similar purpose but will
        store the value of the square of the number the counterChecker variable is equal to.
         */
        int square;
        int squareChecker;

        /* Do-while statement will keep running the statements inside it provided that the square is less than the
        number the user entered
         */
        do {
            square = (int) Math.pow (counter, 2); // store the value of the square of the counter variable in "square"
            counter++; // increase the counter variable by an increment of 1
            counterChecker = counter; // set the value of the counterChecker variable equal to the counter variable
            // store the value of the square of the counterChecker variable in "squareChecker"
            squareChecker = (int) Math.pow (counterChecker, 2);

            /* First If Statement : prints the square followed by a comma if the square is less than the number the user
            entered and if the next square in the sequence is also less than the number entered

            Second If Statement: prints the square followed by a period if the square is less than or equal to the
            number the user entered and if the next square in the sequence is greater than the number entered

            Third If Statement: prints the square followed by a comma if the square is less than the number the user
            entered.

             */

            if (square < number && squareChecker < number) {
                System.out.print(square + ", "); // print the current value of the square variable followed by a comma
            }
            else if (square <= number && squareChecker > number) {
                System.out.print(square + "."); // print the current value of the square variable followed by a period
            }
            else if (square < number){
                System.out.print(square + ", "); // print the current value of the square variable followed by a comma
            }
        } while (square < number);

    }
}

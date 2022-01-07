/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 13th 2021
 * Student Number: 251213353
 *
 * Description of program: Asks the user to input a positive nonzero integer value and outputs the sum of all the
 * integers from 1 up to the number entered
 */

import java.util.Scanner; // import the Java Scanner class

public class SumAll {
    public static void main(String[] args) {
        // outputs a print statement asking the user to input a positive nonzero integer value
        System.out.println("Enter a positive nonzero integer value: ");
        Scanner keyboard = new Scanner(System.in); // create a Scanner object, "keyboard", to receive input of user
        int value; // declare a variable, "value", to store the positive nonzero integer the user inputs
        value = keyboard.nextInt(); // stores the positive nonzero integer of the user into the variable, "value"
        /* initialize a variable, "counter", and have it equal to 1, since you will at least need to add 1 initially
        to the sum because 1 is the lowest nonzero positive integer the user can enter.
         */
        int counter = 1;
        int sum = 0; // create a variable, "sum", to store the sum of all the intgers from 1 up to number entered
        do {
            sum += counter; // add whatever the value of the counter variable is to the sum variable
            counter++; // increase the counter variable by an increment of 1
        } while (counter <= value);
        // The above statements keep looping as long as the counter is less than or equal to the value the user entered

        /* Output two print statements that tell the user what the sum of all the positive integers up until the number
        they entered is.
         */
        System.out.println("The sum of all the integers from 1 up to the number you entered is: ");
        System.out.println(sum); // Output the sum of all the positive integers they entered is
    }
}

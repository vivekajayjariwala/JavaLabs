/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 13th 2021
 * Student Number: 251213353
 *
 * Description of program: Accepts, as input, a set of non-negative integers, that is either positive or zero and when
 * the program encounters 11 in the sequence of inputs, stops and outputs the total length of the sequence before the 11
 * was inputted.
 */

import java.util.Scanner; // import the Java Scanner class

public class StopsAtEleven {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // create a Scanner object, "keyboard", to receive input of user
        int value; // declare a variable, "value", to store the value of the user's inputs
        int counter = 0; // create a variable, "counter", to keep track of the number of inputs in the sequence

        do {
            value = keyboard.nextInt();
            if (value < 0) {
                /* If the user enters a negative number, the program does not increase the counter variable but instead
                informs the user that they need to enter a non-negative integer that is either positive or zero
                 */
                System.out.println("Sorry, but you must enter a non-negative integer, that is either positive or zero.");
            } else {
                /* Provided that the user does not enter a negative integer, the program will continue to increase the
                counter variable by an increment of one for every non-negative integer the user enters
                 */
                counter++; // increase the counter variable by an increment of one
            }
        } while (value != 11);
        // keep looping the above actions within the do statement as long as the input entered is not equal to 11

        /* When the user finally inputs the number 11, the do-while loop breaks and the counter is printed, displaying
        the number of values in the sequence before the 11 was inputted.
         */
        System.out.println(counter-1);
    }
}

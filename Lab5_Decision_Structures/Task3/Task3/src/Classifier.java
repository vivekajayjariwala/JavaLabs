/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 30th 2021
 * Student Number: 251213353
 *
 * Description of program: Asks the user to input a rank value from 1-4 and returns a statement saying which category
 * the rank is classified under.
 */

import java.util.Scanner; // import the Java scanner class
public class Classifier {
    public static void main(String[] args) {
        int rank; // declare a variable, "rank", to store integer value that user inputs
        Scanner keyboard = new Scanner(System.in); // create a Scanner object, "keyboard", to receive input of user

        // Output a print statement asking the user to input a rank to classify it
        System.out.print("Enter your rank from 1-4 to classify your academic performance: ");

        rank = keyboard.nextInt(); // store the value of the number the user entered into the "rank" variable

        /* Creates an if statement with nested if-else statements that for each value for the "rank variable", outputs a
        corresponding print statement that says what category that rank would be in. If the number inputted is not
        between 1-4, then it tells the user that the number they inputted was not between 1-4.
         */

        if (rank == 1){
            // outputs a print statement stating that the rank is in the category, "Unacceptable"
            System.out.println("\nUnacceptable");

        } else if (rank == 2){
            // outputs a print statement stating that the rank is in the category, "Below Expectations"
            System.out.println("\nBelow Expectations");

        } else if (rank == 3){
            // outputs a print statement stating that the rank is in the category, "Meets Expectations"
            System.out.println("\nMeets Expectations");

        } else if (rank == 4){
            // outputs a print statement stating that the rank is in the category, "Exceeds Expectations"
            System.out.println("\nExceeds Expectations");

        } else {
            // outputs a print statement stating that the user did not enter a value between 1-4
            System.out.println("\nYou did not enter a rank value between 1-4");

        }

    }
}

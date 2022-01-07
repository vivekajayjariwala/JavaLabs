/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 13th 2021
 * Student Number: 251213353
 *
 * Description of program: Asks the user to input two integers and then outputs the sum of all integers from the first
 * integer to the second integer.
 */
import java.util.Scanner; // import the Java Scanner class

public class SumA2B {
    public static void main(String[] args) {
        int valueA; // declare a variable, valueA, that stores the value of the first number the user inputs
        int valueB; // declare a variable, "valueB", the stores the value of the second number the user inputs

        // create a variable, "sum", that will store value of the sum of all the integers between the user's values
        int sum=0;

        Scanner keyboard = new Scanner(System.in); // create a Scanner object, "keyboard", to receive input of user

        System.out.println("Input an integer: "); // prints statement asking the user to input an integer
        valueA = keyboard.nextInt(); // stores the value of the input into "valueA"
        // prints statement asking the user to input another integer, but that it should be larger than the first
        System.out.println("Input a second integer that is larger than the first one: ");
        valueB = keyboard.nextInt(); // stores the value of the input into "valueB"

        /* Create an if statement in case the user does not listen to the instructions and inputs a larger value for
        the second integer than the first. It will run the statements above in a do-while loop until the user inputs
        a value for the second integer that is larger than the first.
         */

        if (valueB < valueA) {
            // a do-while loop that will repeat the below statements until the second value is larger than the first
            do {
                /* Outputs a print statement informing the user that they did not input a value for the second integer
                that is smaller than the first.
                 */
                System.out.println("You did not enter a value for the second integer that is larger than the first. Please try again.");
                System.out.println("Input an integer: "); // prints statement asking the user to input an integer
                valueA = keyboard.nextInt(); // stores the value of the input into "valueA"
                // prints statement asking the user to input another integer, but that it should be larger than the first
                System.out.println("Input a second integer that is larger than the first one: ");
                valueB = keyboard.nextInt(); // stores the value of the input into "valueB"
            }while (valueB < valueA);
        }
        /* A for loop that will initialize the variable i, have it initially equal to "valueA" will keep looping
        with the condition that i is less than or equal to "valueB". With each loop, i is incremented by 1.
         */
        for (int i = valueA; i <= valueB; i++){
            sum += i; // add the current value of i to the "sum" variable
        }

        /* Outputs two print statements that tell the user what the value is for the sum of all the integers between
        the first value they entered to the second value they entered.
         */

        System.out.println("The sum of all integers from the first integer you entered to the last are: ");
        System.out.println(sum);
    }
}

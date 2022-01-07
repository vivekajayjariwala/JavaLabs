/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 13th 2021
 * Student Number: 251213353
 *
 * Description of program: Takes the input of two numbers, and outputs the numbers from this interval, but if the number
 * is divisible by 3, the program outputs Fizz instead of the number, if the number is divisible by 5, it
 * will output Buzz, and if it is divisible both by 3 and by 5, it will output FizzBuzz.
 */
import java.util.Scanner; // import the Java Scanner class

public class FizzBuzz {
    public static void main(String[] args) {
        int valueA; // declare a variable, valueA, that stores the value of the first number the user inputs
        int valueB; // declare a variable, "valueB", the stores the value of the second number the user inputs
        Scanner keyboard = new Scanner(System.in); // create a Scanner object, "keyboard", to receive input of user

        System.out.println("Input an integer: "); // prints statement asking the user to input an integer
        valueA = keyboard.nextInt(); // stores the value of the input into "valueA"
        // prints statement asking the user to input another integer, but that it should be larger than the first
        System.out.println("Input a second integer that is larger than the first one: ");
        valueB = keyboard.nextInt(); // stores the value of the input into "valueB"

        /* A for loop that will initialize the variable i, have it initially equal to "valueA" will keep looping
        with the condition that i is less than or equal to "valueB". With each loop, i is incremented by 1.
         */
        for (int i = valueA; i <= valueB; i++){

            // Create a variable called "byThree" that is equal to the remainder of when i is divided by 3.
            int byThree = i % 3;

            // Create a variable called "byFive" that is equal to the remainder of when i is divided by 5.
            int byFive = i % 5;

            /* if statement for when both "byThree" and "byFive" are equal to 0, which indicates that the number is
            divisible by both 3 and 5.
            */
            if (byThree == 0 && byFive == 0) {
                System.out.println("FizzBuzz"); // prints "FizzBuzz" because the value is divisible by 3 and 5
            }
            // if statement for when "byThree" is equal to 0, which indicates that the number is divisible by 3
            else if (byThree == 0) {
                System.out.println("Fizz"); // prints "Fizz" because the value is divisible by 3
            }
            // if statement for when "byFive" is equal to 0, which indicates that the number is divisible by 5
            else if (byFive == 0) {
                System.out.println("Buzz"); // prints "Buzz" because the value is divisible by 5
            }
            /* if statement for when both "byThree" and "byFive" are not equal to 0, which indicates that the number is
            not divisible by both 3 and 5.
            */
            else if (byThree != 0 && byFive != 0){
                System.out.println(i); // prints the value of i at that current instance
            }
        }
    }
}

/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 30th 2021
 * Student Number: 251213353
 *
 * Description of program: Asks the user to input a year number and determines if it is a leap year or not
 */

import java.util.Scanner; //import the Java Scanner class
public class IsLeapYear {
    public static void main(String[] args) {
        int year; //declare a variable, "year", to store the value of the year number the user enters

        Scanner keyboard = new Scanner(System.in); // create a Scanner object, "keyboard", to receive input of user

        // Output a print statement asking the user to input a year number to check if it is a leap year or not
        System.out.print("Enter a year number to determine if it is a leap year or not: ");

        year = keyboard.nextInt(); // store the value of the year number the user entered into the "year" variable

        // Create a variable, "firstCheck", that is equal to the remainder of the "year" variable when divided by 4
        int firstCheck = year % 4;
        // Create a variable, "secondCheck", that is equal to the remainder of the "year" variable when divided by 100
        int secondCheck = year % 100;
        // Create a variable, "thirdCheck", that is equal to the remainder of the "year" variable when divided by 400
        int thirdCheck = year % 400;

        /* (1st if statement) If the year number is not divisible by 4, which is when the remainder when divided by 4
        is equal to 0, then it is not a leap year.

        The remainder when divided by 4 is stored in the firstCheck variable

        (2nd if statement) If the year is divisible by 4, which is when the remainder when divided by 4 is equal to 0,
        and not divisible by 100, which is when the remainder when divided by 100 is equal to 0, then it is leap year.

        The remainder when divided by 100 is stored in the secondCheck variable

        (3rd if statement) If the year is divisible by 4 and also divisible by 100, then the year is a leap year
        if it is also divisible by 400 otherwise it is not leap year

        The remainder when divided by 400 is stored in the thirdCheck variable
         */

        //if firstCheck is not equal to 0
        if (firstCheck != 0) {

            System.out.println("\nThe year you entered is not a leap year"); //prints that the year is not a leap year

        }
        //if firstCheck is equal to zero and secondCheck is not equal to 0
        if (firstCheck == 0 && secondCheck != 0){

            System.out.println("\nThe year you entered is a leap year"); //prints that the year is a leap year

        }
        //if firstCheck, secondCheck, and thirdCheck are all equal to 0
        if (firstCheck == 0 && secondCheck == 0 && thirdCheck == 0 ){

            System.out.println("\nThe year you entered is a leap year"); //prints that the year is a leap year

        }
    }

}

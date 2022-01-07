/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 20th 2021
 * Student Number: 251213353
 *
 * Description of program: Asks the user to enter the length of a room, width of a room, and price per square foot of
 * carpet for a room. It then displays the dimensions of the room and the total cost to carpet it based on the inputted
 * information.
 */

import java.text.DecimalFormat; // import the Decimal Format class
import java.util.Scanner; // import the Java Scanner class

public class CarpetCalculator {
    public static void main(String[] args) {
        double userPrice; // declare a variable to store the price per square foot of carpet the user enters
        double userLength; // declare a variable to store the length of the room that the user enters
        double userWidth; // declare a variable to store the width of the room that the user enters

        Scanner keyboard = new Scanner(System.in); // create a Scanner object, keyboard, to store inputs from the user
        // create a Decimal Format object, df, to specify how decimal values are displayed (to hundreth place)
        DecimalFormat df = new DecimalFormat("0.00");

        // display a message asking user to enter the price per square foot
        System.out.print("Enter the price per square foot: ");
        userPrice = keyboard.nextDouble(); // store user inputted value for price per square foot in userPrice variable
        // display a message asking user to enter the length of the room
        System.out.print("Enter the length of the room: ");
        userLength = keyboard.nextDouble(); // store user inputted value for room length in userLength variable
        // display a message asking user to enter the width of the room
        System.out.print("Now enter the width of the room: ");
        userWidth = keyboard.nextDouble(); // store user inputted value for room width in userWidth variable

        // create a RoomDimension object, rd, to access methods in RoomDimension class
        RoomDimension rd = new RoomDimension(userLength, userWidth);
        // create a RoomCarpet object, rc, to access methods in RoomCarpet class
        RoomCarpet rc = new RoomCarpet(userLength, userWidth, userPrice);

        // Display a print statement of the dimensions of the room and area of the room
        System.out.println("Room dimensions:\n" + rd.toString());
        // Display a print statement of the total cost to carpet the room
        System.out.println("Carpet cost: $" + df.format(rc.getTotalCost()));
    }
}

/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 30th 2021
 * Student Number: 251213353
 *
 * Description of program: Asks the user to input numerical values for a month, day, and year and then outputs whether
 * the date given is a "magic date" (the month and day digits multiply to equal the year digits) or not
 */


import java.util.Scanner; // import the Java Scanner class
public class MagicDatesDemo {
    public static void main(String[] args) {
        int userMonth; // declare a variable, "userMonth", to store the user's input for the month value
        int userDay;// declare a variable, "userDay", to store the user's input for the day value
        int userYear; // declare a variable, "userYear", to store the user's input for the year value

        Scanner keyboard = new Scanner(System.in); // create a Scanner object, "keyboard", to receive input of user

        System.out.print("Enter a number for the month: "); // outputs statement asking to input a month value
        userMonth=keyboard.nextInt(); // stores month value in "userMonth" variable

        System.out.print("\nEnter a number for the day: "); // outputs statement asking to input a day value
        userDay=keyboard.nextInt(); // stores day value in "userDay" variable


        System.out.print("\nEnter a two digit number for the year: "); // outputs statement asking to input a year value
        userYear=keyboard.nextInt(); // stores year value in "userYear" variable

        /* Create an object, "md", to call the MagicDate class using userMonth, userDay, and userYear as the three
        integer arguments required to call it
         */

        MagicDate md = new MagicDate(userMonth, userDay, userYear);

        /* If the returned boolean value from the isMagic() method is true, that verifies if the date entered is
        considered a "magic date" and thus prints a statement saying it is "magic". If the returned boolean value
        entered is false, it prints a statement saying it is not "magic".
         */

        if (md.isMagic()){
            System.out.println("\nThe date entered is magic"); // outputs statement saying date is "magic"
        }
        if (md.isMagic() == false){
            System.out.println("\nThe date entered is not magic"); // outputs statement saying date is not "magic"
        }

    }
}

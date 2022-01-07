/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 13th 2021
 * Student Number: 251213353
 *
 * Description of program: Returns a string value of either "heads" or "tails" to simulate a coin being tossed
 * with a 50/50 probability.
 */

import java.util.Random; // import the Java Random class to generate random values

public class Coin {
    String sideUp; // creates a variable, "sideUp", to store either "heads" or "tails"


    // Creates a constructor that accepts a string variable as an argument
    public Coin (String s){
        s = sideUp;
        toss(); // calls the toss method
    }

    // the toss() method stores either "heads" or "tails" into the "sideUp" variable
    public void toss() {
        // create an object, "rand", to utilize the methods in the Random class that help generate random values
        Random rand = new Random();

        // create a variable, "tossNumber", that stores the randomly generated value between 0 and 1
        int tossNumber = (int) Math.round(Math.random());

        // create an if statement that stores the string value "heads" into "sideUp" if "tossNumber" equals 0
        if (tossNumber == 0){
            sideUp = "heads"; // make sideUp equal to string value "heads"
        }
        // create an if statement that stores the string value "tails" into "sideUp" if "tossNumber" equals 1
        if (tossNumber == 1){
            sideUp = "tails"; // make sideUp equal to string value "tails"
        }
    }

    // the getSideUp() method returns the value of the sideUp variable to whichever method calls it
    public String getSideUp() {
        return sideUp; // return the value of the sideUp variable if this method is called
    }

}

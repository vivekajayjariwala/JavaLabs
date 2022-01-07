/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 30th 2021
 * Student Number: 251213353
 *
 * Description of program: Returns a true or false value for if the values for a month, day, and year written in the
 * notation of mm/dd/yy are a "magic date" (the month and day digits multiply to equal the year digits)
 */

public class MagicDate {
    private int month; // declare a private variable named "month"
    private int day; // declare a private variable named "day"
    private int year; // declare a private variable named "year"

    // Creates a constructor that accepts month, day, and year as three arguments
    public MagicDate (int m, int d, int y) {
        month = m;
        day = d;
        year = y;
    }

    /* Creates a method that returns "true" if the year value is equal to the product of the month and day values, thus
    implicating that it is a "magic date" and returns false if it is not a product of these two values
     */

    public int getMultiplication(){
        int n = month*day*year;
        return n;
    }

    public boolean isMagic() {
        if (year == (month * day)) {
            return true; // returns a true value to whichever class called this method
        } else {
            return false; // returns a false value to whichever class called this method

        }

    }
}


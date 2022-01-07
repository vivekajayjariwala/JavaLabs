/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 9th 2021
 * Student Number: 251213353
 *
 * Description of program: This program takes an inputted double value, and returns the whole and the fractional parts
 * of the number in two separate lines.
 */

import java.text.DecimalFormat; //import the Decimal Format class into this Java class
import java.util.Scanner; //import the Scanner class into this Java class

public class Task4
{
    public static void main(String[] args) {
        // define a Scanner object called scanner
        Scanner scanner = new Scanner(System.in);

        // define a DecimalFormat object called decimal
        DecimalFormat decimal = new DecimalFormat("0.0");

        // it reads the value for the double value, n, from the standard input
        double n = scanner.nextDouble();

        /** creates a variable, x, that is the same value as the variable, n, but converted to an integer, thereby,
         * removing the fractional part of the number
         */

         int x = (int)n;

        /** creates a variable, y, that is equal to the fractional value of the variable, n. This is accomplished
         * through subtracting the integer value of the inputted value, which is stored in x, from the inputted value
         * called n
         */

        double y = n-x;


        // prints the value for the variable x, which is the whole part of the inputted double value
        System.out.println(x);

        // prints the value for the variable y, which is the fractional part of the inputted double value
        System.out.println(decimal.format(y));

    }

}


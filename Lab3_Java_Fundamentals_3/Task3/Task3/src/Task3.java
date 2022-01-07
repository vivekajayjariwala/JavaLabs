/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 9th 2021
 * Student Number: 251213353
 *
 * Description of program: This program reads an inputted integer number and returns the value of the remainder of
 * when this integer is divided by 10, followed by a double-sided arrowhead, and then the value of the quotient of when
 * this integer is divided by 10. If the inputted integer number is a two-digit number, which is what this program is
 * inteded to be utilized for, it will output the ones column of this two-digit number, followed by a double-sided
 * arrowhead, and then the tens column of the two-digit number.
 */

import java.util.Scanner; //import the Scanner class into this Java class

public class Task3
{
    public static void main(String[] args) {
        // define a Scanner object called scanner
        Scanner scanner = new Scanner(System.in);

        // it reads the value for the integer, n, from the standard input
        int n = scanner.nextInt();

        /** creates a variable, x, that is equal to the remainder of when the integer, n, is divided by 10. If this
         * value for n is a two-digit number, this will be the value for the ones column of the two-digit number
         */
        int x = n % 10;

        /** creates a variable, y, that is equal to the quotient of when the integer, n, is divided by 10. If this
         * value for n is a two-digit number, this will be the value for the tens column of the two-digit number.
         */
        int y = n / 10;

        /** outputs a print statement of the value of x followed by a double-sided arrow, and the value of y. If the
         * value for n is a two-digit number, it will output the ones column of the two-digit number followed by a
         * double-sided arrow and the value of the tens column of the two-digit number.
         */
        System.out.println(x + "<->" + y);
    }

}


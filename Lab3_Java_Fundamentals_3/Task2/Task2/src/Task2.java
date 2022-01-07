/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 9th 2021
 * Student Number: 251213353
 *
 * Description of program: This program reads an inputted integer number and returns the value of an arithmetic
 * expression in which the inputted integer value is utilized in.
 */

import java.util.Scanner; //import the Scanner class into this Java class

public class Task2
{
    public static void main(String[] args) {
        // define a Scanner object called scanner
        Scanner scanner = new Scanner(System.in);

        // it reads an integer value, n, from the standard input
        int n = scanner.nextInt();

        /** output a print statement of the value of the expression for when the inputted integer value is increased by
         // 1, multiplied by itself, increased by 2, multiplied by itself, and then increased by 3
         */
        System.out.println(((n+1)*n+2) * n +3 );
    }

}


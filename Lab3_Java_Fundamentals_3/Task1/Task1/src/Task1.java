/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 9th 2021
 * Student Number: 251213353
 *
 * Description of program: This program reads two integer numbers and returns the addition of those respective number's
 * squares
 */

import java.util.Scanner; //import the Scanner class into this Java class

public class Task1
{
    public static void main(String[] args) {
        // define a Scanner object called scanner
        Scanner scanner = new Scanner(System.in);

        // it reads an integer value from the standard input, which is stored in the variable, a
        int a = scanner.nextInt();

        // it reads another integer value from the standard input, which is stored in the variable, b
        int b = scanner.nextInt();

        // it squares both values that were inputted, adds them together, and then outputs the result
        System.out.println((a*a) + (b*b));
    }
}

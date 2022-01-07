/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 23th 2021
 * Student Number: 251213353
 *
 * Description of program: Asks the user to input a value for Fahrenheit temperature, and returns the conversion of
 * this value of temperature to both Celsius and Kelvin.
 */

import java.util.Scanner; // import the Java Scanner class
import java.text.DecimalFormat; // import the Java Decimal Format class
public class TemperatureDemo {
    public static void main(String[] args) {

        double userFtemp; // declare a variable, userFtemp, for the user temperature

        Scanner keyboard = new Scanner(System.in); // create an object, "keyboard", to call the Scanner class

        /* Create an object, "df", to call the Decimal Format class and set the pattern to the hundredth place so that
        it can be used to display values to that decimal place
         */
        DecimalFormat df = new DecimalFormat("#.00");

        /* Output a statement asking the user to input a Fahrenheit temperature and store the inputted value into the
        userFtemp variable
         */
        System.out.print("Enter the Fahrenheit temperature: ");
        userFtemp = keyboard.nextDouble();

        // Create an object, "temp", to call the Temperature class and use userFtemp as the argument required to call it
        Temperature temp = new Temperature(userFtemp);

        /* Send the value for fahrenheit to the Temperature class to set the value of fahrenheit, so that it can then
        be used to calculate the conversion to Celsius and Kelvin
         */
        temp.setFahrenheit(userFtemp);

        /* Output two statement saying what the celsius value and then the kelvin value is for the given fahrenheit
        value, and display them to the hundredth decimal place
         */
        System.out.println("Celsius: " + df.format(temp.getCelsius()));
        System.out.print("Kelvin: " + df.format(temp.getKelvin()));
    }
}

/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 23th 2021
 * Student Number: 251213353
 *
 * Description of program: Calculates and returns the converted value of a given fahrenheit temperature to celsius and
 * kelvin respectively.
 */


public class Temperature {
    private double ftemp; //declare a variable, ftemp, for the fahrenheit temperature

    /* Create a variable, "fraction", that contains the constant final value of the fraction, 5/9, which is typically
    used in the formulas to convert between fahrenheit, celsius, and kelvin
     */
    private final double FRACTION = 0.5555555555555556;

    // Creates a constructor that accepts a fahrenheit temperature and stores in the ftemp field
    public Temperature (double f) {
        ftemp = f;
    }

    /* This method, setFahrenheit, accepts a parameter for fahrenheit, and sets it to the value of the ftemp variable
    that is used to store the value of fahrenheit
     */
    public void setFahrenheit(double f) {
        ftemp = f;
    }


    public double getCelsius() {
        // Creates a variable, ctemp, that is equal to the celsius value for a given fahrenheit value
        double ctemp = (FRACTION)*(ftemp-32);
        return ctemp; // return the calculated value for celsius to whichever class called this method
    }

    public double getKelvin() {
        // Creates a variable, ktemp, that is equal to the kelvin value for a given fahrenheit value
        double ktemp = ((FRACTION)*(ftemp-32))+273;
        return ktemp; // return the calculated value for kelvin to whichever class called this method
    }
}

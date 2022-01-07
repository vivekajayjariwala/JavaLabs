/**
 * Name: Vivek Jariwala
 * Date: Saturday, December 4th 2021
 * Student Number: 251213353
 *
 * Description of program: This program contains fields from a production worker's name, number, hire date, shift
 * number, and hourly pay rate. It has methods that can store this information, return this information, and
 * display the information. This program functions partly by inheriting the Employee class.
 */

import java.text.DecimalFormat; // import the Java Decimal Format class

public class ProductionWorker extends Employee {

    // declare a variable, "shift", to represent the integer value of the shift that the employee works
    private int shift;
    // declare a variable, "payRate", to represent the hourly rate of pay of the employee
    private double payRate;
    // create a constant variable, "DAY_SHIFT", to represent the day shift which is shift 1
    final int DAY_SHIFT = 1;
    // create a constant variable, "NIGHT_SHIFT", to represent the night shift which is shift 2
    final int NIGHT_SHIFT = 2;

    Employee employeeInfo = new Employee();

    // create a constructor that accepts 3 string variables, an integer variable, and a double variable as an argument

    public ProductionWorker(String n, String num, String date, int sh, double rate){

        super(n, num, date);
        shift = sh;
        payRate = rate;

    }

    // creates an empty constructor that does not have any arguments

    public ProductionWorker(){

    }

    // create a method, setShift, to set the value of a given integer value to the shift variable
    public void setShift(int s){

        shift = s; // set the given integer value to the value of shift

    }

    // create a method, setPayRate, to set the value of a given double value to the payRate variable
    public void setPayRate(double p){

        payRate = p; // set the given double value to the value of payRate

    }

    // create a method, getShift, to return the current value of the shift variable
    public int getShift(){

        return shift; // return value of shift to wherever this method is called

    }

    // create a method, getPayRate, to return the current value of the payRate variable
    public double getPayRate(){

        return payRate; // return value of payRate to wherever this method is called

    }

    // create a method, toString, that will store all the above values into one formatted string variable
    public String toString(){

        String s = null; // create a string variable, s, and have it initialized to null

        // create an instance of the DecimalFormat class in order to display a value to the hundredth place
        DecimalFormat df = new DecimalFormat("0.00");

        /* create an if statement to set the value of s to all the employee's information and have the shift be labelled
        as "Day" if the employee has an integer value of 1 stored in the shift variable
         */
        if (getShift() == DAY_SHIFT){
            // store the employee information and value of the variables into the string variable, s
            s = (super.toString() + "\nShift: Day" + "\nHourly Pay Rate: $"+df.format(getPayRate()));
            return s; // return the value of s to wherever this method is called
        }

        /* create an if statement to set the value of s to all the employee's information and have the shift be labelled
        as "Night" if the employee has an integer value of 2 stored in the shift variable
         */
        if (getShift() == NIGHT_SHIFT){
            // store the employee information and value of the variables into the string variable, s
            s = ( super.toString() + "\nShift: Night" + "\nHourly Pay Rate: $"+df.format(getPayRate()));
            return s;  // return the value of s to wherever this method is called
        }

        return s;  // return the value of s to wherever this method is called
    }

}



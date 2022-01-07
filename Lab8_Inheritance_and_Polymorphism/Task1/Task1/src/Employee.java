/**
 * Name: Vivek Jariwala
 * Date: Saturday, December 4th 2021
 * Student Number: 251213353
 *
 * Description of program: This program contains fields for an employee's name, number, and hire date. It has methods
 * that can store this information, return this information, verify the employee number, and display the information.
 */

public class Employee {
    private String name; // declare a variable, name, to store the employee's name
    private String employeeNumber; // declare a variable, employeeNumber, to store the employee's employee number
    private String hireDate; // declare a variable, hireDate, to store the employee's date of hire

    // create a constructor that accepts 3 string variables as an argument

    public Employee (String n, String num, String date){
        name = n;
        employeeNumber = num;
        hireDate = date;
    }

    // creates an empty constructor that does not have any arguments

    public Employee(){
        

    }

    // create a method, setName, to set the value of a given String value to the name variable

    public void setName(String n){

        name = n; // set the given String value to the value of name

    }

    // create a method, setEmployeeNumber, to set the value of a given String value to the employeeNumber variable

    public void setEmployeeNumber (String e){

        employeeNumber = e; // set the given String value to the value of employeeNumber

    }

    // create a method, setHireDate, to set the value of a given String value to the setHireDate variable

    public void setHireDate(String h){

        hireDate = h; // set the given String value to the value of hireDate

    }

    // create a method, getName, to return the current value of the name variable

    public String getName(){

        return name; // return value of name to wherever this method is called

    }

    // create a method, getEmployeeNumber, to return the current value of the employeeNumber variable

    public String getEmployeeNumber(){

        return employeeNumber;  // return value of employeeNumber to wherever this method is called

    }

    // create a method, getHireDate, to return the current value of the hireDate variable

    public String getHireDate(){

        return hireDate; // return value of hireDate to wherever this method is called

    }

    // create a method, isValidEmpNum, to determine if the employee number entered is correct

    private boolean isValidEmpNum(String e){

        employeeNumber = e; // set the value of given parameter to employeeNumber

        boolean valid = false; // create a variable, valid, that determines if the employeeNumber is correct or not


        /* create an if statement that sets the valid variable to true if the employeeNumber is equal to either of the
        employee numbers that are known to be correct
         */
        if (getEmployeeNumber() == "123-A" || getEmployeeNumber() == "222-L"){
            valid = true; // sets the valid variable to true
        }

        return valid; // returns the current value of the valid variable
    }

    public String toString(){



        String s = null; // create a string variable, s, and have it initialized to null


        /* create an if statement to set the value of s to all the employee's information and have the shift be labelled
        as "Day" if the employee number is valid
         */
        if (isValidEmpNum(getEmployeeNumber()) == true){
            // store the employee information and value of the variables into the string variable, s
            s = ("Name: " + getName() + "\nEmployee Number: " + getEmployeeNumber() + "\nHire Date: " + getHireDate());
            return s; // return the value of s to wherever this method is called

        }

        // set the string variable to a sentence that states that the employee number was not valid
        s = ("The employee number that was entered was not a valid employee number.");
        return s; // return the value of s to wherever this method is called

        }


}

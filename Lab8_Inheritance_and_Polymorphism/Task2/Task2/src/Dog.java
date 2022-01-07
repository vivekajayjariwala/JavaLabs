/**
 * Name: Vivek Jariwala
 * Date: Saturday, December 4th 2021
 * Student Number: 251213353
 *
 * Description of program: This program inherits the class Animal and contains a singular method, say(), that overrides
 * the say() method from the animal superclass, in order to return a String value of "arf-arf".
 */
public class Dog extends Animal{
    public String say(){
        String s = "arf-arf"; // create a variable, s, and store the String value of "arf-arf" into the variable
        return s; // return the value of s to wherever this method is called
    }
}

/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 20th 2021
 * Student Number: 251213353
 *
 * Description of program: Displays a predetermined array and then shows the sum of its values, the average of its
 * values, the highest value in the elements of the array, and the reverse order of the elements in the array.
 */

import java.util.Arrays; // import the Java Arrays class to use specific methods in relation to arrays
import java.text.DecimalFormat; // import the Java Decimal Format class

public class Task3Demo {
    public static void main(String[] args) {
        // create an array and initialize with a list of elements to store in the respective indexes
        double [] array = {3.0,2.4,6.0,2.0,4.0,5.1,7.2};

        // create a SequenceOperations object, so, to access methods in Sequence Operations class
        SequenceOperations so = new SequenceOperations(array);
        // create a Decimal Format object, df, to specify how decimal values are displayed (to hundreth place)
        DecimalFormat df = new DecimalFormat("0.00");

        // Output a message that displays all the values in the array as they currently are in a String
        System.out.println("Processing the array: " + Arrays.toString(array));
        // Output a message that displays the sum of all the values in the array
        System.out.println("Total: "+ so.getTotal(array));
        // Output a message that displays the average of all the values in the array
        System.out.println("Average: "+ df.format(so.getAverage(array)));
        // Output a message that displays the highest value in the array
        System.out.println("Highest value: "+ so.getHighest(array));
        // Output a message that displays the reverse order of all the elements currently in the array
        System.out.println("Array reverse: " + Arrays.toString(so.getReverse(array)));


    }

}

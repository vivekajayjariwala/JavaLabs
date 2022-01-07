/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 20th 2021
 * Student Number: 251213353
 *
 * Description of program: Contains methods that compute and return values for the sum of an array, average of the
 * values within an array, the highest value within an array, and reverses the order of the elements in an array.
 */

public class SequenceOperations {

    double array []; // declare an array to represent any arbitrary array that will be used in the following methods


    // Creates a constructor that accepts a double data type array as an argument for an array
    public SequenceOperations(double[] a) {
        double[] array = a;
    }

    // Following method finds the sum of a given array
    public static double getTotal(double[] array){
        double sum = 0.0; // create a variable, sum, to store the sum of all the values in an array
        int length = array.length; // create a variable, length, equal to the length of the array itself
        /* Create a for loop, that adds each value within the array to the preexisting variable for sum. The for loop
        initializes a variable i to 0, and i is incremented by one every time the loop is run. Furthermore, i can never
        be greater than the total length of the array, because arrays start at the index #0 as well.
        */
        for (int i = 0; i < length; i++){
            sum += array[i]; // adds the value for the array at the current index to the value of the sum
        }
        return sum; // return the computed value of the sum of the array to wherever this method is called
    }

    // Following method finds the average of the values of a given array
    public static double getAverage(double[] array){
        double sum = 0.0; // create a variable, sum, to store the sum of all the values in an array
        int length = array.length; // create a variable, length, equal to the length of the array itself
        /* Create a for loop, that adds each value within the array to the preexisting variable for sum. The for loop
        initializes a variable i to 0, and i is incremented by one every time the loop is run. Furthermore, i can never
        be greater than the total length of the array, because arrays start at the index #0 as well.
        */
        for (int i = 0; i < length; i++){
            sum += array[i]; // adds the value for the array at the current index to the value of the sum
        }
        // create a variable, average, to store the computed value of the average of all the values in the array
        double average = sum / length;
        return average; // return the computed value of the average of the array elements to where this method is called
    }

    // Following method finds the highest value within the elements of a given array
    public static double getHighest(double[] array){
        double max = 0.0; // create a variable, max, that will store the max value found within the array
        int length = array.length; // create a variable, length, equal to the length of the array itself
        /* Create a for loop, that changes the current value of the max variable to the current value of the array
        at a specific index if the current value of the max variable is smaller than the current value of the array at
        that specific index. The for loop initializes a variable i to 0, and i is incremented by one every time the loop
        is run. Furthermore, i can never be greater than the total length of the array, because arrays start at the
        index #0 as well.
        */
        for (int i = 0; i < length; i++){
            /* if the current value of the max variable is smaller than the current value of the array at that specific
            index then execute following actions
             */
            if (array[i] > max){
                max = array[i]; // make max variable equal to current value of array at the index i
            }
        }
        return max; // return the value of the highest value of the array to wherever this method is called

    }

    public static double[] getReverse(double[] array){
        int length = array.length; // create a variable, length, equal to the length of the array itself
        // create an array to store the reverse of the elements within the current array that is passed to this method
        double[] reverseArray = new double[length];
        /* The for loop initializes a variable i to 0, and i is incremented by one every time the loop
        is run. Furthermore, i can never be greater than the total length of the array, because arrays start at the
        index #0 as well. Within the for loop, the values at the beginning of the given array will be inputted into
        the indexes at the end of the reverse array. Furthermore, the values at the end of the given array
        will be inputted into the indexes at the beginning of the reverse array.
         */
        for (int i = 0; i < length; i++){
            double t=array[i]; // create a variable, t, that stores the current value of the array at the index i
            /* the reverse array at index i stores the value of the given array at the index number that is equal to
            the total length of the current array subtracted by i and 1. Essentially, the values at the end of the
            given array  will be inputted into the indexes at the beginning of the reverse array.
             */
            reverseArray[i]=array[length-i-1];
            /* the reverse array at the index number that is equal to the total length of the current array subtracted
            by i and 1 is equal to the value of t. Essentially, the values at the beginning of the given array will
            be inputted into the indexes at the end of the reverse array.
             */
            reverseArray[length-i-1]=t;
        }
        return reverseArray; /* return the entire reverseArray that is the array containing the reverse of all the
        elements in the given array to wherever this method is called
        */
    }

}

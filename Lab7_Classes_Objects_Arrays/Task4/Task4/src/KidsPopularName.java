/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 20th 2021
 * Student Number: 251213353
 *
 * Description of program: Contains methods to store a list of names into an array, create an array of the size of the
 * number of lines in a text file, and will sort through this array to determine if a given String value also exists in
 * the array.
 */

import java.io.*; // import the Java io class
import java.util.Scanner; // import the Java Scanner class

public class KidsPopularName {
    private String fileName; // declare a variable, fileName, to store the name of the file
    private String[] kidsNames; // declare an array, kidsNames, that will store all the kids names


    public KidsPopularName(String fileName) throws FileNotFoundException {
        this.fileName = fileName; // utilize the variable fileName as the parameter for the constructor
        kidsNames = new String[getNumNames()]; // make the kidsNames array the size of
        fillNames();

    }
    private int getNumNames() throws FileNotFoundException {
        // create an object to access the methods in the file class, using the given fileName as the argument
        File textFile = new File (fileName);
        // create a Scanner object, inputFile, so that you can scan through the file
        Scanner inputFile = new Scanner(textFile);
        int counter=0; // create a variable, counter, to keep track of how many lines and thus names are in the file
        // create a while loop that will keep cycling through the names in the text file until there are no more lines
        while(inputFile.hasNext()){
            inputFile.next(); // the scanner object will scan for each word
            counter++; // with each word that is scanned, the counter variables increments by one
        }
        inputFile.close(); // close the file so other methods can access it
        return counter; // return the value of counter, total number names in the list, to wherever this method is called
    }

    private void fillNames() throws FileNotFoundException {
        // create an object to access the methods in the file class, using the given fileName as the argument
        File textFile = new File(fileName);
        // create a Scanner object, inputFile, so that you can scan through the file
        Scanner inputFile = new Scanner(textFile);

        /* make a variable length that is equal to the number of lines in the file. This will help us create a set
        duration for the for loop*/
        int length = getNumNames();

        /* Create a for loop that intializes the variable i, increments it by one each time it is run, and have the
        for loop run until i is no longer less than or equal to the number of lines in the file
         */
        for (int i = 0; i <= length; i++) {
            // if there is another word, then execute the following commands
            if (inputFile.hasNext()) {
                String s = inputFile.nextLine(); // store the string value of the word in the line to the variable, s
                kidsNames[i] = s; // store the variable s into the kidsNames array at the current index, i
            }

        }
    }

    public boolean isPopularName(String name) throws FileNotFoundException {
        boolean exists = false; // create a boolean variable, exists, to determine is a name entered exists
        /* make a variable length that is equal to the number of lines in the file. This will help us create a set
        duration for the for loop*/
        int length = getNumNames();
        /* Create a for loop that intializes the variable i, increments it by one each time it is run, and have the
        for loop run until i is no longer less than to the number of lines in the file
         */
        for (int i = 0; i < length; i++) {
            /* if the string value of the word given to this method is equal to one of elements in the kidNames array
            execute the following actions
             */
            if (kidsNames[i].equalsIgnoreCase(name)) {
                exists = true; // set the value of exists to true
                return exists; // return the value of exists to wherever this method is called
            }

        }

        return exists; // return the value of exists to wherever this method is called

        }


}

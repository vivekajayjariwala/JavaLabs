/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 20th 2021
 * Student Number: 251213353
 *
 * Description of program: Contains methods to display certain amount of lines from a text file.
 */

import java.io.File; // import the Java File class
import java.io.FileNotFoundException; // import the Java File Not Found Exception
import java.util.Scanner; // import the Java Scanner class


public class FileDisplay {
    String fileName; // create a variable to represent the name of the given file

    // create an object to access the methods in the file class, using the specific "lines.txt" file as the argument
    File programFile = new File("lines.txt");

    // Create a constructor and set the parameter to reference the current instance of the fileName variable
    public FileDisplay(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        {
            try {
                // create a Scanner object, inputFile, so that you can scan through the file
                Scanner inputFile = new Scanner(programFile);
                // output a print statement saying that all the lines in the file will be printed
                System.out.println("All the lines in the file will be printed below");
                // As long as the file has a word, execute the following actions
                while (inputFile.hasNext()){
                    // create a variable, s1, to store the string value of every line
                    String s1 = inputFile.nextLine();
                    System.out.println(s1); // print out each line that was just stored in the s1 variable
                }
                inputFile.close(); // close the file so other methods can access it
            }

            catch (FileNotFoundException e) {
                // if the file is not found, then print out a statement saying that the file does not exist
                System.out.println("The file does not exist");
            }
        }

    }


    public void display (int n){
        {
            try {
                // create a Scanner object, inputFile, so that you can scan through the file
                Scanner inputFile = new Scanner(programFile);
                // create a counter variable to keep track of how many lines the program is cycling through
                int counter = 1;
                // output a print statement saying that the lines in the file to a specific line number will be printed
                System.out.println("\nAll the lines will be printed within this file until Line " + n);
                // As long as the file has a word, execute the following actions
                while (inputFile.hasNext()){
                    // as long as the counter variable is less than the number that is given to the method
                    if (counter <= n){
                        // create a variable, s1, to store the string value of every line
                        String s1 = inputFile.nextLine();
                        // print out each line that was just stored in the s1 variable
                        System.out.println(s1);
                        counter++; // increment the value of the counter variable by one
                    }
                    else{
                        break;
                    }
                }
                inputFile.close(); // close the file so other methods can access it
            }
            catch (FileNotFoundException e) {
                // if the file is not found, then print out a statement saying that the file does not exist
                System.out.println("The file does not exist");
            }
        }
    }

    public void display (int from, int to){
        {
            try {
                // create a Scanner object, inputFile, so that you can scan through the file
                Scanner inputFile = new Scanner(programFile);
                // create a counter variable to keep track of how many lines the program is cycling through
                int counter = 1;
                /* output a print statement saying that all the lines in the file from one line number to another will
                 be printed
                 */
                System.out.println("\nAll lines from Line " + from + " to Line " + to + " will be printed");
                // As long as the file has a word, execute the following actions
                while (inputFile.hasNext()) {
                    // create a variable, s1, to store the string value of every line
                    String s1 = inputFile.nextLine();
                    /* as long as the counter variable is greater than or equal to the from value given to this method
                    and less than or equal to the to value given to this method, execute the following actions
                     */
                    if (counter >= from && counter <= to) {
                        System.out.println(s1); // print the current value of the s1 variable
                    }
                    counter++; // increment the counter by one
                }
                inputFile.close(); // close the file so other methods can access it
            } catch (FileNotFoundException e) {
                // if the file is not found, then print out a statement saying that the file does not exist
                System.out.println("The file does not exist");
            }
        }
    }

}

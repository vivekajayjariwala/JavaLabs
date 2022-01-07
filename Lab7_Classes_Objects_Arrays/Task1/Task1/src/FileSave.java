/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 20th 2021
 * Student Number: 251213353
 *
 * Description of program: Opens the file defined by the constructor, saves the string value of line at the end, and
 * closes the file.
 */

import java.io.File; // import the Java file class
import java.io.FileWriter; // import the Java File Writer class
import java.io.IOException; // import the Java IO Exception class
import java.io.PrintWriter; // import the Java Print Writer class

public class FileSave {

    String fileName; // create a variable to represent the name of the given file

    // Create a constructor and set the parameter to reference the current instance of the fileName variable
    public FileSave(String f) {
        this.fileName= fileName;
    }


    public void save (String line) throws IOException {
        // create an object to access the methods in the file class, using the given fileName as the argument
        File textFile = new File (fileName);
        // create a FileWriter object, fw, so you can write characters or strings to the file
        FileWriter fw = new FileWriter(fileName, true);
        // create a PrintWriter object, printWriter, to interact with the file and also write with it
        PrintWriter printWriter = new PrintWriter(fw);
        printWriter.print(line); // save the string value of line at the end of the file
        printWriter.close(); // close the file

    }

}

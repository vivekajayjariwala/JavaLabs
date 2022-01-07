/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 20th 2021
 * Student Number: 251213353
 *
 * Description of program: This program will output a predetermined selection of lines from the file lines.txt.
 */

import java.io.File; // import the Java file class
import java.io.FileWriter; // import the Java File Writer class
import java.io.IOException; // import the Java IO Exception class
import java.io.PrintWriter; // import the Java Print Writer class

public class FilesDemo {
    public static void main(String[] args) throws IOException {

        // create an object to access the methods in the file class, using the specific "lines.txt" file as the argument
        File textFile = new File ("lines.txt");
        // create a FileWriter object, fw, so you can write characters or strings to the file
        FileWriter fw = new FileWriter("lines.txt", true);
        // create a PrintWriter object, printWriter, to interact with the file and also write with it
        PrintWriter printWriter = new PrintWriter("lines.txt");

        // Using the printWriter object, print out the following lines to the file
        printWriter.println("1-Lorem ipsum dolor sit amet");
        printWriter.println("2-Consectetuer adipiscing elit");
        printWriter.println("3-Sed diam nonummy nibh euismod tincidunt");
        printWriter.println("4-Ut wisi enim ad minim veniam");
        printWriter.println("5-Quis nostrud exerci tation ullamcorper");
        printWriter.println("6-Suscipit lobortis nisl ut aliquip ex ea commodo consequat");
        printWriter.println("7-Duis autem vel eum iriure dolor in hendrerit");
        printWriter.println("8-Vel illum dolore eu feugiat nulla facilisis at vero eros");

        // if the file does not exist, then close it
        new FileWriter("lines.txt", false).close();
        printWriter.close();

        // create an object, fd, to access the methods in the FileDisplay class
        FileDisplay fd = new FileDisplay("lines.txt");
        fd.display(); // display all the lines in the file
        System.out.println("\n"); // add a line break
        fd.display(3); // display all the lines in the file until Line 3
        System.out.println("\n"); // add a line break
        fd.display(10); // display all the lines in the file until Line 10
        System.out.println("\n"); // add a line break
        fd.display(3,5); // display all the lines between Line 3 and Line 5 in the file

    }
}

/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 20th 2021
 * Student Number: 251213353
 *
 * Description of program: This program will sort through two arrays that contain the lists of the most popular boy
 * and girl names respectively, and will display if the given name entered by the user is in one of these lists, and
 * if not, it will display that it is not in one of these lists. 
 */

import java.io.*; // import the Java io class
import java.util.Scanner; // import the Java Scanner class

public class NameSearch {
    public static void main(String[] args) throws FileNotFoundException {

        /* Create two objects for the KidsPopularName class to utilize its methods. One is called boyNames and will
        use the list of boy names as the argument. The other one is called girlNames and will utilize the list of
        girl as the argument. This allows this class which essentially is meant to scan through lists of names to do it
        for both boy names and girl names.
         */
        KidsPopularName boyNames = new KidsPopularName("BoyNames.txt");
        KidsPopularName girlNames = new KidsPopularName("GirlNames.txt");
        // Create a scanner object, keyboard, to take input from the user
        Scanner keyboard = new Scanner(System.in);
        // Output a statement asking the user to enter a name to check if it is popular for either boys or girls
        System.out.println("Enter a name to check if it is a popular name for either boys or girls: ");
        String userName=keyboard.nextLine();  // store the input of the user into the variable, userName
        // if the name entered is one of the names on the popular boy names list, output a statement saying that it is
        if (boyNames.isPopularName(userName) == true ){
            System.out.println("It is one of the most popular boy's names.");
        }
        // if the name entered is one of the names on the popular girl names list, output a statement saying that it is
        if (girlNames.isPopularName(userName) == true ){
            System.out.println("It is one of the most popular girl's names.");
        }
        /* if the name entered is not one of the names on the popular boy names or girl names lists, output a statement
        saying that it is not */
        if(boyNames.isPopularName(userName) == false && girlNames.isPopularName(userName) == false){
        System.out.println("It is not one of the most popular baby names.");
        }

    }
}

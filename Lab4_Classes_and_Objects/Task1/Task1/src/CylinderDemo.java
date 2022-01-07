/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 23th 2021
 * Student Number: 251213353
 *
 * Description of program: Asks the user to input values for a cylinder's radius and height, and then outputs what
 * the cylinder's volume, curved surface area, and total surface area are.
 */


import java.util.Scanner; // import the Java Scanner class
public class CylinderDemo {

    public static void main(String[] args) {
        double userRadius; // create a variable, userRadius, to store the user's input for cylinder radius
        double userHeight; // create a variable. userHeight, to store the user's input for cylinder height
        Scanner keyboard = new Scanner(System.in); // create a Scanner object named "keyboard"
        System.out.print("Enter the radius of a cylinder: "); // output a statement asking the user to enter a radius
        userRadius = keyboard.nextDouble(); // store the inputted radius into the userRadius variable
        System.out.print("Enter the height of a cylinder: "); // // output a statement asking the user to enter a height
        userHeight = keyboard.nextDouble(); // store the inputted height into the userHeight variable
        /* Create an object, "shape", to call the Cylinder class using userRadius and userHeight as the two double
        arguments required to call it
         */
        Cylinder shape = new Cylinder(userRadius,userHeight);
        shape.setRadius(userRadius); // send the value of the radius to the Cylinder class to set the radius
        shape.setHeight(userHeight); // send the value of the height to the Cylinder class to set the height


        /* Output one statement saying what the radius is and one statement saying what the height is using the values
        from a method in the Cylinder class that returns what the values of the radius and height are
         */
        System.out.println("The cylinder's radius is " + shape.getRadius());
        System.out.println("The cylinder's height is " + shape.getHeight());


        /* Output a statement saying what the volume is, a statement saying what the curved surface area is, and a
        statement saying what the total surface area is, with all the pertinent values having been calculated in methods
        found within the Cylinder class
         */
        System.out.println("The cylinder's volume is " + shape.getVolume());
        System.out.println("The cylinder's curved surface area is " + shape.getCurvedSurfaceArea());
        System.out.println("The cylinder's total surface area is " + shape.getTotalSurfaceArea());

    }
}

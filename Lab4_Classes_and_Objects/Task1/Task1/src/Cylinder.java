/**
 * Name: Vivek Jariwala
 * Date: Saturday, October 23th 2021
 * Student Number: 251213353
 *
 * Description of program: Calculates and returns the values of the volume, curved surface area, and
 * total surface area of a cylinder.
 */
public class Cylinder {

    private double radius; // declare a variable, radius, for the cylinder radius
    private double height; // declare a variable, height, for the cylinder height
    private final double PI = 3.14159; // create a final constant variable, PI, which stores a rounded value of PI

    // Creates a constructor that accepts radius and height of a cylinder as two arguments
    public Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    /* This method, setRadius, accepts a parameter for the radius of a cylinder, and sets it to the value of the
    radius variable
     */
    public void setRadius(double r) {
        radius = r;
    }

    /* This method, setHeight, accepts a parameter for the height of a cylinder, and sets it to the value of the
    height variable
     */
    public void setHeight(double h) {
        height = h;
    }

    public double getRadius() {
        return radius;
    } // a method that returns the value of the radius of a cylinder

    public double getHeight() {
        return height;
    } // a method that returns the value of the height of a cylinder

    public double getVolume() {
        /* Create a variable, volume, that is equal to the calculated value of the volume of a cylinder, based on the
        arguments that are utilized for the radius and height variables respectively
         */
        double volume = PI * radius * radius * height;
        return volume; // return the calculated value for volume of a cylinder to whichever class called the method
    }

    public double getCurvedSurfaceArea() {
        /* Create a variable, curvedSurfaceArea, that is equal to the calculated value of the curved surface area of a
        cylinder, based on the arguments that are utilized for the radius and height variables respectively
         */
        double curvedSurfaceArea = 2 * PI * radius * height;
        // return the calculated value for curved surface area of a cylinder to whichever class called the method
        return curvedSurfaceArea;
    }

    public double getTotalSurfaceArea() {
        /* Create a variable, totalSurfaceArea, that is equal to the calculated value of the total surface area of a
        cylinder, based on the arguments that are utilized for the radius and height variables respectively
         */
        double totalSurfaceArea = 2 * PI * radius * (height + radius);
        // return the calculated value for total surface area of a cylinder to whichever class called the method
        return totalSurfaceArea;
    }

}

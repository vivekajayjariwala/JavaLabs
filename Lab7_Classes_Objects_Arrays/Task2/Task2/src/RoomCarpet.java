/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 20th 2021
 * Student Number: 251213353
 *
 * Description of program: Calculates the cost of a carpet based on the dimensions of a room and converts information
 * regarding this room into a string.
 */

public class RoomCarpet {
    private double carpetCost; // create a variable to store the cost of the carpet
    private double length; // create a variable for length to use as an argument to create a RoomDimension object
    private double width; // create a variable for width to use as an argument to create a R
    // create an object to use methods from RoomDimension class
    private RoomDimension size = new RoomDimension(length, width);


    // Creates a constructor that accepts double variables as arguments for the length, width, and cost

    public RoomCarpet (double len, double w, double cost){
        length = len;
        width = w;
        carpetCost = cost;
    }


    // Following method calculates the Total Cost of the carpet

    public double getTotalCost(){
        // create the object to access RoomDimension methods with updated values for length and width
        size = new RoomDimension(length, width);
        double totalCost; // declare a variable, totalCost, to store the total cost of the carpet
        totalCost = size.getArea() * carpetCost; // compute the total cost of the carpet and store in totalCost variable
        return totalCost; // return the value of the total cost of the carpet to wherever this method is called
    }

    // Following method creates a String detailing the size dimensions and total cost of the carpet

    public String toString(){
        // Create a variable, s, that writes out the size dimension and total carpet cost
        String s = ("Size Dimension:" + length + "x" + width + " Total Carpet Cost:" + " " + getTotalCost());
        return s; // return this string, s, to wherever this method is called
    }

}

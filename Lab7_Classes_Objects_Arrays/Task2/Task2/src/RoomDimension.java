/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 20th 2021
 * Student Number: 251213353
 *
 * Description of program: Calculates the area of a room based on the dimensions of a room and converts information
 * regarding this room into a string.
 */

public class RoomDimension {
    private double length; // declare a variable, length, to store the length of the room
    private double width; // declare a variable, width, to store the width of the room


    // Creates a constructor that accepts double variables as arguments for the length and width of the room
    public RoomDimension (double len, double w){
        length = len;
        width = w;
    }


    // Creates a method that computes the area of the room and returns the value for it
    public double getArea(){
        double area= length*width; // creates a variable, area, that computes and stores the area of the room
        return area; // return the value for the area of the room to wherever this method is called
    }

    // Following method creates a String detailing the size dimensions and area of the room
    public String toString(){
        // Create a variable, s, that writes out the size dimension and area of the room
        String s = ("Length:" + " " + length + " Width:" + " " + width  + " Area: " + getArea());
        return s; // return this string, s, to wherever this method is called
    }

}

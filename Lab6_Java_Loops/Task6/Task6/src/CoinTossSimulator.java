/**
 * Name: Vivek Jariwala
 * Date: Saturday, November 13th 2021
 * Student Number: 251213353
 *
 * Description of program: This program tosses the coin 10 times using the Coin class. Each time the coin is tossed,
 * it displays the side that is facing up. The program keeps count of the number of times a head is facing up and the
 * number of times a tail is facing up and display those values after the 10 tosses.
 */
public class CoinTossSimulator {
    public static void main(String[] args) {
        String side = "heads"; // create a variable, side, and use it as an argument for the constructor. 
        Coin flip = new Coin(side); // create an object, "flip", to call the Coin class and use its methods
        int headsCounter = 0; // create a variable, headsCounter, to keep track of the number of heads that are flipped
        int tailsCounter = 0; // create a variable, tailsCounter, to keep track of the number of tails that are flipped
        flip.toss(); // call the toss() method in the coin class to flip the coin once and get an initial value for it

        // Print a statement saying what side the coin is initially on
        System.out.println("The side initially facing up: " + flip.getSideUp());
        // Print a statement saying that the coin will be tossed 10 times
        System.out.println("Now I will toss the coin 10 times.");
        /* Create a for loop initializing the variable i that is equal to 1 at first, and the for loop will run until
        i is no longer less than or equal to 10. Each time the for loop is run, i will be incremented by 1.
        */
        for (int i = 1; i <= 10; i++){
            flip.toss(); // call the toss() method in the coin class to flip the coin
            // Print a statement saying what side the coin landed on for that toss
            System.out.println("Toss:\t" + flip.getSideUp());
            // create an if statement that increments tailsCounter by 1 if the coin lands on tails for that toss
            if (flip.getSideUp() == "tails"){
                tailsCounter++; // increment tailsCounter variable by 1
            }
            // create an if statement that increments headsCounter by 1 if the coin lands on heads for that toss
            if (flip.getSideUp() == "heads"){
                headsCounter++;  // increment headsCounter variable by 1
            }
        }
        // Prints a statement of total number of times a head facing up in the 10 tosses
        System.out.println("Total Heads: " + headsCounter);
        // Prints a statement of total number of times a tails facing up in the 10 tosses
        System.out.println("Total Tails: " + tailsCounter);
    }



}

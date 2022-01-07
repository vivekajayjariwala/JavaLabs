/**
 * Name: Vivek Jariwala
 * Date: Saturday, December 4th 2021
 * Student Number: 251213353
 *
 * Description of program: This program creates two objects of the ProductionWorker class using a predetermined set of
 * data for the arguments, which describe employees. It then prints out the information regarding the employees after
 * it has been returned and formatted from the ProductionWorker class.
 */

public class Task1Demo {
    public static void main(String[] args) {
        // create ProductionWorker object, workerOne, and give a list of values for the arguments
        ProductionWorker workerOne = new ProductionWorker("John Smith", "123-A", "11-15-2005", 1, 16.50);
        // create ProductionWorker object, workerTwo, and give a list of values for the arguments
        ProductionWorker workerTwo = new ProductionWorker("Joan Jones", "222-L", "12-12-2005", 2, 18.50);
        System.out.println("The first production worker."); // print a statement saying that this is the 1st worker
        System.out.println(workerOne); // prints the string value returned from the toString method
        System.out.println("\nThe second production worker."); // print a statement saying that this is the 2nd worker
        System.out.println(workerTwo); // prints the string value returned from the toString method

    }
}

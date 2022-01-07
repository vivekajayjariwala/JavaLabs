/**
 * Name: Vivek Jariwala
 * Date: Saturday, December 4th 2021
 * Student Number: 251213353
 *
 * Description of program: This program creates three objects of type Animal with instances of Cat, Dog, and Duck. It
 * invokes the say() method using these objects and prints out the return values, which are "meow-meow", "arf-arf", and
 * "quack-quack".
 *
 */
public class Task2Demo {
    public static void main(String[] args) {
        // creates object of type Animal, named cat, that creates an instance of the Cat class
        Animal cat = new Cat();
        // creates object of type Animal, named dog, that creates an instance of the Dog class
        Animal dog = new Dog();
        // creates object of type Animal, named duck, that creates an instance of the Duck class
        Animal duck = new Duck();

        System.out.println("Cat says:"); // prints out a statement saying "Cat says:"
        // calls the say() method from the cat class, and prints out the string returned from that method
        System.out.println(cat.say());

        System.out.println("\nDog says:");  // prints out a statement saying "Dog says:"
        // calls the say() method from the dog class, and prints out the string returned from that method
        System.out.println(dog.say());

        System.out.println("\nDuck says:");  // prints out a statement saying "Duck says:"
        // calls the say() method from the duck class, and prints out the string returned from that method
        System.out.println(duck.say());
    }
}

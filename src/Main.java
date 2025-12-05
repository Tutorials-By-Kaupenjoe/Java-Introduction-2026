import net.kaupenjoe.Animal;
import net.kaupenjoe.Cat;
import net.kaupenjoe.Dog;

public class Main {
    public static void main(String[] args) {
        /* INHERITANCE & POLYMORPHISM */

        Dog bengie = new Dog("bengie.png", "Bengie", 11);
        Dog jeremy = new Dog("jeremy.jpg", "Jeremy", 7);

        Cat whiskers = new Cat("whiskers.png", "Whiskers", 4);

        // IF SOMETHING REPEATS... WE CAN DO SOMETHING

        bengie.displayInfo();
        bengie.birthday();
        bengie.displayInfo();
        bengie.makeSound();

        whiskers.displayInfo();
        whiskers.birthday();

        whiskers.makeSound();

        Animal myCuteAnimal;
        myCuteAnimal = new Dog("charlie.png", "Charlie", 15);

        myCuteAnimal.makeSound();
        ((Dog) myCuteAnimal).bellyRub();

    }
}
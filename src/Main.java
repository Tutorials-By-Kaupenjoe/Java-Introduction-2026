import net.kaupenjoe.Dog;

public class Main {
    public static void main(String[] args) {
        /* ACCESS MODIFIERS */

        System.out.println("How many dogs are there: " + Dog.numberOfDogs);

        Dog bengie = new Dog("bengie.png", "Bengie", 11);
        Dog jeremy = new Dog("jeremy.jpg", "Jeremy", 7);

        System.out.println("How many dogs are there: " + Dog.numberOfDogs);

        System.out.println("Bengie age: " + bengie.getAge());
        System.out.println("Jeremy age: " + jeremy.getAge());

        jeremy.bark();
        bengie.birthday();

        System.out.println("Bengie age: " + bengie.getAge());
        System.out.println("Jeremy age: " + jeremy.getAge());

        // bengie.age = 100; // modify this field directly! (not usually what we want)

        System.out.println("Bengie age: " + bengie.getAge());

        Dog charlie = new Dog("charlie.png", "Charlie", 13);

        System.out.println("How many dogs are there: " + Dog.numberOfDogs);
    }
}
import net.kaupenjoe.Dog;

public class Main {
    public static void main(String[] args) {
        /* CLASSES & OBJECTS */

        Dog bengie = new Dog("bengie.png", "Bengie", 11);
        Dog jeremy = new Dog("jeremy.jpg", "Jeremy", 7);

        System.out.println("Bengie age: " + bengie.age);
        System.out.println("Jeremy age: " + jeremy.age);

        jeremy.bark();
        bengie.birthday();

        System.out.println("Bengie age: " + bengie.age);
        System.out.println("Jeremy age: " + jeremy.age);

        bengie.age = 100; // modify this field directly! (not usually what we want)

        System.out.println("Bengie age: " + bengie.age);
    }
}
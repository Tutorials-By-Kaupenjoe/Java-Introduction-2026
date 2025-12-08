import net.kaupenjoe.*;

public class Main {
    public static void main(String[] args) {
        /* ANONYMOUS CLASSES */

        Dog bengie = new Dog("bengie.png", "Bengie", 11);
        Dog jeremy = new Dog("jeremy.jpg", "Jeremy", 7);
        Cat whiskers = new Cat("whiskers.png", "Whiskers", 4);
        Animal john = new Cat("john.png", "John", 31); // new Animal doesn't work with Abstract Classes!

        Bird birdy = new Bird("birdy.jpg", "Birdy", 2);
        Bird yoshi = new Bird("yoshi.jpg", "Yoshi", 3) {
            @Override
            public void move() {
                System.out.println(this.getName() + " soars through the skies.");
            }
        };

        birdy.move();
        yoshi.move();

        Bear browny = new Bear("browny.png", "Browny", 12);

        Pettable nano = new Cat("nano.bmp", "Nano", 0);
        Pettable luc = new Pettable() {
            @Override
            public void pet() {
                System.out.println("Luc looks weird at you, because he's a human...");
            }
        };

        Animal july = new Animal("july.png", "July", 100) {
            @Override
            public void move() {
                System.out.println(this.getName() + " crawls slowly.");
            }
        };

        july.displayInfo();
        july.move();

        PettingZoo myZoo = new PettingZoo(bengie, jeremy, whiskers, nano, (Cat)john, luc);
        myZoo.petRandomAnimal();
        myZoo.petRandomAnimal();
        myZoo.petRandomAnimal();

    }
}
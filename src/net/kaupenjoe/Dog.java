package net.kaupenjoe;

public class Dog extends Animal {
    public static int numberOfDogs = 0;

    public Dog(String picture, String name, int age) {
        super(picture, name, age); // Basically the same as new Animal(...)

        numberOfDogs++;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " woofed");
    }

    public void bellyRub() {
        System.out.printf("Belly rubbed of " + getName());
    }
}

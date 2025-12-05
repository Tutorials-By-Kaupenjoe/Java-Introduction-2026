package net.kaupenjoe;

public class Cat extends Animal {
    public Cat(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meowed");
    }

    public void scratch() {
        System.out.println(getName() + " just scratched you.");
    }
}

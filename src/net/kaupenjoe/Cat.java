package net.kaupenjoe;

public class Cat extends Animal implements Pettable {
    public Cat(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void move() {
        System.out.println("Cat is sneaking!");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " meowed");
    }

    public void scratch() {
        System.out.println(getName() + " just scratched you.");
    }

    @Override
    public void pet() {
        System.out.println("Tried petting the cat however...");
        scratch();
    }
}

package net.kaupenjoe;

public class Bird extends Animal {
    public Bird(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void move() {
        System.out.println("Bird is flying!");
    }
}

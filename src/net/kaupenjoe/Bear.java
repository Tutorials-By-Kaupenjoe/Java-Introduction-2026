package net.kaupenjoe;

public class Bear extends Animal {
    public Bear(String picture, String name, int age) {
        super(picture, name, age);
    }

    @Override
    public void move() {
        System.out.println("Bear is swimming...");
    }
}

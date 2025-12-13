package net.kaupenjoe;

public class Sword {
    private String name;

    public Sword(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sword: " + name;
    }
}
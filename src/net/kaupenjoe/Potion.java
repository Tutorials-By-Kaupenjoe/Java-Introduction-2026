package net.kaupenjoe;

public class Potion {
    private String type;

    public Potion(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Potion: " + type;
    }
}
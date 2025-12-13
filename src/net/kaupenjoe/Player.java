package net.kaupenjoe;

public class Player {
    public String name;

    public Player(String name) {
        this.name = name;
    }

    public void damagePlayer() {
        System.out.println(name + " was hurt!");
    }
}

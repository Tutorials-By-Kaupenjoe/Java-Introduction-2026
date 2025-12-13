package net.kaupenjoe;

import java.util.ArrayList;
import java.util.List;

public class World {
    public String name;
    public List<String> connectedPlayers;
    public List<String> allMobs;

    public static final World THE_WORLD = new World("Kaupenjoe's World");

    private World(String name) {
        this.name = name;
        connectedPlayers = new ArrayList<>();
        allMobs = new ArrayList<>();
    }
}

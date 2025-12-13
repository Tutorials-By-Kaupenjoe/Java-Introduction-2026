package net.kaupenjoe;

import java.util.ArrayList;
import java.util.List;

public class Sheep {
    public boolean hasWool;
    public String name;
    public static List<OnSheepShearedEvent> shearedEvents = new ArrayList<>();

    public Sheep(String name) {
        this.name = name;
        this.hasWool = true;
    }

    public void shearSheep(Player player) {
        if(!hasWool) {
            System.out.println("Sheep " + name + " has no more wool!");
            return;
        }

        this.hasWool = false;
        notifyEvent(player);
    }

    private void notifyEvent(Player player) {
        for(OnSheepShearedEvent event : shearedEvents) {
            event.OnSheepSheared(this, player);
        }
    }
}

import net.kaupenjoe.Player;
import net.kaupenjoe.Sheep;

public class Main {
    public static void main(String[] args) {
        /* Design Pattern: Observer */
        // Before any player and any Sheep

        // Outputting sheep and player
        Sheep.shearedEvents.add(((sheep, player) -> {
            System.out.println(sheep.name + " was just sheared by " + player.name);
        }));

        // EVERYTIME a sheep gets sheared, the player gets hurt!
        Sheep.shearedEvents.add((sheep, player) -> {
           player.damagePlayer();
        });

        Player kaupenjoe = new Player("Kaupenjoe");
        Player nano = new Player("Nano");
        Player moon = new Player("Moon");

        Sheep jeb_ = new Sheep("jeb_");
        Sheep charlie = new Sheep("Charlie");
        Sheep luc = new Sheep("Luc");
        Sheep woolly = new Sheep("Woolly");

        jeb_.shearSheep(kaupenjoe);
        charlie.shearSheep(moon);

        // EVERYTIME a sheep gets sheared, the player gets hurt!
        Sheep.shearedEvents.add((sheep, player) -> {
            System.out.println("Wool SO MUCH WOOL");
        });

        luc.shearSheep(moon);
        luc.shearSheep(moon);

    }
}
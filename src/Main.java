import net.kaupenjoe.World;

public class Main {
    public static void main(String[] args) {
        /* Design Pattern: Singleton */
        // When you only need one of those!

        // World myWorld = new World();
        System.out.println("The world we have is: " + World.THE_WORLD.name);
    }
}
import net.kaupenjoe.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /* Generics */
        // "Variables" for Data Types

        List<String> questions;
        String name;
        int age = 10;

        ItemStorage<Sword> swordRack = new ItemStorage<>();
        swordRack.addItem(new Sword("Iron Sword"));
        swordRack.addItem(new Sword("Diamond Sword"));
        swordRack.displayItems();

        ItemStorage<Potion> potionStorage = new ItemStorage<>();
        potionStorage.addItem(new Potion("Health Potion"));
        potionStorage.addItem(new Potion("Strength Potion"));
        potionStorage.displayItems();

        BlockStorage<Block> blockStorage = new BlockStorage<>();
        blockStorage.addBlock(new WoodBlock());
        blockStorage.addBlock(new WoodBlock());
        blockStorage.addBlock(new StoneBlock());
        blockStorage.addBlock(new WoodBlock());
        blockStorage.addBlock(new StoneBlock());
        blockStorage.displayBlocks();


    }
}
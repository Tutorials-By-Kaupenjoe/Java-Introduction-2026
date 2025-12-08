package net.kaupenjoe.miner;

import java.util.List;
import java.util.Random;

public class Blocks {
    public static final Block COBBLESTONE = new Block("Cobblestone", Tools.PICKAXE, Items.STONE_FRAGMENT);
    public static final Block GRAVEL = new Block("Gravel", Tools.SHOVEL, Items.FLINT);
    public static final Block LOG = new Block("Log", Tools.AXE, Items.WOOD);
    public static final Block COBWEB = new Block("Cobweb", Tools.SWORD, Items.STRING);

    public static List<Block> ALL_BLOCKS = List.of(COBBLESTONE, GRAVEL, LOG, COBWEB);

    public static Block getRandomBlock() {
        Random random = new Random(); // TODO: Maybe put this somewhere else for better performance

        return ALL_BLOCKS.get(random.nextInt(0, ALL_BLOCKS.size()));
    }
}

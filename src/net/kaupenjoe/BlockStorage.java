package net.kaupenjoe;

import java.util.ArrayList;
import java.util.List;

public class BlockStorage<T extends Block> {
    private List<T> blocks;

    public BlockStorage() {
        this.blocks = new ArrayList<>();
    }

    public void addBlock(T block) {
        blocks.add(block);
        System.out.println("Added " + block + " to the Storage");
    }

    public void displayBlocks() {
        System.out.println("Blocks in the Storage:");
        for(T block : blocks) {
            System.out.println("- " + block);
        }
    }
}


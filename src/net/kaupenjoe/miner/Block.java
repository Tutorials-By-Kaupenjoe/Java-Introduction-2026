package net.kaupenjoe.miner;

public class Block {
    private String name;
    private Tool toolToMine;
    private Item drop;

    public Block(String name, Tool toolToMine, Item drop) {
        this.name = name;
        this.toolToMine = toolToMine;
        this.drop = drop;
    }

    public String getName() {
        return name;
    }

    public Tool getToolToMine() {
        return toolToMine;
    }

    public Item getDrop() {
        return drop;
    }

    public boolean isCorrectTool(Tool tool) {
        return this.toolToMine == tool;
    }
}

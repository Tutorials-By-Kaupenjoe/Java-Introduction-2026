package net.kaupenjoe.miner;

public class Tool {
    private String name;
    private int durability;

    public Tool(String name, int durability) {
        this.name = name;
        this.durability = durability;
    }

    public void damageTool() {
        this.durability--;
        System.out.println("Your " + this.name + " lost 1 durability");

        if(durability <= 0) {
            destroyTool();
        }
    }

    public void damageTool(int amount) {
        this.durability -= amount;
        System.out.println("Your " + this.name + " lost " + amount + " durability.");

        if(this.durability <= 0) {
            destroyTool();
        }
    }

    private void destroyTool() {
        System.out.println("Your " + this.name + " just got destroyed!");
    }

    public String getName() {
        return name;
    }

    public int getDurability() {
        return durability;
    }
}

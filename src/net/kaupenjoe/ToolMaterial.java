package net.kaupenjoe;

public enum ToolMaterial {
    WOOD("wood", 1, 0.5),
    STONE("stone", 3, 2.0),
    IRON("iron", 5, 5.0),
    DIAMOND("diamond", 10, 10.0);

    private final String displayName;
    private final int durability;
    private final double miningSpeed;

    ToolMaterial(String displayName, int durability, double miningSpeed) {
        this.displayName = displayName;
        this.durability = durability;
        this.miningSpeed = miningSpeed;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getDurability() {
        return durability;
    }

    public double getMiningSpeed() {
        return miningSpeed;
    }

    public void useTool() {
        System.out.println("Using " + displayName + " with Durability of " + durability);
    }

    public void mine() {
        System.out.println("Mining with " + displayName + " with Mining Speed of " + miningSpeed);
    }
}

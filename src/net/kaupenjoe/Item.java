package net.kaupenjoe;

public class Item {
    private ItemComponent itemComponent;

    public Item(ItemComponent itemComponent) {
        this.itemComponent = itemComponent;
    }

    public String getRarity() {
        return itemComponent.getRarity().name();
    }
}

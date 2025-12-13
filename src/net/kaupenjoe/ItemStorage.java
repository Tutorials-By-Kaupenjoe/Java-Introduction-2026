package net.kaupenjoe;

import java.util.ArrayList;
import java.util.List;

public class ItemStorage<T> {
    private List<T> items;

    public ItemStorage() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
        System.out.println("Added " + item + " to the Storage");
    }

    public void displayItems() {
        System.out.println("Items in the Storage:");
        for(T item : items) {
            System.out.println("- " + item);
        }
    }
}

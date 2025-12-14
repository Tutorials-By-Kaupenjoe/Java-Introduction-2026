package net.kaupenjoe;

public class ItemComponent {
    private int id;
    private int durability;
    private boolean hasShine;
    private ItemRarity rarity;

    private ItemComponent() {

    }

    public int getId() {
        return id;
    }

    public int getDurability() {
        return durability;
    }

    public boolean isHasShine() {
        return hasShine;
    }

    public ItemRarity getRarity() {
        return rarity;
    }

    public static class ItemComponentBuilder {
        private ItemComponent component;

        public static ItemComponentBuilder builder() {
            ItemComponentBuilder builder = new ItemComponentBuilder();
            builder.component = new ItemComponent();
            return builder;
        }

        public ItemComponentBuilder id(int id) {
            this.component.id = id;
            return this;
        }

        public ItemComponentBuilder durability(int durability) {
            this.component.durability = durability;
            return this;
        }

        public ItemComponentBuilder hasShine(boolean hasShine) {
            this.component.hasShine = hasShine;
            return this;
        }

        public ItemComponentBuilder rarity(ItemRarity rarity) {
            this.component.rarity = rarity;
            return this;
        }

        public ItemComponent build() {
            return this.component;
        }
    }
}

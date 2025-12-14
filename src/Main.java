import net.kaupenjoe.Item;
import net.kaupenjoe.ItemComponent;
import net.kaupenjoe.ItemRarity;

public class Main {
    public static void main(String[] args) {
        /* Design Pattern: Builder */
        Item ironIngot = new Item(ItemComponent.ItemComponentBuilder.builder().id(10).rarity(ItemRarity.COMMON).build());
        Item diamondSword = new Item(ItemComponent.ItemComponentBuilder.builder().id(32).rarity(ItemRarity.LEGENDARY).durability(1200).build());
        Item masterPickaxe = new Item(ItemComponent.ItemComponentBuilder.builder().id(67).rarity(ItemRarity.UNIQUE).durability(6900).hasShine(true).build());

        System.out.println(ironIngot.getRarity());
        System.out.println(diamondSword.getRarity());
        System.out.println(masterPickaxe.getRarity());
    }
}
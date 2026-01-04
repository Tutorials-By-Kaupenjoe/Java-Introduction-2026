package net.kaupenjoe.systems;

import net.kaupenjoe.components.HealthComponent;
import net.kaupenjoe.components.HideInShellComponent;
import net.kaupenjoe.components.NameComponent;
import net.kaupenjoe.components.requests.DamageRequest;
import net.kaupenjoe.entity.Entity;

import java.util.Optional;

public class CombatSystem implements ECSSystem {
    @Override
    public void process(World world) {
        for(Entity entity : world.query(HealthComponent.class, DamageRequest.class)) {
            DamageRequest damageRequest = entity.getComponent(DamageRequest.class);
            HealthComponent healthComponent = entity.getComponent(HealthComponent.class);

            Optional<NameComponent> optionalName = entity.getOptionalComponent(NameComponent.class);
            String name = "Unknown Entity";
            if(optionalName.isPresent()) {
                name = optionalName.get().name;
            }

            if(entity.getOptionalComponent(HideInShellComponent.class).isPresent()) {
                System.out.println(name + " didn't get damaged, because it was hidden in its shell!");
                entity.remove(DamageRequest.class);
                continue;
            }

            healthComponent.health -= damageRequest.damage();
            entity.remove(DamageRequest.class);
            System.out.println(name + " recieved " + damageRequest.damage() + " damage");
        }
    }
}

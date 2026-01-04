package net.kaupenjoe.systems;

import net.kaupenjoe.components.HasShellComponent;
import net.kaupenjoe.components.HideInShellComponent;
import net.kaupenjoe.components.NameComponent;
import net.kaupenjoe.components.PettableComponent;
import net.kaupenjoe.components.requests.PetRequest;
import net.kaupenjoe.entity.Entity;

import java.util.Optional;

public class PettingZooSystem implements ECSSystem {
    @Override
    public void process(World world) {
        for(Entity entity : world.query(PettableComponent.class, PetRequest.class)) {
            PettableComponent pettableComponent = entity.getComponent(PettableComponent.class);

            // "Optional" component query if it doesn't exist, that's okay we just default to a different value
            Optional<NameComponent> nameComponent = entity.getOptionalComponent(NameComponent.class);
            String identity = (nameComponent.isPresent()) ? nameComponent.get().name : "Unknown Entity";

            System.out.println(identity + " " + pettableComponent.pettingAction);

            if(entity.getOptionalComponent(HasShellComponent.class).isPresent()) {
                entity.add(new HideInShellComponent());
            }

            entity.remove(PetRequest.class);
        }
    }
}

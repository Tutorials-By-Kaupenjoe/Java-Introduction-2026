package net.kaupenjoe.systems;

import net.kaupenjoe.components.NameComponent;
import net.kaupenjoe.components.NoiseComponent;
import net.kaupenjoe.entity.Entity;

import java.util.Optional;

public class SoundSystem implements ECSSystem {
    @Override
    public void process(World world) {
        for(Entity entity : world.query(NoiseComponent.class)) {
            NoiseComponent noiseComponent = entity.getComponent(NoiseComponent.class);

            // "Optional" component query if it doesn't exist, that's okay we just default to a different value
            Optional<NameComponent> nameComponent = entity.getOptionalComponent(NameComponent.class);
            String identity = (nameComponent.isPresent()) ? nameComponent.get().name : "Unknown Entity";

            System.out.println(identity + " just " + noiseComponent.sound);
        }
    }
}

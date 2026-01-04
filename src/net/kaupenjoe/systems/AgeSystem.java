package net.kaupenjoe.systems;

import net.kaupenjoe.components.AgeComponent;
import net.kaupenjoe.components.NameComponent;
import net.kaupenjoe.components.requests.BirthdayRequest;
import net.kaupenjoe.entity.Entity;

import java.util.Optional;

public class AgeSystem implements ECSSystem {
    @Override
    public void process(World world) {
        for(Entity entity : world.query(AgeComponent.class, BirthdayRequest.class)) {
            entity.getComponent(AgeComponent.class).age++;
            entity.remove(BirthdayRequest.class);

            Optional<NameComponent> optionalName = entity.getOptionalComponent(NameComponent.class);
            String name = "Unknown Entity";
            if(optionalName.isPresent()) {
                name = optionalName.get().name;
            }

            System.out.println("Entity with id " + entity.getId() + " and name " + name + " just had their birthday. Is now "
                    + entity.getComponent(AgeComponent.class).age + " years old!");
        }
    }
}

package net.kaupenjoe.systems;

import net.kaupenjoe.components.Component;
import net.kaupenjoe.entity.Entity;

import java.util.ArrayList;
import java.util.List;

public class World {
    private final List<Entity> entities = new ArrayList<>();
    private final List<ECSSystem> systems = new ArrayList<>();
    private int nextId = 0;

    public void addSystem(ECSSystem system) {
        this.systems.add(system);
    }

    public int createEntity(Component... components) {
        int currentId = nextId;
        Entity entity = new Entity(currentId);
        for(Component component : components) {
            entity.add(component);
        }
        entities.add(entity);
        nextId++;
        return currentId;
    }

    public Entity edit(int id) {
        return entities.get(id);
    }

    public List<Entity> query(Class<? extends Component>... types) {
        List<Entity> result = new ArrayList<>();
        for(Entity entity : entities) {
            boolean match = true;

            for(Class<? extends Component> type : types) {
                if(entity.getComponent(type) == null) {
                    match = false;
                    break;
                }
            }

            if(match) {
                result.add(entity);
            }
        }

        return result;
    }

    // Tick or Update
    // Process Tick to run all Systems
    public void process() {
        for(ECSSystem system : systems) {
            system.process(this);
        }
    }
}

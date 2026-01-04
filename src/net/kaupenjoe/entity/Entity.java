package net.kaupenjoe.entity;

import net.kaupenjoe.components.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Entity {
    private final int id;
    private List<Component> components = new ArrayList<>();

    public Entity(int id) {
        this.id = id;
    }

    public void add(Component component) {
        this.components.add(component);
    }

    public <T extends Component> void remove(Class<T> type) {
        components.removeIf(type::isInstance);
    }

    public <T extends Component> Optional<T> getOptionalComponent(Class<T> type) {
        return components.stream()
                .filter(type::isInstance)
                .map(type::cast)
                .findFirst();
    }

    public <T extends Component> T getComponent(Class<T> type) {
        return components.stream()
                .filter(type::isInstance)
                .map(type::cast)
                .findFirst().orElse(null);
    }

    public int getId() {
        return id;
    }
}

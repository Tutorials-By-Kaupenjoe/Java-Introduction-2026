package net.kaupenjoe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PettingZoo {
    private List<Pettable> animals;
    private Random random = new Random();

    public PettingZoo(Pettable animal) {
        this.animals = new ArrayList<>();
        this.animals.add(animal);
    }

    public PettingZoo(Pettable... animals) {
        this.animals = new ArrayList<>();
        this.animals.addAll(Arrays.stream(animals).toList());
    }

    public void addAnimal(Pettable animal) {
        this.animals.add(animal);
    }

    public void petRandomAnimal() {
        animals.get(random.nextInt(animals.size())).pet();
    }

    public List<Pettable> getAnimals() {
        return animals;
    }
}

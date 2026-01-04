import net.kaupenjoe.components.*;
import net.kaupenjoe.components.requests.BirthdayRequest;
import net.kaupenjoe.components.requests.DamageRequest;
import net.kaupenjoe.components.requests.PetRequest;
import net.kaupenjoe.systems.*;

public class Main {
    public static void main(String[] args) {
        /* ENTITY COMPONENT SYSTEM (ECS) */
        // Unity --> GameObjects and MonoBehaviour
        // Examples: Binding of Issac
        // Expedition 33: Pictos & Lumina
        World world = new World();

        world.addSystem(new SoundSystem());
        world.addSystem(new AgeSystem());
        world.addSystem(new PettingZooSystem());
        world.addSystem(new CombatSystem());


        int bengieId = world.createEntity(new NameComponent("Bengie"), new AgeComponent(11),
                new NoiseComponent("Barked"), new PettableComponent("Had their belly rubbed!"),
                new HealthComponent(10));
        int whiskersId = world.createEntity(new NameComponent("Whiskers"), new AgeComponent(7),
                new NoiseComponent("Hissed"), new PettableComponent("Scratched You"));
        int charlieId = world.createEntity(new NameComponent("Charlie"), new AgeComponent(3),
                new NoiseComponent("Barked"), new PettableComponent("Had their belly rubbed!"));

        int vedalId = world.createEntity(new NameComponent("Vedal"), new AgeComponent(115),
                new NoiseComponent("Moaned"), new PettableComponent("Retracts into Shell"),
                new HasShellComponent(), new HealthComponent(100));

        world.edit(vedalId).add(new DamageRequest(2)); // bengie.birthday();

        world.process();

        world.edit(vedalId).add(new PetRequest());
        // world.edit(bengieId).add(new DamageRequest(2)); // bengie.birthday();
        // world.edit(charlieId).add(new BirthdayRequest()); // charlie.birthday();

        world.process();

        world.edit(vedalId).add(new DamageRequest(2)); // bengie.birthday();
        // world.edit(whiskersId).add(new PetRequest());
        // world.edit(whiskersId).add(new BirthdayRequest()); // whiskers.birthday();

        world.process();
    }
}
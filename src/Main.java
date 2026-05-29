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

        // --- START OF DIAGNOSTIC TEST FOR YOUR NEW METHOD ---
        System.out.println("\n--- RUNNING DIAGNOSTIC CHECK ON VEDAL ---");
        
        // 1. Fetch the actual Entity object for Vedal from the world engine
        net.kaupenjoe.entity.Entity vedalEntity = world.edit(vedalId);
        
        // 2. Execute your brand-new method to check for a shell component
        if (vedalEntity.hasComponent(HasShellComponent.class)) {
            System.out.println("SUCCESS: Vedal has a protective shell component attached!");
        } else {
            System.out.println("DEBUG: No shell component detected.");
        }
        
        // 3. Let's verify a negative test (checking if Vedal has a BirthdayRequest component)
        if (vedalEntity.hasComponent(BirthdayRequest.class)) {
            System.out.println("DEBUG: Vedal has a pending birthday request.");
        } else {
            System.out.println("SUCCESS: Negative check passed. Vedal does not have a pending birthday request.");
        }
        System.out.println("-------------------------------------------\n");
        // --- END OF DIAGNOSTIC TEST ---
    }
}
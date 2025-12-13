import net.kaupenjoe.*;
import net.kaupenjoe.trivia.TriviaGame;
import net.kaupenjoe.trivia.TriviaQuestion;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        /* LAMBDA & STREAMS */
        // "Methods as Variables"
        
        Dog bengie = new Dog("bengie.png", "Bengie", 11);
        Dog jeremy = new Dog("jeremy.jpg", "Jeremy", 7);
        Cat whiskers = new Cat("whiskers.png", "Whiskers", 4);
        Animal john = new Cat("john.png", "John", 31); // new Animal doesn't work with Abstract Classes!

        Bird birdy = new Bird("birdy.jpg", "Birdy", 2);
        Bird yoshi = new Bird("yoshi.jpg", "Yoshi", 3);

        Bear browny = new Bear("browny.png", "Browny", 12);

        Pettable nano = new Cat("nano.bmp", "Nano", 0);
        Pettable luc = new Pettable() {
            @Override
            public void pet() {
                System.out.println("Luc looks weird at you, because he's a human...");
            }
        };

        PettingZoo myZoo = new PettingZoo(bengie, jeremy, whiskers, nano, (Cat) john, luc);
        myZoo.petRandomAnimal();
        myZoo.petRandomAnimal();
        myZoo.petRandomAnimal();

        System.out.println("------------");
        System.out.println("LAMBDA");

        /* LAMBDA EXPRESSION IN ACTION */
        // Example 1: Runnable
        Runnable runnableSingle = () -> System.out.println("Hello from a Runnable lambda!");
        runnableSingle.run();

        Runnable runnableMulti = () -> {
            System.out.println("Hello from a Multiline Runnable Lambda");
            System.out.println("Yes! Second instruction. Just like a method");
        };
        runnableMulti.run();

        Runnable methodAsVariable = Main::testOutput; // Method Reference (static)
        methodAsVariable.run();

        // Runnable () -> void
        // ...
        // Functional Interfaces --> ONE METHOD

        // Example 2: Consumer
        // Consumer of a Type (Generics!)
        // Interface "consumes" that type a parameter
        Consumer<Integer> ovenControl = (degrees) -> System.out.println("Preheat the oven to " + degrees + "°C (from Lambda)");
        ovenControl.accept(165);
        preheatOven(165);

        ovenControl = Main::preheatOven; // Method Reference (static)
        ovenControl.accept(200); // Now CALLS the preheatOven method!


        // Example 3: Supplier
        // Supplier of a Type
        // The Interfaces "supplies" (returns) that type!
        Supplier<TriviaQuestion> getRandomQuestion = () -> new TriviaQuestion("Test Question", "Test Answer");
        TriviaQuestion q = getRandomQuestion.get();
        q.outputQuestion();

        // we have matching signature within the TriviaGame
        TriviaGame triviaGame = new TriviaGame();
        getRandomQuestion = triviaGame::getRandomQuestion; // Method Reference (Non-Static/On the instance)
        TriviaQuestion question = getRandomQuestion.get();
        question.outputQuestion();

        // Example 4: Function
        // Function of Input Type and Output Type
        // Example... PettingZoo WHAT? YES!
        Function<Pettable, PettingZoo> createPettingZoo = (pettable) -> new PettingZoo(pettable); // "long form"
        createPettingZoo = PettingZoo::new; // "Short form" (Method Reference TO THE CONSTRUCTOR)


        // Example 5: Predicate
        // Variant of Function which always returns a BOOLEAN value!
        // Example: isAnswerCorrect
        Predicate<String> correctAnswer = (answer) -> question.isAnswerCorrect(answer); // "long form"
        correctAnswer = question::isAnswerCorrect;
        System.out.println(correctAnswer.test("World Wide Web"));


        // Example 6: "Custom" Functional Interface
        // Pettable Anynomous Class
        // However... The Pettable Interface fulfils the Functional Interface constraint
        Pettable matt = new Pettable() {
            @Override
            public void pet() {
                System.out.println("Matt growls as you stroke his back");
            }
        };

        // We can make this a Lambda Expression!
        Pettable mike = () -> System.out.println("Mike jumps excitedly");
        myZoo.addAnimal(matt);
        myZoo.addAnimal(mike);


        /* STREAMS */

        List<String> fruits = List.of("Apple", "Banana", "Orange", "Mango", "Pineapple", "Mandarin");

        fruits.stream()
                .filter(fruit -> fruit.endsWith("e")) // Using a Predicate
                .forEach(System.out::println);                // This is a consumer (via a Method Reference)

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // Using streams to perform operations on numbers
        // 1. Filter even numbers
        // 2. Square each number
        // 3. Sum the squared numbers
        int sumOfSquares = numbers.stream()
                // Predicate
                .filter(n -> n % 2 == 0)
                // Function (transforms)
                .mapToInt(n -> n * n)
                // Terminal Operation
                .sum();

        System.out.println("Sum of squares of even numbers: " + sumOfSquares);


        myZoo.getAnimals().stream()
                .map(pettable -> {
                    if(pettable instanceof Animal animal) {
                        return animal;
                    } else {
                        return null;
                    }
                })
                .filter(Objects::nonNull)
                .filter(animal -> animal.getName().startsWith("N"))
                .forEach(Animal::displayInfo); // Method Reference

    }

    public static void testOutput() {
        System.out.println("Testing an output from a method");
    }

    // Old method from Lecture 16
    public static void preheatOven(int degrees) {
        System.out.println("Preheat the Oven to " + degrees + "°C.");
    }
}
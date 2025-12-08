import net.kaupenjoe.calc.*;
import net.kaupenjoe.miner.ResourceMinerGame;
import net.kaupenjoe.trivia.TriviaGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 3a: Calculator with Classes (Possibly Over-Engineered)
         *  Refactor the Calculator to use Classes. Make an Interface class called Operation and then
         *  implement that interface for each math operation that's available.
         *
         *  Estimated Time: 60-90 minutes
         */

        /* SOLUTION 3a: */
        // calculator();

        /* EXERCISE 3b: Trivia Game with Classes
         * Let's create a Trivia Game! Get a few fun facts ready, because while one game should be 3-5 questions long,
         * they should always be randomly selected from a pool of ~15 questions. You can also just google for trivia!
         *
         * Think about what structure makes sense with classes. It's not always necessary to use Interfaces and Abstract
         * Classes! Think what truly makes sense!
         *
         * Sometimes it's best to start with a small plan than plan TOO much. Here I suggest you use a maximum of
         * 30 minutes to plan out the structure and then simply start programming. Otherwise, you might overplan!
         *
         * Don't forget that Errors are your friend, not your foe! They usually tell you what needs fixing so your
         * game can work in the end!
         *
         * Remember String comparisons and reading in of answers with the scanner and NextLine!
         *
         * Estimated Time: 120-180 minutes
         *
         */

        /* SOLUTION 3b: */
        // Question & Answer Data Type
        // TriviaGame game = new TriviaGame();
        // game.startGame();

        /* EXERCISE 3c: Resource Miner With Classes
         * And now, the Resource Miner Game will be awesome!
         * Expand it with Classes in the following way:
         * Make a Block class which represents each block?!
         * Make a Tool class which comes with Durability and a way to decrease it
         * Somehow "Map" a type of block to a type of tool to know which is needed to properly destroy it.
         * If a wrong tool is used decrease the durability by 10x and don't "drop" anything.
         * If the right tool is used decrease the durability by 1 and "drop" an Item depending on the Block.
         * When one of the Tools has lost all its durability the game ends.
         *
         * ADVICE 0: DO NOT USE AI FOR THIS
         * I get it, it can make thinks easier. And for advanced people who know the fundamentals it can help...
         * However, for Beginners and Intermediates: DO NOT RELY ON AI! Google? 1000%, "How to read in a users string in Java"
         * "How to compare strings in java" - Very short snippets: Those are great!
         * "Generate me this Resource Miner Game" (If you do this: You don't fail me... You fail yourself!
         * DO NOT DO THIS TO YOURSELF)
         *
         * ADVICE 1: DON'T TAKE THIS ALL IN AT ONCE
         * Often in Programming (and in life), it makes sense to break things down into manageable chunks!
         * Start with being able to mine a block, no drop, no durability, no check for the right tool. And then continue!
         * This breaking down will help with the structure too!
         *
         * ADVICE 2: MAKE IT WORK FIRST, THEN MAKE IT PRETTY!
         * The first go around you code will likely be unreadable or rather it could be more readable. That's alright!
         * Awesome thing about code and software is: It's changeable! Meaning you can always go back and refactor it!
         * Rule of Thumb: Don't leave your code in an unreadable state until tomorrow! Always refactor it (at least a bit)
         * still today!
         *
         * ADVICE 3: DON'T BE TOO HARD ON YOURSELF!
         * There's a reason Programming is highly paid, not everyone can do it! And barely anyone can do it well
         * (sometimes myself included).
         * The fact you're learning and continue to be curious is Awesome and has to be commended! Try this exercise as
         * far as you can, if you're stuck: Take a break. Go do something else away from a screen and come back with a
         * fresh mind!
         *
         * And finally, a full, complete walkthrough will be done with the solution and Kaupenjoe's thoughts on each step!
         *
         * Estimated Time: 180+ minutes
         *
         */

        /* SOLUTION 3c: */
        ResourceMinerGame.startGame();
    }

    private static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose operation:");
        System.out.println("plus or + for Addition");
        System.out.println("minus or - for Subtraction");
        System.out.println("multiply or * for Multiplication");
        System.out.println("divide or / for Division");

        System.out.print("Enter the operation: ");
        String choice = scanner.nextLine();

        Operation selectedOperation;
        switch (choice.toLowerCase()) {
            case "plus", "+":
                selectedOperation = new Addition();
                break;
            case "minus", "-":
                selectedOperation = new Subtraction();
                break;
            case "multiply", "*":
                selectedOperation = new Multiplication();
                break;
            case "divide", "/":
                selectedOperation = new Division();
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        Calculator calculator = new Calculator(selectedOperation);

        System.out.print("Enter First Number: ");
        int operand1 = scanner.nextInt();

        System.out.print("Enter Second Number+: ");
        int operand2 = scanner.nextInt();

        int result = calculator.calculate(operand1, operand2);
        System.out.println(calculator.getOperationString() + " = " + result);
    }
}
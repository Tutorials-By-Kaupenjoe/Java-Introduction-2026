import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 1a: Easy Calculator
         *
         * Create a Calculator that runs once.
         * You should read the operation first, then read the first and second number.
         *
         * Depending on the operation chosen, you then have to return a different result.
         * You can do this with if statements or a switch statement.
         *
         * REMEMBER: that when reading in a String, you want to use scanner.next()
         * And when comparing strings you wanna use:
         * String s = "something";
         * s.equals("something"); and not ==
         *
         * After the result has been output the program ends!
         * Estimated Time: 30-45 minutes
         *
         */

        /* SOLUTION EXERCISE 1a
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the operation (plus or +, minus or -, multiply or *, divide or /)");
        String operation = scanner.next();

        System.out.println("Type in your first number!");
        int number1 = scanner.nextInt();

        System.out.println("Type in your second number!");
        int number2 = scanner.nextInt();
        int result = 0;
        // int result = switch (operation) {
        //     case "plus", "+" -> number1 + number2;
        //     case "minus", "-" -> number1 - number2;
        //     case "multiply", "*" -> number1 * number2;
        //     case "divide", "/" -> number1 / number2;
        //     default -> 0;
        // };

        switch (operation) {
            case "plus", "+": result = number1 + number2; break;
            case "minus", "-": result = number1 - number2; break;
            case "multiply", "*": result = number1 * number2; break;
            case "divide", "/": result = number1 / number2; break;
            default: result = 0; break;
        }

        System.out.println("Your result it " + number1 + " " + operation + " " + number2 + " = " + result);*/

        /* EXERCISE 1b: Basic Resource Miner Game
         * Create a Basic "Resource Miner" Game. This is of course open to interpretation.
         *
         * The Basic idea is as follows: Via a random number generated, the "player" has one of (at least) three "blocks"
         * in front of them. Let's call them Clay, Stone, Cobweb as examples. The player must then decide which tool to use
         * Sword, Shovel, Pickaxe. Is the correct tool chosen then the player moves onto the next randomly selected block.
         * They should mine three blocks and then the game outputs the score on how many they mined correctly!
         *
         * When the player types in their tool, make sure to do a small amount of error correction. Make sure that both
         * lower and uppercase for the tool names are basically ignored! (Lesson: String Methods)
         *
         * For ease of use this, generates a number between 1 and 3, feel free to use it:
         * int min = 1;
         * int max = 3;
         * int randomBlock = (int) (Math.random() * (max - min + 1)) + min;
         *
         * Estimated Time ~60+ minutes
         *
         */

        /* SOLUTION EXERCISE 1b */
        System.out.println("Welcome to ResourceMiner!");

        // First we define variables
        int min= 1;
        int max = 3;
        int randomBlock;
        int correctMineScore = 0;
        Scanner scanner = new Scanner(System.in);
        String toolChoice;
        int toolChoiceId = 0;

        // FIRST MINE
        randomBlock = (int) (Math.random() * (max - min + 1)) + min;
        switch (randomBlock) {
            case 1: System.out.println("You find a Stone Block"); break;
            case 2: System.out.println("You find a Clay Block"); break;
            case 3: System.out.println("You find a Cobweb Block"); break;
        }

        System.out.println("What tool do you want to use to mine the Block: Pickaxe, Shovel or Sword?");
        toolChoice = scanner.next().toLowerCase();

        switch (toolChoice) {
            case "pickaxe": toolChoiceId = 1; break;
            case "shovel": toolChoiceId = 2; break;
            case "sword": toolChoiceId = 3; break;
            default: System.out.println("ERROR: Could not find " + toolChoice + ". Program now ending!"); return;
        }

        if(randomBlock == toolChoiceId) {
            System.out.println("The Block was mined successfully!");
            correctMineScore++;
        } else {
            System.out.println("Your tool broke, but luckily you have extra!");
        }
        System.out.println("You encounter a new Block!");

        // SECOND MINE
        randomBlock = (int) (Math.random() * (max - min + 1)) + min;
        switch (randomBlock) {
            case 1: System.out.println("You find a Stone Block"); break;
            case 2: System.out.println("You find a Clay Block"); break;
            case 3: System.out.println("You find a Cobweb Block"); break;
        }

        System.out.println("What tool do you want to use to mine the Block: Pickaxe, Shovel or Sword?");
        toolChoice = scanner.next().toLowerCase();

        switch (toolChoice) {
            case "pickaxe": toolChoiceId = 1; break;
            case "shovel": toolChoiceId = 2; break;
            case "sword": toolChoiceId = 3; break;
            default: System.out.println("ERROR: Could not find " + toolChoice + ". Program now ending!"); return;
        }

        if(randomBlock == toolChoiceId) {
            System.out.println("The Block was mined successfully!");
            correctMineScore++;
        } else {
            System.out.println("Your tool broke, but luckily you have extra!");
        }
        System.out.println("You encounter a new Block!");

        // THIRD MINE
        randomBlock = (int) (Math.random() * (max - min + 1)) + min;
        switch (randomBlock) {
            case 1: System.out.println("You find a Stone Block"); break;
            case 2: System.out.println("You find a Clay Block"); break;
            case 3: System.out.println("You find a Cobweb Block"); break;
        }

        System.out.println("What tool do you want to use to mine the Block: Pickaxe, Shovel or Sword?");
        toolChoice = scanner.next().toLowerCase();

        switch (toolChoice) {
            case "pickaxe": toolChoiceId = 1; break;
            case "shovel": toolChoiceId = 2; break;
            case "sword": toolChoiceId = 3; break;
            default: System.out.println("ERROR: Could not find " + toolChoice + ". Program now ending!"); return;
        }

        if(randomBlock == toolChoiceId) {
            System.out.println("The Block was mined successfully!");
            correctMineScore++;
        } else {
            System.out.println("Your tool broke, but luckily you have extra!");
        }
        System.out.println("You have mined all Blocks! You correctly mined " + correctMineScore + " out of 3.");



        
    }
}
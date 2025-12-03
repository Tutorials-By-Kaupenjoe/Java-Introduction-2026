import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* EXERCISE 2a: Easy Calculator (Now with Methods)
         *
         * Use the same Calculator, we've made in Exercise 1a and remake it with methods!
         * In addition, make it so that the calculator asks if you'd like to continue, you can then say "y" if you do!
         * Think how this "infinite" loop could be made! (Hint: Lesson Loops)
         *
         * Estimated Time: 30-45 minutes
         *
         */

        /* SOLUTION EXERCISE 2a */
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What is the first number?");
            int firstNumber = scanner.nextInt();
            System.out.println("What is the second number?");
            int secondNumber = scanner.nextInt();
            System.out.println("What is the operation? (+, plus | -, minus | *, multiply, | /, divide)");
            String operation = scanner.next();
            evaluateOperation(operation, firstNumber, secondNumber);
            if (wannaStop(scanner)) {
                break;
            }
        }

        /* EXERCISE 2b: Basic Resource Miner Game (Now with methods)
         * We will refactor (rewrite) the Classic Resource Miner Game with Methods. This will CLEAN IT UP significantly!
         *
         * With this, change it to so the User can input how many blocks they want to harvest before the game ends!
         *
         * Estimated Time ~60+ minutes
         *
         */

        /* SOLUTION EXERCISE 2b */
        System.out.println("Welcome to ResourceMiner!");

        // First we define variables
        int min= 1;
        int max = 3;
        int randomBlock;
        int correctMineScore = 0;
        scanner = new Scanner(System.in);
        String toolChoice;
        int toolChoiceId = 0;
        int rounds = 0;

        System.out.println("How many block do you want to mine? 1-10");
        rounds = scanner.nextInt();

        for(int i = 0; i < rounds; i++) {
            randomBlock = getRandomBlock(min, max);
            toolChoice = chooseTool(scanner);
            toolChoiceId = getIdByToolChoice(toolChoice);

            if(areToolAndBlockMatching(randomBlock, toolChoiceId)) {
                System.out.println("The Block was mined successfully!");
                correctMineScore++;
            } else {
                System.out.println("Your tool broke, but luckily you have extra!");
            }

            System.out.println("You encounter a new Block!");
        }

        System.out.println("You have mined all Blocks! You correctly mined " + correctMineScore + " out of " + rounds + ".");

    }


    /* RESOURCE MINER METHODS */
    public static int getRandomBlock(int min, int max) {
        int randomBlock;
        randomBlock = (int) (Math.random() * (max - min + 1)) + min;
        switch (randomBlock) {
            case 1: System.out.println("You find a Stone Block"); break;
            case 2: System.out.println("You find a Clay Block"); break;
            case 3: System.out.println("You find a Cobweb Block"); break;
        }
        return randomBlock;
    }

    public static String chooseTool(Scanner scanner) {
        String toolChoice;
        System.out.println("What tool do you want to use to mine the Block: Pickaxe, Shovel or Sword?");
        toolChoice = scanner.next().toLowerCase();
        return toolChoice;
    }

    public static boolean areToolAndBlockMatching(int randomBlock, int toolChoiceId) {
        return randomBlock == toolChoiceId;
    }

    public static int getIdByToolChoice(String toolChoice) {
        return switch (toolChoice) {
            case "pickaxe": yield 1;
            case "shovel": yield 2;
            case "sword": yield 3;
            default: System.out.println("ERROR: Could not find " + toolChoice + ". Program now ending!"); yield -1;
        };
    }


    /* CALCULATOR METHODS */
    public static boolean wannaStop(Scanner scanner) {
        System.out.println("\nDo you want to calculate something else? y/n");
        return !scanner.next().equals("y");
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if(b == 0) {
            System.out.println("Dividing by 0 does not work!");
            return 0;
        }

        return a / b;
    }

    public static void evaluateOperation(String operation, int a, int b) {
        int result;
        switch (operation) {
            case "+", "plus": result = sum(a, b); break;
            case "-", "minus": result = subtract(a, b); break;
            case "*", "multiply": result = multiply(a, b); break;
            case "/", "divide": result = divide(a, b); break;
            default: System.out.println("Not a valid operation"); result = 0;
        };
        System.out.println("Result is " + a + " " + operation + " " + b + " = " + result);
    }

}
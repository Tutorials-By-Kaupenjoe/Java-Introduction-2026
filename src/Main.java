import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* BOOLEANS & LOGIC */

        // Booleans are either true or false
        boolean goodVideo = true;
        boolean subscribed = false;
        System.out.println("This is a good video " + goodVideo);

        boolean isCreative = false;
        System.out.println("Player is in Creative Mode: " + isCreative);


        /* COMPARISON (< <= >= > == !=) */
        int points = 69;
        int pointsForPassing = 55;
        boolean hasPassedTest = points >= pointsForPassing;
        System.out.println("Has passed Test: " + hasPassedTest);

        int health = 0;
        boolean isAlive = health > 0; // Health = 1 TRUE, Health = 0 False
        System.out.println("Is Player Kaupenjoe still alive? " + isAlive);

        // (VARIABLE/VALUE comp VARIABLE/VALUE) ==> BOOLEAN
        // int + int ==> int

        // BEWARE of STRINGS
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        boolean isKaupenjoe = name.equals("Kaupenjoe"); // .equals for Strings

        System.out.println("Is Your Name Kaupenjoe? " + isKaupenjoe);


        /* LOGIC */
        // "addition" and "subtraction" for Booleans
        // (BOOLEAN logic BOOLEAN) ==> BOOLEAN

        // OR || ==> (a || b)
        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 1
        // 0 | 1 | 1
        // 1 | 1 | 1

        // AND && ==> (a && b)
        // a | b | c
        // 0 | 0 | 0
        // 1 | 0 | 0
        // 0 | 1 | 0
        // 1 | 1 | 1

        // NOT !
        // a | !a
        // 0 |  1
        // 1 |  0

        boolean passedTest1 = true;
        boolean passedTest2 = true;
        boolean hasHonors = passedTest1 && passedTest2;

        // Mining Example
        boolean hasPickaxe = true;
        int durability = 5;
        int neededDurability = 9;

        boolean canMine3x3Area = (hasPickaxe && (durability >= neededDurability)) || isCreative;

        /* DRINKING AGE EXAMPLE */
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        System.out.println("Put in true or false, are you from Europe?");
        boolean isEuropean = scanner.nextBoolean();

        int euDrinkingAge = 18;
        int usDrinkingAge = 21;

        boolean isAmerican = !isEuropean;
        boolean couldDrinkInEU = age >= euDrinkingAge;
        boolean couldDrinkInUS = age >= usDrinkingAge;

        boolean canPersonDrinkAlcohol = isEuropean && couldDrinkInEU || isAmerican && couldDrinkInUS;
        System.out.printf("Can you drink? " + canPersonDrinkAlcohol);
    }
}
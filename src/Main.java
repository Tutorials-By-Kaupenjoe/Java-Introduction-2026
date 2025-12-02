import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* STRING & STRING METHODS */

        String name = "Kaupenjoe";
        String occupation = "YouTube";
        occupation += "r";

        System.out.println("My name is " + name +  " and I am a " + occupation);

        String sentence = "Hello, how are you doing? Hello!";
        System.out.println(sentence);

        // Upper Case & Lower Case
        System.out.println("Lower Case: " + sentence.toLowerCase());
        System.out.println("Upper Case: " + sentence.toUpperCase());

        // Contain
        System.out.println("Does it contain \"hello\": " + sentence.contains("hello"));

        // Replacing
        System.out.println(sentence.replace("Hello", "Howdy, Howdy"));

        // charAt (Programmers start counting at 0)
        System.out.println(sentence.charAt(8));

        // Sentence is not modified!
        System.out.println(sentence);

        System.out.println("---------------");

        /* STRING COMPARISON */
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        if(input == "Kaupenjoe") {
            System.out.println("Yep, it's Kaupenjoe with ==");
        } else {
            System.out.println("Nope, it's not Kaupenjoe with ==");
        }

        if(input.equals("Kaupenjoe")) {
            System.out.println("Yep, it's Kaupenjoe with equals");
        } else {
            System.out.println("Nope, it's not Kaupenjoe with equals");
        }

        System.out.println("---------------");

        /* Note on Scanners and Strings! */
        System.out.println("What is your Full Name?");
        input = scanner.next(); // Using Next will not work!
        System.out.println("What is our input? " + input);

        if(input == "Joe Kaupenjoe") { // You name is Joe Kaupenjoe? L O L!
            System.out.println("Yep, it's Joe Kaupenjoe with ==");
        } else {
            System.out.println("Nope, it's not Joe Kaupenjoe with ==");
        }

        if(input.equals("Joe Kaupenjoe")) {
            System.out.println("Yep, it's Joe Kaupenjoe with equals");
        } else {
            System.out.println("Nope, it's not Joe Kaupenjoe with equals");
        }

        // This doesn't work, because scanner.next() "stops" reading when it sees a space character!
        // We need to use scanner.nextLine(), BUT in order to do this, the remaining input must
        // be "cleared" by calling scanner.nextLine() again!
        System.out.println("---------------");
        scanner.nextLine();

        System.out.println("What is your Full Name?");
        input = scanner.nextLine(); // Using Next will not work!

        if(input == "Joe Kaupenjoe") { // You name is Joe Kaupenjoe? L O L!
            System.out.println("Yep, it's Joe Kaupenjoe with ==");
        } else {
            System.out.println("Nope, it's not Joe Kaupenjoe with ==");
        }

        if(input.equals("Joe Kaupenjoe")) {
            System.out.println("Yep, it's Joe Kaupenjoe with equals");
        } else {
            System.out.println("Nope, it's not Joe Kaupenjoe with equals");
        }
    }
}
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* INPUT & OUTPUT */

        /* OUTPUT */
        // You (usually) output Strings
        System.out.println("Hello World! This is our first output!");

        // Values
        int life = 42;
        System.out.println(life);

        // Value and string
        int grade = 85;
        System.out.println("Your Grade is " + grade);

        /* INPUT */
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt(); // HAS TO BE A NUMBER!
        System.out.println("You just typed " + number);

        String input = scanner.next();
        System.out.println("You just typed (String): " + input);

    }
}
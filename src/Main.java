//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* INTEGERS & MATH */

        int a = 100;
        int b = 200;

        /* ADDITION */
        int sum = a + b;
        System.out.println("Sum: " + sum);

        sum = 50;
        System.out.println("Sum: " + sum);

        /* SUBTRACTION */
        int sub = a - b;
        System.out.println("Subtraction: " + sub);

        /* MULTIPLICATION */
        int multi = a * b;
        System.out.println("Multiplication: " + multi);

        /* DIVISION */
        int division = a / b;
        System.out.println("Division: " + division);

        double x = 100;
        double y = 200;
        double doubleDivision = x / y;
        System.out.println("Double Division: " + doubleDivision);

        // No Division by 0
        // division = b / 0;
        // System.out.println("Division: " + division);

        /* REMAINDER (MODULO) */
        int remainder = 100 % 2; // = 0 => Even Number | = 1 => Uneven Number!
        System.out.println("Remaining from 100 / 2: " + remainder);

        remainder = 100 % 3;
        System.out.println("Remaining from 100 / 3: " + remainder);

        remainder = 100 % 4;
        System.out.println("Remaining from 100 / 4: " + remainder);

        /* MATH METHODS */
        System.out.println("Rounding " + Math.round(6.4));       // Output: 6
        System.out.println("Rounding Down " + Math.floor(500.2f));  // Output: 6
        System.out.println("Rounding Up " + Math.ceil(6.4));    // Output: 7
        System.out.println("Exponent " + Math.pow(2, 3));       // Output: 2^3 = 8

        // More "Math Methods"
        // Math.

        // "RANDOM" Numbers
        System.out.println("Random Number between 0 - 10: " + Math.random() * 10);
        System.out.println("Random Number between 0 - 10: " + Math.round(Math.random() * 10));
    }
}
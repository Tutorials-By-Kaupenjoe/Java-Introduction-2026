//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /* ASSIGNMENT OPERATORS */

        // Assignment =
        int mana = 100;
        System.out.println("Mana: " + mana);
        // int x = 1000;
        // x = mana;

        // ADDITION +=
        mana += 20; // mana = mana + 20;
        System.out.println("Mana: " + mana);
        mana++; // mana = mana + 1 // INCREMENT
        System.out.println("Mana: " + mana); // 121

        // SUBTRACTION -=
        mana--; // mana = mana - 1 // DECREMENT
        System.out.println("Mana: " + mana);
        mana -= 60; // mana = mana - 60;
        System.out.println("Mana: " + mana);

        // MULTIPLY *=
        mana *= 2;
        System.out.println("Mana: " + mana);

        // DIVIDE /=
        mana /= 4;
        System.out.println("Mana: " + mana);

        // MODULO (REMAINDER) %=
        mana %= 2;
        System.out.println("Mana: " + mana);
    }
}
public class Main {
    public static void main(String[] args) {
        /* (BASIC) CASTING */
        // Turning one Data Type into another

        int health = 10;
        float damage = 1.5f;

        // int result = health - damage; // 10 - 1.5f = 8.5f
        float resultFloat = health - damage; // yes, because it's a float!
        System.out.println("Result: " + resultFloat); // 8.5

        int resultInt = health - (int)damage; // explicit "Cast" damage from float to int
        System.out.println("Result (int): " + resultInt); // 9? 8?
        resultFloat = (float)health - damage; // 10 -> 10.0

        resultInt = (int)((float)health - damage); // 8.5 to int --> 8
        System.out.println("Result: " + resultInt);

        String points = "100";
        String pi = "3.14159265";

        int result = Integer.parseInt(points);
        System.out.println("Result: " + result);
    }
}
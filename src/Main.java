public class Main {
    public static void main(String[] args) {
        /* METHODS */
        // Going Beyond the main method!
        // When you need to redo the same thing in different places!
        // We predefine a certain "behaviour"/task and can repeat it

        // We can call a method
        test();
        test();
        test();

        // method with parameters
        outputSum(10, 20);
        System.out.println("Calling the method: " + outputSum(67, 69));
        int result = 1000 + outputSum(10, 10);

        bakeCake();
        bakeCake();
        bakeCake();
        bakeCake();
    }

    // For now all our methods are: public static void
    public static void test() {
        System.out.println("Test");
    }

    // A method with parameters
    // Method Signature: [public] [static] [return_type] name(parameter_type parameter_name)
    public static int outputSum(int x, int y) {
        System.out.println("The sum of " + x + " + " + y + " = " + (x+y));
        return x + y;
    }

    // To Bake a Cake we need a couple steps!
    public static void bakeCake() {
        // Preheat the oven to 250°C
        // Pour Flour
        // Add Salt
        // Pour Water
        // Add Baking Powder
        // Knead Mixture
        // Put into the oven for 20 minutes
        // LOTS OF OTHER STEPS...
        // We could do it individually, but this becomes hard to read... How about all of those are methods?

        // System.out.println("Preheat the oven to 250°C");
        // System.out.println("Pour Flour");
        // System.out.println("Add Salt");
        // System.out.println("Pour Water");
        // System.out.println("Add Baking Powder");
        // We are REPEATING --> Maybe we can make some methods?!

        // Now with methods
        preheatOven(250);
        pour("Flour");
        add("Salt");
        pour("Water");
        add("Baking Powder");
        kneadMixture();
        putInOvenFor(20);
        removeFromOven();
    }

    public static void preheatOven(int degrees) {
        System.out.println("Preheat the Oven to " + degrees + "°C.");
    }

    public static void pour(String ingredient) {
        System.out.println("Pour " + ingredient);
    }

    public static void add(String ingredient) {
        System.out.println("Add " + ingredient);
    }

    public static void kneadMixture() {
        System.out.println("Knead Mixture");
    }

    public static void putInOvenFor(int minutes) {
        System.out.println("Put Mixture into Oven for " + minutes + " minutes.");
    }

    public static void removeFromOven() {
        System.out.println("The Mixture has been removed from the oven!");
    }
}
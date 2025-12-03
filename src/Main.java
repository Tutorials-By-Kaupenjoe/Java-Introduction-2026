public class Main {
    public static void main(String[] args) {
        /* TERNARY OPERATOR */
        // A very "compact" way to do if-else

        int health = 0;
        String status = "";
        System.out.println("What is your Status? " + status);

        if(health > 0) {
            status = "Alive";
        } else {
            status = "Non-Alive";
        }
        System.out.println("What is your Status? " + status);
        status = "";

        // TERNARY OPERATOR
        // BOOLEAN ? TRUE_RETURN : FALSE_RETURN;
        status = (health > 0) ? "Alive" : "Non-Alive";
        System.out.printf("What is your status? " + status);
    }
}
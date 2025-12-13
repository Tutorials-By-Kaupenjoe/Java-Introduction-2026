import net.kaupenjoe.bank.Bank;
import net.kaupenjoe.bank.Person;

public class Main {
    public static void main(String[] args) {
        /* Exceptions & Try and Catch */
        // Throw an exception if something happens that's "unexpected".
        // Rule of Thumb: FAIL LOUDLY!

        Person nano = new Person("Nano", "Attack", 8);
        Person daniel = new Person("Daniel", "Smith", 24);
        Person marie = new Person("Marie", "Susan", "Jones", 28);

        Bank kaupenBank = new Bank("KaupenBank");
        try {
            kaupenBank.openBankAccount(nano, 200); // Not old Enough
        } catch(Exception e) {
            System.out.println("Open Bank Error: " + e.getMessage());
            e.printStackTrace(System.out);
        }

        kaupenBank.openBankAccount(marie, 2000);
        kaupenBank.openBankAccount(daniel, 10); // Deposit is not enough

        System.out.println(kaupenBank.getAccountByPerson(marie).getBalance()); // 2000
        kaupenBank.withdrawAmount(3000, marie); // Cannot withdraw over the limit!

    }
}
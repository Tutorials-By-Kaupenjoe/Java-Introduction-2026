import net.kaupenjoe.bank.Bank;
import net.kaupenjoe.bank.Person;

public class Main {
    public static void main(String[] args) {
        /*
         * EXERCISE 4:
         * Bank Management System:
         * Create a Bank Management System which has the following components:
         * Person (which saves first, middle and last name, age and maybe a "social security number")
         * Bank (which saves a List of customers and their Checking Accounts, maximum overdraw amount)
         * Checking Account (should have a current value, methods for taking and depositing money)
         * Opening a Checking Account should only work via a Bank and must require a certain amount of initial deposit.
         *
         *
         */

        /* SOLUTION 4 */

        Person nano = new Person("Nano", "Attack", 8);
        Person daniel = new Person("Daniel", "Smith", 24);
        Person marie = new Person("Marie", "Susan", "Jones", 28);

        Bank kaupenBank = new Bank("KaupenBank");
        kaupenBank.openBankAccount(nano, 200); // Not old Enough

        kaupenBank.openBankAccount(marie, 2000);
        kaupenBank.openBankAccount(daniel, 10); // Deposit is not enough

        System.out.println(kaupenBank.getAccountByPerson(marie).getBalance()); // 2000
        kaupenBank.withdrawAmount(3000, marie); // Cannot withdraw over the limit!

    }
}
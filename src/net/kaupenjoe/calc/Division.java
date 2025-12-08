package net.kaupenjoe.calc;

public class Division implements Operation {
    @Override
    public int perform(int operand1, int operand2) {
        if (operand2 != 0) {
            return operand1 / operand2;
        } else {
            System.out.println("Error: Division by zero");
            return Integer.MIN_VALUE; // Representing an error condition
        }
    }

    @Override
    public char getOperationSymbol() {
        return '/';
    }
}
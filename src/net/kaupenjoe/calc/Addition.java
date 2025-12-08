package net.kaupenjoe.calc;

public class Addition implements Operation {
    @Override
    public int perform(int operand1, int operand2) {
        return operand1 + operand2;
    }

    @Override
    public char getOperationSymbol() {
        return '+';
    }
}

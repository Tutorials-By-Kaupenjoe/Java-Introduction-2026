package net.kaupenjoe.calc;

public interface Operation {
    int perform(int firstNumber, int secondNumber);

    char getOperationSymbol();
}
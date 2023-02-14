package com.seminar_5;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private char operation;
    private double operand1;
    private double operand2;
    private Map<Character, Operation> operationMap = new HashMap<>();

    public Calculator(double operand1, char operation,  double operand2) {
        this.operand1 = operand1;
        this.operation = operation;
        this.operand2 = operand2;

        operationMap.put('+', new Addition());
        operationMap.put('-', new Subtraction());
        operationMap.put('*', new Multiplication());
        operationMap.put('/', new Division());
    }

    public double makeCalculation() {
        Operation operationMapValue = null;
        if (operationMap.containsKey(operation)) {
            operationMapValue = operationMap.get(operation);
            System.out.println(operationMap.get(operation));
        } else {
            System.out.println("Неправильный ввод");
        }
        return operationMapValue.calculateResult(operand1, operand2);
    }
}
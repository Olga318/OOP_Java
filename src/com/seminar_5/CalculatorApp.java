package com.seminar_5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Напишите первую цифру, символ действия  ''+, -, * или / '' и вторую цифру через пробел");
        char operator = 0;
        double firstNum = 0;
        double secondNum = 0;
        try {
            firstNum = scanner.nextDouble();
            operator = scanner.next().charAt(0);
            secondNum = scanner.nextDouble();
        } catch (InputMismatchException ime) {
            System.out.println("invalid input");
        } finally {
            if (operator != '+' & operator != '-' & operator != '*' & operator != '/') {
                throw new InputMismatchException();
            }
            Calculator calculator = new Calculator(firstNum, operator, secondNum);
            System.out.println(calculator.makeCalculation());
        }
    }
}

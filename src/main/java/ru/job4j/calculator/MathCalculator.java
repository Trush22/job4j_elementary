package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double subAndDivSum(double first, double second) {
        return sub(first, second)
                + div(first, second);
    }

    public static double sumTotal(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + sub(first, second)
                + div(first, second);
    }

    public static void main(String[] args) {
            System.out.println("Результат расчета равен: " + sumTotal(10, 20));
        }

}

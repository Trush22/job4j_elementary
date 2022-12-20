package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double sum = amount * percent / 100 + amount;
        while (salary < sum) {
            sum = sum - salary;
            year = year + 1;
        }
        return year;
    }
}

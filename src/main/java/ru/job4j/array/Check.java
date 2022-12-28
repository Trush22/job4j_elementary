package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            boolean temp = data[0];
            if (data[i] == temp) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}

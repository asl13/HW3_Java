package ru.academits.java;

public class DivisibleByFour {

    public static boolean divideByFour(int x) {
        return x % 4 == 0;
    }

    public static void main(String[] args) {

        System.out.println("Числа, кратные 4-м, из диапазона от 100 до 1 :");
        for (int x = 100; x >= 1; --x) {
            if (divideByFour(x)) {
                System.out.println(x);
            }
        }
    }
}

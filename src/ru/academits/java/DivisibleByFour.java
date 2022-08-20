package ru.academits.java;

public class DivisibleByFour {

    public static double divideByFour(double x) {
        return x % 4;
    }

    public static void main(String[] args) {

        int firstNum = 100;
        int lastNum = 1;

        System.out.println("�����, ������� 4-�, �� ��������� �� " + firstNum + " �� " + lastNum + " :");
        for (double x = firstNum; x >= lastNum; --x) {
            double dividedNum = divideByFour(x);
            if (dividedNum == 0) {
                System.out.println(x);
            }
        }
    }
}


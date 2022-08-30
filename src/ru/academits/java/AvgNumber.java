package ru.academits.java;

import java.util.Scanner;

public class AvgNumber {
    public static void main(String[] args) {

        Scanner getNum = new Scanner(System.in);
        double firstNum = 0;
        double lastNum = 0;

        while (firstNum <= 0) {
            System.out.print("Введите начальное число (больше нуля): ");
            firstNum = getNum.nextInt();
        }
        while (lastNum <= firstNum) {
            System.out.print("Введите конечное число (больше начального): ");
            lastNum = getNum.nextInt();
        }

        System.out.println("");
        System.out.println("Диапазон чисел: от " + firstNum + " до " + lastNum);

        double numCount = 0;
        double evenNumCount = 0;
        double sum = 0;
        double evenSum = 0;

        for (double i = firstNum; i <= lastNum; ++i) {
            numCount = ++numCount;
            sum = sum + i;
            if (i % 2 == 0) {
                evenNumCount = ++evenNumCount;
                evenSum = evenSum + i;
            }
        }

        System.out.println("Сумма чисел диапазона  - " + sum);
        System.out.println("Количество чисел диапазона - " + numCount);
        System.out.println("Среднее арифметическое  - " + (sum/numCount));
        System.out.println("");
        System.out.println("Сумма четных чисел диапазона  - " + evenSum);
        System.out.println("Количество четных чисел в диапазоне - " + evenNumCount);
        System.out.println("Среднее арифметическое четных чисел - " + (evenSum/evenNumCount));

    }
}
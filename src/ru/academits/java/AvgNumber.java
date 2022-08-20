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

        double sum = firstNum;
        double numCount = 1;
        double firstEvenNum = firstNum;
        double lastEvenNum = lastNum;
        double evenNumCount = 1;

        while (firstNum < lastNum) {
            firstNum = ++firstNum;
            sum = sum + firstNum;
            numCount = ++numCount;
        }
        System.out.println("Сумма чисел диапазона  - " + sum);
        System.out.println("Количество чисел диапазона - " + numCount);
        double avg = sum / numCount;
        System.out.println("Среднее арифметическое  - " + avg);

        while (firstEvenNum < lastEvenNum && firstEvenNum % 2 != 0) {
            firstEvenNum = ++firstEvenNum;
        }
        System.out.println("");

        if (lastEvenNum % 2 != 0) {
            lastEvenNum = --lastEvenNum;
        }
        System.out.println("Диапазон четных чисел: от " + firstEvenNum + " до " + lastEvenNum);

        double evenSum = firstEvenNum;
        while (firstEvenNum < lastEvenNum) {
            firstEvenNum = firstEvenNum + 2;
            evenSum = evenSum + firstEvenNum;
            evenNumCount = ++evenNumCount;
        }

        double evenAvg = evenSum / evenNumCount;
        System.out.println("Сумма четных чисел диапазона  - " + evenSum);
        System.out.println("Количество четных чисел в диапазоне - " + evenNumCount);
        System.out.println("Среднее арифметическое четных чисел - " + evenAvg);

    }
}
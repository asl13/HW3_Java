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


        double numCount = 1;
        double evenNumCount = 1;
        double firstEvenNum = firstNum;
        double lastEvenNum = lastNum;
        double sum = firstNum;
        double avg = 0;
        double evenAvg = 0;

        if (firstEvenNum < lastEvenNum && firstEvenNum % 2 != 0) {
            firstEvenNum = ++firstEvenNum;
        }
        if (lastEvenNum % 2 != 0) {
            lastEvenNum = --lastEvenNum;
        }
        double evenSum = firstEvenNum;

        while (firstNum < lastNum) {
            firstNum = ++firstNum;
            sum += firstNum;
            numCount = ++numCount;
            avg = sum / numCount;
        }
        System.out.println("Сумма чисел диапазона  - " + sum);
        System.out.println("Количество чисел диапазона - " + numCount);
        System.out.println("Среднее арифметическое  - " + avg);
        System.out.println("");

        System.out.println("Диапазон четных чисел: от " + firstEvenNum + " до " + lastEvenNum);

        while (firstEvenNum < lastEvenNum) {
            firstEvenNum = firstEvenNum + 2;
            evenSum += firstEvenNum;
            evenNumCount = ++evenNumCount;
            evenAvg = evenSum / evenNumCount;
        }

        System.out.println("Сумма четных чисел диапазона  - " + evenSum);
        System.out.println("Количество четных чисел в диапазоне - " + evenNumCount);
        System.out.println("Среднее арифметическое четных чисел - " + evenAvg);

    }
}
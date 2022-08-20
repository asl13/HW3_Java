package ru.academits.java;

import java.util.Scanner;

public class AvgNumber {
    public static void main(String[] args) {

        Scanner getNum = new Scanner(System.in);
        double firstNum = 0;
        double lastNum = 0;

        while (firstNum <= 0) {
            System.out.print("������� ��������� ����� (������ ����): ");
            firstNum = getNum.nextInt();
        }
        while (lastNum <= firstNum) {
            System.out.print("������� �������� ����� (������ ����������): ");
            lastNum = getNum.nextInt();
        }

        System.out.println("");
        System.out.println("�������� �����: �� " + firstNum + " �� " + lastNum);

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
        System.out.println("����� ����� ���������  - " + sum);
        System.out.println("���������� ����� ��������� - " + numCount);
        double avg = sum / numCount;
        System.out.println("������� ��������������  - " + avg);

        while (firstEvenNum < lastEvenNum && firstEvenNum % 2 != 0) {
            firstEvenNum = ++firstEvenNum;
        }
        System.out.println("");

        if (lastEvenNum % 2 != 0) {
            lastEvenNum = --lastEvenNum;
        }
        System.out.println("�������� ������ �����: �� " + firstEvenNum + " �� " + lastEvenNum);

        double evenSum = firstEvenNum;
        while (firstEvenNum < lastEvenNum) {
            firstEvenNum = firstEvenNum + 2;
            evenSum = evenSum + firstEvenNum;
            evenNumCount = ++evenNumCount;
        }

        double evenAvg = evenSum / evenNumCount;
        System.out.println("����� ������ ����� ���������  - " + evenSum);
        System.out.println("���������� ������ ����� � ��������� - " + evenNumCount);
        System.out.println("������� �������������� ������ ����� - " + evenAvg);

    }
}
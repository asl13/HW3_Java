package ru.academits.java.Person;

import java.util.Scanner;

public class Main_Person {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("������� ���: ");
        String name = input.nextLine();

        System.out.print("������� ��������: ");
        String middleName = input.nextLine();

        System.out.print("������� �������: ");
        String familyName = input.nextLine();

        System.out.print("������� �������: ");
        int age = input.nextInt();


        Person person1 = new Person(name, middleName, familyName, age);

        int birthYear = person1.getBirthYear(age);

        System.out.println("���: " + person1 + " | ��� ��������: " + (birthYear - 1) + " ��� " + birthYear);

    }
}

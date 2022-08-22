package ru.academits.java.Person;

import java.util.Scanner;

public class Main_Person {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = input.nextLine();

        System.out.print("Введите отчество: ");
        String middleName = input.nextLine();

        System.out.print("Введите фамилию: ");
        String familyName = input.nextLine();

        System.out.print("Введите возраст: ");
        int age = input.nextInt();

        Person person1 = new Person(name, middleName, familyName, age);

        person1.setAge(0);

        int birthYear = person1.getBirthYear(age);

        System.out.println("ФИО: " + person1 + " | Год рождения: " + (birthYear - 1) + " или " + birthYear);

    }
}
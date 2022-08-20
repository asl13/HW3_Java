package ru.academits.java.Person;

import java.util.Calendar;

public class Person {
    private String name;
    private String middleName;
    private String familyName;
    private int age;
    private Calendar cal = Calendar.getInstance();

    public Person(String name, String middleName, String familyName, int age) {
        this.name = name;
        this.middleName = middleName;
        this.familyName = familyName;
        this.age = age;
    }

    public int getBirthYear(int a) {
        int x = cal.get(Calendar.YEAR) - a;
        return x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + middleName + " " + familyName + " | Возраст: " + age;
    }
}

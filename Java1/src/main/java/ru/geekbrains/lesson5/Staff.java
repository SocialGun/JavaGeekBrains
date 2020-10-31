package ru.geekbrains.lesson5;

public class Staff {
    private String name;
    private String place;
    private String email;
    private String number;
    private int salary;
    private int age;

    public Staff(String name, String place, String email,
                 String number, int salary, int age) {
        this.name = name;
        this.place = place;
        this.email = email;
        this.number = number;
        this.salary = salary;
        this.age = age;

    }

    public void staffInfo() {
        System.out.println("Name: " + name + ";\nPlace: " + place + ";\nEmail: " + email +
                ";\nPhone number: " + number + ";\nSalary: " + salary + " rubles;\nAge: " + age + " years.\n");
    }

    public int getAge() {
        return age;
    }
}

package ru.geekbrains.lesson5;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println(
                "Full name: " + fullName + "\n" +
                "Position: " + position + "\n" +
                "E-mail: " + email + "\n" +
                "Phone number: " + phoneNumber + "\n" +
                "Salary: " + salary + "\n" +
                "Age: " + age + "\n"
        );
    }
}

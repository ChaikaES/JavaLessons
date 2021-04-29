package ru.geekbrains.lesson6;

public class Animal {
    protected String name;
    private static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public void run(int d) {
       System.out.println(name + " run " + d + " m ");
    }

    public void swim(int d) {
        System.out.println(name + " swim " + d + " m ");
    }

    public static void printCount() {
        System.out.println("Количество животных: " + count);
    }
}


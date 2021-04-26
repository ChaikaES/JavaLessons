package ru.geekbrains.lesson6;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int d) {
       System.out.println(name + " run " + d + " m ");
    }

    public void swim(int d) {
        System.out.println(name + " swim " + d + " m ");
    }


}


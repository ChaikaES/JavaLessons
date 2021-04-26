package ru.geekbrains.lesson6;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    public void run (int d) {
        if (d > 200) {
            System.out.println(name + "не может так много пробежать");
        } else {
            super.run(d);
        }
    }

    public void swim(int d) {
        System.out.println(name + " не умеет плавать, он кот");
    }
}

package ru.geekbrains.lesson6;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    public void run (int d) {
        if (d > 500) {
            System.out.println(name + " не может так много пробежать");
        } else {
            super.run(d);
        }
    }

    public void swim (int d) {
        if (d > 10) {
            System.out.println(name + " не может так много проплыть");
        } else {
            super.swim(d);
        }
    }
}

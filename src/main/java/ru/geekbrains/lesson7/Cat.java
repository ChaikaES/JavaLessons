package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
//    private boolean full;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
//        this.full = full;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

}

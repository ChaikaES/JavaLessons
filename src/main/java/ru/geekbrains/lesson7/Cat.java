package ru.geekbrains.lesson7;

public class Cat {
    private String name;
    private int appetite;
    private boolean full = false; // всегда голодный

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            full = true;
            System.out.printf("Кот %s наелся \n", name);
        } else {
            System.out.printf("Коту %s надо еще \n", name);
        }
    }
}

package ru.geekbrains.lesson7;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Bloshik", 5);
        Plate plate = new Plate(10);

        plate.info();
        cat.eat(plate);
        plate.info();
    }
}

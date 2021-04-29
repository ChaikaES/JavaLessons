package ru.geekbrains.lesson7;

public class App {
    public static void main(String[] args) {
        task_3();
        task_5();
        task_6();
    }

    public static void task_3() {
        Cat cat = new Cat("Bloshik", 12);
        Plate plate = new Plate(10);

        plate.info();
        cat.eat(plate);
        plate.info();
    }

    public static void task_5() {
        Cat[] cats = {
                new Cat("Pompon", 7),
                new Cat("Puhlik", 17),
                new Cat("Kisunya", 9),
                new Cat("Mnyamka", 13)
        };
        Plate plate = new Plate(40);
        for (Cat cat: cats) {
            cat.eat(plate);
        }
    }

    public static void task_6() {
        Plate plate = new Plate(10);

        plate.addFood(5);

        assert plate.getFood() == 15;
    }
}

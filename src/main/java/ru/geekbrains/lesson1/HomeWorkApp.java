package ru.geekbrains.lesson1;

public class HomeWorkApp {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = -10;
        int b = 5;
        int c = (a + b);
        if (c >= 0) {
            System.out.println("Сумма положительная " + c);
        } else {
            System.out.println("Сумма отрицательная " + c);
        }
    }

    public static void printColor() {
        int value = 87;
        if (value <= 0) { // value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”
            System.out.println("Красный");
        } else if (value <= 100) { // лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”
            System.out.println("Желтый");
        } else { // если больше 100 (100 исключительно) - “Зеленый”;
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 20;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
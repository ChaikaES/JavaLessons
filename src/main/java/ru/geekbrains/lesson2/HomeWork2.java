package ru.geekbrains.lesson2;

public class HomeWork2 {

    public static void main(String[] args){
        twoNumbers(6, 2);
        twoNumbers(-2, 7);
        positiveNegative(15);
        checkNumber(-5);
        wordsNumber("Hello!", 7);
    }

    public static boolean twoNumbers(int a, int b) {
        int sum = a + b;
        System.out.println(a > 0);
        return sum >= 10 && sum <= 20;
//        if (sum >= 10 && sum <= 20) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public static void positiveNegative(int d) {
        if (d >= 0) {
            System.out.println("Число положительное: " + d);
        } else {
            System.out.println("Число отрицательное: " + d);
        }
    }

    public static boolean checkNumber(int j) {
        return j < 0;
//        if (j < 0) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public static void wordsNumber(String f, int h) {
        for (int counter = 1; counter <= h; counter++) {
            System.out.println(f);
        }
    }
}

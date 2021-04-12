package ru.geekbrains.lesson2;

public class HomeWork2 {

    public static void main(String[] args){
        twoNumbers();
        positiveNegative();
    }

    public static boolean twoNumbers(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void positiveNegative(int d) {
        if (d >= 0) {
            System.out.println("Число положительное: " + d);
        } else {
            System.out.println("Число отрицательное: " + d);
        }
    }

}

package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        int[] my_arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArray(my_arr);
        changeNumber(my_arr);
        printArray(my_arr);

    }

    public static void printArray(int[] pr) {
        for (int i = 0; i < pr.length; i++) {
            System.out.print(pr[i] + " ");
        }
        System.out.println();
    }

    public static void changeNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }


}

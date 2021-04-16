package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {

    public static void main(String[] args) {
        System.out.println("Task_1");
        int[] my_arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        printArray(my_arr);
        changeNumber(my_arr);
        printArray(my_arr);

        System.out.println("Task_2");
        int[] big_arr = new int[100];
        fillArray(big_arr);
        printArray(big_arr);

        System.out.println("Task_3");
        int[] inc_arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArray(inc_arr);
        increaseNumber(inc_arr);
        printArray(inc_arr);
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

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    public static void increaseNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<6) {
                arr[i] *= 2;
            }
        }

    }


}



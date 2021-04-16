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

        System.out.println("Task_4");
        int[][] fdiag = new int[5][5];
        fillDiagonal(fdiag);

        System.out.println("Task_5");
        int[] result = twoArg(10, 7);
        printArray(result);

        System.out.println("Task_6");
        int[] search = {9, 4, 15, 7, 23, 1, 2, 2, 16, 8};
        printArray(search);
        maxMin(search);

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

    public static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int rowLength = arr[i].length;
            for (int j = 0; j < rowLength; j++) {
                if ((i == j) || (j == rowLength - 1 - i)) {
                    arr[i][j] = 1;
                }
            }
            printArray(arr[i]);
        }
    }

    public static int[] twoArg(int len, int initialValue) {
        int[] mass = new int[len];
        for (int i = 0; i < len; i++) {
            mass[i] = initialValue;
        }
        return mass;
    }

    public static void maxMin(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
    }


}



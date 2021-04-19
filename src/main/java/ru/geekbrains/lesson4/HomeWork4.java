package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);//ход человека
    public static Random rand = new Random();//генератор случайных чисел для компа

    //основной цикл игры
    public static void main(String[] args) {
        initMap();//тест программы.Произойдёт инициализация и вывод поля в консоль. Программа завершит свою работу.
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    //проверка победы
    public static boolean checkWin(char symb) {
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    //ход компа
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);//rand.nextInt(n) возвращает случайное число в диапазоне от 0 до n – 1 включительно
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1; //запросить координаты и уменьшить их на 1, так как для игрока удобно вводить координаты в формате 1-3
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y)); // while(isCellValid(x, y) == false)
        map[y][x] = DOT_X;  // можно ли поставить фишку в указанную ячейку. Если ячейка свободна и существует, то поставить крестик
    }

    //проверка ячеек. возможность установить фишки в указанную ячейку
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    //инициализация поля.заполнить все ячейки.
    // двойной цикл «пробегает» по всем ячейкам массива и в каждую ячейку записывает символ DOT_EMPTY
    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    // вывод поля в консоль
    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) { //отвечает за распечатку шапки игрового поля
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {// j цикл отвечает за печать одной строки
                System.out.print(map[i][j] + " ");//счетчик i увеличивается и производится печать следующих строк
            }
            System.out.println();
        }
        System.out.println();
    }
}

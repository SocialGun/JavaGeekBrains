package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;

public class XO {
    public static int SIZE = 5;
    public static int DOTS_TO_WIN = 5;
    public static final char X = 'X';
    public static final char O = 'O';
    public static final char DEFAULT = '_';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        createMap();
        printMap();
        while (true) {
            playerTurn();
            printMap();
            if (isVictory(X)) {
                System.out.println("Вы победили!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
            aiTurn();
            printMap();
            if (isVictory(O)) {
                System.out.println("Вы проиграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья.");
                break;
            }
        }

    }

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DEFAULT) return false;
            }
        }
        return true;
    }
    private static boolean isVictory(char symbol) {
        int sumH;
        int sumV;
        int sumD1 = 0;
        int sumD2 = 0;
        for (int i = 0; i < SIZE; i++) {
            sumH = 0;
            sumV = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symbol) {
                    sumH++;
                    if (sumH == DOTS_TO_WIN) return true;
                }
                if (map[j][i] == symbol){
                    sumV++;
                    if (sumV == DOTS_TO_WIN) return true;
                }
            }
            if (map[i][i] == symbol ) {
                sumD1++;
                if (sumD1 == DOTS_TO_WIN) return true;
            }
            if(map[i][SIZE - i - 1] == symbol) {
                sumD2++;
                if (sumD2 == DOTS_TO_WIN) return true;
            }
        }
        return false;
    }
    public static void createMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DEFAULT;
            }
        }
    }
    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Ваш ход. Введдите координаты.");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isValid(x, y));
        map[y][x] = X;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isValid(x, y));
        map[y][x] = O;
    }
    private static boolean isValid(int x, int y) {
        if (x < 0 || x > SIZE || y < 0 || y > SIZE) {
            System.out.println("Введите корректные координаты");
            return false;
        }
        return map[y][x] == DEFAULT;
    }
}
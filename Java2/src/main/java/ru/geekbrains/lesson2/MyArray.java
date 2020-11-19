package ru.geekbrains.lesson2;

import java.util.Arrays;
import java.util.Scanner;

public class MyArray {

    private static String[][] createArr(Scanner sc, int i, int j) throws MyArraySizeException {

        if (i != 4 || j != 4) throw new MyArraySizeException();
        String[][] arr = new String[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.print("Введите элемент массива " + k + " строки, " + l + " столбца: ");
                arr[k][l] = sc.next();
            }
        }
        return arr;
    }

    private static int sumArr(String[][] arr, int row, int column) throws MyArrayDataException {
        int sum = 0;
        int[][] arrInt = new int[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    arrInt[i][j] = Integer.parseInt(arr[i][j]);
                    sum += arrInt[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String[][] arr = createArr(sc, 4, 4);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(Arrays.deepToString(arr[i]));
            }
            System.out.println("Сумма элементов массива: " + sumArr(arr, arr.length, arr[0].length));
            } catch (MyArraySizeException | MyArrayDataException e) {
                e.printStackTrace();
            }
    }
}

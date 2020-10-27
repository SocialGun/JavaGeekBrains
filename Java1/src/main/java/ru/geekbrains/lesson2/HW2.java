package ru.geekbrains.lesson2;

public class HW2 {
    public static void main(String[] args) {
        //1
        invertArray();
        //2
        fillArray();
        //3
        increase2();
        //4
        fillDiagonal();
        //5
        maxMin();
        //6
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 5);
        }
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println("\n" + checkBalance(array) + "\n");
        //7
        int n = 3;
        moveArray(array, n);

    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 1:
                    arr[i] = 0;
                    break;
                case 0:
                    arr[i] = 1;
                    break;
            }
        }
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0, j = 3; i < arr.length; i++) {
            arr[i] = j * i;
        }
        printArray(arr);
    }

    public static void increase2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        printArray(arr);
    }

    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 && (j == 0 || j == 4) ||
                        i == 4 && (j == 0 || j == 4) ||
                        i == 1 && (j == 1 || j == 3) ||
                        i == 3 && (j == 1 || j == 3) ||
                        i == 2 && j == 2) {
                    arr[i][j] = 1;
                }
            }
        }
        printDoubleArray(arr);
    }

    public static void printDoubleArray(int[][] arr) {
        for (int[] ints : arr) {
            System.out.println();
            for (int anInt : ints)
                System.out.print(anInt + " ");
        }
        System.out.println("\n");
    }

    public static void maxMin() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        printArray(arr);
        int m1 = -1, m2 = 101;
        for (int i : arr) {
            if (m1 < i) m1 = i;
            if (m2 > i) m2 = i;
        }
        System.out.println("\nmax = " + m1 + "; min = " + m2 + "\n");
    }

    public static boolean checkBalance(int[] array) {
        int sl = 0, sr = 0;
        for (int i : array) sr += i;
        for (int i : array) {
            if (sl == sr) return true;
            sl += i;
            sr -= i;
        }
        return false;
    }

    public static void moveArray(int[] array, int n) {
        System.out.println("Исходный массив:");
        printArray(array);
        System.out.print("Получившийся после сдвига на ");
        if (n > 0) {
            System.out.println(n + " вправо массив:");

            for (int i = 0; i < n; i++) {
                int save = array[array.length - 1];
                for (int j = array.length - 1; j > 0; j--) {
                    array[j] = array[j - 1];
                }
                array[0] = save;
            }
        } else {
            System.out.println(Math.abs(n) + " влево массив:");

            for (int i = 0; i > n; i--) {
                int save = array[0];
                for (int j = 0; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = save;
            }
        }
        printArray(array);
    }
}
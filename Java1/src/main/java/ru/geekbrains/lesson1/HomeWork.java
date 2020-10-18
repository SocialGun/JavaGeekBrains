package ru.geekbrains.lesson1;

public class HomeWork {

    public static void main(String[] args) {
        byte byteVol =  100;
        short shortVol = -30000;
        int intVol = 5;
        long longVol = 15500L;
        float floatVol = 16.55f;
        double doubleVol = 6.476;
        char charVol = '\uff80';
        boolean booleanVol = true;

        System.out.println(calculate(5.56f, -97.374f, -78.1f, 3.99f));

        System.out.println(task10and20(10, 15));

        isPositiveOrNegative(0);

        System.out.println(isNegative(-1));

        hello("Ксю");

        year(2000);

    }

    public static float calculate(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task10and20(int x1, int x2) {
        return x1 >= 10 && x1 <= 20 && x2 >= 10 && x2 <= 20;
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    public static boolean isNegative(int y) {
        return y < 0;
    }

    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void year(int g) {
        if (g % 4 == 0 && g % 100 != 0 || g % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }
    }
}


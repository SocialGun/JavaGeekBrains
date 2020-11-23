package ru.geekbrains.lesson2;

public class MyArrayDataException extends Exception{
    int i, j;

    public MyArrayDataException(int i, int j) {
        super("Некорректные данные. Строка: " + i + ", столбец: " + j);
        this.i = i;
        this.j = j;
    }
}

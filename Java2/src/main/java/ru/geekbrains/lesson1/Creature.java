package ru.geekbrains.lesson1;

public interface Creature {
    void jump(int height);
    void run(int length);
    boolean isOnDistance();
    void showResult();
    String getName();
}

package ru.geekbrains.lesson7;

public class Cat {
    private final String name;
    private final int appetite;
    private int full = 0;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getFull() {
        return full;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isFull() {
        return getFull() > 0;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        full = 0;
        if (plate.decreaseFood(appetite)) full++;
    }


}

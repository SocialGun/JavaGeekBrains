package ru.geekbrains.lesson6;

import java.util.Random;

public class Animal {
    protected String name;
    protected int l;
    Random rand = new Random();
    public int maxRun = rand.nextInt(1000);
    public int maxSwim = rand.nextInt(100);

    public Animal() {
    }

    public Animal(String name, int l) {
        this.name = name;
        this.l = l;
    }

    public void run() {
        System.out.println("Животное по имени " + name + " пробежало " + l + " м.");
    }

    public void swim() {
        System.out.println("Животное по имени " + name + " проплыло " + l + " м.");
    }


}

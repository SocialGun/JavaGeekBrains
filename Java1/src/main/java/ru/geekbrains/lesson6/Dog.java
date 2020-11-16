package ru.geekbrains.lesson6;

public class Dog extends Animal {

    public Dog(String name, int l) {
        this.name = name;
        this.l = l;
    }

    @Override
    public void run() {
        if (l <= maxRun) System.out.println("Собака по имени" + name + "пробежала " + l + " м.");
        else System.out.println("Эта собака не может так далеко бегать. Ограничение: " + maxRun + " м.");
    }
    @Override
    public void swim() {
        if (l <= maxSwim) {
            System.out.println("Собака по имени " + name + " проплыла " + l + " м.");
        } else System.out.println("Эта собака не может так далеко плавать. Ограничение: " + maxSwim + " м.");
    }
}

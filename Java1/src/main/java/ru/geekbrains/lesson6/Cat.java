package ru.geekbrains.lesson6;

public class Cat extends Animal {

    public Cat(String name, int l) {
        this.name = name;
        this.l = l;
    }

    @Override
    public void run() {
        if(l <= maxRun) System.out.println("Кот по имени " + name + " пробежал " + l + " м.");
        else System.out.println("Этот кот не может так далеко бегать. Ограничение: " + maxRun + " м.");
    }
    @Override
    public void swim() {
        System.out.println("Коты не умеют плавать.");
    }
}

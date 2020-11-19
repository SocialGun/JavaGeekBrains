package ru.geekbrains.lesson1;

public class Cat implements Creature {
    private String name;
    private int maxDistance;
    private int maxHeight;
    private boolean onDistance;

    public Cat (String name) {
        this.name = name;
        this.maxDistance = 30000;
        this.maxHeight = 500;
        this.onDistance = true;
    }

    public String getName() {
        return name;
    }

    @Override
    public void jump(int height) {
        if (height <= maxHeight) System.out.println("Кот по кличке " + name + " преодолел стенку.");
        else {
            System.out.println("Кот по кличке " + name + " не справился с высотой.");
            onDistance = false;
        }
    }

    @Override
    public void run(int length) {
        if (length <= maxDistance) System.out.println("Кот по кличке " + name + " пробежал дистанцию.");
        else {
            System.out.println("Кот по кличке " + name + " не справился с дистанцией.");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void showResult() {
        if (onDistance) System.out.println("Кот по кличке " + name + " прошел соревнование.");
        else System.out.println("Кот по кличке " + name + " не прошел соревнование.");
    }
}

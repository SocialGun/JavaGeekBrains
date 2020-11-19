package ru.geekbrains.lesson1;

public class Human implements Creature {
    private String name;
    private int maxDistance;
    private int maxHeight;
    private boolean onDistance;

    public Human(String name) {
        this.name = name;
        this.maxDistance = 10000;
        this.maxHeight = 200;
        this.onDistance = true;
    }

    public String getName() {
        return name;
    }

    @Override
    public void jump(int height) {
        if (height <= maxHeight) System.out.println("Участник с именем " + name + " преодолел стенку.");
        else {
            System.out.println("Участник с именем " + name + " не справился с высотой.");
            onDistance = false;
        }
    }

    @Override
    public void run(int length) {
        if (length <= maxDistance) System.out.println("Участник с именем " + name + " пробежал дистанцию.");
        else {
            System.out.println("Участник с именем " + name + " не справился с дистанцией.");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void showResult() {
        if (onDistance) System.out.println("Участник с именем " + name + " прошел соревнование.");
        else System.out.println("Участник с именем " + name + " не прошел соревнование.");
    }
}

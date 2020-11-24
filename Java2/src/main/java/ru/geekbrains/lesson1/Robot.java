package ru.geekbrains.lesson1;

public class Robot implements Creature {
    private String name;
    private int maxDistance;
    private int maxHeight;
    private boolean onDistance;

    public Robot (String name) {
        this.name = name;
        this.maxDistance = 100000;
        this.maxHeight = 1000;
        this.onDistance = true;
    }

    public String getName() {
        return name;
    }

    @Override
    public void jump(int height) {
        if (height <= maxHeight) System.out.println("Робот " + name + " преодолел стенку.");
        else {
            System.out.println("Робот " + name + " не справился с высотой.");
            onDistance = false;
        }
    }

    @Override
    public void run(int length) {
        if (length <= maxDistance) System.out.println("Робот " + name + " пробежал дистанцию.");
        else {
            System.out.println("Робот " + name + " не справился с дистанцией.");
            onDistance = false;
        }
    }

    @Override
    public boolean isOnDistance() {
        return onDistance;
    }

    @Override
    public void showResult() {
        if (onDistance) System.out.println("Робот " + name + " прошел соревнование.");
        else System.out.println("Робот " + name + " не прошел соревнование.");
    }
}

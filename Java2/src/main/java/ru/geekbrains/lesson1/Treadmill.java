package ru.geekbrains.lesson1;

public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Creature creature) {
        creature.run(length);
    }
}

package ru.geekbrains.lesson1;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Creature creature) {
        creature.jump(height);
    }
}

package ru.geekbrains.lesson1;

public class Course {

    Obstacle[] obstacle;
    public Course(Obstacle[] obstacle) {
        this.obstacle = obstacle;
    }

    public void doIt(Team team) {
        Creature[] creature = team.getTeamMember();
        for (Creature creatures: creature) {
            for (Obstacle obstacles: obstacle) {
                obstacles.doIt(creatures);
                if (!creatures.isOnDistance()) break;
            }
        }
    }
}

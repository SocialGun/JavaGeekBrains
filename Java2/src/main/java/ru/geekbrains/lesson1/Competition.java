package ru.geekbrains.lesson1;

public class Competition {
    public static void main(String[] args) {

        Creature[] creatures = {new Human("Чак"), new Cat("Мяут"),
                new Cat("Лаки"), new Robot("RE45")};
        Obstacle[] obstacles = {new Treadmill(15000), new Wall(500)};
        Team team = new Team(creatures, "Туда-сюда");
        System.out.println(team.getTeamName() + " начинает соревнование.\n");
        team.getTeamMember();
        Course course = new Course(obstacles);
        course.doIt(team);
        System.out.println("\nРезультаты соревнования:");
        team.showResults();
        System.out.println("\nПобедители соревнования:");
        team.showSucceed();
    }
}

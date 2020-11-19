package ru.geekbrains.lesson1;

public class Team {
    private String teamName;
    Creature[] teamMember;

    public Team(Creature[] teamMember, String teamName) {
        this.teamName = teamName;
        this.teamMember = teamMember;
    }

    public String getTeamName() {
        return "Команда: " + teamName;
    }

    public Creature[] getTeamMember() {
        return teamMember;
    }

    public void showResults() {
        for (Creature creature: teamMember) {
            creature.showResult();
        }
    }

    public void showSucceed() {
        for (Creature creature: teamMember) {
            if (creature.isOnDistance()) System.out.print(creature.getName() + " ");
        }
    }
}

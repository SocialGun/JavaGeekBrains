package ru.geekbrains.lesson7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int n) {
        if (food >= n) {
            food -= n;
            return true;
        } else {
            System.out.println("There is not enough food in this plate.");
            return false;
        }
    }

    public void increasePlate() {
        System.out.println("How many?");
        Scanner sc = new Scanner(System.in);
        int inc = sc.nextInt();
        food += inc;
    }

    public void info() {
        System.out.println("Food: " + food);
    }
}

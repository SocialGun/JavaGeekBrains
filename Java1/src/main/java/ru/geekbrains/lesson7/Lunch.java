package ru.geekbrains.lesson7;

import java.util.Scanner;

public class Lunch {
    public static void main(String[] args) {
        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Bob", 10);
        catArray[1] = new Cat("Shaun", 5);
        catArray[2] = new Cat("Max", 60);
        catArray[3] = new Cat("Lili", 1);
        catArray[4] = new Cat("Vova", 25);
        Plate plate = new Plate(100);

        for (int i = 0; i < catArray.length - 1; i++) {
            plate.info();
            System.out.println("Is " + catArray[i].getName() + " bellyful? " + catArray[i].isFull());
            catArray[i].eat(plate);
            plate.info();
            System.out.println("Is this cat bellyful now? " + catArray[i].isFull() + "\n");

            if (plate.getFood() < catArray[i + 1].getAppetite())
                System.out.println("You should fill the plate for the next cat "
                        + catArray[i + 1].getName() + " with "
                        + (catArray[i + 1].getAppetite() - plate.getFood()) + " units.\n");

            System.out.println("Do you want to fill this plate? Enter 1 for yes/ 0 for no.");
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();
            if (answer == 1) plate.increasePlate();
            else if (answer == 0) System.out.println();
        }

        plate.info();
        System.out.println("Is " + catArray[catArray.length - 1].getName() + " bellyful? "
                + catArray[catArray.length - 1].isFull());
        catArray[catArray.length - 1].eat(plate);
        plate.info();
        System.out.println("Is this cat bellyful now? " + catArray[catArray.length - 1].isFull());
    }
}

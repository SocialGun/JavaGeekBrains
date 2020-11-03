package ru.geekbrains.lesson6;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat = new Cat("Bob", 500);
        Dog dog = new Dog("Sam", 60);
        Animal a = new Animal("Bil", 500);
        cat.run();
        dog.swim();
        a.run();
        cat.swim();
    }
}

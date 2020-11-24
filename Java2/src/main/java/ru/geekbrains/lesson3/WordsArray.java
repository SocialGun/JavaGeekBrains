package ru.geekbrains.lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class WordsArray {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Zoo", "Field", "Moscow", "Zoo", "Dog",
                                                           "Sofa", "Cereals", "Zoo", "Car", "Yellow",
                                                        "Carpet", "Carpet", "Lemon", "Tree", "Moscow",
                                                            "Elephant", "Zoo", "Umbrella", "Moscow"));
        LinkedHashSet<String> uniqueArr = new LinkedHashSet<>(arr);
        System.out.println("Изначальный массив: " + arr.toString());
        System.out.println("Массив только с уникальными словами: " + uniqueArr.toString());
        System.out.println("Столько раз встречаются следующие слова:");
        for (String key : uniqueArr) {
            int i = 0;
            for (String key1 : arr) {
                if (key.equals(key1)) i++;
            }
            System.out.println(key + " - " + i);
        }
    }
}
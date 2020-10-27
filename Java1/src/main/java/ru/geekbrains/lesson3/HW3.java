package ru.geekbrains.lesson3;

import java.util.Random;
import java.util.Scanner;

public class HW3 {
    public static void main(String[] args) {
        //1
        while (guessNumber() == 1) {
            guessNumber();
        }
        //2
        String[] words = {"apple", "orange", "lemon",
                "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape",
                "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        guessWord(words);

    }

    public static int guessNumber () {
        Random rand = new Random();
        int n = 10;
        int t = 3;
        int x = rand.nextInt(n);
        System.out.println("Угадайте число от 0 до " + (n - 1) +
                ".\nУ вас " + t + " попытки.");
        for (int i = 0; i < t; i++) {
            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();
            if (answer == x) {
                System.out.println("Вы угадали!\n" +
                        "Повторить игру еще раз? 1 - да / 0 - нет.");
                break;
            } else if (answer > x) {
                System.out.println("Загаданное число меньше.");
            } else
                System.out.println("Загаданное число больше.");
            if(i == t - 1) {
                System.out.println("Вы проиграли. Загаданное число: " +
                        x + "\nПовторить игру еще раз? 1 - да / 0 - нет.");
                break;
            }
        }
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void guessWord(String[] words) {
        System.out.println("Угадайте слово. Категория - съедобное.\n" +
                "Пишите на английском с маленькой буквы.");
        Random rand = new Random();
        int wordNumber = rand.nextInt(words.length);
        System.out.println();
        String answer;
        String word = words[wordNumber];
//        System.out.println(words[wordNumber]);
        do {
            Scanner sc = new Scanner(System.in);
            answer = sc.next();
            for (int i = 0; i < 15; i++) {
                if (i < word.length() && i < answer.length() &&
                        word.charAt(i) == answer.charAt(i)) {
                    System.out.print(word.charAt(i));
                }else {
                    System.out.print("#");
                }
            }
            System.out.println();
        } while (!answer.equals(word));
    }
}

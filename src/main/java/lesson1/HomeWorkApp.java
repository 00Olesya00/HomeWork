package lesson1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {
    public static Scanner scanner = new Scanner(System.in);//можно же попробовать так?

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }


    static void printThreeWords() {
        System.out.println("Задание №2.");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    private static void checkSumSign() {
        System.out.println("Задание №3.");
        System.out.println("Сумма двух чисел.");
        System.out.println("Ввидите первое число: ");
        int a = scanner.nextInt();//можно же попробовать так?
        System.out.println("Ввидите второе число: ");
        int b = scanner.nextInt();
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная.");
        } else {
            System.out.println("Сумма отрицательная. ");
        }
    }

    private static void printColor() {
        System.out.println("Задание №4.");
        int value = ThreadLocalRandom.current().nextInt(150) - 10;
        System.out.println("Загаданное число: " + value);
        if (value > 100) {
            System.out.println("Зеленый");
        } else if (value <= 100 && value > 0) {
            System.out.println("Желтый");
        } else {
            System.out.println("Красный");
        }
    }

    private static void compareNumbers() {
        System.out.println("Задание №5.");
        System.out.println("Сравнение чисел.");
        System.out.println("Ввидите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Ввидите второе число: ");
        int b = scanner.nextInt();
        if (a >= b) {
            System.out.println(a + " >= " + b + " (a >= b) ");
        } else {
            System.out.println(a + " < " + b + " (a < b) ");
        }
    }
}

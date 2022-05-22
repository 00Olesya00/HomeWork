package lesson2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class OperationsApp {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        menuApp();

    }

    //Извиняюсь за самодеительность хотелось попробовать применить полученые знания.
    private static void menuApp() {
        out:
        while (true) {
            System.out.println("Выберите задание:");
            String pattern = """
                    1 %s
                    2 %s
                    3 %s
                    4 %s
                    5 %s
                    """;
            System.out.printf(pattern, "Задание №1", "Задание №2", "Задание №3", "Задание №4", "Задание №5");
            int a = scanner.nextInt();
            //Здесь наверное можно заменить классы на переменные, а сами классы поместить в main, для удобства
            // но моего опыта пока не хватает.
            switch (a) {
                case 1:
                    intervalSum(0);
                    System.out.println("\n" + "Провека завершина!");
                    break;
                case 2:
                    definitionNumber(0);
                    System.out.println("\n" + "Провека завершина!");
                    break;
                case 3:
                    validNumber(0);
                    System.out.println("\n" + "Провека завершина!");
                    break;
                case 4:
                    numberLine("Приветствую!", 10);
                    System.out.println("\n" + "END");
                    break;
                case 5:
                    definitionYear(2019);
                    System.out.println("\n" + "Провека завершина!");
                    break out;


            }


        }
    }

    private static boolean intervalSum(int sum) {

        System.out.println("Задание №1.");
        System.out.println(" ");
        System.out.println("Сумма двух чисел.");
        System.out.println(" ");
        System.out.print("Ввидите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Ввидите второе число: ");
        int b = scanner.nextInt();
        sum = a + b;
        boolean i = false;
        if (sum >= 10 && sum < 20) {
            i = true;
            System.out.print("\n" + "Сумма находится в диапозоне от 10 до 20 т.к = " + sum + " и это - " + i);
            return true;
        }
        System.out.print("\n" + i + " - Сумма не входит в диапозон от 10 до 20 т.к = " + sum);
        return false;
    }

    private static void definitionNumber(int n) {
        System.out.println("Задание №2." + "\n");
        n = ThreadLocalRandom.current().nextInt(80) - 25;
        if (n >= 0) {
            System.out.println("\n" + "Число = " + n + " - положительное");
        } else {
            System.out.println("\n" + "Число = " + n + " - отрицатеельное");
        }
    }

    private static boolean validNumber(int j) {
        System.out.println("Задание №3." + "\n");
        j = ThreadLocalRandom.current().nextInt(70) - 12;
        boolean i = false;
        if (j >= 0) {
            i = true;
            System.out.print("\n" + "Число положительное т.к = " + j + " и это - " + i);
            return true;
        }
        System.out.print("\n" + i + " - Число отрицательное т.к = " + j);
        return false;
    }

    private static void numberLine(String str, int a) {
        System.out.println("Задание №4." + "\n");
        for (int i = 1; i <= a; i++) {
            ;
            System.out.println(str);
        }
    }

    private static boolean definitionYear(int year) {
        System.out.println("Задание №5." + "\n");
        boolean i = false;
        if (year % 4 == 0 || (year % 400 == 0 && year % 100 != 0)) {
            i = true;
            System.out.print("\n" + i + " - " + year + " год високосный.");
            return true;
        }
        System.out.print("\n" + i + " -  " + year + "  год не является високосным.");
        return false;
    }

}




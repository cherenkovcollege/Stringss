package org.example;
import java.util.Scanner;

public class StringProcessor {
    public static void main(String[] args) {
        int go = 1;
        while (go == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите номер задания: ");
            int task = scanner.nextInt();
            switch (task) {
                case 1:
                    System.out.println("Задание 1");
                    stringRepeater();
                    break;
                case 2:
                    System.out.println("Задание 2");
                    stringOccurrences();
                    break;
                case 3:
                    System.out.println("Задание 3");
                    charReplacement();
                    break;
                case 4:
                    System.out.println("Задание 4");
                    deleteEverySecondCharacter();
                    break;
                case 5:
                    System.out.println("Задание 5");
                    break;
                case 6:
                    System.out.println("Задание 6");
                    break;
                default:
                    System.out.println("Такого задания не существует!");
            }
            System.out.println("Хотите продолжить? \n1 - Да \n0 - Нет");
            go = scanner.nextInt();
            if (go == 1)
                System.out.println("Продолжаем");
        }
    }

    // Задание 1

    public static void stringRepeater() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        System.out.print("Введите число: ");
        int num = scanner.nextInt();
        try {
            String result = stringRepeaterCounter(str, num);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String stringRepeaterCounter(String str, int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Число не должно быть меньше нуля!");
        }
        return str.repeat(num);
    }

    // Задание 2

    public static void stringOccurrences() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 1 строку: ");
        String str1 = scanner.nextLine();
        System.out.print("Введите 2 строку: ");
        String str2 = scanner.nextLine();
        try {
            int result = stringOccurrencesProcessor(str1, str2);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int stringOccurrencesProcessor(String str1, String str2) {
        if (str2.equals("null")) {
            throw new IllegalArgumentException("Строка не может быть null!");
        }
        return (str1.length() - str1.replace(str2, "").length()) / str2.length();
    }

    // Задание 3

    public static void charReplacement() {
        String str = "1 2 3 1 2";
        try {
            String result = charReplacementProcessor(str);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String charReplacementProcessor(String str) {
        if (str.equals("null")) {
            throw new IllegalArgumentException("Строка не может быть null!");
        }
        str = str.replace("1", "один");
        str = str.replace("2", "два");
        str = str.replace("3", "три");
        return str;
    }

    // Задание 4

    public static void deleteEverySecondCharacter() {
        String str = "бу испугался? не бойся!";
        try {
            StringBuilder result = deleteEverySecondCharacterProcessor(str);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static StringBuilder deleteEverySecondCharacterProcessor(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (str.equals("null")) {
            throw new IllegalArgumentException("Строка не может быть null!");
        }
        for (int i = 1; i < sb.length(); i++) {
            sb.deleteCharAt(i);
        }
        return sb;
    }

    // Задание 5


    // Задание 6


}
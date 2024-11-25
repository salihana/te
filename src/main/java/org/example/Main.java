package org.example;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.time.Year;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text

        System.out.println("Задание №_1");
        printThreeWords();

        System.out.println("Задание №_2");
        checkSumSign();

        System.out.println("Задание №_3");
        printColor();

        System.out.println("Задание №_4");
        compareNumbers();

        System.out.println("Задание №_5");
        limitNumbers();

        System.out.println("Задание №_6");
        anInteger();

        System.out.println("Задание №_7");
        positiveNumber();

        System.out.println("Задание №_8");
        numberOfWords();

        System.out.println("Задание №_9");
        leapYear();

        System.out.println("Задание №_10");
        array();

        System.out.println("Задание №_11");
        emptyArray();

        System.out.println("Задание №_12");
        arrayMultiplying();

        System.out.println("Задание №_13");
        arrayNum();

        System.out.println("Задание №_14");
        fillingArray();

    }

    public static void printThreeWords() {
            System.out.println("Orange");
            System.out.println("Banana");
            System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 6;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
            int value = 5;
            if (value <= 0) {
                System.out.println("Красный");
            } else if (value > 0 && value <= 100) {
                System.out.println("Желтый");
            } else {
                System.out.println("Зеленый");
            }
    }

    public static void compareNumbers() {
        int a = 8;
        int b = 9;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void limitNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        int summ = a + b;
        boolean c = summ >= 10 && summ <= 20;
        System.out.println(c);
    }

    public static void anInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Вы ввели положительное число");
        } else {
            System.out.println("Вы ввели отрицательное число");
        }
    }

    public static void positiveNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое целое число");
        int a = scanner.nextInt();
        boolean b = a < 0;
        System.out.println(b);
    }

    public static void numberOfWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите любое слово");
        String word = scanner.nextLine();
        System.out.println("Введите любое целое число");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.println(word);
        }
    }

    public static void leapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое год.");
        int a = scanner.nextInt();
        boolean Leap = Year.of(a).isLeap();
        System.out.println(Leap);
    }

    public static void array() {
        int[] arr = new int[]{1, 0, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
      System.out.println(Arrays.toString(arr));
    }

    public static void emptyArray() {
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr1));
    }

    public static void arrayMultiplying() {
        int[] arr2 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) {
                arr2[i] = arr2[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

    public static void arrayNum() {
        int[][] twoDimArray = new int[4][4];
        twoDimArray [0][0] = 1;
        twoDimArray [1][1] = 1;
        twoDimArray [2][2] = 1;
        twoDimArray [3][3] = 1;
        twoDimArray [3][0] = 1;
        twoDimArray [2][1] = 1;
        twoDimArray [1][2] = 1;
        twoDimArray [0][3] = 1;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" " + twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void fillingArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число.");
        int len = scanner.nextInt();
        System.out.println("Введите второе число.");
        int initialValue = scanner.nextInt();
        int[] newArray = new int[len];
        Arrays.fill(newArray, initialValue);
        System.out.println(Arrays.toString(newArray));
    }

}
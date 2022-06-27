package io.metadevs.vnazarov;

import java.util.Arrays;
import java.util.Scanner;


public class PussyFeeder {
    static final int MAXFOOD = 7;
    private static int[] food;
    static Scanner sc = new Scanner(System.in);
    private static int action;

    public static void main(String[] args) {
        System.out.println("Добро пожаловать в 'Кормитель котиков'");
        System.out.println("Введите количество котиков");
        food = new int[sc.nextInt()];
        System.out.println("Русифицированно! Английский язык санкционно удалён");
        System.out.println("Принудительный выход из программы - числовой ввод 666");
        System.out.println("Далее используйте числовой ввод");
        while (true) {
            System.out.println("___(´｡• ω •｡)___(＾▽＾)___o(≧▽≦)o___(^˵◕ω◕˵^)___(─‿‿─)___");
            System.out.println("---Кормушки---");
            System.out.println(Arrays.toString(food));
            System.out.println("Кормим или отнимам?");
            System.out.println("1-Кормить");
            System.out.println("2-Отнять");
            action = sc.nextInt();
            System.out.println("1-Покормить или отобрать еду у конкретного кота");
            System.out.println("2-Покормить или отобрать еду у всех котов сразу");
            System.out.println("3-Покормить или отобрать еду у четных или нечетных котов");
            System.out.println("Введите цифрой ваш выбор");
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("Какого конкретного котика?");
                    int numOfCat = sc.nextInt() - 1;
                    feedOneCat(numOfCat, action);
                    break;
                case 2:
                    System.out.println("Вы выбрали всех котов");
                    System.out.println("Кормим или отнимам?");
                    for (int i = 0; i < food.length; i++) {
                        feedOneCat(i, action);
                    }
                    break;
                case 3:
                    oddOrEven(action);
                    break;
                case 666:
                    System.exit(0);
                default:
                    System.out.println("Ввод некоректный. Повторите попытку");
                    break;
            }
        }
    }

    public static void feedOneCat(int numOfCat, int action) {

        switch (action) {
            case 1:
                if (food[numOfCat] < MAXFOOD) {
                    food[numOfCat] = food[numOfCat] + 1;
                } else {
                    System.out.println("Кормушка " + numOfCat + 1 + " уже полная");
                }
                break;
            case 2:
                if (food[numOfCat] >= 1) {
                    food[numOfCat] = food[numOfCat] - 1;
                } else {
                    System.out.println("Кормушка " + numOfCat + 1 + " уже пустая");
                }
                break;
            case 666:
                System.exit(0);
            default:
                System.out.println("Ввод некоректный. Повторите попытку");
        }
    }

    public static void oddOrEven(int action) {
        System.out.println("Четные или не четные?");
        System.out.println("1-Четные");
        System.out.println("2-Не четные");
        int oddOrEven = sc.nextInt();
        switch (oddOrEven) {
            case 1:
                for (int i = 0; i < food.length; i++) {
                    if (i % 2 != 0) {
                        feedOneCat(i, action);
                    }
                }
                break;
            case 2:
                for (int i = 0; i < food.length; i++) {
                    if (i % 2 == 0) {
                        feedOneCat(i, action);
                    }
                }
                break;
            case 666:
                System.exit(0);
            default:
                System.out.println("Ввод некоректный. Повторите попытку");
        }
    }
}
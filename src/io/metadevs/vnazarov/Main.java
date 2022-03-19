package io.metadevs.vnazarov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 99:");
        int userInput = sc.nextInt();
        sc.close();
        if (userInput < 100 & userInput > 0) {
            switch (userInput / 10) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    switch (userInput % 10) {
                        case 0:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            System.out.println("Мне " + userInput + " лет");
                            break;
                        case 1:
                            System.out.println("Мне " + userInput + " год");
                            break;
                        case 2:
                        case 3:
                        case 4:
                            System.out.println("Мне " + userInput + " года");
                            break;
                    }
                    break;
                case 1:
                    System.out.println("Мне " + userInput + " лет");
                    break;
            }
        } else {
            System.out.println("Введено некоректное число");
        }
    }
}

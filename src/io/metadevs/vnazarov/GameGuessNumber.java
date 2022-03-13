package io.metadevs.vnazarov;

import java.util.Scanner;
import java.lang.Math;

public class GameGuessNumber {

    public static void main(String[] args) {
        int unknownNumber = (int) Math.floor(Math.random() * 100+1);
        final int NUMTRYINGS = 10;
        boolean gameIsWon = false;
        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАЧА: Угадать число (от 0 до 100) за 10 попыток");
        for (int i = 0; i < NUMTRYINGS; i++) {
            System.out.print("Введите ваше число: ");
            int userNumber = input.nextInt();
            if (userNumber > unknownNumber) {
                System.out.println("Моё число меньше.");
            }
            else if (userNumber < unknownNumber) {
                System.out.println("Моё число больше.");
            }
            else {
                gameIsWon = true;
                break;
            }
        }
        if (gameIsWon) {
            System.out.println("Игра выиграна");
        }
        else {
            System.out.println("Игра проиграна. Загаданное число " + unknownNumber);
        }
    }
}

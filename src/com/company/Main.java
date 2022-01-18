package com.company;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Main {

    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        sum(a, b);  // 15
        sum(3, a);  // 10
        sum(5, 23); // 28

        boolean aGreaterThenB = a > b;
        boolean aLessThenB = a < b;
        boolean aGreaterOrEqualThenB = a >= b;
        boolean aLessOrEqualThenB = a <= b;
        if (aGreaterThenB) {
            System.out.println("a > b");
        } else {
            System.out.println("False a >X b");
        }
        if (aLessThenB) {
            System.out.println("a < b");
        } else {
            System.out.println("False a <X b");
        }
        if (aGreaterOrEqualThenB) {
            System.out.println("a >= b");
        } else {
            System.out.println("false a >=X b");
        }
        if (aLessOrEqualThenB) {
            System.out.println("a <= b");
        } else {
            System.out.println("False a <=X b");
        }
        int userInput = new Scanner(System.in).nextInt();
        if (userInput % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }

    }
    static void sum(int x, int y) {
        int z = (x + y);
        System.out.println(z);
    }

}

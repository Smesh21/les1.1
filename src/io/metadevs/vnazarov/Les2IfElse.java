package io.metadevs.vnazarov;

import java.util.Scanner;

public class Les2IfElse {
    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        sum(a, b);
        sum(3, a);
        sum(5, 23);

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

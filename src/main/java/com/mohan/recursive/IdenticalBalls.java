/*
 * Copyright (c) 2020. MK Groups.
 * All rights reserved.
 * All data of MK groups are confidential.
 */

package com.mohan.recursive;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IdenticalBalls {

    public static void main(String[] args) {
        try {
            Base b = new Base();
            Sub s = (Sub) b;
            System.out.println("Enter the Number of Identical Balls in a Bag: ");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            if(n >= 1){
                System.out.println("Total Number of ways to remove balls: " + calculateWays(n));
            } else {
                System.out.println("Number of balls should be greater than ZERO");
            }

        } catch (InputMismatchException e) {
            throw new InputMismatchException("Only Numbers are accepted");
        }
    }

    public static int calculateWays(int balls) {
        switch (balls) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return calculateWays(balls - 1) + calculateWays(balls - 2);
        }
    }
}

class Base {
}

class Sub extends Base {
}

class Sub2 extends Base {
}

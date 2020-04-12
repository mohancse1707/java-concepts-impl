/*
 * Copyright (c) 2020. MK Groups.
 * All rights reserved.
 * All data of MK groups are confidential.
 */

package com.mohan.logicalprogram;

import java.util.Scanner;

public class OddOrEvenNumbers {
    public static void main(String[] args) {
        int input;
        System.out.println("Enter an integer to check if it's odd or even");
        Scanner in = new Scanner(System.in);
        input = in.nextInt();

        if (input % 2 == 0) {
            System.out.println("The number is even.");
        }

        if (input % 2 != 0) {
            System.out.println("The number is odd.");
        }
    }
}

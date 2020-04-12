/*
 * Copyright (c) 2020. MK Groups.
 * All rights reserved.
 * All data of MK groups are confidential.
 */

package com.mohan.logicalprogram;

import java.util.Scanner;

public class MultipleOfGivenNumbers {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number!");
        int num1 = reader.nextInt();
        reader.nextLine();
        System.out.println("Enter another number!");
        int num2 = reader.nextInt();

        if ((num1 % num2) == 0) {
            System.out.println("Yes! " + num1 + " is a multiple of " + num2 + "!");
        } else {
            System.out.println("No! " + num1 + " is not a multiple of " + num2 + "!");
        }
        reader.close();
    }
}

/*
 * Copyright (c) 2020. MK Groups.
 * All rights reserved.
 * All data of MK groups are confidential.
 */

package com.mohan.logicalprogram;

import java.util.Scanner;

public class FindNivenNumber {
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scan.nextInt();
        int total = 0;

        for(int k = number ; k > 0 ; k = k/10)
        {
            total = total + (k%10);
        }
        if(number%total == 0)
        {
            System.out.println("Harshad number");
        }
        else
        {
            System.out.println("Not a Harshad number");
        }
    }
//https://www.codespeedy.com/find-if-a-number-is-niven-harshad-number-or-not-in-java/
}
